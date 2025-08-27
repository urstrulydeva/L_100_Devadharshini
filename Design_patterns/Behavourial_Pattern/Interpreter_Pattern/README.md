
---

### File: `README_Interpreter.md`
```markdown
# Interpreter Pattern — Mini Math Language (+ and -)

## What it is (in one line)
Define a tiny language and classes that can interpret its sentences.

## Why this example?
We build a mini grammar that understands expressions 
and evaluate them.

## Roles in this code
- **Expression (Interface)**: `Expression` — contract for `interpret()`.
- **Terminal Expression**: `NumberExpr` — wraps integers.
- **Non-terminal Expressions**: `PlusExpr`, `MinusExpr` — combine expressions.
- **Parser**: `SimpleParser` — turns a string into an expression tree (left-to-right).

## Files
- `Main.java` — all classes + demo in `main`.
- `Expresssion.java` - interface for expression
- `PlusExpr.java` - builds the tree for evaluation
- `MinusExpr.java` - builds tree for evaluation
- `NumberExpr.java`
- `SimpleParser.java` - tokenises input

## How it works
1. `SimpleParser.parse("5 + 3 - 2 + 10")` tokenizes input.
2. It builds an expression tree left-to-right using `PlusExpr` / `MinusExpr`.
3. `interpret()` walks the tree and computes the result.

> Note: This simple parser **does not** handle operator precedence or parentheses; it evaluates strictly left-to-right.

## Run it

```bash
# Compile
javac Design_Patterns/Behavioural_Pattern/Interpreter_Pattern/*.java

# Run
java Design_Patterns.Behavioural_Pattern.Interpreter_Pattern.Main
