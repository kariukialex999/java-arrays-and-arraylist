package org.kariioke;

public class MultiDimensionArray {
    static void main() {
        //think of a multidimensional array as array of arrays
        //given a multi-dimension array of 3 x 3
        //if you specify the number of rows, it is not always necessary to name the number of columns
        //the number of rows is mundate
        /*
            1 2 3
            4 5 6
            7 8 9

         */

        //int [] [] arr = new int[3][3];
        //a nested array is stored as an array of arrays
        //each particular index is an array

        int [] [] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int number = arr[2][0];
        System.out.println(number);

        //since each array is a different object then we can set an array with different sizes

        int arr1 [][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
    }
}
