# master-project
## 1. overview
Based on Springboot, the author developed a school management system as the master project. The project uses
a MVC structure, which utilize mysql as the database server. The frontend is built by javascript, thymeleaf and bootstrap.


REST API: The application provides a REST API for integration with other systems and applications.
Security: Spring Boot offers built-in security features for user authentication and authorization.
The application is structured with a layered architecture, including:

Presentation Layer: Handles user interface and interaction.
Business Logic Layer: Implements core functionalities and business rules.
Data Access Layer: Communicates with the database and retrieves/manipulates data.

## 2. design
### 2.1 controllers
The project uses rest controller to handle backend requests. It also use global exception
handler to catch and handle unexpected crashes.
There will be adminController, StudentController and teacher Controller for each role. And PublicController for general requests.
### 2.2 service layer
This layer performs business logic, which is called by the controller layer. For example when register, you can choose your role as a teacher/student, and specify your personal information based on your role. This layer would handle all these logic.
### 2.3 repository layer
utilize Spring JPA as the ORM to handle impedance mismatch.
JPA queries was used to implement the features. It support CRUD, sorting, and other advanced functionalities.
### 2.4 model
define the instance, setting up the validation for each field.Like for certain field(Address), it shouldn't be blank. For zip code, it should be 5 digit of numbers etc.
### 2.5 security
Using spring security, only certain roles would be able to access certain resources.
ProjectSecurityConfig specified how each role would be able to access certain resource. UserNamePwdAuthenticationProvider is used to authenticate users.
### 2.6 templates
Utiliziing thymeleaf which is a built-in frontend for springboot, template files were written using html,css and decorated by bootstrap. Javascript was used to handle events and dynamic webpage display. 
### 2.7 screenshots
![sc1](https://github.com/ybt1024/master-project/assets/60807383/860ee702-7298-49a6-b4a4-71af39174bd0)
![sc2](https://github.com/ybt1024/master-project/assets/60807383/55fcd2a8-e87c-403e-aced-2f25d8aa69ab)
![sc6](https://github.com/ybt1024/master-project/assets/60807383/61a943c9-f38e-420c-ace3-65b0735a5c6b)
![sc5](https://github.com/ybt1024/master-project/assets/60807383/5ae84321-0b9c-4ec2-a872-d85273914d30)
![sc4](https://github.com/ybt1024/master-project/assets/60807383/feb272ff-d74d-4ce1-a79f-f910db99ba57)
![sc8](https://github.com/ybt1024/master-project/assets/60807383/30d93cba-001d-46e8-b008-a83e165d025c)
![sc7](https://github.com/ybt1024/master-project/assets/60807383/0bb84764-e6db-403c-a338-2e0b143ec1c1)
![sc3](https://github.com/ybt1024/master-project/assets/60807383/f724eb69-e095-4a84-830b-7b049ae06752)

### 2.8 Demo
https://drive.google.com/file/d/11gP73HZ5r4gDYQhnlhOLsowhwKiEf3IO/view?usp=drive_link
