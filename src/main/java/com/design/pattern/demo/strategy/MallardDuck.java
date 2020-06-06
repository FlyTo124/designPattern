package com.design.pattern.demo.strategy;

public class MallardDuck extends Duck {

    public MallardDuck(){
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBevior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭...");
    }
}
