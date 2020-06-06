package com.design.pattern.demo.strategy;

public class Test {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.quack();

        System.out.println("#################################");

        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.display();
        readHeadDuck.swim();
        readHeadDuck.fly();
        readHeadDuck.quack();

        System.out.println("#################################");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.fly();
        readHeadDuck.quack();

        System.out.println("#################################");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.fly();
        decoyDuck.quack();
    }
}
