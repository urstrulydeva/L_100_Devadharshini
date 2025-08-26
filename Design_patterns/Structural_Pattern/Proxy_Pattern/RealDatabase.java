package Design_patterns.Structural_Pattern.Proxy_Pattern;

public class RealDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("Executing query on REAL Database: " + sql);
    }
}
