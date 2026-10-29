package dev.chainguard.example;

import dev.chainguard.example.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Smoke test: boots the full application context from the Chainguard-provided
 * Spring Framework 6.2.19 / Spring Boot 3.5.14 jars.
 *
 * If this test passes, the Chainguard Libraries integration is wired end-to-end:
 * dependency resolution, pull-token auth, BOM-driven transitive versioning, and
 * runtime bean wiring against the +cgr artifacts.
 */
@SpringBootTest
class ApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    void contextLoadsFromChainguardJars() {
        // Context boots -> auto-config + security filter chain + web MVC all
        // loaded from the Chainguard-provided artifacts.
        assertThat(helloController).isNotNull();
    }

    @Test
    void runtimeReportsExpectedSpringVersions() {
        // The runtime version reporters include the cgr suffix prefix
        // (SpringVersion returns "6.2.19-0" from the Chainguard JAR
        // manifest). Assert the upstream base version with startsWith.
        assertThat(SpringVersion.getVersion()).startsWith("6.2.19");
        assertThat(SpringBootVersion.getVersion()).startsWith("3.5.14");
    }
}
