package com.study.ladder.designmode.composite;

import org.apache.ivy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司
 *
 * @author suxin
 * @since 2021-05-08
 */
public class Company extends Organization {

    /**
     * 公司列表
     */
    private List<Organization> organizationList = new ArrayList<>();

    @Override
    public void add(Organization company) {
        organizationList.add(company);
    }

    @Override
    public void remove(Organization company) {
        organizationList.remove(company);
    }

    @Override
    public void showLine() {
        System.out.println("-" + this.getName());
        for (Organization organization : organizationList) {
            organization.showLine();
        }
    }

    @Override
    public void showDuty() {
        System.out.println(this.getName() + " 管理下属部门: "
                + StringUtils.join(organizationList.stream()
                .map(Organization::getName).toArray(), ","));
        for (Organization organization : organizationList) {
            organization.showDuty();
        }
    }
}
