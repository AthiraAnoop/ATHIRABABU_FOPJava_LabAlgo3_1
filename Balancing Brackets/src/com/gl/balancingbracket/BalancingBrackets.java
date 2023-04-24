package com.gl.balancingbracket;

import java.util.*;

public class BalancingBrackets {
	public static void main(String[] args) {
		String sample = "([[{}]])";
		checkBalanced(sample);
		System.out.println((checkBalanced(sample) ? "The entered String has Balanced Brackets" : "The entered Strings do not contain Balanced Brackets"));
	}

	public static Boolean checkBalanced(String sample) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < sample.length(); i++) {
			char c = sample.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				} else if (c == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (c == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (c == ']' && stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}
}
