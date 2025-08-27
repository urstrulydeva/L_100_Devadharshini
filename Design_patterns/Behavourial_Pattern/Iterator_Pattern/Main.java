package Design_patterns.Behavourial_Pattern.Iterator_Pattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Order> seed = new ArrayList<>();
        for (int i = 1; i <= 17; i++) {
            seed.add(new Order("ORD-" + i, "CUST-" + ((i % 5) + 1), i * 100));
        }
        FakeOrderAPI api = new FakeOrderAPI(seed, 6);
        PaginatedIterable<Order> orders = new PaginatedIterable<>(api);

        int countBig = 0;
        for (Order o : orders) {
            if (o.amount >= 1000) countBig++;
            System.out.println(" -> " + o);
        }
        System.out.println("Orders >= 1000: " + countBig);
    }
}

