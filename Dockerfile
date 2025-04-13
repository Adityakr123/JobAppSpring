# Use Java 24 JDK base image
FROM eclipse-temurin:24-jdk

# Set working directory
WORKDIR /app

# Copy everything (code, pom.xml, mvnw, etc.)
COPY . .

# Grant permission to mvnw (in case it's not executable)
RUN chmod +x mvnw

# Use Maven wrapper to build the app and skip tests
RUN ./mvnw clean package -DskipTests

# Expose Spring Boot port
EXPOSE 8080

# Run the built JAR (replace if needed)
CMD ["java", "-jar", "target/FirstJobAPP-0.0.1-SNAPSHOT.jar"]
