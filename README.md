# SimpleBlog
## Introduction
- Purpose of this repo is to have a demo JAVA application, also showcase some advanced JAVA features like JSF2, Spring3,
Spring Security and JPA(Hibernate). This repo is a fork from [rohan-s-raju](https://github.com/rohan-s-raju/SimpleBlog).
- This demo can be used for training and demo purposes for code quality and automated testing and CI/CD.
## Initial setup instructions
## Prerequisites
- JDK 1.8
- Maven
- [Flyway](https://flywaydb.org) for database migrations


## Get the sources
- `git clone https://github.com/endegraaf/SimpleBlog.git`
- `cd SimpleBlog`

## Preparation
- Create a local mysql database `blog`
- Create a user `bloguser` with password `blogpassword` and grant permission on `blog`
```
DROP DATABASE if exists `blog`; 
CREATE DATABASE `blog` CHARACTER SET utf8;
CREATE USER bloguser@'localhost' IDENTIFIED BY 'blogpassword';
GRANT ALL PRIVILEGES ON blog.* TO 'bloguser'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
```
*Note: the default username and passwords are changeable in applicationContext.xml in the WEB-INF folder.*
- From the command line (assume you have Flyway on your path), run:
```
flyway  -baselineOnMigrate=false -url=jdbc:mysql://localhost/ -schemas=blog -user=bloguser -password=blogpassword -locations=filesystem:src/main/resources/db/migration/ migrate
```

## Running the demo app
- mvn clean install
- mvn tomcat7:run-war

## Use the demo
- Visit your new demo app on [localhost](http://localhost:8088/blog/index.xhtml)


