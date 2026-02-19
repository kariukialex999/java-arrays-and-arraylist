package org.kariioke;

public class Max {
    static void main() {
        //given an array find the max number in that array

        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        System.out.println(max1(arr));
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int max1(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
