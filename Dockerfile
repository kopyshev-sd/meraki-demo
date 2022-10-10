FROM openjdk:17-oracle
ADD target/meraki-fake-api.jar meraki-fake-api.jar
ENTRYPOINT ["java", "-jar","meraki-fake-api.jar"]
EXPOSE 8080