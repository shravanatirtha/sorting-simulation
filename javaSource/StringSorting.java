package javaSource;

import java.util.*;

public class StringSorting {

    public StringSorting() {

    }

    public void sort(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Comparator comparator = new Comparator<T>() {
                    
                // };
                // if (list.get(j) < list.get(i)) {
                //     int temp = list.get(i);
                //     list.add(i, list.get(j));
                //     list.add(j, temp);
                // }
            }
        }
    }

    public void insert(ArrayList<String> list, String el) {
        list.add(el);
    }

    public void sortedInsert(ArrayList<String> list, String el) {
        int i = 0;
        // while (el >= list.get(i)) {
        //     i++;
        // }
        list.add(i, el);
    }

}