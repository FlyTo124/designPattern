package com.design.pattern.demo.strategy;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck(){
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBevior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭");
    }
}
