# Java Console Applications

This repository contains three beginner-friendly Java console applications developed using Core Java concepts such as loops, conditional statements, file handling, arrays, user input, and object-oriented programming fundamentals.

## Projects Included

### 1. Number Guessing Game

A simple interactive game where the user attempts to guess a randomly generated number between 1 and 100.

#### Features

* Random number generation
* Hint system (Higher / Lower)
* Maximum 10 attempts per game
* Score calculation based on performance
* Replay functionality

#### Scoring System

| Attempts | Score      |
| -------- | ---------- |
| 1 - 2    | 100 Points |
| 3 - 4    | 80 Points  |
| 5+       | 50 Points  |

#### Technologies Used

* Java
* Scanner Class
* Random Class

---

### 2. ATM Interface

A console-based ATM simulation that allows users to perform basic banking operations after successful authentication.

#### Features

* User Login Authentication
* Balance Inquiry
* Deposit Money
* Withdraw Money
* Fund Transfer
* Transaction History
* Exit Functionality

#### Default Credentials

User ID: 12345

Password: 1234

#### Technologies Used

* Java
* Scanner Class
* Switch Case
* Loops

---

### 3. Online Examination System

A simple online examination system that allows users to log in, take a multiple-choice exam, update passwords, and view their final score.

#### Features

* User Authentication
* Multiple Choice Questions (MCQs)
* Automatic Score Calculation
* Password Update Option
* Password Persistence using File Handling
* Exam Time Monitoring
* Logout Functionality

#### Default Credentials

User ID: 23456

Password: Stored in password.txt

#### Password Management

The application reads the password from a file named:

password.txt

Any password changes made through the application are automatically saved to this file, making the password persistent across program executions.

#### Technologies Used

* Java
* Scanner Class
* File Handling
* BufferedReader
* BufferedWriter

---

## Requirements

* Java JDK 8 or later
* Any Java IDE (Eclipse, IntelliJ IDEA, VS Code, NetBeans)

---

## How to Run

### Compile

```bash
javac NumberGuessing.java
javac ATMInterface.java
javac OnlineExamination.java
```

### Execute

```bash
java NumberGuessing
java ATMInterface
java OnlineExamination
```

---

## Learning Outcomes

These projects demonstrate:

* User Input Handling
* Conditional Statements
* Loops
* Random Number Generation
* Menu-Driven Programming
* File Handling
* Basic Authentication
* Score Calculation
* Transaction Management

---

## Author 
developed as a part of AICTE OASIS INFOBYTE internship!