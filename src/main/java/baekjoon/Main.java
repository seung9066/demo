package baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int f = 0;
		int t = 0;
		int f1 = n % 5;
		int t1 = n % 3;
		int k = 1;

		// System.out.println(f1 + " " + t1 + " " + f2 + " " + t2);

		
		
		while (true) {
			if (f1 == 0) {
				if (f1 + t1 == 0) {
					
				} else {
					System.out.println(f1);
					break;
				}
			}
		}
	}
}
