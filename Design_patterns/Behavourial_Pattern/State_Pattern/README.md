# State Pattern — Order Lifecycle

**Idea**: Switch behavior by swapping state objects instead of `if/else` ladders.

**Model**: `NEW → PAID → SHIPPED → DELIVERED` (or `CANCELLED`).  
Illegal transitions throw an exception.

## Files
- `State.java` — interface for actions (`pay/ship/deliver/cancel`)
- `Order.java` — context; delegates to current state and logs transitions
- `*State.java` — `New`, `Paid`, `Shipped`, `Delivered`, `Cancelled`
- `Main.java` — demo of valid + invalid transitions

## Run
```bash
# from src/
javac DesignPatterns/Behavioral/State/*.java
java DesignPatterns.Behavioral.State.Main
```

### Why this design?

Adds/removes states without touching callers

Prevents invalid transitions at compile-time boundaries (per state class)

Great for payments, media players, workflow engines