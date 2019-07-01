FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD userserver-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom $params","-jar","/app.jar"]