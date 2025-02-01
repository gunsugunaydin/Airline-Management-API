# Airline Management API

## Overview

The Airline Management API is a backend application designed to manage airplanes, flights, and passenger reservations for an airline company. Built using Spring Boot, it provides a set of RESTful APIs to handle operations such as flight scheduling, airplane assignment, and passenger bookings. The system ensures efficient management by incorporating robust validation, exception handling, and email notifications.

## Features

- **Airplane Management:** Create, update, retrieve, and delete airplane data.
- **Flight Management:** Manage flights and their association with airplanes.
- **Reservation System:** Book and manage passenger reservations.
- **Cascade Effect:**
  - An airplane can be used for multiple flights, and each flight is assigned to an airplane.
  - A flight can have multiple reservations, and each reservation is linked to a flight.
- **Email Notifications:**
  - Notifications are sent when a reservation is made, flight details change, or a user's email address is updated.  
  - @Async is used for non-blocking email notifications.
  - JavaMailSender and Thymeleaf are used for HTML email templates.
   ![image](https://github.com/user-attachments/assets/8a3b88d9-ff15-4ea7-9445-b0f689d99cd8)
      

- **Global Exception Handling:** Ensures proper error management with meaningful error messages.    

- **Filtering & Booking:**
  - Users can filter flights by departure location, arrival location, departure date, and arrival date.  
  - @JsonIgnore is used in entity relationships to avoid infinite loops during serialization. Without it, filtering would cause an infinite loop.
  - The system verifies the capacity of the flight before booking.
- **Airplane Availability Check:** Ensures an airplane is available before assigning it to a flight.
- **Unique Reservation Code:**
  - Each reservation has a unique code that remains unchanged even if the flight or email is updated.
- **PATCH Method Handling:**
  - `@RequestPart` with `MediaType.MULTIPART_FORM_DATA_VALUE` is used for PATCH methods, requiring parameters as strings. These values are parsed in the service layer.
- **Seeding Data:**
  - Sample data is provided, including test cases for various failure scenarios.

## Technologies Used

- **Backend:** Spring Boot, Java
- **Frontend (for Email Templates):** Thymeleaf, HTML, CSS
- **Database:** H2 (In-memory)
- **ORM:** JPA & Hibernate
- **Email Notifications:** Java Mail API
- **Security:** Spring Security (all endpoints permitted)
- **Documentation:** Swagger

## Error Handling

The application includes global exception handling to return meaningful error messages. Some custom exceptions include:

- **AirplaneNotAvailableException:** Triggered when an airplane is unavailable.
- **FlightFullyBookedException:** Raised when a flight reaches full capacity.
- **ReservationAlreadyExistsException:** Raised if a duplicate reservation is attempted.
- **InvalidFlightTimeException:** Thrown if the departure time is after the arrival time.

## Prerequisites

- **Java 21** must be installed to run this project.
- **Maven** should be installed for dependency management.

## Configuration & Setup

1. Clone the repository:
   ```sh
   git clone https://github.com/gunsugunaydin/Airline-Management-API.git
   cd airline-management-api
   ```
2. Configure mail credentials in `secret.properties` or use mine 🫠:
   ```properties
   mail.username=your_email@example.com
   mail.password=your_password
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
   
 Alternatively:
  ```bash
  # Download the project as a ZIP file and extract it
  # Navigate to the extracted folder and open the terminal
  code .
  
  # After opening the project, follow the steps below:
  mvn clean install
  mvn spring-boot:run
  ```
---

## Usage and API Documentation

Explore the API documentation through Swagger at `http://localhost:8080/swagger-ui/index.html`.

![image](https://github.com/user-attachments/assets/45e0ab92-8d5a-4042-9fb6-1909742f7e45)

Swagger UI Screenshot

## API Endpoints

### Airplane API

- **GET** `/airplanes/` - Retrieve all airplanes.
- **GET** `/airplanes/{id}` - Retrieve details of a specific airplane.
- **GET** `/airplanes/{id}/flights` - Retrieve flights operated by a specific airplane.
- **POST** `/airplanes/` - Add a new airplane.
- **PATCH** `/airplanes/{id}` - Update an airplane.
- **DELETE** `/airplanes/{id}` - Remove an airplane.

### Flight API

- **GET** `/flights/` - Retrieve all flights.
- **GET** `/flights/{id}` - Retrieve details of a specific flight.
- **GET** `/flights/{id}/reservations` - Retrieve reservations for a specific flight.
- **POST** `/flights/` - Add a new flight.
- **POST** `/flights/filter` - Search for flights.
- **PATCH** `/flights/{id}` - Update a flight.
- **DELETE** `/flights/{id}` - Remove a flight.

### Reservation API

- **GET** `/reservations/` - Retrieve all reservations.
- **GET** `/reservations/{id}` - Retrieve details of a specific reservation.
- **POST** `/reservations/` - Create a new reservation.
- **PATCH** `/reservations/{id}` - Update a reservation.

## Contact
Please feel free to explore the code and share your feedback. I am always open to suggestions.

<img src="https://media.tenor.com/v63_brUy45wAAAAi/peach-goma-love-peach-cat.gif" alt="Get in Touch Gif" width="50" height="50"> Get in Touch:

- **Email**: [gunsugunay98@gmail.com](mailto:gunsugunay98@gmail.com)
- **LinkedIn**: [linkedin.com/in/gunsugunaydin](https://www.linkedin.com/in/gunsugunaydin/)
