FROM maven:3.9.9-eclipse-temurin-21

WORKDIR /app

COPY pom.xml .
COPY src ./src

EXPOSE 8080

ENTRYPOINT ["mvn", "spring-boot:run", "-Dspring-boot.run.profiles=dev"]
