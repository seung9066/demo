package baekjoon;

import java.util.Scanner;

public class q2588_charAt_IntegerparseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.next();

        // charAt() 문자열의 몇번째 가져오기
        System.out.println(a*(b.charAt(2)));
        System.out.println(a*(b.charAt(1)));
        System.out.println(a*(b.charAt(0)));
        // Integer.parseInt() 문자열에 들어있는 숫자를 int로 변환
        System.out.println(a*Integer.parseInt(b));
    }
}
