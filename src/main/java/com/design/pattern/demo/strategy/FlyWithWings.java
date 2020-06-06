package com.design.pattern.demo.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("起飞...");
    }
}
