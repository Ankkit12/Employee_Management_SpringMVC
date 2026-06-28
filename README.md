# Employee Management System

A Spring Boot Employee Management System built using Spring MVC, Thymeleaf, Spring Data JPA, MySQL, and Spring Security.

## Features

* Employee CRUD Operations
* Spring MVC with Thymeleaf
* REST APIs
* Swagger/OpenAPI Documentation
* Global Exception Handling
* Employee Search
* Pagination & Sorting
* Spring Security Authentication
* Role-Based Authorization (ADMIN / USER)
* MySQL Database Integration

## Tech Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Spring Security
* Thymeleaf
* MySQL
* Swagger/OpenAPI
* Maven

## REST API Endpoints

### Employee APIs

* GET /v1/employee
* GET /v1/employee/{id}
* POST /v1/employee
* DELETE /v1/employee/{id}

### Search

* GET /v1/employee/search?keyword={keyword}

### Pagination

* GET /v1/employee/page?page=0&size=5

## Security

Implemented Spring Security with:

* In-Memory Authentication
* Role-Based Authorization
* ADMIN Role
* USER Role

### Demo Credentials

ADMIN

* Username: admin
* Password: admin123

USER

* Username: user
* Password: user123

## Screenshots
<img width="1211" height="695" alt="Screenshot 2026-05-31 230106" src="https://github.com/user-attachments/assets/3199025e-cabd-4538-8850-b2fca975ec04" />
<img width="1561" height="415" alt="Screenshot 2026-05-31 225828" src="https://github.com/user-attachments/assets/d158ef98-207a-40fb-8fbd-51db10ecbb35" />
<img width="1192" height="892" alt="Screenshot 2026-05-31 225802" src="https://github.com/user-attachments/assets/256a3f2e-c03f-4e5e-932d-74fdb5e7cc07" />
<img width="1466" height="807" alt="Screenshot 2026-05-31 225614" src="https://github.com/user-attachments/assets/9c39a93e-9fd0-4fe2-bcc6-a15f4d8bea89" />
<img width="1812" height="948" alt="Screenshot 2026-05-31 225521" src="https://github.com/user-attachments/assets/9aab9133-c57c-4d47-bfb4-e4238adfa101" />
<img width="1737" height="616" alt="Screenshot 2026-05-31 225420" src="https://github.com/user-attachments/assets/58649dc3-ad4f-4e00-b8b1-7938e1693b8d" />
<img width="1598" height="497" alt="Screenshot 2026-05-31 225153" src="https://github.com/user-attachments/assets/6582cf05-c030-4fd0-bbb3-1abf6ecc1c5b" />
<img width="1746" height="790" alt="Screenshot 2026-05-31 225350" src="https://github.com/user-attachments/assets/83fecc51-3cc8-45a5-b4d6-d9f12b872131" />



## Future Enhancements

* React Frontend
* Docker Containerization
* Live Deployment
* JWT Authentication
* Database-Based Users and Roles
