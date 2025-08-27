# Visitor Pattern — Expression Tree

**Idea**: Add operations to a fixed tree of types (Number, Variable, Add, Mul) without touching the node classes.

## Files
- `Node.java` & `Visitor.java` — element and visitor contracts with generics for return type
- `*Node.java` — AST node types
- `EvalVisitor.java` — evaluates with a variable map
- `PrintVisitor.java` — pretty-prints `(x + 2) * (3 + y)`
- `Main.java` — builds tree and runs visitors

## Run
```bash
javac DesignPatterns/Behavioral/Visitor/*.java
java DesignPatterns.Behavioral.Visitor.Main
```

##  Why Visitor?

Add new operations (evaluate, render, validate) without modifying nodes.

Ideal for compilers, doc models, scene graphs.
