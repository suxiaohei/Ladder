package com.study.ladder.clickhouse;

import java.sql.*;

/**
 * clickhouse 测试类
 *
 * @author suxin
 * @since 2019-08-13
 */
public class ClickHouseJDBCDemo implements AutoCloseable {
    private static final String DB_URL = "jdbc:clickhouse://172.16.11.102:8123/datasets";

    private final Connection conn;

    /**
     * Creates new instance
     *
     * @throws SQLException in case of connection issue
     */
    private ClickHouseJDBCDemo() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, "default", "iaisYuX4");
    }

    /**
     * Queries db to get the cities with biggest season change
     *
     * @throws SQLException in case of query issue
     */
    public void seasonFlights() throws SQLException {
        String query = "select * from datasets.ontime limit 1";
        long time = System.currentTimeMillis();
        try (Statement statement = conn.createStatement()) {
            try (ResultSet rs = statement.executeQuery(query)) {
                System.out.println(rs);
            }
        }
        System.out.println("Time: " + (System.currentTimeMillis() - time) + " ms");
    }

    @Override
    public void close() throws Exception {
        if (conn != null) {
            conn.close();
        }
    }

    /**
     * Application entry point
     *
     * @param args cli args
     */
    public static void main(String[] args) throws Exception {
        try (ClickHouseJDBCDemo demo = new ClickHouseJDBCDemo()) {
            demo.seasonFlights();
        }
    }

}
