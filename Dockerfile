FROM openjdk:17-jdk

WORKDIR /app

COPY target/docker-1.0.jar /app/docker.jar

EXPOSE 8080

CMD ["java", "-jar", "docker.jar"]