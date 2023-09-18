FROM openjdk:22-slim-bookworm
RUN apt-get update
RUN apt-get -y install curl
WORKDIR /app
COPY /target/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]