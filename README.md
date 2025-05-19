# 3.1.3: Patterns - Command Pattern

This project demonstrates the **Command Design Pattern** in Java by implementing a small parking system that manages multiple types of vehicles. Each vehicle can be started, accelerated, and braked using encapsulated command objects.

---

## 🚘 Available Vehicles

- Car 
- Bicycle 
- Plane
- Boat

Each vehicle implements:
- `start()`
- `accelerate()`
- `brake()`

---

## 🧠 Command Pattern Overview

This project uses the **Command Pattern** to encapsulate actions (commands) as objects, decoupling the invoker from the receiver.

### 📦 Implemented Commands
- `StartCommand` 
- `AccelerateCommand`
- `BrakeCommand`

Each command receives a vehicle and performs the associated action.

---

## 🎮 Controller (Invoker)

The `ParkingController` acts as the **Invoker**, executing commands passed to it without knowing the internal logic of the vehicles.

Example:
controller.executeCommand(startCommand);

---

## 📌 Learning Goals
- Apply the Command pattern in Java

- Practice Object-Oriented Programming principles

- Use separation of concerns and clean architecture

- Write basic unit tests without external dependencies

## 📚 How to run it
Copy the repository:
https://github.com/ToniR90/3.1-Patterns1-Nivell3.git