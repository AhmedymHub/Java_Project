# Java_Project

# My Project

Here is an image of the project:

![Screenshot of Project](/javaa.png)

Project Title: Turkish Airline Booking System
Project Overview:
The Turkish Airline Booking System is a desktop application designed to manage the booking of flights for passengers traveling through Turkish Airlines. The application allows users to browse available flights, search for destinations, book tickets, and manage their travel itinerary. The system is built with Java for the backend logic and SQLite for database management. It provides a simple, user-friendly interface to simulate an airline's flight booking system.

Technologies Used:
Java: Used for implementing the core functionality and logic of the application, handling user interactions, and managing data flow.
SQLite: A lightweight, serverless database used to store flight details, passenger information, and booking records.
Swing (optional): A GUI toolkit in Java for creating a user interface (optional, if implemented).
Features and Functionality:
Flight Management:

Flight Search: Users can search for flights based on departure city, destination, and travel dates.
Flight Listing: Display available flights with relevant details (flight number, departure/arrival times, price, etc.).
Flight Booking: Users can select a flight, enter their details, and proceed with booking the flight.
Passenger Information:

Passenger Registration: Passengers can register their details (name, passport number, etc.) into the system for booking tickets.
Booking Management: Passengers can view their booking history, cancel bookings, or make changes to their existing reservations.
Database Integration:

SQLite Database: The application uses SQLite for managing flight schedules, bookings, and passenger data.
Tables:
flights: Stores flight information, including flight numbers, departure/arrival times, prices, and destinations.
passengers: Stores passenger details, including name, contact information, and passport number.
bookings: Keeps track of flight bookings, linking passengers to their selected flights.
User Interface (UI):

Graphical User Interface (GUI): The application has an easy-to-use GUI built using Java Swing (or console-based UI if no Swing is used).
Interactive Forms: Forms for searching flights, entering passenger information, and booking tickets.
Error Handling: Proper error messages and validation to ensure that all user inputs are correct (e.g., no empty fields, correct date formats).
Security:

Basic Authentication: Users may need to authenticate their identity before booking a flight (password-based).
Password Encryption (optional): Store user passwords in the database securely using encryption.
Booking Confirmation:

Ticket Confirmation: Once a flight is successfully booked, users will receive a confirmation with booking details (flight number, date, seat, etc.).
Flight Updates:

Flight Status: Users can check the current status of a flight (delayed, on-time, etc.).
Flight Modification: Users can modify or cancel their bookings if needed.
Database Design (SQLite):
Here is a simple schema for the SQLite database:

Tables:
Flights Table:

sql
Copy
Edit
CREATE TABLE flights (
    flight_id INTEGER PRIMARY KEY,
    flight_number TEXT NOT NULL,
    departure_city TEXT NOT NULL,
    destination_city TEXT NOT NULL,
    departure_time TEXT NOT NULL,
    arrival_time TEXT NOT NULL,
    price REAL NOT NULL
);
Passengers Table:

sql
Copy
Edit
CREATE TABLE passengers (
    passenger_id INTEGER PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    passport_number TEXT NOT NULL,
    email TEXT NOT NULL
);
Bookings Table:

sql
Copy
Edit
CREATE TABLE bookings (
    booking_id INTEGER PRIMARY KEY,
    passenger_id INTEGER NOT NULL,
    flight_id INTEGER NOT NULL,
    booking_date TEXT NOT NULL,
    FOREIGN KEY (passenger_id) REFERENCES passengers(passenger_id),
    FOREIGN KEY (flight_id) REFERENCES flights(flight_id)
);
Java Classes and Functions:
Main Class:

The entry point of the application, which handles the startup of the program and initializing the UI or command-line interface.
Flight Class:

Represents a flight with attributes such as flight number, departure/arrival times, and price. It handles methods for displaying flight details and searching for available flights.
Passenger Class:

Manages the passenger details like name, passport number, email, and related methods (e.g., registration, updating information).
Booking Class:

Handles booking logic, associating passengers with flights, and managing booking records.
DatabaseManager Class:

Contains methods to interact with the SQLite database (insert, update, select, and delete records for flights, passengers, and bookings).
UI Classes:

If using Swing, these would be classes for managing different UI elements like search bars, tables, buttons, and forms for user input.
Steps to Build the Application:
Setting Up SQLite Database:

Install SQLite and create the required tables for flights, passengers, and bookings.
Connect to the SQLite database using Java JDBC (Java Database Connectivity).
Implement Core Logic:

Create the Java classes for handling flight searches, booking, and passenger registration.
Implement the logic for querying the database to fetch flight data and save bookings.
User Interface:

Design and implement the GUI or console-based interface for users to search flights, book tickets, and manage their bookings.
Ensure that user input is validated and handle any exceptions gracefully.
Test and Debug:

Test all functionalities, such as searching flights, booking tickets, and checking flight statuses, ensuring that everything works as expected.
Debug any issues related to the database or user interactions.
Deploy:

Package the application into an executable format (e.g., JAR file) and distribute it to users.
Conclusion:
The Turkish Airline Booking System is a practical project for learning how to develop database-driven applications using Java and SQLite. It allows you to gain hands-on experience in connecting Java with a relational database, handling CRUD operations, and designing a user interface. This project can be extended further by adding more advanced features like flight scheduling, payment processing, and integration with online booking systems.
