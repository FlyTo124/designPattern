package com.design.pattern.demo.strategy;

public class MuteQuack implements QuackBevior {
    @Override
    public void quack() {
        System.out.println("不会叫...");
    }
}
