package com.study.ladder.designmode.memento;

/**
 * 游戏
 *
 * @author suxin
 * @since 2021-05-10
 */
public class Game {

    /**
     * 状态
     */
    private String state;

    /**
     * 创建备忘
     *
     * @return 备忘
     */
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(this.state);
        return memento;
    }

    public void show() {
        System.out.println("state = "+ this.state);
    }

    /**
     * 重置
     *
     * @param memento 备忘
     */
    public void reset(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
