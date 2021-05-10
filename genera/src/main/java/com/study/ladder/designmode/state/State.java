package com.study.ladder.designmode.state;

/**
 * 状态
 *
 * @author suxin
 * @since 2021-05-10
 */
public interface State {

    /**
     * 状态修改
     * @param process
     */
    void change(Process process);
}
