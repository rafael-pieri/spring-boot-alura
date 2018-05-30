## Alura Online Courses - Spring Boot: Agility in java development with Spring

### Overview
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
This repository contains an example of how to use this powerful Spring module.

### How to deploy the application
Execute the following command to up a MYSQL instance:

```docker run --name mysql-instance -e MYSQL_ROOT_PASSWORD=root -d mysql:8.0.11```

Once the database is up and running, execute the following command to run the application:

```mvn exec:java```

It will be available at: http://localhost:8080/
