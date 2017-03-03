package com.yakamy.algorithm.one;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author yakamy
 * @create 2017-03-03 12:32
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[]{7, 6, 5, 4, 3, 2, 1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }


}
