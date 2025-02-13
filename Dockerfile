FROM openjdk:17-jdk-slim

COPY ./target/spring-boot-mongodb-recipes-0.0.1-SNAPSHOT.jar devops-app.jar

EXPOSE 9191

ENTRYPOINT ["java","-jar","/devops-app.jar"]