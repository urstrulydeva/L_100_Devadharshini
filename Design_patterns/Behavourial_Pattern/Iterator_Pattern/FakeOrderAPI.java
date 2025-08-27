package Design_patterns.Behavourial_Pattern.Iterator_Pattern;


import java.util.*;

public class FakeOrderAPI implements PageFetcher<Order> {
    private final List<Order> all;
    private final int pageSize;

    public FakeOrderAPI(List<Order> all, int pageSize) {
        this.all = all; this.pageSize = pageSize;
    }

    @Override public Page<Order> fetch(String pageToken) {
        int start = 0;
        if (pageToken != null) start = Integer.parseInt(pageToken);
        int end = Math.min(start + pageSize, all.size());
        List<Order> slice = all.subList(start, end);
        String next = (end < all.size()) ? String.valueOf(end) : null;
        System.out.println("[API] fetched " + slice.size() + " items starting at " + start);
        return new Page<>(slice, next);
    }
}

