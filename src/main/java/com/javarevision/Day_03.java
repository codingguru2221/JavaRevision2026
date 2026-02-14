package com.javarevision;

class DataTypeDemo {

    // Primitive data types demo
    public void primitiveDemo() {
        int age = 21;
        double salary = 45000.75;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Primitive Data Types:");
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
        System.out.println("Grade = " + grade);
        System.out.println("Is Student = " + isStudent);
    }

    // Non-Primitive data types demo
    public void nonPrimitiveDemo() {
        String name = "TheCodex";
        int[] numbers = {10,20,30};

        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("Name = " + name);
        System.out.println("Array First Value = " + numbers[0]);
    }

    // Type casting demo
    public void castingDemo() {

        // Implicit Casting
        int a = 50;
        double b = a;

        System.out.println("\nImplicit Casting:");
        System.out.println("int value = " + a);
        System.out.println("converted to double = " + b);

        // Explicit Casting
        double x = 99.99;
        int y = (int) x;

        System.out.println("\nExplicit Casting:");
        System.out.println("double value = " + x);
        System.out.println("converted to int = " + y);
    }
}


public class Day_03 {
    public static void main(String[] args) {
        DataTypeDemo demo = new DataTypeDemo();

        demo.primitiveDemo();
        demo.nonPrimitiveDemo();
        demo.castingDemo();
    }
}
