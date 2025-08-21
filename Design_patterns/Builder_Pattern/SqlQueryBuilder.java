package Design_patterns.Builder_Pattern;

import java.util.*;

public class SqlQueryBuilder {
    private String table;
    private List<String> columns = new ArrayList<>();
    private List<String> joins = new ArrayList<>();
    private List<String> whereClauses = new ArrayList<>();
    private List<Object> parameters = new ArrayList<>();
    private String orderBy;
    private Integer limit;

    public SqlQueryBuilder from(String table) {
        this.table = table;
        return this;
    }

    public SqlQueryBuilder select(String... cols) {
        this.columns.addAll(Arrays.asList(cols));
        return this;
    }

    public SqlQueryBuilder join(String joinTable, String onCondition) {
        joins.add("JOIN " + joinTable + " ON " + onCondition);
        return this;
    }

    public SqlQueryBuilder where(String condition, Object... values) {
        whereClauses.add(condition);
        parameters.addAll(Arrays.asList(values));
        return this;
    }

    public SqlQueryBuilder orderBy(String clause) {
        this.orderBy = clause;
        return this;
    }

    public SqlQueryBuilder limit(int limit) {
        this.limit = limit;
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT ");
        sb.append(columns.isEmpty() ? "*" : String.join(", ", columns));
        sb.append(" FROM ").append(table);

        for (String join : joins) {
            sb.append(" ").append(join);
        }

        if (!whereClauses.isEmpty()) {
            sb.append(" WHERE ");
            sb.append(String.join(" AND ", whereClauses));
        }

        if (orderBy != null) {
            sb.append(" ORDER BY ").append(orderBy);
        }

        if (limit != null) {
            sb.append(" LIMIT ").append(limit);
        }

        return sb.toString();
    }

    public List<Object> getParameters() {
        return parameters;
    }
}

