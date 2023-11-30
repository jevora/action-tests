FROM openjdk:11
COPY target/action-test.jar /app/action-test.jar
WORKDIR /app
CMD ["java", "-jar", "action-test.jar"]
