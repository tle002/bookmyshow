# BookMyShow

BookMyShow is a Spring Boot application that allows users to browse and book movie tickets in various theatres across different cities. The application provides REST API endpoints to list cities, theatres, movies, and shows, as well as to book and clear seat bookings.

## Features

- List all cities
- List all theatres in a city
- List all movies in a city
- List all shows for a movie
- Book a seat for a show
- Clear a seat booking if payment is not made

## Project Structure
. ├── .gitattributes ├── .gitignore ├── .vscode/ │ └── settings.json ├── HELP.md ├── mvnw/ ├── mvnw copy ├── mvnw.cmd ├── pom.xml ├── README.md ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── com/ │ │ │ └── bookmyshow/ │ │ │ ├── BookmyshowApplication.java │ │ │ ├── controller/ │ │ │ ├── model/ │ │ │ ├── repository/ │ │ │ └── service/ │ │ └── resources/ │ │ ├── application.properties │ │ └── data.sql │ └── test/ └── target/


## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MySQL

### Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/bookmyshow.git
    cd bookmyshow
    ```

2. Configure the database:
    - Update the [application.properties](http://_vscodecontentref_/8) file with your MySQL database credentials.

3. Initialize the database:
    - The [data.sql](http://_vscodecontentref_/9) file contains initial data for cities, theatres, movies, and shows.

4. Build and run the application:
    ```sh
    ./mvnw spring-boot:run
    ```

### API Endpoints

- **List all cities**
    - `GET /api/cities`

- **List theatres in a city**
    - `GET /api/theatres/city/{cityId}`

- **List movies in a city**
    - `GET /api/movies/city/{cityId}`

- **List shows for a movie**
    - `GET /api/shows/movie/{movieId}`

- **Book a seat**
    - `POST /api/bookings/book`
    - Request body example:
        ```json
        {
            "userId": 1,
            "showId": 1,
            "seatNumber": "A1",
            "paymentStatus": false
        }
        ```

- **Clear a seat booking**
    - `DELETE /api/bookings/clear/{bookingId}`

### License

This project is licensed under the Apache License 2.0. See the LICENSE file for details.

### Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [MySQL](https://www.mysql.com/)