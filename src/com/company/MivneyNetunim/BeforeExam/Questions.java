package com.company.MivneyNetunim.BeforeExam;

import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class Questions {
    public static void main(String[] args) {
//        String s1 = "ftjdy.rtyhdrthdrtj";
//        String s2 = "ftjdy.rtyhd.rthdrtj";
//        String s3 = "ft.jdy.rtyhd.rthdrtj";
//        System.out.println(s1.split("\\.", -1).length - 1);
//        System.out.println(s2.split("\\.", -1).length - 1);
//        System.out.println(s3.split("\\.").length - 1);
//        String s4 = "qwertrewq";
//        String s5 = "qwerttrewq";
//        System.out.println(palindrome(s4));
//        System.out.println(palindrome(s5));

//        int[] arr = new int[]{3,4,5,5,6,7,8};
//        System.out.println(rangeCount(arr,8,3,5));

    }

    // Calculate the number of leaves in binary tree
    //
    public static int numLeaves(Node root) {
        if (root.right == null && root.left == null) return 1;
        else if (root.right != null) return numLeaves(root.right);
        else return numLeaves(root.left);
    }

    // Sum all the right sons of Binary Search Tree
    //
    public static int sumAllSons(Node root) {
        if (root == null) return 0;
        if (root.right == null) return sumAllSons(root.left);
        return root.right.data + sumAllSons(root.right) + sumAllSons(root.left);
    }

    // get n numbers ranged(1 to k), return with O(n+k) how many numbers in range a to b.
    //
    public static int rangeCount(int[] arr, int maxNumber, int start, int end) {
        int[] temp = new int[maxNumber + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        for (int i = 1; i < maxNumber; i++) {
            temp[i] = temp[i] + temp[i - 1];
        }
        // start-1 is to include the start position
        return temp[end] - temp[start - 1];
    }


    // check if the string is with balanced brackets
    //
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        char j, k;
        for (int i = 0; i < str.length(); i++) {
            j = str.charAt(i);
            if (j == '(' || j == '{' || j == '[') {
                stack.push(j);
            }
//            if (j != '(' && j != '{' && j != '[' && stack.isEmpty()) return false;
            if (j == ')') {
                k = stack.pop();
                if (k == '{' || k == '[') return false;
            }
            if (j == '}') {
                k = stack.pop();
                if (k == '(' || k == '[') return false;
            }
            if (j == ']') {
                k = stack.pop();
                if (k == '{' || k == '(') return false;
            }
        }
        return stack.isEmpty();
    }


    // function that check if: string is a palindrome. (Using Queue and Stack)
    //
    public static boolean palindrome(String s) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() / 2; i++) {
            stack.push(s.charAt(i));
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        // if the string is odd then we don't need to check the middle char
        if (s.length() % 2 != 0)
            stack.pop();
        // check goes here
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove()))
                return false;
        }
        return true;
    }


    // function that check if: the string is mirroring by a dot. (Using Stack)
    //
    public static boolean dotMirror(String s) {
        // check if there are more dots than expected (just 1 exactly needed)
        if (s.split("\\.").length - 1 != 1) return false;
        Stack<Character> stack = new Stack<>();
        boolean dot = false;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '.') dot = true;
                // if the char before the dot than add to stack
            else if (!dot) stack.push(c);
                // if the char after the dot than try to pop out the head and check if he is equal to the char
                //      if its empty then obviously it's incorrect
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        // just check if all the characters that went in the stack are out.
        return stack.isEmpty();
    }
}
