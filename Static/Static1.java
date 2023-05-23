package com.java.methods;

class Test {
    static int x, y, z;
    
    static {
        x = 10;
        y = 20;
    }
    
    static void printOne() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

public class Static {
    public static void main(String[] args) {
        Test.printOne();
    }
}
