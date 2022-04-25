FROM openjdk:16-alpine3.13
COPY target/java-restful-web-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]