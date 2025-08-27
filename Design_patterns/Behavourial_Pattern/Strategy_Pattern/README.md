
---

### `src/DesignPatterns/Behavioral/Strategy/README.md`
```md
# Strategy Pattern (Java)

## Real-Life-Example
You always travel from **A to B**, but you can choose **how**: car, train, or flight.  
Strategy lets you swap the **algorithm/behavior** without changing the caller.

## When to Use
- Interchangeable algorithms (ranking, pricing, compression)
- Multiple payment/shipping methods
- A/B experimentation of logic without if/else chains

## Structure in This Demo
- `RouteStrategy.java` — strategy interface
- `CarRoute.java`, `TrainRoute.java`, `FlightRoute.java` — concrete strategies
- `Navigator.java` — context that uses a strategy
- `Main.java` — switches strategies at runtime

## How It Works
`Navigator` holds a `RouteStrategy`. Call `setStrategy(...)` to swap, then `estimateAndPrint(from, to)` delegates to the selected strategy.

## Run
```bash
# from src/
javac DesignPatterns/Behavioral/Strategy/*.java
java DesignPatterns.Behavioral.Strategy.Main
