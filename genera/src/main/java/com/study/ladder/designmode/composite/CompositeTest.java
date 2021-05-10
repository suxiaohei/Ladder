package com.study.ladder.designmode.composite;

/**
 * 组合模式测试类
 *
 * @author suxin
 * @since 2021-05-08
 */
public class CompositeTest {

    public static void main(String[] args) {
        Company root = new Company();
        root.setName("总公司");

        Company companyBeijing = new Company();
        companyBeijing.setName("北京公司");

        DepartmentHr departmentHrBeijing = new DepartmentHr();
        departmentHrBeijing.setName("北京人力");
        companyBeijing.add(departmentHrBeijing);

        DepartmentSale departmentSaleBeijing = new DepartmentSale();
        departmentSaleBeijing.setName("北京销售");
        companyBeijing.add(departmentSaleBeijing);
        root.add(companyBeijing);

        Company companyTianjin = new Company();
        companyTianjin.setName("天津公司");

        DepartmentHr departmentHrTianjin = new DepartmentHr();
        departmentHrTianjin.setName("天津人力");
        companyTianjin.add(departmentHrTianjin);

        DepartmentSale departmentSaleTianjin = new DepartmentSale();
        departmentSaleTianjin.setName("天津销售");
        companyTianjin.add(departmentSaleTianjin);
        root.add(companyTianjin);

        root.showLine();
        root.showDuty();
    }
}
