package com.study.ladder.designmode.factoryabstract;

/**
 * 业务类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class DataBaseAccess {

    private static String pack = "com.study.ladder.designmode.factoryabstract";
    private static String type = "TypeTwo";

    public static IProductA createProductA() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IProductA) Class.forName(pack + ".ProductA" + type).newInstance();
    }

    public static IProductB createProductB() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IProductB) Class.forName(pack + ".ProductB" + type).newInstance();
    }
}
