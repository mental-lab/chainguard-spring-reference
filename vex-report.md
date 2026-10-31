## 🛡️ Remediation Advisor — Chainguard OpenVEX analysis

**28 findings** — 🔧 8 with a Chainguard fix ready · ⬆️ 0 need an upstream upgrade · 🔼 20 upgrades available · 📋 0 exception-review · ✅ 0 already fixed

### Action required

| CVE | Severity | Package | Fix | Action |
| --- | --- | --- | --- | --- |
| GHSA-9xv2-5v5q-p794 | CRITICAL | `tomcat-embed-core 10.1.55` | pkg:maven/org.apache.tomcat.embed/tomcat-embed-core@10.1.55-0.cgr.2 | **backport** |
| GHSA-gcx9-497g-6cp6 | CRITICAL | `tomcat-embed-core 10.1.55` | pkg:maven/org.apache.tomcat.embed/tomcat-embed-core@10.1.55-0.cgr.2 | **backport** |
| GHSA-h3x4-894j-xpx5 | CRITICAL | `tomcat-embed-core 10.1.55` | pkg:maven/org.apache.tomcat.embed/tomcat-embed-core@10.1.55-0.cgr.2 | **backport** |
| GHSA-j3rv-43j4-c7qm | HIGH | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.2-0.cgr.1 | **backport** |
| GHSA-q4xh-88c3-wmh7 | HIGH | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.2-0.cgr.1 | **backport** |
| GHSA-rmj7-2vxq-3g9f | HIGH | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.2-0.cgr.1 | **backport** |
| GHSA-jhq6-gfmj-v8fx | LOW | `logback-core 1.5.32` | pkg:maven/ch.qos.logback/logback-core@1.5.32-0.cgr.1 | **backport** |
| GHSA-p47f-322f-whfh | LOW | `logback-core 1.5.32` | pkg:maven/ch.qos.logback/logback-core@1.5.32-0.cgr.1 | **backport** |

### Rationale

- **GHSA-9xv2-5v5q-p794** (`tomcat-embed-core`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.
- **GHSA-gcx9-497g-6cp6** (`tomcat-embed-core`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.
- **GHSA-h3x4-894j-xpx5** (`tomcat-embed-core`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.
- **GHSA-j3rv-43j4-c7qm** (`jackson-databind`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.
- **GHSA-q4xh-88c3-wmh7** (`jackson-databind`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.
- **GHSA-rmj7-2vxq-3g9f** (`jackson-databind`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.
- **GHSA-jhq6-gfmj-v8fx** (`logback-core`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.
- **GHSA-p47f-322f-whfh** (`logback-core`): Chainguard-built patched package exists at the SAME upstream version (VEX status=fixed). This is a same-version backport: identical API surface, CVE fix layered on top. Safe to apply with the existing test suite.

<details><summary>All remaining findings (20) — upgrades available, exception-review, already fixed</summary>

| CVE | Severity | Package | Fix | Action |
| --- | --- | --- | --- | --- |
| GHSA-f525-44xv-f2qj | CRITICAL | `tomcat-embed-core 10.1.55` | tomcat-embed-core==10.1.59 (upstream) | **upgrade** |
| GHSA-7hhh-6rmp-j9qf | HIGH | `jackson-core 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-core@2.15.0-rc1-0.cgr.2 | **upgrade** |
| GHSA-p6pp-m3f8-5c89 | HIGH | `jackson-core 2.21.2` | jackson-core==2.21.7 (upstream) | **upgrade** |
| GHSA-r7wm-3cxj-wff9 | HIGH | `jackson-core 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-core@2.15.0-rc1-0.cgr.2 | **upgrade** |
| GHSA-cxp5-3px4-pw24 | HIGH | `jackson-databind 2.21.2` | jackson-databind==2.21.7 (upstream) | **upgrade** |
| GHSA-wv8q-qhhj-9h54 | HIGH | `jackson-databind 2.21.2` | jackson-databind==2.21.7 (upstream) | **upgrade** |
| GHSA-g3pr-3p32-fp23 | HIGH | `micrometer-core 1.15.11` | pkg:maven/io.micrometer/micrometer-core@1.16.5-0.cgr.2 | **upgrade** |
| GHSA-w737-wx49-qj23 | HIGH | `micrometer-core 1.15.11` | pkg:maven/io.micrometer/micrometer-core@1.16.5-0.cgr.1 | **upgrade** |
| GHSA-3pjw-73gf-8qr5 | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.3-0.cgr.3 | **upgrade** |
| GHSA-5gvw-p9qm-jgwh | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.4-0.cgr.2 | **upgrade** |
| GHSA-5hh8-q8hv-fr38 | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.3-0.cgr.2 | **upgrade** |
| GHSA-5jmj-h7xm-6q6v | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.4-0.cgr.2 | **upgrade** |
| GHSA-9fxm-vc8v-hj55 | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.3-0.cgr.2 | **upgrade** |
| GHSA-gx83-3vf8-gh7j | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.1-0.cgr.1 | **upgrade** |
| GHSA-hgj6-7826-r7m5 | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.3-0.cgr.2 | **upgrade** |
| GHSA-mhm7-754m-9p8w | MEDIUM | `jackson-databind 2.21.2` | jackson-databind==2.21.5 (upstream) | **upgrade** |
| GHSA-rcqc-6cw3-h962 | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.21.3-0.cgr.2 | **upgrade** |
| GHSA-vvgp-rfg2-7rr6 | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.19.1-0.cgr.1 | **upgrade** |
| GHSA-wjgm-6hv5-3cvf | MEDIUM | `jackson-databind 2.21.2` | pkg:maven/com.fasterxml.jackson.core/jackson-databind@2.9.8-0.cgr.8 | **upgrade** |
| GHSA-qv9r-c865-cp47 | MEDIUM | `log4j-api 2.24.3` | log4j-api==2.25.5 (upstream) | **upgrade** |

</details>

> Decision framework: fix available → compatible upgrade → backport → replacement → compensating control, weighted by severity × exploitability × internet exposure × asset criticality.

