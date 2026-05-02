#FROM ubuntu:latest
#LABEL authors="rishabranjan"
#
#ENTRYPOINT ["top", "-b"]
FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]