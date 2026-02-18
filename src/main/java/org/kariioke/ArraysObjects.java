package org.kariioke;

import java.util.Arrays;

public class ArraysObjects {
    static void main() {
        //arrays of objects
        //arrays are pass by value and are mutable


        String[] str = new String[5];
        System.out.println(Arrays.toString(str));

        str[0] = "Lex";
        System.out.println(Arrays.toString(str ));
    }
}
