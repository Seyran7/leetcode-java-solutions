package com.seyran.leetcodejavasolutions.easy;

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

        System.out.println(solution.firstBadVersion(5)); // 4
        System.out.println(solution.firstBadVersion(10)); // 4
    }
}
public class VersionControl {

    private final int bad;

    public VersionControl() {
        this.bad = 4; // ilk pis versiya
    }

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}