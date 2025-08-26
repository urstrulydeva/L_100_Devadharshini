# Bridge Pattern — Payments Example (Java)
Two halves that plug together like LEGO: your "Payment flow" piece and your "Gateway vendor" piece.
You can swap either without rebuilding the whole toy.

Decouple the **abstraction** (business payment flows) from the **implementation** (gateway vendors). 
Lets teams evolve independently, swap providers per region, and contract-test adapters without 
breaking product flows.

## Files
- `PaymentGateway.java` — Implementor interface (vendor API)
- `RazorpayGateway.java`, `StripeGateway.java` — Concrete implementors
- `Payment.java` — Abstraction base class
- `OneClickPayment.java`, `SubscriptionPayment.java` — Refined abstractions
- `Main.java` — Demo

## Run
```bash
javac *.java
java Main
