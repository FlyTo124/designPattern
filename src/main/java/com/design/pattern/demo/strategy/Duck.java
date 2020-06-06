package com.design.pattern.demo.strategy;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBevior quackBevior;

    public void fly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBevior(QuackBevior quackBevior) {
        this.quackBevior = quackBevior;
    }

    public void quack() {
        quackBevior.quack();
    }

    public void swim(){
        System.out.println("鸭子游泳...");
    }

    public void display(){
        System.out.println("鸭子的外形....");
    }


}
