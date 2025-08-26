package Design_patterns.Structural_Pattern.Proxy_Pattern;

class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private boolean isAdmin;

    public DatabaseProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public void query(String sql) {
        if (!isAdmin && sql.toLowerCase().startsWith("delete")) {
            System.out.println("ACCESS DENIED: Only admins can delete data!");
            return;
        }
        if (realDatabase == null) {
            realDatabase = new RealDatabase(); // Lazy loading
        }
        System.out.println("Proxy: Logging query → " + sql);
        realDatabase.query(sql);
    }
}
