# Mediator Pattern

**Real-Life-Example**  
Imagine a **teacher in class**. Instead of kids shouting at each other, they tell the teacher, and she passes the message. The teacher is the **mediator**.

**Tech-Example**
A **Slack-like Chat** System:
Instead of users connecting to every other user, they just connect to a central mediator (chat server). This is easier to scale and maintain.

---
## Overview
The **Mediator Pattern** centralizes communication between objects. 
Instead of objects referencing each other directly, they communicate through a mediator.

## Structure
- `ChatMediator`: Interface for message exchange
- `ChatRoom`: Implements mediator logic
- `User`: Abstract participant
- `ConcreteUser`: Sends/receives messages

## How to Run
```bash
javac DesignPatterns/Behavioral/Mediator/*.java
java DesignPatterns.Behavioral.Mediator.Main
