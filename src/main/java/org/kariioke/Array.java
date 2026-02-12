package org.kariioke;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static void main() {
        //given a some values of the same type, we can store them in an organized way

        int a = 1;
        int b = 2;
        int c = 3;

        //we can use an array to store data types of the same family

        //syntax
        //datatype[] variableName = new datatype[size];
        //the reference variable happens at compile time and is stored in stack memory
        //the creation of the object occurs at runtime and is stored in heap memory
        //heap objects are not continuos in java

        int[] rollNo = new int[3];
        int [] myArr = {1, 2, 3};

        //we can use a loop to access every individual member in the array
        //given an array

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter members of the array: ");
        int arr[] = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //to print out an array we use the arrays utility class toString builder
        System.out.println(Arrays.toString(arr));

        //we can also use a foreach loop to access members of an array
        //an enhanced for loop gives you direct access to the individual member
        for (int member : arr) {
            System.out.println(member);
        }
        System.out.println(" ");

        //a normal for loop has to access the members using indexes
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
