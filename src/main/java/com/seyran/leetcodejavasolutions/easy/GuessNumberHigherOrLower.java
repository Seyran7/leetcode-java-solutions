package com.seyran.leetcodejavasolutions.easy;

public class GuessNumberHigherOrLower extends GuessGame  {

        public int guessNumber(int n) {
            long left = 1;
            long right = n;

            while (left <= right) {
                long mid = left + (right - left) / 2;

                int result = guess((int) mid);

                if (result == 0) {
                    return (int) mid;
                } else if (result == -1) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return -1;
    }
}
class GuessGame {
    private int pick = 6;

    public int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }
}