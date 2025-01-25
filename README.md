Overview
This project demonstrates the implementation of Spring Security to protect a Spring Boot application. It focuses on robust user authentication, role-based authorization, and securing application endpoints using industry-standard practices.

Key Features
JWT Authentication: Provides secure, token-based authentication for users.
Role-Based Access Control: Restricts access to resources based on user roles.
Custom Filters: Ensures validation and secure processing of user requests.
Secure API Endpoints: Protects resources with Spring Security configurations.


Prerequisites
Java 17 or higher
Maven or Gradle for dependency management
mysql , java


Technologies Used
Spring Boot: Framework for building Java applications.
Spring Security: Provides authentication and access control.
JWT: Token-based authentication.
Hibernate: ORM for database interaction.
H2 Database: Embedded database for testing and development.


How It Works
User Registration:
Users can register using /auth/register. User details are saved in the database.

User Authentication:
Users log in using /auth/login. A valid JWT is returned upon successful authentication.

Access Protected Resources:
Use the JWT as a Bearer Token in the Authorization header to access secure endpoints.

