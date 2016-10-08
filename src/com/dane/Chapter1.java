package com.dane;

import java.util.Scanner;

public class Chapter1 {

    public static void main(String[] args) {
        problem15();
    }

    /************************************************
     *
     * Problem 1.5
     *
     ************************************************/

    public static void problem15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Original: ");
        String original = scanner.nextLine();

        System.out.println("Output: ");
        String output = scanner.nextLine();

        System.out.println(oneAway(original, output));
    }

    public static boolean oneAway (String orig, String output) {
        if (orig.length() == output.length()) {
            boolean oneDiff = false;
            for (int i = 0; i < orig.length(); i++) {
                if (orig.charAt(i) != output.charAt(i)) {
                    if (oneDiff) {
                        return false;
                    } else {
                        oneDiff = true;
                    }
                }
            }
            return true;
        } else if (output.length() - 1 == orig.length()) {
            return oneCharDiff(output, orig);
        } else if (orig.length() - 1 == output.length()){
            return oneCharDiff(orig, output);
        } else {
            return false;
        }
    }

    private static boolean oneCharDiff (String longer, String shorter) {
        //i for shorter, z for longer
        boolean charSkip = false;
        for (int i = 0, z = 0; i < shorter.length(); i++, z++) {
            if (shorter.charAt(i) != longer.charAt(z)) {
                if (charSkip) {
                    return false;
                } else {
                    charSkip = true;
                    i--;
                }
            }
        }
        return true;
    }

}
