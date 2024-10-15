# Booking Management Application

Booking Management Application is a full-stack Java backend project designed to manage flight bookings. The application allows users to book flights, manage passengers, and handle flight information through a robust system of entities and services, including Flights, Bookings, and Passengers.

## Features
- Manage flight information (origin, destination, departure time, etc.)
- Create, update, and delete bookings.
- Assign passengers to bookings.
- Handle flight capacity and available seats.

## Technologies Used
- **Java 17**
- **Spring Boot**
- **JPA (Java Persistence API) / Hibernate** for ORM
- **PostgreSQL** for the database
- **Docker** for containerization
- **Lombok** for reducing boilerplate code (Getters, Setters, Builders)
- **Gradle** for build automation

## Requirements
To run this project locally, you will need:
- **Java 17** or later
- **Docker** installed for containerizing the application and the database
- **PostgreSQL** set up (you can use Docker for this)
- **Gradle** installed (to build the project)
- **Git** to clone the repository

## Setup Instructions

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-username/Booking-Management-Application.git
    cd Booking-Management-Application
    ```

2. **Run the PostgreSQL container with Docker**
    Ensure you have Docker installed, and run the PostgreSQL container:
    ```bash
    docker-compose up -d
    ```

3. **Build and run the project**
    Use Gradle to build the project and run it locally:
    ```bash
    ./gradlew build
    ./gradlew bootRun
    ```

4. **Access the Application**
    The application should now be running on `http://localhost:8080`.

## API Documentation
| Endpoint | HTTP Method | Description |
| -------- | ----------- | ----------- |
| `/api/bookings` | `GET` | Get all bookings |
| `/api/bookings/{id}` | `GET` | Get booking by ID |
| `/api/bookings` | `POST` | Create a new booking |
| `/api/bookings/{id}` | `PUT` | Update an existing booking |
| `/api/bookings/{id}` | `DELETE` | Delete a booking |

### Example JSON for Creating a Booking
```json
{
  "flightId": 1,
  "bookingDateTime": "2023-10-12T15:30:00",
  "passengerIds": [1, 2, 3]
}
