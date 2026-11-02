# CampusFlow – Productivity & Task Management Platform

CampusFlow is a task management application designed to help users organize tasks, manage priorities, track deadlines, and handle task dependencies through a centralized platform.

The project demonstrates full-stack development using **Java, Spring Boot, React, and MySQL**, along with the practical use of common data structures and JWT-based authentication.

## 🚀 Tech Stack

| Layer | Technologies |
|---|---|
| Frontend | React.js, JavaScript, HTML, CSS |
| Backend | Java, Spring Boot, Spring Security |
| Database | MySQL |
| ORM | Spring Data JPA, Hibernate |
| Authentication | JWT (JSON Web Token) |
| Build Tool | Maven |
| Version Control | Git, GitHub |

## ✨ Features

- **Task Management:** Create, view, update, and delete tasks.
- **Priority Management:** Organize tasks according to their priority.
- **Deadline Tracking:** Store due dates and task status.
- **Task Dependencies:** Represent relationships between tasks and check for circular dependencies.
- **Autocomplete:** Search task names using prefix-based suggestions.
- **Undo and Redo:** Demonstrate reversing and restoring recent actions.
- **Recently Viewed Tasks:** Maintain recently accessed tasks using an LRU cache.
- **Authentication:** Secure API access using JWT authentication.
- **Role-Based Authorization:** Restrict administrative endpoints based on user roles.
- **Persistent Storage:** Store task information in MySQL using JPA and Hibernate.

## 🧠 Data Structures Used

One of the key aspects of CampusFlow is demonstrating how data structures can solve practical application problems.

| Data Structure | Application |
|---|---|
| Priority Queue (Min Heap) | Organizing tasks based on priority |
| Graph | Representing task dependencies and detecting cycles |
| Trie | Prefix-based task autocomplete |
| Stack | Supporting Undo and Redo operations |
| LRU Cache | Managing recently accessed tasks |

## 🏗️ System Architecture

The application follows a simple three-layer architecture:

```text
       React Frontend
             |
             | REST API Requests
             v
      Spring Boot Backend
             |
       Service Layer
             |
     Data Structures
             |
       JPA / Hibernate
             |
             v
         MySQL Database
```

- **Frontend:** Provides the user interface for managing tasks.
- **Controller Layer:** Handles HTTP requests and responses.
- **Service Layer:** Contains application logic.
- **Data Structures:** Demonstrates priority scheduling, dependency validation, autocomplete, undo/redo, and caching.
- **Repository Layer:** Handles database operations through Spring Data JPA.
- **Database:** Stores task records persistently.

## 📁 Project Structure

```text
CampusFlow/
│
├── backend/
│   ├── src/main/java/
│   │   └── com/campusflow/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       ├── model/
│   │       ├── security/
│   │       └── structures/
│   │
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
│
├── frontend/
│   ├── src/
│   │   ├── App.jsx
│   │   └── App.css
│   ├── package.json
│   └── vite.config.js
│
├── docs/
│   └── 3-hour-plan.md
│
└── README.md
```

## ⚙️ Setup and Installation

### Prerequisites

- Java 17 or later
- Maven
- Node.js and npm
- MySQL

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/CampusFlow.git
cd CampusFlow
```

### 2. Create the MySQL database

Open MySQL and execute:

```sql
CREATE DATABASE campusflow;
```

Configure your database credentials and JWT secret using the environment variables referenced in `backend/src/main/resources/application.properties`.

### 3. Run the Spring Boot backend

```bash
cd backend
mvn spring-boot:run
```

The backend starts on:

```text
http://localhost:8080
```

### 4. Run the React frontend

Open another terminal:

```bash
cd frontend
npm install
npm run dev
```

Open the local URL displayed by Vite in your browser.

### 5. Demo Login

```text
Username: admin
Password: admin123
```

The project currently uses a demo account for authentication.

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/login` | Authenticate and obtain a JWT |
| GET | `/api/tasks` | Retrieve all tasks |
| POST | `/api/tasks` | Create a task |
| PUT | `/api/tasks/{id}` | Update a task |
| DELETE | `/api/tasks/{id}` | Delete a task |
| GET | `/api/demo/priority` | Demonstrate priority queue |
| GET | `/api/demo/autocomplete` | Demonstrate Trie autocomplete |
| POST | `/api/demo/dependencies` | Demonstrate dependency graph |
| POST | `/api/demo/undo` | Demonstrate stack operations |
| POST | `/api/demo/recent` | Demonstrate LRU cache |
| GET | `/api/admin/ping` | Demonstrate admin-only access |

## 🔐 Authentication and Security

CampusFlow demonstrates JWT-based authentication with Spring Security.

1. The user submits login credentials.
2. The backend validates the demo credentials.
3. A JWT containing the username and role is generated.
4. The frontend stores the token and sends it with protected API requests.
5. Spring Security validates the token and checks the required role.

**Note:** This repository contains a simplified demonstration of authentication and authorization. It is not a production-ready user management system.

## 🔮 Future Enhancements

- Implement automated recurring task scheduling.
- Add real-time task notifications.
- Build a full calendar-based scheduling interface.
- Add productivity analytics and visual dashboards.
- Introduce database-backed user registration and password hashing.
- Add automated unit and integration tests.

## 🎯 Learning Outcomes

Through CampusFlow, the project demonstrates:

- Building RESTful APIs using Spring Boot.
- Connecting a React frontend with a Java backend.
- Database integration using MySQL, JPA, and Hibernate.
- Understanding JWT authentication and role-based authorization.
- Applying fundamental data structures to practical application scenarios.
- Organizing a full-stack project using layered architecture.



---

**CampusFlow – Plan smarter. Prioritize better. Get things done.**
