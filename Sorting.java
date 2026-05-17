package javaSource;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();
            IntegerSorting integerSorting = new IntegerSorting();
            int n = 0;

            while (n < 5) {
                list.add(sc.nextInt());
                n++;
            }
            int el = sc.nextInt();

            integerSorting.insert(list, el);
            System.out.println(list);

            integerSorting.sortedInsert(list, el);
            System.out.println(list);

            integerSorting.sort(list);
            System.out.println(list);
        }
    }
}
