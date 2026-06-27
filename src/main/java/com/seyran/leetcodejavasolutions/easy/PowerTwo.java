package com.seyran.leetcodejavasolutions.easy;

public class PowerTwo {

        public boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
    }
}
