package Design_patterns.Structural_Pattern.Proxy_Pattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Database admin = new DatabaseProxy(true);
        Database user = new DatabaseProxy(false);

        System.out.println("---- Admin Access ----");
        admin.query("SELECT * FROM employees");
        admin.query("DELETE FROM employees WHERE id=5");

        System.out.println("\n---- User Access ----");
        user.query("SELECT * FROM employees");
        user.query("DELETE FROM employees WHERE id=5"); // blocked by proxy
    }
}