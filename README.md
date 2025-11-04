# TaskFlowAPI# TaskFlowAPI# TaskFlowAPI



A comprehensive REST API for task management built with Spring Boot 3, providing user management and task organization capabilities.



[![GitHub release (latest by date)](https://img.shields.io/github/v/release/muracciolei/TaskFlowAPI)](https://github.com/muracciolei/TaskFlowAPI/releases)A comprehensive REST API for task management built with Spring Boot 3, providing user management and task organization capabilities.A comprehensive REST API for task management built with Spring Boot 3, providing user management and task organization capabilities.

[![Download Latest Release](https://img.shields.io/badge/Download-Latest%20Release-blue)](https://github.com/muracciolei/TaskFlowAPI/releases/latest)

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)

![Java Version](https://img.shields.io/badge/java-17-orange)

![Spring Boot](https://img.shields.io/badge/spring%20boot-3.2.0-green)[![GitHub release (latest by date)](https://img.shields.io/github/v/release/muracciolei/TaskFlowAPI)](https://github.com/muracciolei/TaskFlowAPI/releases)[![GitHub release (latest by date)](https://img.shields.io/github/v/release/muracciolei/TaskFlowAPI)](https://github.com/muracciolei/TaskFlowAPI/releases)

![License](https://img.shields.io/badge/license-MIT-blue)

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)![Build Status](https://img.shields.io/badge/build-passing-brightgreen)

## 🚀 Features

![Java Version](https://img.shields.io/badge/java-17-orange)![Java Version](https://img.shields.io/badge/java-17-orange)

- **User Management**: Register, authenticate, and manage user profiles

- **Task Management**: Create, update, delete, and organize tasks![Spring Boot](https://img.shields.io/badge/spring%20boot-3.2.0-green)![Spring Boot](https://img.shields.io/badge/spring%20boot-3.2.0-green)

- **Status Tracking**: Track tasks with statuses (PENDING, IN_PROGRESS, COMPLETED)

- **User Assignment**: Assign tasks to specific users![License](https://img.shields.io/badge/license-MIT-blue)

- **Due Dates**: Set and track task deadlines

- **RESTful API**: Full REST API with proper HTTP methods and status codes![Spring Boot](https://img.shields.io/badge/spring%20boot-3.2.0-green)[![Maven](https://img.shields.io/badge/Maven-3.8.0-blue.svg)](https://maven.apache.org/)

- **Data Persistence**: H2 database for development, PostgreSQL ready for production

- **Security**: Spring Security integration with CORS support## 🚀 Features

- **Documentation**: Swagger/OpenAPI integration for API documentation

![License](https://img.shields.io/badge/license-MIT-blue)[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## 🏗️ Tech Stack

- **User Management**: Register, authenticate, and manage user profiles

- **Framework**: Spring Boot 3.2.0

- **Language**: Java 17- **Task Management**: Create, update, delete, and organize tasks

- **Database**: H2 (development) / PostgreSQL (production)

- **ORM**: Spring Data JPA / Hibernate- **Status Tracking**: Track tasks with statuses (PENDING, IN_PROGRESS, COMPLETED)

- **Security**: Spring Security

- **Build Tool**: Maven 3.9.5- **User Assignment**: Assign tasks to specific users## 🚀 Features## 📋 Table of Contents

- **Documentation**: Swagger/OpenAPI 3

- **Testing**: JUnit 5, Mockito- **Due Dates**: Set and track task deadlines



## 📋 Prerequisites- **RESTful API**: Full REST API with proper HTTP methods and status codes



- Java 17 or higher- **Data Persistence**: H2 database for development, PostgreSQL ready for production

- Maven 3.6 or higher

- Git- **Security**: Spring Security integration with CORS support- **User Management**: Register, authenticate, and manage user profiles- [Features](#features)



## 🛠️ Installation & Setup- **Documentation**: Swagger/OpenAPI integration for API documentation



### 1. Clone the repository- **Task Management**: Create, update, delete, and organize tasks- [Architecture](#architecture)

```bash

git clone https://github.com/muracciolei/TaskFlowAPI.git## 🏗️ Tech Stack

cd TaskFlowAPI

```- **Status Tracking**: Track tasks with statuses (PENDING, IN_PROGRESS, COMPLETED)- [Prerequisites](#prerequisites)



### 2. Build the project- **Framework**: Spring Boot 3.2.0

```bash

mvn clean install- **Language**: Java 17- **User Assignment**: Assign tasks to specific users- [Installation](#installation)

```

- **Database**: H2 (development) / PostgreSQL (production)

### 3. Run the application

```bash- **ORM**: Spring Data JPA / Hibernate- **Due Dates**: Set and track task deadlines- [Quick Start](#quick-start)

mvn spring-boot:run

```- **Security**: Spring Security



The application will start on `http://localhost:8081/api`- **Build Tool**: Maven 3.9.5- **RESTful API**: Full REST API with proper HTTP methods and status codes- [Docker Setup](#docker-setup)



### 4. Access H2 Console (Development)- **Documentation**: Swagger/OpenAPI 3

- URL: `http://localhost:8081/api/h2-console`

- JDBC URL: `jdbc:h2:mem:taskflowdb`- **Testing**: JUnit 5, Mockito- **Data Persistence**: H2 database for development, PostgreSQL ready for production- [API Documentation](#api-documentation)

- Username: `sa`

- Password: (leave empty)



### 5. API Documentation## 📋 Prerequisites- **Security**: Spring Security integration with CORS support- [Project Structure](#project-structure)

Access Swagger UI at: `http://localhost:8081/api/swagger-ui.html`



## 📦 Releases

- Java 17 or higher- **Documentation**: Swagger/OpenAPI integration for API documentation- [Technologies](#technologies)

### 📥 **[Download Latest Release](https://github.com/muracciolei/TaskFlowAPI/releases/latest)**

- Maven 3.6 or higher

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/muracciolei/TaskFlowAPI?style=for-the-badge)](https://github.com/muracciolei/TaskFlowAPI/releases/latest)

- Git- [Contributing](#contributing)

### Release History

- **v1.0.0** - Initial release with core functionality

- See all releases: **[Release Notes](https://github.com/muracciolei/TaskFlowAPI/releases)**

## 🛠️ Installation & Setup## 🏗️ Tech Stack- [License](#license)

## 📚 API Endpoints



### User Management

### 1. Clone the repository

| Method | Endpoint | Description |

|--------|----------|-------------|```bash

| GET | `/api/users` | Get all users |

| POST | `/api/users` | Create a new user |git clone https://github.com/muracciolei/TaskFlowAPI.git- **Framework**: Spring Boot 3.2.0## ✨ Features

| GET | `/api/users/{id}` | Get user by ID |

| PUT | `/api/users/{id}` | Update user |cd TaskFlowAPI

| DELETE | `/api/users/{id}` | Delete user |

```- **Language**: Java 17

### Task Management



| Method | Endpoint | Description |

|--------|----------|-------------|### 2. Build the project- **Database**: H2 (development) / PostgreSQL (production)### Core Functionality

| GET | `/api/tasks` | Get all tasks |

| POST | `/api/tasks` | Create a new task |```bash

| GET | `/api/tasks/{id}` | Get task by ID |

| PUT | `/api/tasks/{id}` | Update task |mvn clean install- **ORM**: Spring Data JPA / Hibernate- ✅ **User Management** - Registration, authentication, and authorization

| DELETE | `/api/tasks/{id}` | Delete task |

| GET | `/api/tasks/user/{userId}` | Get tasks by user |```

| GET | `/api/tasks/status/{status}` | Get tasks by status |

- **Security**: Spring Security- ✅ **Task CRUD Operations** - Create, read, update, delete tasks

## 📖 Usage Examples

### 3. Run the application

### Create a User

```bash```bash- **Build Tool**: Maven 3.9.5- ✅ **Task Status Tracking** - Multiple status workflows (Open, In Progress, In Review, Completed, Cancelled)

curl -X POST http://localhost:8081/api/users \

  -H "Content-Type: application/json" \mvn spring-boot:run

  -d '{

    "username": "johndoe",```- **Documentation**: Swagger/OpenAPI 3- ✅ **Priority Management** - Task prioritization (Low, Medium, High, Critical)

    "email": "john.doe@example.com",

    "password": "securepassword"

  }'

```The application will start on `http://localhost:8081/api`- **Testing**: JUnit 5, Mockito- ✅ **Team Collaboration** - Assign tasks to team members and track assignments



### Create a Task

```bash

curl -X POST http://localhost:8081/api/tasks \### 4. Access H2 Console (Development)- ✅ **Project Management** - Organize tasks within projects

  -H "Content-Type: application/json" \

  -d '{- URL: `http://localhost:8081/api/h2-console`

    "title": "Complete project documentation",

    "description": "Write comprehensive README and API docs",- JDBC URL: `jdbc:h2:mem:taskflowdb`## 📋 Prerequisites

    "dueDate": "2025-12-31",

    "status": "PENDING",- Username: `sa`

    "userId": 1

  }'- Password: (leave empty)### Technical Features

```



### Get Tasks by Status

```bash### 5. API Documentation- Java 17 or higher- ✅ **JWT Authentication** - Secure token-based authentication

curl http://localhost:8081/api/tasks/status/PENDING

```Access Swagger UI at: `http://localhost:8081/api/swagger-ui.html`



## 🔧 Configuration- Maven 3.6 or higher- ✅ **Role-Based Access Control** - Admin, Project Manager, Team Lead, User roles



The application can be configured through `application.yml`:## 📚 API Endpoints



### Database Configuration- Git- ✅ **RESTful API** - Clean, standards-compliant REST endpoints

```yaml

spring:### User Management

  datasource:

    url: jdbc:h2:mem:taskflowdb  # H2 for development- ✅ **PostgreSQL Database** - Persistent data storage with migrations

    # url: jdbc:postgresql://localhost:5432/taskflowdb  # PostgreSQL for production

```| Method | Endpoint | Description |



### Server Configuration|--------|----------|-------------|## 🛠️ Installation & Setup- ✅ **Redis Caching** - Performance optimization with Redis cache

```yaml

server:| GET | `/api/users` | Get all users |

  port: 8081

  servlet:| POST | `/api/users` | Create a new user |- ✅ **Swagger/OpenAPI** - Auto-generated API documentation

    context-path: /api

```| GET | `/api/users/{id}` | Get user by ID |



## 🗃️ Database Schema| PUT | `/api/users/{id}` | Update user |### 1. Clone the repository- ✅ **Docker Support** - Containerized deployment ready



### Users Table| DELETE | `/api/users/{id}` | Delete user |

- `id` (BIGINT, Primary Key)

- `username` (VARCHAR, Unique)```bash- ✅ **Spring Security** - Comprehensive security configuration

- `email` (VARCHAR, Unique)

- `password` (VARCHAR)### Task Management



### Tasks Tablegit clone git@github.com:muracciolei/TaskFlowAPI.git

- `id` (BIGINT, Primary Key)

- `title` (VARCHAR)| Method | Endpoint | Description |

- `description` (TEXT)

- `due_date` (DATE)|--------|----------|-------------|cd TaskFlowAPI## 🏗️ Architecture

- `status` (VARCHAR): PENDING, IN_PROGRESS, COMPLETED

- `user_id` (BIGINT, Foreign Key)| GET | `/api/tasks` | Get all tasks |



## 🧪 Testing| POST | `/api/tasks` | Create a new task |```



Run tests with:| GET | `/api/tasks/{id}` | Get task by ID |

```bash

mvn test| PUT | `/api/tasks/{id}` | Update task |```

```

| DELETE | `/api/tasks/{id}` | Delete task |

## 🚀 Deployment

| GET | `/api/tasks/user/{userId}` | Get tasks by user |### 2. Build the projectTaskFlowAPI/

### Production Configuration

| GET | `/api/tasks/status/{status}` | Get tasks by status |

1. Update `application.yml` for production database

2. Set environment variables:```bash├── src/

   ```bash

   export SPRING_PROFILES_ACTIVE=production## 📖 Usage Examples

   export DATABASE_URL=your_production_db_url

   export DATABASE_USERNAME=your_db_usernamemvn clean install│   ├── main/

   export DATABASE_PASSWORD=your_db_password

   ```### Create a User



3. Build production JAR:```bash```│   │   ├── java/com/taskflow/

   ```bash

   mvn clean package -Pprodcurl -X POST http://localhost:8081/api/users \

   ```

  -H "Content-Type: application/json" \│   │   │   ├── controller/       # REST API endpoints

4. Run the application:

   ```bash  -d '{

   java -jar target/taskflow-api-1.0.0.jar

   ```    "username": "johndoe",### 3. Run the application│   │   │   ├── service/          # Business logic layer



## 🤝 Contributing    "email": "john.doe@example.com",



1. Fork the repository    "password": "securepassword"```bash│   │   │   ├── repository/       # Data access layer

2. Create a feature branch (`git checkout -b feature/amazing-feature`)

3. Commit your changes (`git commit -m 'Add some amazing feature'`)  }'

4. Push to the branch (`git push origin feature/amazing-feature`)

5. Open a Pull Request```mvn spring-boot:run│   │   │   ├── model/            # Entity models



## 📄 License



This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.### Create a Task```│   │   │   ├── dto/              # Data transfer objects



## 📞 Support```bash



If you have any questions or issues, please:curl -X POST http://localhost:8081/api/tasks \│   │   │   ├── security/         # Security configuration

1. Check the [API documentation](http://localhost:8081/api/swagger-ui.html)

2. Review existing [issues](https://github.com/muracciolei/TaskFlowAPI/issues)  -H "Content-Type: application/json" \

3. Create a new issue if needed

  -d '{The application will start on `http://localhost:8081/api`│   │   │   ├── exception/        # Custom exceptions

## 🎯 Roadmap

    "title": "Complete project documentation",

- [ ] JWT Authentication

- [ ] Role-based access control    "description": "Write comprehensive README and API docs",│   │   │   └── util/             # Utility classes

- [ ] Task categories and tags

- [ ] File attachments for tasks    "dueDate": "2025-12-31",

- [ ] Email notifications

- [ ] Task comments and collaboration    "status": "PENDING",### 4. Access H2 Console (Development)│   │   └── resources/

- [ ] Advanced filtering and search

- [ ] Mobile API optimization    "userId": 1



## 📊 Project Status  }'- URL: `http://localhost:8081/api/h2-console`│   │       ├── application.yml    # Application configuration



**TaskFlowAPI** - Streamline your task management workflow with a powerful, RESTful API.```



---- JDBC URL: `jdbc:h2:mem:taskflowdb`│   │       └── db/migrations/    # Database migrations



**Version**: 1.0.0  ### Get Tasks by Status

**Last Updated**: November 2025
```bash- Username: `sa`│   └── test/                     # Test cases

curl http://localhost:8081/api/tasks/status/PENDING

```- Password: (leave empty)├── pom.xml                       # Maven dependencies



## 🔧 Configuration├── Dockerfile                    # Docker container definition



The application can be configured through `application.yml`:### 5. API Documentation├── docker-compose.yml            # Docker Compose orchestration



### Database ConfigurationAccess Swagger UI at: `http://localhost:8081/api/swagger-ui.html`└── README.md                     # This file

```yaml

spring:```

  datasource:

    url: jdbc:h2:mem:taskflowdb  # H2 for development## 📚 API Endpoints

    # url: jdbc:postgresql://localhost:5432/taskflowdb  # PostgreSQL for production

```## 📦 Prerequisites



### Server Configuration### User Management

```yaml

server:### Required

  port: 8081

  servlet:| Method | Endpoint | Description |- **Java 17+** - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)

    context-path: /api

```|--------|----------|-------------|- **Maven 3.8.0+** - Download from [Maven Download Page](https://maven.apache.org/download.cgi)



## 🗃️ Database Schema| GET | `/api/users` | Get all users |- **PostgreSQL 12+** - Download from [PostgreSQL Downloads](https://www.postgresql.org/download/)



### Users Table| POST | `/api/users` | Create a new user |- **Git** - Download from [Git SCM](https://git-scm.com/)

- `id` (BIGINT, Primary Key)

- `username` (VARCHAR, Unique)| GET | `/api/users/{id}` | Get user by ID |

- `email` (VARCHAR, Unique)

- `password` (VARCHAR)| PUT | `/api/users/{id}` | Update user |### Optional (For Docker)



### Tasks Table| DELETE | `/api/users/{id}` | Delete user |- **Docker 20.10+** - Download from [Docker Desktop](https://www.docker.com/products/docker-desktop)

- `id` (BIGINT, Primary Key)

- `title` (VARCHAR)- **Docker Compose 2.0+** - Usually included with Docker Desktop

- `description` (TEXT)

- `due_date` (DATE)### Task Management

- `status` (VARCHAR): PENDING, IN_PROGRESS, COMPLETED

- `user_id` (BIGINT, Foreign Key)## 🚀 Installation



## 🧪 Testing| Method | Endpoint | Description |



Run tests with:|--------|----------|-------------|### Step 1: Clone the Repository

```bash

mvn test| GET | `/api/tasks` | Get all tasks |```bash

```

| POST | `/api/tasks` | Create a new task |git clone https://github.com/yourusername/taskflow-api.git

## 📦 Releases

| GET | `/api/tasks/{id}` | Get task by ID |cd taskflow-api

### Latest Release

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/muracciolei/TaskFlowAPI)](https://github.com/muracciolei/TaskFlowAPI/releases/latest)| PUT | `/api/tasks/{id}` | Update task |```



**[📥 Download Latest Release](https://github.com/muracciolei/TaskFlowAPI/releases/latest)**| DELETE | `/api/tasks/{id}` | Delete task |



### Release History| GET | `/api/tasks/user/{userId}` | Get tasks by user |### Step 2: Configure Database

- **v1.0.0** - Initial release with core functionality

- See all releases: [Release Notes](https://github.com/muracciolei/TaskFlowAPI/releases)| GET | `/api/tasks/status/{status}` | Get tasks by status |



## 🚀 DeploymentCreate PostgreSQL database:



### Production Configuration## 📖 Usage Examples```sql



1. Update `application.yml` for production databaseCREATE DATABASE taskflowdb;

2. Set environment variables:

   ```bash### Create a UserCREATE USER taskflow WITH PASSWORD 'taskflow_secure_password_2024';

   export SPRING_PROFILES_ACTIVE=production

   export DATABASE_URL=your_production_db_url```bashALTER ROLE taskflow SET client_encoding TO 'utf8';

   export DATABASE_USERNAME=your_db_username

   export DATABASE_PASSWORD=your_db_passwordcurl -X POST http://localhost:8081/api/users \ALTER ROLE taskflow SET default_transaction_isolation TO 'read committed';

   ```

  -H "Content-Type: application/json" \ALTER ROLE taskflow SET timezone TO 'UTC';

3. Build production JAR:

   ```bash  -d '{GRANT ALL PRIVILEGES ON DATABASE taskflowdb TO taskflow;

   mvn clean package -Pprod

   ```    "username": "johndoe",```



4. Run the application:    "email": "john.doe@example.com",

   ```bash

   java -jar target/taskflow-api-1.0.0.jar    "password": "securepassword"### Step 3: Update Configuration

   ```

  }'

## 🤝 Contributing

```Edit `src/main/resources/application.yml` with your database credentials:

1. Fork the repository

2. Create a feature branch (`git checkout -b feature/amazing-feature`)```yaml

3. Commit your changes (`git commit -m 'Add some amazing feature'`)

4. Push to the branch (`git push origin feature/amazing-feature`)### Create a Taskspring:

5. Open a Pull Request

```bash  datasource:

## 📄 License

curl -X POST http://localhost:8081/api/tasks \    url: jdbc:postgresql://localhost:5432/taskflowdb

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

  -H "Content-Type: application/json" \    username: taskflow

## 📞 Support

  -d '{    password: taskflow_secure_password_2024

If you have any questions or issues, please:

1. Check the [API documentation](http://localhost:8081/api/swagger-ui.html)    "title": "Complete project documentation",```

2. Review existing [issues](https://github.com/muracciolei/TaskFlowAPI/issues)

3. Create a new issue if needed    "description": "Write comprehensive README and API docs",



## 🎯 Roadmap    "dueDate": "2025-12-31",### Step 4: Build the Project



- [ ] JWT Authentication    "status": "PENDING",```bash

- [ ] Role-based access control

- [ ] Task categories and tags    "userId": 1mvn clean install

- [ ] File attachments for tasks

- [ ] Email notifications  }'```

- [ ] Task comments and collaboration

- [ ] Advanced filtering and search```

- [ ] Mobile API optimization

## ⚡ Quick Start

## 📊 Project Status

### Get Tasks by Status

**TaskFlowAPI** - Streamline your task management workflow with a powerful, RESTful API.

```bash### Run Locally

---

curl http://localhost:8081/api/tasks/status/PENDING```bash

**Version**: 1.0.0  

**Last Updated**: November 2025```# Using Maven

mvn spring-boot:run

## 🔧 Configuration

# Using JAR file (after building)

The application can be configured through `application.yml`:java -jar target/taskflow-api-1.0.0.jar

```

### Database Configuration

```yamlThe API will be available at: `http://localhost:8080/api`

spring:

  datasource:### Access Swagger UI

    url: jdbc:h2:mem:taskflowdb  # H2 for developmentNavigate to: `http://localhost:8080/api/swagger-ui.html`

    # url: jdbc:postgresql://localhost:5432/taskflowdb  # PostgreSQL for production

```## 🐳 Docker Setup



### Server Configuration### Using Docker Compose (Recommended)

```yaml```bash

server:# Start all services

  port: 8081docker-compose up -d

  servlet:

    context-path: /api# View logs

```docker-compose logs -f taskflow-api



## 🗃️ Database Schema# Stop services

docker-compose down

### Users Table```

- `id` (BIGINT, Primary Key)

- `username` (VARCHAR, Unique)Services:

- `email` (VARCHAR, Unique)- **TaskFlowAPI**: `http://localhost:8080/api`

- `password` (VARCHAR)- **PostgreSQL**: Port `5432`

- **Redis**: Port `6379`

### Tasks Table

- `id` (BIGINT, Primary Key)### Using Docker Directly

- `title` (VARCHAR)```bash

- `description` (TEXT)# Build Docker image

- `due_date` (DATE)docker build -t taskflow-api:1.0.0 .

- `status` (VARCHAR): PENDING, IN_PROGRESS, COMPLETED

- `user_id` (BIGINT, Foreign Key)# Run container

docker run -p 8080:8080 \

## 🧪 Testing  -e SPRING_DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/taskflowdb \

  -e SPRING_DATASOURCE_USERNAME=taskflow \

Run tests with:  -e SPRING_DATASOURCE_PASSWORD=taskflow_secure_password_2024 \

```bash  taskflow-api:1.0.0

mvn test```

```

## 📚 API Documentation

## 🚀 Deployment

### Authentication Endpoints

### Production Configuration

**Login**

1. Update `application.yml` for production database```http

2. Set environment variables:POST /api/auth/login

   ```bashContent-Type: application/json

   export SPRING_PROFILES_ACTIVE=production

   export DATABASE_URL=your_production_db_url{

   export DATABASE_USERNAME=your_db_username  "username": "user@example.com",

   export DATABASE_PASSWORD=your_db_password  "password": "password123"

   ```}



3. Build production JAR:Response: 200 OK

   ```bash{

   mvn clean package -Pprod  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",

   ```  "refreshToken": "...",

  "expiresIn": 86400

4. Run the application:}

   ```bash```

   java -jar target/taskflow-api-1.0.0.jar

   ```### Task Endpoints



## 🤝 Contributing**Get All Tasks**

```http

1. Fork the repositoryGET /api/tasks

2. Create a feature branch (`git checkout -b feature/amazing-feature`)Authorization: Bearer <jwt_token>

3. Commit your changes (`git commit -m 'Add some amazing feature'`)```

4. Push to the branch (`git push origin feature/amazing-feature`)

5. Open a Pull Request**Get Task by ID**

```http

## 📄 LicenseGET /api/tasks/{id}

Authorization: Bearer <jwt_token>

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.```



## 📞 Support**Create Task**

```http

If you have any questions or issues, please:POST /api/tasks

1. Check the [API documentation](http://localhost:8081/api/swagger-ui.html)Content-Type: application/json

2. Review existing [issues](https://github.com/muracciolei/TaskFlowAPI/issues)Authorization: Bearer <jwt_token>

3. Create a new issue if needed

{

## 🎯 Roadmap  "code": "TASK-001",

  "title": "Implement user authentication",

- [ ] JWT Authentication  "description": "Set up JWT-based authentication",

- [ ] Role-based access control  "status": "OPEN",

- [ ] Task categories and tags  "priority": "HIGH",

- [ ] File attachments for tasks  "projectId": 1,

- [ ] Email notifications  "estimatedHours": 8.0

- [ ] Task comments and collaboration}

- [ ] Advanced filtering and search```

- [ ] Mobile API optimization

**Update Task**

## 📊 Project Status```http

PUT /api/tasks/{id}

**TaskFlowAPI** - Streamline your task management workflow with a powerful, RESTful API.Content-Type: application/json

Authorization: Bearer <jwt_token>

---```



**Version**: 1.0.0  **Delete Task**

**Last Updated**: November 2025```http
DELETE /api/tasks/{id}
Authorization: Bearer <jwt_token>
```

## 📁 Project Structure

### Models
- `Task.java` - Task entity with status and priority enums
- `User.java` - User entity implementing Spring Security UserDetails
- `Project.java` - Project entity for task organization

### Repositories (Data Access)
- `TaskRepository.java` - JPA repository for Task entity
- `UserRepository.java` - JPA repository for User entity
- `ProjectRepository.java` - JPA repository for Project entity

### Services (Business Logic)
- `TaskService.java` - Task management operations
- `UserService.java` - User management and authentication
- `ProjectService.java` - Project management operations

### Controllers (REST API)
- `TaskController.java` - Task REST endpoints
- `UserController.java` - User REST endpoints
- `ProjectController.java` - Project REST endpoints
- `AuthController.java` - Authentication endpoints

### Security
- `JwtTokenProvider.java` - JWT token generation and validation
- `JwtAuthenticationFilter.java` - JWT authentication filter
- `SecurityConfig.java` - Spring Security configuration

## 🛠️ Technologies

### Backend
- **Java 17** - Language
- **Spring Boot 3.2.0** - Framework
- **Spring Security** - Authentication & Authorization
- **Spring Data JPA** - ORM & Database Access
- **Maven** - Build Tool

### Database
- **PostgreSQL** - Primary Database
- **H2** - Development Database
- **Redis** - Caching Layer

### Libraries
- **JWT (JJWT)** - Token Authentication
- **Lombok** - Code Generation
- **Springdoc OpenAPI** - API Documentation
- **Jakarta Persistence** - JPA Implementation

### DevOps
- **Docker** - Containerization
- **Docker Compose** - Container Orchestration

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Support

For issues, questions, or suggestions, please create an issue on GitHub or contact the development team.

---

**Made with ❤️ by the TaskFlow Team**

*Last Updated: 2024*