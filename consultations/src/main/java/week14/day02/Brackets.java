package week14.day02;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
    private static final String BRACKETS = "()[]{}";

    //
//      if (c == ')' && stack.pop() != '(') {
//        return false;
//    } else if (c == ']' && stack.pop() != '[') {
//        return false;
//    } else if (c == '}' && stack.pop() != '{') {
//        return false;
//    }
    public boolean isBracketsCorrect(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : input.toCharArray()) {
            if (BRACKETS.indexOf(c) % 2 == 0) {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (BRACKETS.indexOf(stack.peek()) + 1 != BRACKETS.indexOf(c)) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Brackets brackets = new Brackets();

        System.out.println(brackets.isBracketsCorrect("(([]){})"));
        System.out.println(brackets.isBracketsCorrect("(([]{})"));
        System.out.println(brackets.isBracketsCorrect("((["));
        System.out.println(brackets.isBracketsCorrect("(([)]"));
        System.out.println(brackets.isBracketsCorrect("(((({}[]){})))"));
        System.out.println(brackets.isBracketsCorrect("(((("));
        System.out.println(brackets.isBracketsCorrect("(((())))]"));
    }

}
