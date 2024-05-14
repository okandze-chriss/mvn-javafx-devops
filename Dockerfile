FROM openjdk:17-jdk-alpine
WORKDIR /tmp
COPY out/artifacts/mvn_javafx_devops_jar/mvn-javafx-devops.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]