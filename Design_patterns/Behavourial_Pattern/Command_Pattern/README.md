
---

### `src/DesignPatterns/Behavioral/Command/README.md`
```md
# Command Pattern (Java)

## Real-Life-Example
A remote button sends a packaged **command** to a device. Because actions are objects, you can **queue, log, retry, and undo** them.

## When to Use
- Undo/redo in editors and UIs
- Task queues and retries
- Macro actions / scripting
- Decoupling UI (invoker) from business logic (receiver)

## Structure in This Demo
- `Command.java` — command interface (`execute`, `undo`, `name`)
- `Light.java` — receiver (has the real operations)
- `TurnOnCommand.java`, `TurnOffCommand.java` — concrete commands
- `Remote.java` — invoker with an undo stack
- `Main.java` — runs a sequence with undo

## How It Works
`Remote.press(command)` executes and pushes it to history. `Remote.undo()` pops and calls `undo()` on the last command.

## Run
```bash
# from src/
javac DesignPatterns/Behavioral/Command/*.java
java DesignPatterns.Behavioral.Command.Main
