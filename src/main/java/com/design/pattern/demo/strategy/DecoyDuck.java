package com.design.pattern.demo.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        super.setFlyBehavior(new FlyNoWay());
        super.setQuackBevior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("我是诱饵鸭");
    }
}
