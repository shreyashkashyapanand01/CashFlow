# 💰 CashFlow – Personal Finance Tracker

[![Java](https://img.shields.io/badge/Java-orange)]()
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-brightgreen)]()
[![MySQL](https://img.shields.io/badge/MySQL-blue)]()
[![React](https://img.shields.io/badge/React-61DAFB)]()
[![CSS](https://img.shields.io/badge/CSS-blue)]()
[![JavaScript](https://img.shields.io/badge/JavaScript-yellow)]()



**Track. Manage. Grow.**  
CashFlow is a **full-stack** personal finance tracker that lets users log income, monitor expenses, analyze spending patterns, and achieve budget goals.  
Built with **Spring Boot**, **MySQL**, and **React**, it’s secure, scalable, and easy to use.

---

## ✨ Features

### 🧑‍💻 User Features
- **Secure Authentication**
    - Email **OTP verification** during registration
    - **Password recovery** with OTP reset
- **Income & Expense Tracking**
    - Add, update, delete transactions
    - Categorize spending for better insights
- **Data Visualization**
    - Interactive monthly/yearly charts
    - Expense breakdown by category
- **Responsive UI**
    - Works on desktop, tablet, and mobile

### 🛠 Admin Module
- **User Management**
    - View, edit, or delete users
    - Activate/deactivate accounts
- **Category Management**
    - Add/remove categories dynamically
- **Analytics Dashboard**
    - System-wide expense trends
    - Revenue & usage analytics

---

## 🏗 Architecture & Tech Stack

| Layer           | Technologies |
|-----------------|--------------|
| **Frontend**    | HTML, CSS, JavaScript, React |
| **Backend**     | Spring Boot, Spring Security, Spring Data JPA |
| **Database**    | MySQL |
| **Build Tool**  | Maven |
| **Security**    | JWT Auth, BCrypt Hashing, Email OTP |
| **Visualization** | Chart.js |


## ⚙️ Getting Started

### 📌 Prerequisites
- Java JDK 11+
- Maven
- MySQL Server
- Node.js (for frontend)

### 🚀 Backend Setup
```bash
# Navigate to backend
cd backend

# Configure DB & SMTP in src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/expensetracker
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.mail.username=your_email@gmail.com
spring.mail.password=your_email_app_password

# Run backend
mvn spring-boot:run
 ```
### 🚀 Fontend Setup
```bash
# Navigate to backend

cd ./frontend
npm install
npm start

```
## 📸 Screenshots
  ![Screenshot 1](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140637.png)  
  ![Screenshot 2](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140652.png)  
  ![Screenshot 3](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140701.png)  
  ![Screenshot 4](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140711.png)  
  ![Screenshot 5](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140721.png)  
  ![Screenshot 6](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140737.png)  
  ![Screenshot 7](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140756.png)  
  ![Screenshot 8](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140805.png)  
  ![Screenshot 9](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140816.png)  
  ![Screenshot 10](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140827.png)  
  ![Screenshot 11](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140841.png)  
  ![Screenshot 12](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140857.png)  
  ![Screenshot 13](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140907.png)  
  ![Screenshot 14](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140915.png)  
  ![Screenshot 15](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140923.png)  
  ![Screenshot 16](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140931.png)  
  ![Screenshot 17](frontend/SCREENSHOTS/Screenshot%202025-08-10%20140938.png)


---
