package com.javatest.others;

public class Recursive {

	public static void doMove(int n, char from, char temp, char to) {
		if (n == 0)
			return;

		doMove(n - 1, from, to, temp);
		System.out.println("Moving disc: " + n + " from tower " + from + " to tower " + to);
		doMove(n - 1, temp, from, to);
	}

	public static void main(String[] args) {
		doMove(3, 'A', 'B', 'C');
	}

}
