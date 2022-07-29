package baekjoon;
import java.util.Scanner;

public class q1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();
		A = A.trim();
		A = A.replaceAll("\\s", "1");
		int[] arr = new int[A.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) - '0' == 1) {
				arr[A.charAt(i) - '0']++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]+1);
			}
		}
	}
}
