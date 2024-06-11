
TourBuddy


Hi 👋👋👋,

This is java Spring Boot Tours and travel management Project with follows model,view and controller Architecture  


![Logo](https://private-user-images.githubusercontent.com/110238534/338401629-71ebedac-ed35-4ea8-9ba1-267c7f0d4540.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTgxMTYyODQsIm5iZiI6MTcxODExNTk4NCwicGF0aCI6Ii8xMTAyMzg1MzQvMzM4NDAxNjI5LTcxZWJlZGFjLWVkMzUtNGVhOC05YmExLTI2N2M3ZjBkNDU0MC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNjExJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDYxMVQxNDI2MjRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1hYjAyMTBmMjdkNDc4NjJkZTBlZDhkNTk5MWU1ZTlhNzc0ZGQzYTU4MGYwNTI4MWE0MDZhNmMyNmFhNmQyZWU3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.BeeOv4UFcNk2XBkIOp68xLV4VJlPTeZeVtmRrMGHCvk)


## Geting  started

 VS code installation
 
 - Install Java Extension Pack Spring Boot Extension Pack.
 - Create java project Select these from the toolbar -Spring Boot -Maven Project -Snapshot version -java


## Demo

Insert gif or link to demo

https://github.com/Aditikhasnis/TourBuddy/assets/110238534/96f9fe89-7172-4315-bd9c-2abcf557b76f
## 🛠 Skills
Java Spring Boot libraries , HTML, CSS, java


## Libraries and Dependencies:

- Basically the model would interact with the database which in this case is the repository where you can run your sql query and perform actions related to backend (You need to have tables schemas  created in the back-end )
- Controller interacts with both view and model specificaly the repository the @GetMapping takes in the .html page as an attribute and renders the specific page 

Mysql Connectivity
- import java.sql.Connection;
- import java.sql.DriverManager;

- import java.sql.PreparedStatement;
- import java.sql.ResultSet;
- import java.sql.SQLException;
1) Auto-Configuration and Dependency Management:

- Spring Boot manages the database connectivity and configurations for you through its auto-configuration feature.
You need to add the MySQL connector dependency in your pom.xml:
xml


2) Configuration in application.properties:

Spring Boot Starter Web:

- Provides all the dependencies and auto-configuration needed to develop web applications, including RESTful services using Spring MVC.
Spring Boot Starter Thymeleaf:

- Provides the integration between Spring Boot and Thymeleaf.
Spring Boot Starter Data JPA:

- Simplifies the implementation of data access layers by providing an abstraction over different persistence stores.
H2 Database:

- A lightweight, in-memory database often used for development and testing.
Spring Boot Starter Test:

- Provides testing libraries including JUnit, Hamcrest, and Mockito.
## Benifits 


Rapid Development with Spring Boot:


Modern Web Development with Thymeleaf:

Simplified Data Access with Spring Data JPA: