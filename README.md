# Sysnormal Sso client requester
[![Maven Central](https://img.shields.io/maven-central/v/io.github.sysnormal1.security.auth.sso/sso-client-requester.svg)](https://central.sonatype.com/artifact/io.github.sysnormal1.security.auth.sso/sso-client-requester)
[![Repository](https://img.shields.io/badge/view-mvnrepository-blue)](https://mvnrepository.com/artifact/io.github.sysnormal1.security.auth.sso/sso-client-requester)
[![GitHub tag](https://img.shields.io/github/v/tag/sysnormal1/sso-client-requester)](https://github.com/sysnormal1/sso-client-requester)

This library provides a Spring Security auto-configuration for integrating Single Sign-On (SSO) authentication into your Spring Boot application. It includes a base security configuration and a filter to validate JWT tokens against an SSO server, ensuring secure access to protected endpoints.

This library can also be used as a client implementation of the [SSO Starter](https://github.com/sysnormal1/sso-starter), allowing other Java-based APIs or backends to easily integrate into the same authentication ecosystem.

## Features
- Provides methods for login and check token on sso

## Prerequisites
- Spring Boot 4+
- Java 21+
- An SSO server providing token validation endpoints
- Maven or Gradle for dependency management

## Installation

Add the following dependency to your `pom.xml` (Maven) or `build.gradle` (Gradle):

### Maven
```xml
<dependency>
    <groupId>io.github.sysnormal1.security.auth.sso</groupId>
    <artifactId>sso-client-requester</artifactId>
    <version>0.0.3</version>
</dependency>
```

### Gradle
```groovy
implementation 'io.github.sysnormal1.security.auth.sso:sso-client-requester:0.0.2'
```

## Configuration and usage

This library is auto-configuration, but is necessary inject this at here necessary:

````java
import services.com.sysnormal.security.auth.sso.sso_client_requester.SsoClientRequesterService;
import org.springframework.beans.factory.annotation.Autowired;

@Autowired
private SsoClientRequesterService ssoClientRequesterService;
...
DefaultDataSwap loginResponse = ssoClientRequesterService.loginOnSso(email, pasword);
````

### Required Configuration Properties

You need to configure the following properties in your `application.yml` or `application.properties` file:

#### application.yml
```yaml
sso:
  base-endpoint: value
  login-endpoint: value
  default-email: value
  default-password: value
```


## 👥 Integration with SSO Starter

This client library is designed to integrate directly with the SSO Starter server, allowing seamless validation of authentication tokens and centralized access management across multiple applications.

For more details on the SSO server setup, refer to the main [SSO Starter](https://github.com/sysnormal1/sso-starter).

---

## Contributing
For issues, feature requests, or contributions, please contact the starter maintainers or submit a pull request to the repository.

---


## 🧬 Clone the repository

To get started locally:

```bash
git clone https://github.com/sysnormal1/sso-client-requester.git
cd sso-client-requester
mvn install
```

## 🔧 Build and Local Test

```bash
mvn clean install
```

---

## ⚖️ License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

## 👤 Author

**Alencar Velozo**  
GitHub: [@aalencarvz1](https://github.com/aalencarvz1)

---
