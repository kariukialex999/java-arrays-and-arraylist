package org.kariioke;

import java.util.ArrayList;

public class ArrayLists {
    static void main() {
        //this is part of collections framework
        //it is used for the use case that we don't know the size of our items
        //we use generics to specify the datatype and also use wrapper classes for the data types
        //we can use various methods to manipulate the members of the arraylist
        ArrayList <Integer> arrayList = new ArrayList<>(10);

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);
        arrayList.add(0);

        System.out.println(arrayList);

        System.out.println(arrayList.contains(50));
        System.out.println(arrayList.size());

        //mutating member
        arrayList.set(10, 110);

        //getting a member from the arraylist
        System.out.println(arrayList.get(10));

        System.out.println(arrayList);

        arrayList.set((arrayList.size() - 1), 1000);
        arrayList.set(arrayList.size() - 1, 2000);

        //deleting a member from the arraylist
        arrayList.remove(5); //element on index 5 will be removed (60)
        System.out.println(arrayList);
    }
}
