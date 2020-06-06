package com.design.pattern.demo.strategy;

public class Quack implements QuackBevior{


    @Override
    public void quack() {
        System.out.println("呱呱...");
    }
}
