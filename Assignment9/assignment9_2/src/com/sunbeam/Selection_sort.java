package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Selection_sort {

    static <T> void selectionSort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (c.compare(arr[i], arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Double[] arr = new Double[5];
        arr[0] = 75.11;
        arr[1] = 22.22;
        arr[2] = 33.33;
        arr[3] = 44.44;
        arr[4] = 15.55;

        System.out.println("Before sort");
        for (Double d1 : arr) {
            System.out.println(d1);
        }

        // Corrected class name here: DoubleSortComparator
        DoubleSortComparator sortComparator = new DoubleSortComparator();

        Arrays.sort(arr, sortComparator);

        System.out.println("After sort by name");

        for (Double ele : arr) {
            System.out.println(ele);
        }
    }
}