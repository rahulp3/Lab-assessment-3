package com.gl.services;

import java.util.Stack;

public class BracketsCheck {
	Stack<Character> set = new Stack<>();
	char k, z;

	public boolean check(String input) {
		for (int i = 0; i < input.length(); i++) {
			k = input.charAt(i);

			if (k == '[' || k == '{' || k == '(') {
				set.add(k);
			}

			if (set.isEmpty()) {
				return false;
			}

			switch (k) {
			case ')':
				z = set.pop();
				if (z == '{' || z == '[')
					return false;
				break;
			case '}':
				z = set.pop();
				if (z == '(' || z == '[')
					return false;
				break;
			case ']':
				z = set.pop();
				if (z == '{' || z == '(')
					return false;
				break;

			}
		}
		return (set.isEmpty());
	}
}
