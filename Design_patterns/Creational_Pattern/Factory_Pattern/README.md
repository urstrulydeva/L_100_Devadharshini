# Factory Pattern – Assessment Example

## What is the Factory Pattern?
The **Factory Pattern** is a *creational design pattern* that provides an interface for creating objects without exposing the creation logic to the client.  
Instead of instantiating objects directly using `new`, the client asks a **factory** to create them.

Think of it like a restaurant:
- You order *pizza* or *burger*.
- You don’t care how it’s cooked.
- The **kitchen (factory)** decides which recipe to use and gives you the dish.

---

## When to Use It?
Use the Factory Pattern when:
- You want to **hide complex object creation logic** from the client.
- You need to create objects based on **conditions (type, level, config, etc.)**.
- You want to **avoid tight coupling** between client code and concrete classes.
- You may need to **extend with new types** easily in the future.

---

## Example: Assessment Factory

### Factory Implementation
```java
public class AssessmentFactory {
    private static final Map<String, Supplier<Assessment>> registry = new HashMap<>();

    static {
        registry.put("beginner", MCQAssessment::new);
        registry.put("intermediate", ShortAnswerAssessment::new);
        registry.put("advanced", CaseStudyAssessment::new);
    }

    public static Assessment createAssessment(String level) {
        Supplier<Assessment> supplier = registry.get(level.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        }
        throw new IllegalArgumentException("Invalid level: " + level);
    }
}
