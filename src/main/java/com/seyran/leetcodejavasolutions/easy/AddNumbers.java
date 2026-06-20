package com.seyran.leetcodejavasolutions.easy;

public class AddNumbers {
    public int addNumbers(int num) {

        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }
}
