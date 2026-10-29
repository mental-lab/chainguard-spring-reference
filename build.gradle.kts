plugins {
    java
    // Pin the Boot GRADLE PLUGIN at the upstream version (plain 3.5.14).
    // Gradle plugins are build-time tooling, not runtime libraries, so they
    // typically don't need Chainguard's +cgr remediation. The actual Boot
    // runtime JARs get the +cgr suffix via the BOM pin below, which is where
    // CVE remediation matters.
    id("org.springframework.boot") version "3.5.14"
    id("io.spring.dependency-management") version "1.1.6"
    // CycloneDX SBOM — consumed by `suture fetch --sbom` to scope the VEX
    // cache to the libraries this project actually ships, and by Grype for
    // VEX-aware scanning.
    id("org.cyclonedx.bom") version "1.10.0"
}

group = "dev.chainguard.example"
version = "0.1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

// Pin the Spring Boot BOM to the Chainguard +cgr revision.
// This flows the +cgr version suffixes down to every transitively
// resolved Spring artifact without needing to pin each one individually.
dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.5.14-0.cgr.1")
    }
}

// Spring Boot 3.5.14's BOM pins Spring Framework to 6.2.18. If you need
// a different Framework patch (6.2.19 shown here), override explicitly —
// this is how you reach a Framework version above the BOM default while
// still consuming the Boot BOM for everything else. Same pattern applies
// when overriding Security.
ext["spring-framework.version"] = "6.2.19-0.cgr.1"

dependencies {
    // Spring Boot starters — Boot version comes from the BOM;
    // transitive Framework resolution flows through the ext["spring-framework.version"]
    // override above. Spring Security version comes from the BOM default (6.5.4
    // for Boot 3.5.14). You can override Security the same way we overrode
    // Framework — see the commented block below for the pattern.
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    // Example: pinning Spring Security to a specific +cgr-remediated patch.
    // Uncomment if your Chainguard org has coverage for the pinned version
    // and you need to override Boot's BOM default:
    //
    //   implementation("org.springframework.security:spring-security-core:6.5.11-0.cgr.1")
    //   implementation("org.springframework.security:spring-security-web:6.5.11-0.cgr.1")
    //   implementation("org.springframework.security:spring-security-config:6.5.11-0.cgr.1")
    //   implementation("org.springframework.security:spring-security-oauth2-resource-server:6.5.11-0.cgr.1")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
