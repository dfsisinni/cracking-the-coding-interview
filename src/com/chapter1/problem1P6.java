package com.chapter1;

import java.util.Scanner;

/**
 * Created by dane on 10/8/16.
 */

//PROBLEM 1.6
public class problem1P6 {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input:");
        String in = scan.nextLine();

        System.out.println(compressString(in));
    }

    public static String compressString (String original) {
        StringBuilder output = new StringBuilder();
        int start = 0;

        boolean compressed = false;

        for (int i = 1; i < original.length(); i++) {
            if (original.charAt(start) != original.charAt(i)) {
                output.append(original.charAt(start));
                output.append(i - start);

                if (!compressed) {
                    compressed = i - start > 1 ? true : false;
                }

                start = i;
            }
        }

        output.append(original.charAt(start));
        output.append(original.length() - start);

        if (!compressed && original.length() - start == 1) {
            return original;
        }

        return output.toString();
    }



}
