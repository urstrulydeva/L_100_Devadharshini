# Facade Pattern — Checkout Orchestration (Java)

One big friendly button that does lots of small complicated things for you.

A **Facade** centralizes orchestration across subsystems (inventory, payments, shipping, notifications),
concentrating compensations and idempotency in a single stable API while internals evolve.

## Files
- `Order.java` — simple domain request
- `Receipt.java` — result type
- `InventoryService.java`, `PaymentService.java`, `ShippingService.java`, `NotificationService.java` — subsystems
- `CheckoutFacade.java` — the facade orchestrating everything (including compensations)
- `Main.java` — demo entrypoint

## Run
```bash
javac *.java
java Main
