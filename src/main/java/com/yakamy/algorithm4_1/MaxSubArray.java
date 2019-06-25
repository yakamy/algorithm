package com.yakamy.algorithm4_1;

/**
 * 最大子数组
 *
 * @author chenjunwei
 * @date 2019-06-25 10:53
 * @description
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int a[] = new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        Tuple maxSubarray = findMaxSubarray(a, 0, 15);
        System.out.println(maxSubarray);
    }

    public static Tuple findMaxSubarray(int a[], int low, int high) {
        if (high == low) {
            return new Tuple(low, high, a[low]);
        }
        int mid = (low + high) / 2;
        Tuple l = findMaxSubarray(a, low, mid);
        Tuple r = findMaxSubarray(a, mid + 1, high);
        Tuple cross = findMaxCrossingSubarray(a, low, mid, high);
        if (l.sum >= r.sum && l.sum >= cross.sum) {
            return l;
        }
        if (r.sum >= l.sum && r.sum >= cross.sum) {
            return r;
        }
        return cross;
    }

    public static Tuple findMaxCrossingSubarray(int a[], int low, int mid, int high) {
        int leftSum = 0;
        int sum = 0;
        int maxLeft = 0;
        for (int i = mid; i >= low; i--) {
            sum += a[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int rightSum = 0;
        sum = 0;
        int maxRight = 0;
        for (int j = mid + 1; j <= high; j++) {
            sum += a[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }
        return new Tuple(maxLeft, maxRight, leftSum + rightSum);
    }

    static class Tuple {
        int left;
        int right;
        int sum;

        Tuple(int left, int right, int sum) {
            this.left = left;
            this.right = right;
            this.sum = sum;
        }

        @Override
        public String toString() {
            return "Tuple{" +
                    "left=" + left +
                    ", right=" + right +
                    ", sum=" + sum +
                    '}';
        }
    }
}
