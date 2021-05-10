package com.study.ladder.designmode.memento;

/**
 * 备忘测试类
 *
 * @author suxin
 * @since 2021-05-10
 */
public class MementoTest {

    public static void main(String[] args) {
        Game game = new Game();
        game.setState("初始状态");
        game.show();

        Memento memento = game.createMemento();

        game.setState("进行中");
        game.show();

        game.reset(memento);
        game.show();
    }
}
