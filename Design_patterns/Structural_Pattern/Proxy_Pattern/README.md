# Proxy Pattern – Java Example

## What is the Proxy Pattern?
The **Proxy Pattern** is a structural design pattern where a **Proxy (middleman object)** controls access to another object (called the **Real Subject**).  
It is commonly used for:
- Access control (permissions)
- Logging & monitoring
- Caching
- Lazy initialization (load heavy objects only when needed)

Think of it like a **security guard**:  
You don’t directly enter a building; the guard (proxy) checks your ID and decides if you can enter.

---

## Example: Database Access Proxy
In this demo:
- `Database` → common interface  
- `RealDatabase` → actual database connection  
- `DatabaseProxy` → acts as a gatekeeper (logging, permission checks, lazy loading)

## Project Structure
ProxyPatternDemo.java
Database.java
RealDatabase.java
DatabaseProxy.java

yaml
Copy
Edit

---

## How to Run
Compile and run the demo:

```bash
javac ProxyPatternDemo.java
java ProxyPatternDemo
```

Key Takeaway

Without Proxy → Every user talks to the database directly.

With Proxy → Access is controlled, monitored, and optimized before hitting the real database.

This is similar to how API Gateways, Firewalls, or Caching Proxies work in real systems.