# DevOps Java Web Application

A small Maven WAR application for practising a Jenkins-to-Tomcat deployment.

## Requirements
- JDK 17 or newer
- Maven 3.8+
- Apache Tomcat 9

## Build locally
```bash
mvn clean package
```

The WAR file will be created at:
`target/devops-java-webapp.war`

## Test on Tomcat
Copy the WAR file into Tomcat's `webapps/` directory, start Tomcat, then open:
`http://YOUR_TOMCAT_HOST:8080/devops-java-webapp/`

## Jenkins build command
```bash
mvn clean package
```
