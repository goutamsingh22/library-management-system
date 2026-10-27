# Java Library Management System

A simple Library Management System built with Java using Object-Oriented Programming (OOP) principles.

## Features
- Manage Books (Add, View, Check Availability)
- Manage Members (Add, View, Track Issued Books)
- Book Issuing
- Book Returns
- Availability Tracking

## OOP Concepts Used
- **Encapsulation**: Private fields with getters/setters
- **Classes & Objects**: Book, Member, LibraryService, LibraryApp
- **Collections**: HashMap, ArrayList for data management
- **Abstraction**: Service layer separates business logic

## Project Structure
`
library-management-system/
├── src/main/java/com/library/
│   ├── models/
│   │   ├── Book.java
│   │   └── Member.java
│   ├── services/
│   │   └── LibraryService.java
│   └── LibraryApp.java
`

## How to Run
`ash
# Compile
javac -d bin src/main/java/com/library/**/*.java src/main/java/com/library/*.java

# Run
java -cp bin com.library.LibraryApp
`

## Classes

### Book
Represents a book with id, title, author, and availability status.

### Member
Represents a library member who can issue and return books.

### LibraryService
Handles core operations - adding books/members, issuing, returning.

### LibraryApp
Main class with demonstration of functionality.
