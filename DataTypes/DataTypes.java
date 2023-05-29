package com.java.objects.datatypes;

public class DataTypes {

  public static void main(String[] args) {
	// Implicit
    byte a = 20;
    short b = a;
    System.out.println(b);

    int c = 30;
    long d = c;
    System.out.println(d);

    float e = 20.10f;
    double f = e;
    System.out.println(f);

    char g = '7';
    int h = g;
    System.out.println(h);

    System.out.println();
	
	// Explicit
    short i = 20;
    byte j;
    j = (byte)i;
    System.out.println(j);

    long k = 30;
    int l;
    l = (int)k;
    System.out.println(l);

    double m = 20.10;
    float n;
    n = (float)m;
    System.out.println(n);

    int o = 7;
    char p;
    p = (char)o;
    System.out.println(p);


    // Wrapper Classes
    Byte newByte = Byte.valueOf((byte)1);

    System.out.println(newByte);
    
  }
  
}