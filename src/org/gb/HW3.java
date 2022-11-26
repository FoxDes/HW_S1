package org.gb;

public class HW3 {
    public class Solution {
        public int removeElement(int[] nums, int val) {
            int ps[] = new int[nums.length];
            int psLen = 0;

            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (num == val) {
                    count++;
                    ps[psLen] = i;
                    psLen++;
                }
            }

            int i2 = psLen;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (--i2 < 0) break;
                int p = ps[i2];
                if (p == i) continue;
                nums[p] = nums[i];
            }
            return nums.length - count;
        }
    }
}
