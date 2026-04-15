# Spring Boot Microservices Project

## Author
**RABARIJAONA Angoty Fitia**  
Master II – IT University, Antananarivo  

---

## Project Purpose
This project demonstrates the implementation of a **microservices architecture** using Spring Boot.  
It contains two independent services:  
- **Customer Service** → manages customer data  
- **Account Service** → manages bank accounts  

Each service runs independently, has its own in-memory H2 database, and exposes REST endpoints.  
The goal is to showcase an extensible architecture that respects **SOLID principles** and best practices (DTOs, Service Layer, Mapper).

---

##  Technologies & Tools
- **Java 17**  
- **Spring Boot 3.x**  
  - Spring Web  
  - Spring Data JPA  
  - Lombok  
- **H2 Database** (in-memory for testing)  
- **Maven** (dependency management & build)  
- **IntelliJ IDEA** (multi-module workspace)  
- **Git & GitHub Classroom** (version control and academic tracking)

---

##  Running the Services
### Customer Service
- Port: `8080`  
- Endpoints:  
  - `GET /customers` → list all customers  
  - `GET /customer/{id}` → get customer by ID  

### Account Service
- Port: `8081`  
- Endpoints:  
  - `GET /accounts` → list all accounts  
  - `GET /account/{id}` → get account by ID  

---

