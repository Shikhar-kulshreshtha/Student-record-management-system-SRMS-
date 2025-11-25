

# Student Record Management System (SRMS)

**SRMS** is a comprehensive, console-based application developed in Java SE. It is designed to facilitate the efficient administration of student data, course catalogs, and academic records.

This application serves as a practical implementation of core software engineering principles, demonstrating proficiency in Object-Oriented Programming (OOP), standard design patterns, and modern Java APIs including Streams and NIO.2.

-----

## Functional Overview

The system is architected to handle the complete lifecycle of academic data management through the following modules:

  * **Entity Management:** Capabilities to create, update, and retrieve records for Students and Courses.
  * **Academic Operations:** robust handling of course enrollments and grade assignments.
  * **Transcript Generation:** Automated processing of student academic history to generate formatted transcripts with dynamic GPA calculation.
  * **Data Persistence & IO:**
      * **CSV Integration:** Supports batch import and export of data via standard `.csv` formats.
      * **Automated Backups:** Implements timestamped data backup routines to ensure data integrity.
  * **Analytics:** Generation of statistical reports regarding GPA distribution across the student population.

-----

## Technology Stack

  * **Language:** Java SE (Standard Edition) Version 11+
  * **Architecture:** Monolithic Console Application
  * **Key Java APIs:**
      * **Java Streams API:** Utilized for declarative data processing and filtering.
      * **Java NIO.2:** Implemented for high-performance file I/O and path manipulation.
      * **Java Time API:** Used for precise temporal data management.

-----

## Installation & Execution Guide

### Prerequisites

  * **Java Development Kit (JDK):** Version 11 or higher.

### Deployment Steps

**1. Repository Initialization**
Clone the project repository to your local environment:

```bash
git clone <your-repository-link>
cd SRMS
```

**2. Compilation**
Compile the source code from the project root. The output will be directed to the `bin` directory:

```bash
javac -d bin -sourcepath src src/edu/srms/main/MainMenu.java
```

**3. Execution**
Execute the application entry point. The `-ea` flag is recommended to enable assertions for data validation:

```bash
java -ea -cp bin edu.srms.main.MainMenu
```

-----

## Architecture & Context

### Platform Editions

SRMS is built upon **Java SE**, distinct from other platform variations:

| Edition | Scope | Application Context |
| :--- | :--- | :--- |
| **Java SE** (Standard Edition) | Core Libraries & APIs | Desktop and Console Applications (Current Project). |
| **Java EE** (Enterprise Edition) | Web & Distributed Computing | Large-scale server-side applications. |
| **Java ME** (Micro Edition) | Embedded Systems | Resource-constrained devices (IoT). |

### Runtime Environment

The application execution relies on the standard Java ecosystem:

  * **JDK:** Contains development tools (compiler, debugger).
  * **JRE:** Provides the libraries and runtime environment.
  * **JVM:** Executes the compiled bytecode, ensuring platform independence.

-----

## Implementation Reference

The following table maps software engineering concepts to their specific implementations within the codebase:

| Concept / Design Pattern | File / Location |
| :--- | :--- |
| **Encapsulation** | `domain/Student.java` (Access control via private fields/public methods) |
| **Inheritance** | `domain/Student.java` extends `domain/Person.java` |
| **Abstraction** | `domain/Person.java` (Abstract base class) |
| **Polymorphism** | `service/TranscriptService.java` (Generic type processing) |
| **Singleton Pattern** | `config/AppConfig.java` (Global configuration instance) |
| **Builder Pattern** | `domain/Course.java` (Complex object construction) |
| **File I/O (NIO.2)** | `io/BackupService.java` (Path and Files implementation) |
| **Java Streams** | `service/CourseService.java` (Functional data processing) |
| **Lambda Expressions** | `util/Comparators.java` (Concise comparator logic) |
| **Recursive Algorithms** | `util/RecursiveFileUtils.java` (Directory traversal) |
| **Exception Handling** | `exception/DuplicateEnrollmentException.java` (Custom exception hierarchy) |

-----

## Directory Structure

The project adheres to a standard package-based structure:

```text
src/
└── edu/
    └── srms/
        ├── main/       # Application Entry Point
        ├── domain/     # Domain Entities (POJOs)
        ├── service/    # Business Logic Layer
        ├── io/         # Input/Output Operations
        ├── util/       # Utility & Helper Classes
        └── exception/  # Custom Exception Definitions
```
