package org.kariioke;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //we can also create multidimensional arraylist
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3; i++) {
            arrayList.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayList.get(i).add(scanner.nextInt());
            }
        }

        System.out.println(arrayList);
    }
}
