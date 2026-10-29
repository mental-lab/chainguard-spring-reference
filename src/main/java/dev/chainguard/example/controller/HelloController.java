package dev.chainguard.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot 3.5.14 (Chainguard +cgr build)";
    }

    @GetMapping("/version")
    public VersionResponse version() {
        return new VersionResponse(
            org.springframework.core.SpringVersion.getVersion(),
            org.springframework.boot.SpringBootVersion.getVersion()
        );
    }

    public record VersionResponse(String springFramework, String springBoot) {}
}
