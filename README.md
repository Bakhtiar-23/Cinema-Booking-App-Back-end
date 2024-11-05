# Cinema-Booking-App-Back-end
Cinema Booking App is a Spring Boot and Maven-based backend project for managing movie bookings. It provides RESTful endpoints for creating, reading, updating, and deleting movies and bookings, utilizing a FakeDB for in-memory data storage. Built with Java, it's designed for efficient integration with frontend applications.

This project is a Spring Boot-based backend application for a Cinema Booking system. It provides RESTful APIs for managing cinema bookings and runs in a Docker container. This README provides steps for setting up the development environment, building, and deploying the application.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Building the Application](#building-the-application)
- [Running with Docker](#running-with-docker)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

---

## Prerequisites

To get started, ensure you have the following tools installed:

- **Java Development Kit (JDK) 21**: Required to build and run the Spring Boot application.
- **Apache Maven**: For managing project dependencies and building the project.
- **Docker**: For containerizing and deploying the application.
- **Eclipse** (optional): For development in an IDE.

### Installation of Prerequisites

1. **JDK 21**: [Download and install JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
   - Verify installation with:
     ```bash
     java -version
     ```
2. **Apache Maven**: [Download and install Maven](https://maven.apache.org/install.html).
   - Verify installation with:
     ```bash
     mvn -v
     ```
3. **Docker**: [Download Docker Desktop](https://www.docker.com/products/docker-desktop) and install it.
   - Verify installation with:
     ```bash
     docker --version
     ```

## Installation

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/Bakhtiar-23/Cinema-Booking-App-Back-end.git
   cd Cinema-Booking-App-Back-end
### Install dependencies and build the project with Maven:
```bash
mvn clean install
```
#### Package the application as a JAR file:
```bash
mvn package
```
#### Running the project by
```bash
mvn spring-boot:run
```
can see the project on the port: http://localhost:8080/movies or /showtimes

