# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="iorranpt@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8083 available to the world outside this container
EXPOSE 8083

# The application's jar file
ARG JAR_FILE=target/adidas-evt-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} adidas-evt.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=compose","-jar","/adidas-evt.jar"]