package com.java.methods;

import java.util.Scanner;

interface SICalculator {
    public void acceptInput();
    public void findSI();
    public void display();
}

class Businessman1 implements SICalculator {
    private int principle;
    private int time;
    private float rate;
    private float si; 

    public void acceptInput() {
        principle = 10000;
        time = 2;
        rate = 3.5f;
    }

    public void findSI() {
        si = (principle * time * rate) / 100;
    }

    public void display() {
        System.out.println("Simple Interest is: " + si);
    }
}

class Businessman2 implements SICalculator {
    private int principle;
    private int time;
    private float rate;
    private float si; 

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        principle = scan.nextInt();
        System.out.println("Enter time period in years:");
        time = scan.nextInt();
        System.out.println("Enter rate of interest:");
        rate = scan.nextFloat();
    }

    public void findSI() {
        si = (principle * time * rate) / 100;
    }

    public void display() {
        System.out.println("Simple Interest is: " + si);
    }
}

class Businessman3 implements SICalculator {
    private int principle;
    private int time;
    private float rate;
    private float si; 

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        principle = scan.nextInt();
        System.out.println("Enter time period in years:");
        time = scan.nextInt();
        System.out.println("Enter rate of interest:");
        rate = scan.nextFloat();
    }

    public void findSI() {
        if (principle == 0 || time == 0 || rate == 0) {
            si = 0;
        } else {
            si = (principle * time * rate) / 100;
        }
    }

    public void display() {
        System.out.println("Simple Interest is: " + si);
    }
}

class SI {
    public void acceptSICalculator(SICalculator ref) {
        ref.acceptInput();
        ref.findSI();
        ref.display();
    }
}

public class Interface {
    public static void main(String[] args) {
        Businessman1 bm1 = new Businessman1();
        Businessman2 bm2 = new Businessman2();
        Businessman3 bm3 = new Businessman3();
        SI m = new SI();
        System.out.println("Businessman 1: ");
        System.out.println("***************");
        m.acceptSICalculator(bm1);
        System.out.println();
        System.out.println("Businessman 2: ");
        System.out.println("***************");
        m.acceptSICalculator(bm2);
        System.out.println();
        System.out.println("Businessman 3: ");
        System.out.println("***************");
        m.acceptSICalculator(bm3);
    }
}
