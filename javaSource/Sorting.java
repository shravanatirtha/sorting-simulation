package javaSource;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> list = new ArrayList<>();
            StringSorting stringSorting = new StringSorting();
            int n = 0;

            while (n < 5) {
                list.add(sc.nextLine());
                n++;
            }
            String el = sc.nextLine();

            stringSorting.insert(list, el);
            System.out.println(list);

            //stringSorting.sortedInsert(list, el);
            //System.out.println(list);

            //stringSorting.sort(list);
            //System.out.println(list);
        }
    }
}
