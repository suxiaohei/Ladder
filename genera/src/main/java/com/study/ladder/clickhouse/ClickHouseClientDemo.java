// package com.study.ladder.clickhouse;
//
// import com.virtusai.clickhouseclient.ClickHouseClient;
// import groovy.util.logging.Slf4j;
//
//
// /**
//  * ClickHouseClientDemo 测试类
//  *
//  * @author suxin
//  * @since 2019-08-13
//  */
// @Slf4j
// public class ClickHouseClientDemo {
//
//     private static ClickHouseClient client;
//     static {
//         client = new ClickHouseClient("http://172.16.11.102:8123", "default", "iaisYuX4");
//     }
//
//     public static void main(String[] args) {
//         client.get("select%20*%20from%20datasets.ontime%20limit%200,%201", OnTimeObj.class)
//                 .thenAccept(System.out::println);
//         client.close();
//     }
// }
