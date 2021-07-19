package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<Object> objectHashSet = new HashSet<>();
        Point point1 = new Point("125", "170");
        Point point2 = new Point("125", "170");
        Point point3 = new Point("50", "220");

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        System.out.println(point3.hashCode());

        objectHashSet.add(point1);
        objectHashSet.add(point2);
        objectHashSet.add(point3);
        System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point3));


        HashSet<Object> objectHashSetClone = (HashSet<Object>) objectHashSet.clone();
        System.out.println(objectHashSetClone.contains(point3));

        for (Object o : objectHashSetClone) {
            System.out.println(o);
        }
    }
}

