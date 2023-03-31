package com.bridgelabz.DataStructurePrograms.SimpleBalancedParentheses;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String string = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        System.out.println(string);

        for (int i=0; i<string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == '(')
                stack.push(ch);
             if (ch == ')')
                 stack.pop(ch);
        }
        stack.check();
    }
}






