FROM eclipse-temurin:17-jdk-jammy

COPY target/state-service-0.0.1-SNAPSHOT.jar /tmp/state-service.jar

CMD ["java", "-jar", "/tmp/state-service.jar"]
