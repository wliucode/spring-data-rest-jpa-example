# spring-data-rest-jpa-example
This project describles the Spring Boot Example with Spring Data REST and JPA Example

## Description
This Project shows the list of Users and data are stored in the In-Memory H2 Database. 

By using the following endpoints, we can perform different operations as follows:

-- /users/all - (GET) This returns the list of Users in the Users table which is created in H2

-- /users/name/{name} - (GET) This returns the details of the User whose name is passed in URL 

-- /users/load - (POST) Add new users using the Users model. 
                eg. { "name": "WLIU", "teamName": "Development", "salary": 1000 }
