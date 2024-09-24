# TodoList Service
#
This is a Spring Boot-based service for managing a simple Todo List. The service provides functionalities to list, create, update, and delete todos.
teste
## Table of Contents

- [Getting Started](#getting-started)
- [Installation](#installation)
- [API Endpoints](#api-endpoints)
  - [List Todos](#list-todos)
  - [Create ToDo](#create-todo)
  - [Delete ToDo](#delete-todo)
  - [Update ToDo](#update-todo)
- [Built With](#built-with)

## Getting Started

To get a copy of this project up and running on your local machine for development and testing purposes, follow these instructions.

## Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/thiagoassisk8/demotodolist
   ```
2. Navigate to the project directory:
   ```sh
   cd demotodolist
   ```
3. Install the dependencies:
   ```sh
   mvn clean install
   ```
4. Run in your IDE

## API Endpoints

### List Todos

- **Endpoint:** `http://localhost:8080/todos`
- **Method:** `GET`
- **Response:**
  ```json
  [
    {
      "id": 1,
      "name": "Complete ToDo Spring boot API",
      "description": "Make a simple ToDo application using OOP principles",
      "done": false,
      "priority": 10,
      "timeEstimation": 2
    }
  ]
  ```

### Create ToDo

- **Endpoint:** `http://localhost:8080/todos`
- **Method:** `POST`
- **Request Body (JSON):**
  ```json
  {
    "priority": 10,
    "name": "Complete ToDo Spring boot API",
    "description": "Make a simple ToDo application using OOP principles",
    "timeEstimation": 2,
    "done": false
  }
  ```
- **Response:**
  ```json
  [
    {
      "id": 1,
      "name": "Complete ToDo Spring boot API",
      "description": "Make a simple ToDo application using OOP principles",
      "done": false,
      "priority": 10,
      "timeEstimation": 2
    }
  ]
  ```

### Delete ToDo

- **Endpoint:** `http://localhost:8080/todos/{id}`
- **Method:** `DELETE`
- **Response:**
  ```json
  {
    []
  }
  ```

### Update ToDo

- **Endpoint:** `http://localhost:8080/todos/{id}`
- **Method:** `PUT`
- **Request Body (JSON):**

```json
{
  "priority": 15,
  "name": "Update ToDo Spring boot API",
  "description": "Update a simple ToDo application using OOP principles",
  "timeEstimation": 2,
  "done": false
}
```

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The framework used
- [Maven](https://maven.apache.org/) - Dependency Management
