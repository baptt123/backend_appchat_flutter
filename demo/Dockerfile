FROM openjdk:21
ARG FILE_JAR=target/*.jar
ADD ${FILE_JAR} api-service-springboot.jar
ENTRYPOINT {"java","-jar","api-service-springboot.jar"}
EXPOSE 8080
