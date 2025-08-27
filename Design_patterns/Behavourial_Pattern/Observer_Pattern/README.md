# Observer Pattern (Java)

## REAL-LIF-EXAMPLE
A **bell** rings and all subscribed **classrooms** react. The bell doesn’t know who they are; it just rings.  
That’s Observer: **one-to-many notifications** with loose coupling.

## When to Use
- UI events (button clicks)
- Cache invalidation / data change broadcasts
- In-process event bus patterns

## Structure in This Demo
- `Observer.java` — listener contract
- `Subject.java` — keeps subscribers and notifies them
- `ClassRoom.java` — concrete observer reacting to events
- `Main.java` — wires it together

## How It Works
`Subject.publish(event)` prints the bell message and calls `Observer.update(event)` on all current subscribers.

## Run
```bash
# from src/
javac DesignPatterns/Behavioral/Observer/*.java
java DesignPatterns.Behavioral.Observer.Main
