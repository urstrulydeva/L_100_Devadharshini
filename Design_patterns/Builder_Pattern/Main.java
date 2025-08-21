package Design_patterns.Builder_Pattern;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SqlQueryBuilder builder = new SqlQueryBuilder();

        System.out.println("=== SQL Query Builder ===");

        // FROM
        System.out.print("Enter table name (e.g., users): ");
        String table = scanner.nextLine();
        builder.from(table);

        // SELECT
        System.out.print("Enter columns to select (comma-separated or leave empty for *): ");
        String cols = scanner.nextLine();
        if (!cols.trim().isEmpty()) {
            builder.select(cols.trim().split("\\s*,\\s*"));
        }

        // JOIN
        System.out.print("Do you want to add a JOIN? (yes/no): ");
        String joinAnswer = scanner.nextLine();
        while (joinAnswer.equalsIgnoreCase("yes")) {
            System.out.print("Enter join table name: ");
            String joinTable = scanner.nextLine();
            System.out.print("Enter ON condition (e.g., users.id = orders.user_id): ");
            String onCond = scanner.nextLine();
            builder.join(joinTable, onCond);

            System.out.print("Add another JOIN? (yes/no): ");
            joinAnswer = scanner.nextLine();
        }

        // WHERE conditions
        System.out.print("Do you want to add WHERE conditions? (yes/no): ");
        String whereAnswer = scanner.nextLine();
        while (whereAnswer.equalsIgnoreCase("yes")) {
            System.out.print("Enter condition (use ? for value, e.g., age > ?): ");
            String condition = scanner.nextLine();
            System.out.print("Enter value for ?: ");
            String value = scanner.nextLine();
            builder.where(condition, value);

            System.out.print("Add another WHERE condition? (yes/no): ");
            whereAnswer = scanner.nextLine();
        }

        // ORDER BY
        System.out.print("Enter ORDER BY column (or leave blank): ");
        String order = scanner.nextLine();
        if (!order.trim().isEmpty()) {
            builder.orderBy(order);
        }

        // LIMIT
        System.out.print("Enter LIMIT value (or leave blank): ");
        String limitStr = scanner.nextLine();
        if (!limitStr.trim().isEmpty()) {
            try {
                int limit = Integer.parseInt(limitStr);
                builder.limit(limit);
            } catch (NumberFormatException e) {
                System.out.println("Invalid limit. Skipping...");
            }
        }

        // Final Output
        String query = builder.build();
        List<Object> params = builder.getParameters();

        System.out.println("\nFinal SQL Query:");
        System.out.println(query);
        System.out.println("Parameters: " + params);

        scanner.close();
    }
}


