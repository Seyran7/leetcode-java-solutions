package com.seyran.leetcodejavasolutions.easy;

public class BasicCalculatorII {
        public int calculate(String s) {

            int result = 0;
            int lastNumber = 0;
            int currentNumber = 0;
            char operation = '+';

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                if (Character.isDigit(c)) {
                    currentNumber = currentNumber * 10 + (c - '0');
                }

                if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {

                    switch (operation) {

                        case '+':
                            result += lastNumber;
                            lastNumber = currentNumber;
                            break;

                        case '-':
                            result += lastNumber;
                            lastNumber = -currentNumber;
                            break;

                        case '*':
                            lastNumber = lastNumber * currentNumber;
                            break;

                        case '/':
                            lastNumber = lastNumber / currentNumber;
                            break;
                    }

                    operation = c;
                    currentNumber = 0;
                }
            }

            return result + lastNumber;
    }
}
