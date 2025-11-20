# 🛠️⚙️ EquipTrack-Lite Backend
#### 🇧🇷 [Ler em Português](./README.md) 👈

### Equipment Management Microservice

The core of the system — built with **Quarkus** to be **lightweight, fast, and container-ready**.

<img src="https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExb3Q2aHFpOXlpMGNjNmI5c2FiNmE4bGVyOGoxZ3NqYjlodGZqMW11dSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/aARCiUFK86xvG/giphy.gif" alt="Quarkus Logo" width="300" />

---

## 📋 Project Information

| Field               | Detail                       |
| ------------------- | ---------------------------- |
| **Project Name**    | EquipTrack-Lite Backend 🛠️⚙️ |
| **Start Date**      | 10/10/2025 ⏩                |
| **End Date**        | 10/12/2025 🏁                |
| **Status**          | ✔ Completed                  |

---

## 💻 Technologies Used

- ☕ **Quarkus.io** (Java)
- 🐘 **PostgreSQL** (or **H2** in dev mode)
- 🛡️ **Hibernate ORM with Panache**
- 📐 **RESTEasy (JAX-RS)**
- 🟣 **Insomnia / Postman** for API testing

---

## 🎯 Purpose

Implement a full **CRUD (Create, Read, Update, Delete)** for the **Equipment** resource, structured as a proper **RESTful microservice**.

---

## 🧩 Structure & Key Concepts

This microservice demonstrates the foundational architecture on top of which the full system will evolve, focusing on:

- ⚡ **Quarkus:** Java framework optimized for cloud and microservices.
- 🧠 **CDI (Contexts and Dependency Injection):** Usage of `@Inject` and scopes like `@ApplicationScoped`.
- 🗃️ **Hibernate with Panache:** Simplifies repository/DAO layers, reducing boilerplate.
- 🔐 **CORS:** _Cross-Origin Resource Sharing_ configuration for communication with the Vue.js frontend.

---

## 🔧 Main Features

- Creation of **REST endpoints** (`GET`, `POST`, `DELETE`) for the **Equipment** resource.
- Data persistence via **PostgreSQL** (or **H2** in dev mode).
- Central configuration through `application.properties`.
- API communication tests with the **Vue.js Frontend**.

---

## ⚙️ Installation & Setup

### 🔹 Requirements

- **Java 17+**
- **Maven** (or Gradle)

### 🔹 Clone the repository

```bash
git clone https://github.com/LadyJessie19/equiptrack-backend.git
cd equiptrack-backend
````

### 🔹 Database Configuration

Edit:

```
src/main/resources/application.properties
```

You can:

* Keep the **dev** profile using **H2** (for quick development), or
* Configure your **PostgreSQL** credentials.

---

## 🚀 Running the Application

To start the backend in **development mode** (with hot-reload):

```bash
./mvnw compile quarkus:dev
```

The API will be available at:

👉 [http://localhost:8080/equipamentos](http://localhost:8080/equipamentos)

---

## 🟪 Endpoints (Insomnia/Postman Example)

| Method     | Endpoint             | Description             |
| ---------- | -------------------- | ----------------------- |
| **GET**    | `/equipamentos`      | Lists all equipment     |
| **POST**   | `/equipamentos`      | Creates a new equipment |
| **DELETE** | `/equipamentos/{id}` | Removes equipment by ID |

---

## 👩‍💻 Developed by Jessie Moura

<img src="src/main/resources/jessica.png" alt="Jessie" width="200" />

💡 **Jessie M. Bentes** — Fullstack Developer (focused on Backend Java with Spring Boot and Quarkus)

🚀 Passionate about technology, clean architecture, and solid coding practices.

📬 Contact: [LinkedIn](https://www.linkedin.com/in/jessiemoura) | [GitHub](https://github.com/LadyJessie19)

---

## 🧠 Note

This project represents the **Backend MVP** of *EquipTrack-Lite*, establishing a solid foundation for future frontend integrations and additional microservices.

---

## 🚪 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
