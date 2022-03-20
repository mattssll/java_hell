FROM maven:3.5-jdk-8 AS build
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]