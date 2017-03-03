package com.yakamy.algorithm.one;

import java.util.Arrays;

/**
 * 合并排序
 *
 * @author yakamy
 * @create 2017-03-03 11:49
 */
public class CombineSort {

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 7, 1, 3, 2, 6};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            combineSort(a, p, q, r);
        }
    }

    public static void combineSort(int[] a, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] la = new int[n1];
        int[] ra = new int[n2];
        for (int i = 0; i < n1; i++) {
            la[i] = a[i + p];
        }
        for (int i = 0; i < n2; i++) {
            ra[i] = a[i + q + 1];
        }
        for (int k = p, i = 0, j = 0; k <= r; k++) {
            if (i >= n1) {
                a[k] = ra[j++];
                continue;
            }
            if (j >= n2) {
                a[k] = la[i++];
                continue;
            }
            if (la[i] <= ra[j]) {
                a[k] = la[i++];
            } else {
                a[k] = ra[j++];
            }
        }

    }

}
