---

## 🧩 3. Chain of Responsibility Pattern

**Real-Life-Example**  
Think of **a line of security guards**:  
- First guard checks ID.  
- If all good, passes to the next guard to check your bag.  
- If all good, you enter.  
Each guard decides if they handle it or pass it along.  

---

The **Chain of Responsibility Pattern** lets you pass a request along a chain of handlers. 
Each handler decides whether to process the request or pass it forward.

## Structure
- `Logger`: Abstract handler
- `ErrorLogger`, `FileLogger`, `ConsoleLogger`: Concrete handlers
- `Main`: Builds the chain and tests messages

## How to Run
```bash
javac DesignPatterns/Behavioral/ChainOfResponsibility/*.java
java DesignPatterns.Behavioral.ChainOfResponsibility.Main