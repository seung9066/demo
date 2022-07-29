package baekjoon;

import java.util.Scanner;

public class q5622_array_alphabet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num1 = new int[26]; // 알파벳은 26개
		int time = 0;
		for (int i = 0; i < num1.length; i++) { // 우선 알파벳 값을 0으로
			num1[i] = 0;
		}

		String num = scan.next();
		for (int i = 0; i < num.length(); i++) {
			char a = num.charAt(i); // if num = Wa -> a = W a = A
			num1[a - 'A']++;
		}

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] != 0) {
				time += num1[i];
			}
		}

		for (int i = 0; i < 3; i++) {
			num1[i] *= 3;
		}
		for (int i = 3; i < 6; i++) {
			num1[i] *= 4;
		}
		for (int i = 6; i < 9; i++) {
			num1[i] *= 5;
		}
		for (int i = 9; i < 12; i++) {
			num1[i] *= 6;
		}

		for (int i = 12; i < 15; i++) {
			num1[i] *= 7;
		}
		for (int i = 15; i < 19; i++) {
			num1[i] *= 8;
		}
		for (int i = 19; i < 22; i++) {
			num1[i] *= 9;
		}
		for (int i = 22; i < 26; i++) {
			num1[i] *= 10;
		}

		int time1 = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] != 0) {
				time1 += num1[i];
			}
		}

		System.out.println(time1);

	}
}
