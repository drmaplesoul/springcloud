FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD userserver-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom $params","-jar","/app.jar"]
RUN apt-get update
RUN apt-get install vim -y
RUN apt-get install iputils-ping -y
RUN apt-get install net-tools -y
RUN apt-get install telnetd-ssl -y
RUN apt-get install xinetd -y
RUN apt-get install telnetd -y