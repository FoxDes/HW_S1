package org.gb;

import java.util.Arrays;

public class HW1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i1 = 0;
        int i2 = 0;
        if (m < 1) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n < 1) {

        } else {
            for (int i = 0; i < temp.length; i++) {
                if (nums1[i1] < nums2[i2]) {
                    temp[i] = nums1[i1];
                    if (i1 == m - 1) {
                        for (int j = i2; j < n; j++) {
                            temp[++i] = nums2[j];
                        }
                        i = temp.length;
                    }
                    i1++;
                } else {
                    temp[i] = nums2[i2];
                    if (i2 == n - 1) {
                        for (int j = i1; j < m; j++) {
                            temp[++i] = nums1[j];
                        }
                        i = temp.length;
                    }
                    i2++;
                }
            }
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = temp[i];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
