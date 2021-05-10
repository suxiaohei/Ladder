package com.study.ladder.designmode.state;

/**
 * 状态业务类
 *
 * @author suxin
 * @since 2021-05-10
 */
public class Process {

    /**
     * 状态
     */
    private State state;

    public Process(State state) {
        this.state = state;
    }

    public void process() {
        state.change(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
