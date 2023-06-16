
FROM maven:3.6.3-jdk-11-slim AS build
FROM openjdk:11
COPY src /home/app/src
COPY pom.xml /home/app
COPY target /home/app/target

WORKDIR /home/app/target

CMD ["java", "-jar", "sostool-backend-0.0.1-SNAPSHOT.jar"]