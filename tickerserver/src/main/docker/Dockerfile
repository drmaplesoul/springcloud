FROM openjdk:9-jdk-alpine
VOLUME /tmp
ADD tickerserver-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom $params","-jar","/app.jar"]