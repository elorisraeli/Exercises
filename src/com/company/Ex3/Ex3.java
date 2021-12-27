package com.company.Ex3;

public class Ex3 {

    public static boolean validPassword(String s) {
        if (s.length() < 6) return false;
        if (s.contains(" ")) return false;
        int counter_nums = 0;
        int counter_oprs = 0;
        String numbers = "0123456789";
        String operators = "!@#$%";
        for (int i = 0; i < numbers.length(); i++) {
            if (s.contains(String.valueOf(numbers.charAt(i))))
                counter_nums++;
        }
        if (counter_nums == 0) return false;
        for (int i = 0; i < operators.length(); i++) {
            if (s.contains(String.valueOf(operators.charAt(i))))
                counter_oprs++;
        }
        if (counter_oprs == 0) return false;

        return true;
    }

    public static String sentence(String s) {
        String[] words = s.split(" ");
        String s_new = "";
        for (int i = words.length - 1; i >= 0; i--) {
            s_new = String.format("%s %s", s_new, words[i]);
        }
        return s_new;
    }

    public static boolean deletions(String s, String t) {
        String s_build = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(index)) {
                s_build = String.format("%s%s", s_build, s.charAt(i));
                index++;
            }
        }
        if (s_build.equals(t)) return true;
        else return false;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (a - b == 0) {
            return 1;
        } else if (a < b) {
            return 0;
        } else {
            return (1 + divide(a - b, b));
        }
    }
}

