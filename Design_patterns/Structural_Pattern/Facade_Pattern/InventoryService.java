package Design_patterns.Structural_Pattern.Facade_Pattern;

public class InventoryService {
    public boolean reserve(String sku, int qty) {
        System.out.println(String.format("[Inventory] Reserved %d of %s", qty, sku));
        return true;
    }
    public void release(String sku, int qty) {
        System.out.println(String.format("[Inventory] Released %d of %s", qty, sku));
    }
}

