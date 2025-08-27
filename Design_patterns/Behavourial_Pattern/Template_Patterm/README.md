# Template Method Pattern (Java)

**Idea:** Define the *skeleton* of a workflow once, let subclasses fill in specific steps.

## Files
- `DataProcessor.java` — Abstract template with `process()` (read → process → save)
- `CSVDataProcessor.java` — CSV implementation
- `JSONDataProcessor.java` — JSON implementation
- `Main.java` — Runner

## Run
```bash
# from the src directory
javac DesignPatterns/Behavioral/TemplateMethod/*.java
java DesignPatterns.Behavioral.TemplateMethod.Main
