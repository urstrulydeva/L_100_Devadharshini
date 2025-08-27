# Memento Pattern — Tiny Text Editor “Undo”

## What it is (in one line)
Save snapshots of an object’s state so you can restore (undo) later.

## Why this example?
A mini text editor shows the core idea clearly: type text, save a snapshot, make a mistake, undo.

## Roles in this code
- **Originator**: `Editor` — holds the current `content`.
- **Memento**: `Editor.Snapshot` — immutable state holder (stores `content`).
- **Caretaker**: `History` — stack of snapshots used to undo.

## Files
- `Main.java` — Demo fucntion in `main`.
- `Editor.java` - Holds current content
- `Memento.java` - Immutable State Holder
- `Hisory.java` - Stack of undone snapshots

## How it works
1. Type something → state in `Editor` changes.
2. Call `save()` → get a `Snapshot` (memento) of current content.
3. Push snapshots into `History`.
4. On mistake, pop a snapshot and `restore(...)` to revert the `Editor`.

## Run it

```bash
# Compile
javac Design_Patterns/Behavioural_Pattern/Memento_Pattern/*.java

# Run
java Design_Patterns.Behavioural_Pattern.Memento_Pattern.Main
