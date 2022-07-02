package baekjoon;

import java.util.Scanner;

public class q10927_equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = "hello";
        
        // 문자열이 같음을 나타낼 때는 .equals() 사용
        if (a.equals(b)) {
        	System.out.println(a + "!!?");
		} else {
			System.out.println("complete");
		}

    }
}
