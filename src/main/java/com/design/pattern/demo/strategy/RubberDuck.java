package com.design.pattern.demo.strategy;

public class RubberDuck extends Duck {

    public RubberDuck(){
        super.setFlyBehavior(new FlyNoWay());
        super.setQuackBevior(new Squack());
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }
}
