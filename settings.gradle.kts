// Chainguard Libraries reference project
//
// Configures Gradle to resolve ALL dependencies through Chainguard Libraries:
//   - libraries.cgr.dev/java-remediated/ : Chainguard-built +cgr artifacts (CVE-remediated)
//   - libraries.cgr.dev/java/            : upstream Maven Central mirror (fallback)
//
// Credentials come from CHAINGUARD_JAVA_IDENTITY_ID and CHAINGUARD_JAVA_TOKEN
// env vars. See README.md for pull-token minting.

rootProject.name = "chainguard-spring-reference"

pluginManagement {
    repositories {
        maven {
            name = "chainguard-remediated"
            url = uri("https://libraries.cgr.dev/java-remediated/")
            credentials {
                username = providers.environmentVariable("CHAINGUARD_JAVA_IDENTITY_ID").orNull
                password = providers.environmentVariable("CHAINGUARD_JAVA_TOKEN").orNull
            }
        }
        maven {
            name = "chainguard-mirror"
            url = uri("https://libraries.cgr.dev/java/")
            credentials {
                username = providers.environmentVariable("CHAINGUARD_JAVA_IDENTITY_ID").orNull
                password = providers.environmentVariable("CHAINGUARD_JAVA_TOKEN").orNull
            }
        }
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            name = "chainguard-remediated"
            url = uri("https://libraries.cgr.dev/java-remediated/")
            credentials {
                username = providers.environmentVariable("CHAINGUARD_JAVA_IDENTITY_ID").orNull
                password = providers.environmentVariable("CHAINGUARD_JAVA_TOKEN").orNull
            }
        }
        maven {
            name = "chainguard-mirror"
            url = uri("https://libraries.cgr.dev/java/")
            credentials {
                username = providers.environmentVariable("CHAINGUARD_JAVA_IDENTITY_ID").orNull
                password = providers.environmentVariable("CHAINGUARD_JAVA_TOKEN").orNull
            }
        }
    }
}
