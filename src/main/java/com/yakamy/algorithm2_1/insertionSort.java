package com.yakamy.algorithm2_1;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author chenjunwei
 * @date 2019-06-15 14:22
 * @description
 */
public class insertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 3};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }


    public static void insertionSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            //要插入的值
            int key = a[j];
            int i = j - 1;
            //找出要插入的位置，比当前值大的后移
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            //插入当前值
            a[i + 1] = key;
        }
    }


}
