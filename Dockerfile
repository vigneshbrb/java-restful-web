# From: Pulling Image from Docker Hub
FROM openjdk:16-alpine3.13
# Copying some files or directories from HOST Machine into docker image
COPY target/java-restful-web-0.0.1-SNAPSHOT.jar app.jar
# Running java command inside docker image using docker engine
CMD ["java", "-jar", "app.jar"]