# CRM API Project

[![Frontend](https://img.shields.io/badge/Frontend-React.js-20232A?style=flat&logo=react&logoColor=61DAFB)](https://react.dev/)
[![Backend](https://img.shields.io/badge/Backend-Spring_Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Language](https://img.shields.io/badge/Language-Java_17-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://docs.oracle.com/en/java/javase/17/)
[![Database](https://img.shields.io/badge/Database-H2-007396?style=flat&logo=database&logoColor=white)](https://h2database.com/)

This is a full-stack Customer Relationship Management (CRM) application designed to manage users, accounts, contacts, and sales opportunities. 

## 🛠️ Technology Stack

### Backend
- **Framework:** Spring Boot (Java 17)
- **Database:** H2 Database (In-Memory)
- **Persistence:** Spring Data JPA / Hibernate
- **Validation:** Hibernate Validator
- **Testing:** TestNG

### Frontend
- **Library:** React.js (v18)
- **Routing:** React Router DOM (v6)
- **Validation:** Validator (npm package)
- **Testing:** Jest & React Testing Library

## 📦 Project Structure

The project is structured into two main independent modules:

### 1. Backend application (`/Backend Springboot/CRM`)
A RESTful API that securely handles the core business logic and database interactions. 
- **Entities:** `Account`, `Contact`, `Opportunity`, and `User`.
- **Architecture:** Follows the standard controller-service-repository pattern.

### 2. Frontend application (`/frontend-react`)
A single-page application (SPA) providing the user interface for the CRM.
- **Views:** Dedicated routes for Home, Login, Register, and Main Menu.
- **Components:** Modular and reusable UI interfaces like `LoginCard`, `RegisterCard`, and `MainMenuCard`.

## 🚀 Getting Started

### Prerequisites
- **Frontend:** Node.js & npm
- **Backend:** Java 17 Development Kit (JDK)

### Running the Backend
1. Open a terminal and navigate to the backend application directory:
   ```bash
   cd "Backend Springboot/CRM"
   ```
2. Run the Spring Boot project using the Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
   The backend server should start on your local machine (typically `http://localhost:8080`).

### Running the Frontend
1. Open a new terminal and navigate to the frontend directory:
   ```bash
   cd frontend-react
   ```
2. Install the necessary dependencies (only required the first time):
   ```bash
   npm install
   ```
3. Start the React development server:
   ```bash
   npm start
   ```
   The user interface will be open in your default browser at `http://localhost:3000`.

## 📌 Main Features
- **User Authentication:** Login and Registration support.
- **Account Management:** Track involved companies and organizational records.
- **Contact Management:** Administrate the people and representatives associated with the business accounts.
- **Opportunity Pipeline:** Follow up on potential sales deals and business opportunities.
