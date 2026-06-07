package com.seyran.leetcodejavasolutions.easy;

import java.io.*;

public record TenthLine() {


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                count++;
                if (count == 10) {
                    System.out.println(line);
                    break;
                }
            }

            br.close();
    }
}
