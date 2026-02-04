package com.javarevision;

class Exp {

    int a;          // instance variable
    static int b;   // static variable

    void showInstance() {
        System.out.println("Instance variable a = " + a);
    }

    static void showStatic() {
        System.out.println("Static variable b = " + b);
    }
}

public class Day_02 {
    public static void main(String[] args) {

        int c = 50;   // local variable (must be initialized)
        System.out.println("Local variable c = " + c);

        // object creation
        Exp obj1 = new Exp();
        Exp obj2 = new Exp();

        // using instance variable
        obj1.a = 10;
        obj2.a = 20;

        // using static variable
        Exp.b = 100;

        // method calls
        obj1.showInstance();
        obj2.showInstance();
        Exp.showStatic();
    }
}
