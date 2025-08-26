# Flyweight Pattern – Java Demo

## Overview
The **Flyweight Pattern** is a structural design pattern that **reduces memory usage** by sharing common parts of objects instead of creating duplicates. It separates an object’s state into:  
- **Intrinsic (shared)**: State that is common and reused.  
- **Extrinsic (unique)**: State that is unique per object and supplied externally.

---

## Real-World Analogy
Imagine a **box of crayons** in a classroom:  
- All kids share the same set of crayons (**intrinsic**).  
- Each kid has their own drawing (**extrinsic**).  

This prevents buying unnecessary duplicate crayons, saving space and cost.

---

## Demo Example
In this demo, we draw **circles**:  
- **Intrinsic (shared):** Circle color.  
- **Extrinsic (unique):** Position (`x`, `y`) and radius.  

The `CircleFactory` ensures **only one Circle object per color** is created and reused.

---

## Project Structure
FlyweightDemo.java
Circle.java
CircleFactory.java

---

## How to Run
1. Compile all files:
```bash
javac FlyweightDemo.java
```
2. Run the demo:

```bash
java FlyweightDemo
```

---
Sample Output
Creating new Circle of color: Red
Drawing circle [Color: Red, x: 23, y: 54, radius: 100]
Creating new Circle of color: Green
Drawing circle [Color: Green, x: 12, y: 44, radius: 100]
Drawing circle [Color: Red, x: 77, y: 11, radius: 100]
Drawing circle [Color: Green, x: 90, y: 88, radius: 100]
...
