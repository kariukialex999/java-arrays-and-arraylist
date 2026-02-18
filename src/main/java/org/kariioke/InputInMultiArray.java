package org.kariioke;

import java.util.Arrays;

public class InputInMultiArray {
    static void main() {
        //we interact with the members of a nested array using a loop
        //given a multidimensional array

        int arr [][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int number = arr[row][col];
                System.out.print(number + " ");
            }
            System.out.println();
        }

        //since every row is an array, we can use
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
