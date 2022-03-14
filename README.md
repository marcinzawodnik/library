# Library
About my Library manager demo project:

Here is my sample project that I intend to develop in the near future – simple library management system. The project will be written in <code>Java language</code> using <code>Spring Boot</code> framework, <code>PostgreSQL</code> relational database with <code>Hibernate</code> library. The system will have the function of authentication using <code>Spring Security</code>.

So far:
- I have created the project assumptions; 
- I have prepared a <code>use case diagram</code> (using <code>Draw.io app</code>). File is located in the UML directory. The jpg image shows the main functionalities of the system, and shows in which direction the project will be developed;
- using <code>Apache Maven</code> tool I have created basic configuration of the project: I have set up the basic dependencies of the project;
- I have installed the database;
- in “application.properties” file I have configured database connection;
- I have created endpoint using <code>REST API</code>, which allows you to add a book to the database, update book data, view all books available in the database or a single item, and delete a book from the database;
- I tested the endpoint using the <code>Postman</code> application.

To do:
- add users;
- define user roles;
- add authentication and authorization;
- add search function;
- add reservation;
- add lend/return functionality;
- add tests;
- add simple frontend;
- dockerize application;
- mount the application in a public cloud. 

