package com.seyran.leetcodejavasolutions.easy;
import java.util.regex.Pattern;

public class ValidPhoneNumber {

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^(\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\) \\d{3}-\\d{4})$");

    public static boolean isValid(String phone) {
        return PHONE_PATTERN.matcher(phone).matches();
    }

    public static void main(String[] args) {
        String[] phones = {
                "987-123-4567",
                "123 456 7890",
                "(123) 456-7890"
        };

        for (String phone : phones) {
            if (isValid(phone)) {
                System.out.println(phone);
            }
        }
    }
}