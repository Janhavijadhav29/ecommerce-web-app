# E-Commerce Web App

Full-stack E-Commerce application with product catalog, category search and order management.

## Tech Stack

- **Backend:** Java 17, Spring Boot 3, Spring Data JPA (Hibernate), Bean Validation
- **Database:** MySQL
- **Frontend:** React 18 (Vite), Axios
- **Build tools:** Maven, npm

## Features

- Full CRUD (Create, Read, Update, Delete) for Product, Order
- Search with case-insensitive keyword matching
- Input validation with clear error messages
- Global exception handling with proper HTTP status codes
- Layered architecture: Controller → Service → Repository → Entity
- Responsive React UI with tabbed navigation

## Project Structure

```
ecommerce-web-app/
├── backend/                 # Spring Boot REST API
│   ├── pom.xml
│   └── src/main/java/com/shop/
│       ├── config/          # CORS configuration
│       ├── controller/      # REST controllers
│       ├── entity/          # JPA entities
│       ├── exception/       # Custom exceptions & global handler
│       ├── repository/      # Spring Data JPA repositories
│       └── service/         # Business logic
└── frontend/                # React + Vite UI
    └── src/
        ├── components/
        ├── api.js
        └── App.jsx
```

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- MySQL 8+
- Node.js 18+

### 1. Database

The database `ecommerce_db` is created automatically. Update the MySQL username and password in
`backend/src/main/resources/application.properties` if they are not `root` / `root`.

### 2. Run the backend

```bash
cd backend
mvn spring-boot:run
```

The API runs on `http://localhost:8080`.

### 3. Run the frontend

```bash
cd frontend
npm install
npm run dev
```

Open `http://localhost:5173` in your browser.

## REST API Endpoints

### Product

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/products` | Get all |
| GET | `/api/products/{id}` | Get by ID |
| GET | `/api/products/search?keyword=` | Search by category |
| POST | `/api/products` | Create |
| PUT | `/api/products/{id}` | Update |
| DELETE | `/api/products/{id}` | Delete |

### CustomerOrder

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/orders` | Get all |
| GET | `/api/orders/{id}` | Get by ID |
| GET | `/api/orders/search?keyword=` | Search by customerName |
| POST | `/api/orders` | Create |
| PUT | `/api/orders/{id}` | Update |
| DELETE | `/api/orders/{id}` | Delete |

## Author

Built as a Java Full Stack portfolio project.
