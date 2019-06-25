package com.yakamy.algorithm2_3;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author chenjunwei
 * @date 2019-06-15 14:41
 * @description
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 7, 1, 3, 2, 6};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void mergeSort(int a[], int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    public static void merge(int a[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = a[i + p];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = a[i + q + 1];
        }
        for (int k = p, i = 0, j = 0; k <= r; k++) {
            if (i >= n1) {
                a[k] = R[j++];
                continue;
            }
            if (j >= n2) {
                a[k] = L[i++];
                continue;
            }

            if (L[i] <= R[j]) {
                a[k] = L[i];
                i = i + 1;
            } else {
                a[k] = R[j];
                j = j + 1;
            }
        }
    }


}
