package com.design.pattern.demo.strategy;

public class Squack implements QuackBevior {
    @Override
    public void quack() {
        System.out.println("吱吱....");
    }
}
