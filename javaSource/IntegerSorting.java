package javaSource;

import java.util.ArrayList;

public class IntegerSorting {

    public IntegerSorting() {

    }

    public void sort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public void insert(ArrayList<Integer> list, int el) {
        list.add(el);
    }

    public void sortedInsert(ArrayList<Integer> list, int el) {
        int i = 0;
        while (el >= list.get(i)) {
            i++;
        }
        list.add(i, el);
    }

}