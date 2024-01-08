# Spring Cloud Netfix with Rest Template

This project consists of three Maven-based Spring Boot applications: `eureka-server`, `employee-consumer`, and `employee-producer`. The applications are designed to work together to demonstrate a simple microservices architecture using Spring Cloud and Eureka for service discovery.

## eureka-server

### Overview

The `eureka-server` application serves as the Eureka server, providing service registration and discovery capabilities for the other microservices.

### Project Information

- **Group ID:** com.sematec
- **Artifact ID:** eureka-server
- **Version:** 0.0.1-SNAPSHOT
- **Java Version:** 1.8

### Dependencies

- Spring Cloud Starter Netflix Eureka Server
- Spring Boot Starter Test
- JUnit (for testing)

### Build and Run

To build the project, run the following Maven command:

```bash
mvn clean install
```

To run the application, use the following command:

```bash
mvn spring-boot:run
```

The Eureka server will be accessible at `http://localhost:8761`.

## employee-consumer

### Overview

The `employee-consumer` application is a consumer of the `employee-producer` service registered with Eureka.

### Project Information

- **Group ID:** com.sematec
- **Artifact ID:** employee-consumer
- **Version:** 0.0.1-SNAPSHOT
- **Java Version:** 1.8

### Dependencies

- Spring Boot Starter Web
- Spring Cloud Starter Netflix Eureka Client
- Spring Boot Starter Test

### Build and Run

To build the project, run the following Maven command:

```bash
mvn clean install
```

To run the application, use the following command:

```bash
mvn spring-boot:run
```

## employee-producer

### Overview

The `employee-producer` application serves as a simple producer of employee information.

### Project Information

- **Group ID:** com.sematec
- **Artifact ID:** employee-producer
- **Version:** 0.0.1-SNAPSHOT
- **Java Version:** 1.8

### Dependencies

- Spring Boot Starter Web
- Spring Cloud Starter Netflix Eureka Client
- Spring Boot Starter Test

### Build and Run

To build the project, run the following Maven command:

```bash
mvn clean install
```

To run the application, use the following command:

```bash
mvn spring-boot:run
```

## Notes

- The projects use Spring Boot 2.4.0 and Spring Cloud 2020.0.2.
- The Eureka server should be running before starting the consumer and producer applications.
- All projects follow the standard Maven directory structure.
- The Maven `spring-boot-maven-plugin` is included in each project for packaging as executable JAR files.

Feel free to explore and modify the applications to suit your needs. For additional information on Spring Boot and Spring Cloud, refer to the official documentation at [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot) and [https://spring.io/projects/spring-cloud](https://spring.io/projects/spring-cloud).
