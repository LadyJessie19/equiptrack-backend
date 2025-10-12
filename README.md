# 🛠️⚙️ EquipTrack-Lite Backend

### Microserviço de Gerenciamento de Equipamentos

O coração do sistema — desenvolvido com **Quarkus** para ser **leve, rápido e pronto para contêineres**.

<img src="https://i.imgur.com/8QzXy2A.png" alt="Quarkus Logo" width="300" />

---

## 📋 Informações do Projeto

| Campo               | Detalhe                      |
| ------------------- | ---------------------------- |
| **Nome do Projeto** | EquipTrack-Lite Backend 🛠️⚙️ |
| **Data de Início**  | 10/10/2025 ⏩                |
| **Data de Término** | 12/10/2025 🏁                |
| **Status**          | ✅ Concluído (MVP CRUD)      |

---

## 💻 Tecnologias Utilizadas

- ☕ **Quarkus.io** (Java)
- 🐘 **PostgreSQL** (ou **H2** em modo dev)
- 🛡️ **Hibernate ORM com Panache**
- 📐 **RESTEasy (JAX-RS)**
- 🟣 **Insomnia / Postman** para testes de API

---

## 🎯 Objetivo

Implementar um **CRUD completo (Create, Read, Update, Delete)** para o recurso **Equipamento**, estruturado como um **microserviço RESTful**.

---

## 🧩 Estrutura e Conceitos-Chave

Este microserviço demonstra a base da arquitetura sobre a qual irei evoluir o sistema, com foco em:

- ⚡ **Quarkus:** Framework Java otimizado para nuvem e microserviços.
- 🧠 **CDI (Contexts and Dependency Injection):** Uso de `@Inject` e escopos como `@ApplicationScoped`.
- 🗃️ **Hibernate com Panache:** Simplifica a camada de repositório/DAO, reduzindo boilerplate.
- 🔐 **CORS:** Configuração de _Cross-Origin Resource Sharing_ para comunicação com o frontend (Vue.js).

---

## 🔧 Funcionalidades Principais

- Criação de **endpoints REST** (`GET`, `POST`, `DELETE`) para o recurso **Equipamento**.
- Conexão e persistência de dados via **PostgreSQL** (ou **H2** em modo dev).
- Configuração centralizada em `application.properties`.
- Testes de comunicação com o **Frontend Vue.js**.

---

## ⚙️ Instalação e Configuração

### 🔹 Pré-requisitos

- **Java 17+**
- **Maven** (ou Gradle)

### 🔹 Clone o repositório

```bash
git clone <link-do-seu-repo-backend>
cd equiptrack-lite-backend
```

### 🔹 Configuração do Banco de Dados

Edite o arquivo:

```
src/main/resources/application.properties
```

Você pode:

- Manter o perfil **dev** usando **H2** (para desenvolvimento rápido), ou
- Configurar suas credenciais do **PostgreSQL**.

---

## 🚀 Executando a Aplicação

Para rodar o backend em **modo de desenvolvimento** (com _hot-reload_):

```bash
./mvnw compile quarkus:dev
```

A API estará disponível em:

👉 [http://localhost:8080/equipamentos](http://localhost:8080/equipamentos)

---

## 🟪 Endpoints (Exemplo com Insomnia/Postman)

| Método     | Endpoint             | Descrição                     |
| ---------- | -------------------- | ----------------------------- |
| **GET**    | `/equipamentos`      | Lista todos os equipamentos   |
| **POST**   | `/equipamentos`      | Cria um novo equipamento      |
| **DELETE** | `/equipamentos/{id}` | Remove um equipamento pelo ID |

---

## 👩‍💻 Desenvolvido por Jessie Moura

💡 **Jessie M. Bentes** — _Fullstack Developer (foco em Backend Java com Spring Boot e Quarkus)_
🚀 Apaixonada por tecnologia, arquitetura limpa e boas práticas de código.
📬 Entre em contato: [LinkedIn](https://www.linkedin.com/in/jessiemoura) | [GitHub](https://github.com/jessiemoura)

---

## 🧠 Observação

Este projeto representa o **MVP Backend** do _EquipTrack-Lite_, estabelecendo uma base sólida para futuras integrações com o frontend Vue.js e outros microserviços.

---
