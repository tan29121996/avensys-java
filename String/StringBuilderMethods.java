package com.java.objects;

class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java assignment by Siddu");
		
        System.out.println(sb);
        System.out.println("*****************************");

        System.out.println(sb.equals(sb));
        System.out.println("*****************************");

        System.out.println(sb.compareTo(sb));
        System.out.println("*****************************");

        System.out.println(sb.indexOf("S"));
        System.out.println("*****************************");

        System.out.println(sb.charAt(2));
        System.out.println("*****************************");

        System.out.println(sb.substring(5));
        System.out.println("*****************************");

        System.out.println(sb.substring(5, 15));
        System.out.println("*****************************");

        System.out.println(sb.append(""));
        System.out.println("*****************************");

        System.out.println(sb.insert(0, "This is a "));
        System.out.println("*****************************");

        System.out.println(sb.reverse());
        System.out.println("*****************************");

        System.out.println("Capacity of sb: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("After ensureCapacity(), sb can now store up to: " + sb.capacity());
        System.out.println("*****************************");

        System.out.println(sb.length());
        System.out.println("*****************************");

        System.out.println(sb.capacity());
    }
}
