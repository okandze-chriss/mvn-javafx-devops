# Build stage
FROM maven:3.9.5-amazoncorretto-21 AS build
WORKDIR /home/app
COPY . .
RUN mvn javafx:run
