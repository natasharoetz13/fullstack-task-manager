# Fullstack Task Manager

## Description
A fullstack task management
application that allows users to create, update, delete and filter tasks.
Built with React (frontend) and Spring Boot (backend), with PostgreSQL for data persistence.

## Screenshots 

### Main View
![Task Manager](screenshots/main.png)

### Edit Task
![Task Manager](screenshots/edit.png)

### Completed Tasks
![Task Manager](screenshots/completed.png)

A fullstack task manager built using React and Spring Boot.

## Tech Stack

Frontend: React

Backend: Spring Boot

Database: PostgreSQL

Container: Docker

## Key Features

- Create new tasks
- Mark tasks as completed
- Edit existing tasks
- Delete tasks
- Filter tasks (All, Active, Completed)
- Real-time updates via REST API

## Requirements
- Node.js
- Java 17 or higher
- Maven
- Docker (optional)
- PostgreSQL


## Database Setup
Make sure PostgreSQL is running.

Update your `application.properties`:



## Run Backend

```bash
./mvnw spring-boot:run
```

Backend runs on:

http://localhost:8080


## Run Frontend 

```bash
npm install
npm run dev
```

Frontend runs on:

http://localhost:5174

## API Endpoints

| Method | Endpoint     | Discription   |
|--------|--------------|---------------|
| GET    | /tasks       | Get all tasks |
| POST   | /tasks       | Create task   |
| PUT    | /tasks/{id}  | Update task   |
| DELETE | /tasks/{id}  | Delete task   |

## Example Request

POST /tasks

```json
{
"title": "Learn React",
"completed": false
}

```


## Future Improvements

- Add authentication (login/signup)
- Add due dates for tasks
- Add search functionality
- Improve UI/UX design

## How It Works

- React frontend communicates with Spring Boot REST API
- Backend handles CRUD operations for tasks
- PostgreSQL stores task data
- Users can create, update, delete and filter tasks


## Live Demo
Coming soon!

## Author
Natasha Roetz

Github:
https://github.com/natasharoetz13
