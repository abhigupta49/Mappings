<h1 align = "center"> Mappings-Project </h1>


</p>
The project is a portal designed to handle different types of relationships, including one-to-one, one-to-many, many-to-one, and many-to-many relationships. It provides CRUD operations for four models: Student, Laptop, Course, and Book. These models represent entities such as students, laptops, courses, and books, and each model has its own set of attributes and relationships.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<database name>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The  data model  has the following attributes:
<br>

* Student
```
ID: The unique identifier for the student.
name: The name of the student.
age: The age of the student.
phoneNumber: The phone number of the student.
branch: The branch the student belongs to.
department: The department the student is associated with.

Relationships:
address: A one-to-one relationship with the Address model.
```

* Laptop
```
ID: The unique identifier for the laptop.
name: The name of the laptop.
brand: The brand of the laptop.
price: The price of the laptop.

Relationships:

student: A one-to-one relationship with the Student model.

```

* Course
```
ID: The unique identifier for the course.
title: The title of the course.
description: The description of the course.
duration: The duration of the course.
Relationships:

studentList: A many-to-many relationship with the Student model.
```


* Book
```
ID: The unique identifier for the book.
title: The title of the book.
author: The author of the book.
description: The description of the book.
price: The price of the book.
Relationships:

student: A many-to-one relationship with the Student model.
```

* Address
```
addressId: The unique identifier for the address.
landmark: The landmark associated with the address.
zipcode: The zipcode of the address.
district: The district of the address.
state: The state of the address.
country: The country of the address.

```


## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>

<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The portal allows for the creation, reading, updating, and deletion of records for each model. Users can create new students, laptops, courses, and books with their respective attributes. They can also retrieve specific details of a record, update the attributes of existing records, and delete records from the system.
Overall, the portal provides a comprehensive solution for managing different types of relationships and performing CRUD operations on the models involved.

