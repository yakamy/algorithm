package com.yakamy.algorithm.one;


import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 6, 1, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
        sortDesc(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }

    public static void sortDesc(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] < key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }


}