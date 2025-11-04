# Multi-stage Build Dockerfile for TaskFlowAPI
# Stage 1: Build stage using Maven and Java 17
FROM eclipse-temurin:17-jdk-focal as builder

# Set working directory
WORKDIR /app

# Copy Maven project files
COPY pom.xml .
COPY src ./src

# Install Maven
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Runtime stage
FROM eclipse-temurin:17-jre-focal

# Set metadata labels
LABEL maintainer="TaskFlow Team <info@taskflow.com>"
LABEL version="1.0.0"
LABEL description="TaskFlowAPI - Spring Boot REST API for Task Management"

# Set working directory
WORKDIR /app

# Create logs directory
RUN mkdir -p /app/logs && chmod 755 /app/logs

# Copy the JAR file from builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Set environment variables
ENV JAVA_OPTS="-Xmx512m -Xms256m -Dfile.encoding=UTF-8"
ENV SPRING_PROFILES_ACTIVE="docker"

# Create a non-root user for security
RUN useradd -m -u 1000 taskflow
USER taskflow

# Health check
HEALTHCHECK --interval=30s --timeout=10s --start-period=5s --retries=3 \
  CMD java -cp app.jar org.springframework.boot.loader.JarLauncher > /dev/null 2>&1 || exit 1

# Run the application
ENTRYPOINT ["java", "-jar"]
CMD ["app.jar"]