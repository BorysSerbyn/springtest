FROM bitnami/java:15
WORKDIR /app
COPY target/*.jar server.jar
CMD java -jar server.jar