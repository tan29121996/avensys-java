package com.java.methods;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {
    	
    	System.out.println("Array List");
    	System.out.println();

        ArrayList al = new ArrayList();
        al.add("Siddu");
        al.add(100);
        al.add(3.4);
        al.add('c');
        al.add("Nithin");
        al.add(200);
        al.add(4.5);
        al.add('d');
        al.add("Name");
        al.add(500);
        System.out.println(al); 

        System.out.println("Contains 'Siddu': " + al.contains("Siddu"));

        System.out.println("Element at index 2: " + al.get(2));

        System.out.println("Index of 100: " + al.indexOf(100));

        System.out.println("Previous element at index 3: " + al.set(3, "Updated Element"));
        
        System.out.println("Cloned ArrayList: " + (ArrayList) al.clone());
        
        System.out.println();
        System.out.println("Linked List");
        System.out.println();
        
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(100);
        ll.add('A');
        ll.add("Siddu");
        ll.add(34.7);
        ll.add(34.7);
        ll.add(100000);
        ll.add('C');
        ll.add("Nithin");
        ll.add(45.3);
        ll.add(45.4);
        System.out.println(ll);

        System.out.println("Cloned linked List: " + (LinkedList) ll.clone());
        
        System.out.println("Previous element at index 4: " + ll.set(4, "Updated Element"));
        
        System.out.println("Does the linked list contain 'A'? " + ll.contains('A'));
        
        System.out.println("Index of 'Siddu' in the linked list: " + ll.indexOf("Siddu"));
        
        System.out.println("Last index of '34.7' in the linked list: " + ll.lastIndexOf(34.7));
    }
}

