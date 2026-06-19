package com.seyran.leetcodejavasolutions.easy;

class VersionControl {

    private final int bad = 4;

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        FirstBadVersion solution = new FirstBadVersion();
        System.out.println(solution.firstBadVersion(5));
    }
}