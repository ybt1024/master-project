# master-project
## 1. overview
Based on Springboot, the author developed a school management system as the master project. The project uses
a MVC structure, which utilize mysql as the database server. The frontend is built by javascript, thymeleaf and bootstrap.
## 2. design
### 2.1 controllers
The project uses rest controller to handle backend requests. It also use global exception
handler to catch and handle unexpected crashes.
### 2.2 service layer
This layer perform business logic, which is called by the controller
### 2.3 repository layer
utilize Spring JPA as the ORM to handle impedance mismatch.
JPA queries was used to implement the features.
### 2.4 model
define the instance, setting up constrains.
### 2.5 security
Using spring security, only certain roles would be able to access certain resources.
### 2.6 templates
page templates contains thymeleaf options
