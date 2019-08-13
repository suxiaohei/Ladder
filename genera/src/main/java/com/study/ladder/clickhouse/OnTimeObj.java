package com.study.ladder.clickhouse;

/**
 * onTime 测试
 *
 * @author suxin
 * @since 2019-08-13
 */
public class OnTimeObj {

    private final String Year;
    private final String Quarter;
    private final String Month;
    private final String DayofMonth;
    private final String DayOfWeek;
    private final String FlightDate;

    public OnTimeObj(String year, String quarter, String month, String dayofMonth, String dayOfWeek, String flightDate) {
        Year = year;
        Quarter = quarter;
        Month = month;
        DayofMonth = dayofMonth;
        DayOfWeek = dayOfWeek;
        FlightDate = flightDate;
    }

    @Override
    public String toString() {
        return "OnTimeObj{" +
                "Year='" + Year + '\'' +
                ", Quarter='" + Quarter + '\'' +
                ", Month='" + Month + '\'' +
                ", DayofMonth='" + DayofMonth + '\'' +
                ", DayOfWeek='" + DayOfWeek + '\'' +
                ", FlightDate='" + FlightDate + '\'' +
                '}';
    }
}
