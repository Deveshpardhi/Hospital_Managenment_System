# 🏥 Hospital Management System

## 📌 Project Overview

The **Hospital Management System** is a file-based application that efficiently manages patient records, staff details, and administrative tasks using various **design patterns**. It ensures smooth operations for hospitals by providing role-based access for Admins, Doctors, and Patients.

## 🚀 Features

- 🔹 **Role-Based Access:** Admin, Doctor, and Patient functionalities
- 🔹 **Patient Management:** Add, update, and retrieve patient details
- 🔹 **Medical Staff Management:** Maintain doctors and other hospital staff records
- 🔹 **Appointment Scheduling:** Assign and manage doctor appointments
- 🔹 **Billing System:** Generate and maintain patient invoices
- 🔹 **Security & Logging:** Secure access with logging mechanisms
- 🔹 **Design Pattern Implementation:** Improves scalability and maintainability

## 🏗️ Design Patterns Used

- **Factory Pattern:** Creates different user roles dynamically
- **Singleton Pattern:** Ensures a single instance for managing hospital data
- **Strategy Pattern:** Allows flexible patient billing strategies
- **Decorator Pattern:** Enhances system functionalities dynamically
- **Proxy Pattern:** Provides controlled access to sensitive data

## 🛠️ Tech Stack

- **Programming Language:** Java
- **Storage:** File-based system
- **Design Patterns:** Factory, Singleton, Strategy, Decorator, Proxy

## 📂 Project Structure

```
📁 HospitalManagementSystem
 ├── 📁 src
 │   ├── 📁 models
 │   ├── 📁 services
 │   ├── 📁 patterns
 │   ├── 📄 Main.java
 ├── 📄 README.md
 ├── 📄 hospital_data.txt
```

## ⚡ Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/hospital-management-system.git
   ```
2. **Navigate to the project directory**
   ```bash
   cd hospital-management-system
   ```
3. **Compile the Java files**
   ```bash
   javac -d bin src/**/*.java
   ```
4. **Run the project**
   ```bash
   java -cp bin Main
   ```

## 🤝 Contributing

Feel free to fork this repository and contribute to improving the system!

## 📧 Contact

For any queries, reach out at: **pardhida\@rknec.edu**

