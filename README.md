
# Adidas challenge [![Build Status](https://travis-ci.org/iorran/desafio-adidas.svg?branch=master)](https://travis-ci.org/iorran/desafio-adidas)
This guide shows you how to build and run a Coding Challenge Web Services and Integration. 
## Contents
 - Prerequisites
 - Architecture
 - Getting Started 
 - Features
 - Travis CI
 
## Prerequisites
 - Maven 
 - Docker (Optional)
 - Docker Compose (Optional)
 - Git 
 - Java 8
 
## Architecture

Ilustrative architeture to demonstrate the flux.

![architeture](https://uploaddeimagens.com.br/images/001/773/966/original/example.png?1544542551)

##### Note: adidas-db, adidas-evt and adidas-email will be located in different containers

## Getting Started 
### Clone the repository
```
git clone https://github.com/iorran/adidas-db.git
```
###  Running
Demonstration of how to run the challenge into your local machine or docker containers.
All statements assume that you have opened a terminal in the root folder: **desafio-adidas**
![root folder](https://uploaddeimagens.com.br/images/001/773/432/full/folder.png?1544525525)
#### Local
 - Building
    You shoul enter in each microservice folder **adidas-*** and run: 
    ```mvn clean install```
    
 - Running
    You shoul enter in each microservice folder **adidas-*** and run:
    ```mvn spring-boot:run```
    
#### Docker
##### Atention: You can not use that approach without docker and docker compose installed
 - Building
    You shoul enter in each microservice folder **adidas-*** and run: 
    ```mvn clean install -P compose```
 - Running
    In a root folder (same level as **docker-compose.yml**), execute the command:
    ```docker-compose up```
    
## Features
 - Technologies used [Spring Cloud Netflix](https://spring.io/projects/spring-cloud-netflix) integrations to build our microservices.
 - All microservices are protected by spring security.
 - Swagger documentation implemented.

#### Microservice: Adidas DB
##### Description
 This microservice only provide  the access to database.
##### Frameworks used
 - Spring Data JPA
 - Service Discovery: Eureka instances can be registered and clients can discover the instances using Spring-managed beans
 
#### Microservice: Adidas Sub

##### Description
This is the microservice with subscriptions endpoints
##### Frameworks used
 - Declarative REST Client: Feign creates a dynamic implementation of an interface decorated with JAX-RS or Spring MVC annotations;
 - Circuit    Breaker: Hystrix clients can be built with a simple
   annotation-driven    method decorator;
 - Client Side Load Balancer: Ribbon;
 - Service Discovery: Eureka instances can be registered and clients can discover the instances using Spring-managed beans.
 
#### Microservice: Adidas Evt
##### Description
This is the microservice with events endpoints.**(Mock)**
##### Frameworks used
 - Service Discovery: Eureka instances can be registered and clients can discover the instances using Spring-managed beans
 
#### Microservice: Adidas Email
##### Description
This is the microservice with emails endpoints.**(Mock)**
##### Frameworks used
 - Service Discovery: Eureka instances can be registered and clients can discover the instances using Spring-managed beans
 
#### Microservice: Adidas Zuul
##### Description
Proxy server
##### Frameworks used
 - Router and Filter: automatic regsitration of Zuul filters, and a
   simple convention over configuration approach to reverse proxy
   creation
 - Service Discovery: an embedded Eureka server can be created with declarative Java configuration
   
#### Microservice: Adidas Eureka
##### Description
Eureka server
##### Frameworks used
 - Service Discovery: an embedded Eureka server can be created with declarative Java configuration

#### Documentation

[Documentação http://localhost:2020/swagger-ui.html](http://localhost:2020/swagger-ui.html) 

## Travis CI

Travis CI was implemented with just a simple commands to demonstrate if the spring boot building are passing.

Normally, we should create one profile "prod" and configure all urls from heroku or whatever PaaS.

## Authors

**Iorran Castro** - [Github](https://github.com/iorran)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
 

