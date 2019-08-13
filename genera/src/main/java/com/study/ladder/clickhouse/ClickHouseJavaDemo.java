package com.study.ladder.clickhouse;

import ru.yandex.clickhouse.BalancedClickhouseDataSource;
import ru.yandex.clickhouse.ClickHouseConnection;
import ru.yandex.clickhouse.settings.ClickHouseProperties;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ru.yandex.clickhouse 测试类
 *
 * @author suxin
 * @since 2019-08-13
 */
public class ClickHouseJavaDemo {

    private static BalancedClickhouseDataSource dataSource;

    static {
        ClickHouseProperties properties = new ClickHouseProperties();
        dataSource = new BalancedClickhouseDataSource("jdbc:clickhouse://172.16.11.102:8123", properties);
    }

    private static String getTest0() {
        return "select * from datasets.ontime limit 3";
    }

    private static String getTest1() {
        return "SELECT avg(c1) as avgVal FROM ( SELECT Year, Month, count(*) AS c1  FROM ontime GROUP BY Year, Month);";
    }

    private static String getTest2() {
        return "SELECT DayOfWeek, count(*) AS c FROM ontime WHERE Year>=2000 AND Year<=2008 GROUP BY DayOfWeek ORDER BY c DESC;";
    }

    private static String getTest3() {
        return "SELECT DayOfWeek, count(*) AS c FROM ontime WHERE DepDelay>10 AND Year>=2000 AND Year<=2008 GROUP BY DayOfWeek ORDER BY c DESC;";
    }

    private static String getTest4() {
        return "SELECT Origin, count(*) AS c FROM ontime WHERE DepDelay>10 AND Year>=2000 AND Year<=2008 GROUP BY Origin ORDER BY c DESC LIMIT 10;";
    }

    private static String getTest5() {
        return "SELECT Carrier, count(*) AS c  FROM ontime WHERE DepDelay>10 AND Year=2007 GROUP BY Carrier ORDER BY count(*) DESC;";
    }

    private static String getTest6() {
        return "SELECT Carrier, c, c2, c*100/c2 as c3 FROM " +
                "(SELECT Carrier, count(*) AS c FROM datasets.ontime WHERE DepDelay>10 AND Year=2007 GROUP BY Carrier) " +
                "ANY INNER JOIN " +
                "(SELECT Carrier, count(*) AS c2  FROM datasets.ontime WHERE Year=2007 GROUP BY Carrier) USING Carrier " +
                "ORDER BY c3 DESC;";
    }

    public static void main(String[] args) throws SQLException {
        ClickHouseConnection clickHouseConnection = dataSource.getConnection("default", "iaisYuX4");
        ResultSet rs = clickHouseConnection.createStatement().executeQuery(ClickHouseJavaDemo.getTest0());
        while (rs.next()) {
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
        }
    }
}
