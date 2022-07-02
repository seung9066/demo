package baekjoon;

import java.util.Scanner;

public class q2588_charAt_IntegerparseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // 3자리 수를 각 자리별로 가져오기 위해 문자열로 인식 후 진행
        String b = scan.next();

        // charAt() 문자열의 몇번째 가져오기
        // - '0'을 적는 이유는 가져온 숫자가 문자 '3' 이기 때문에 이를 숫자 '3'으로 변환시키기 위해 (3으로 예시)
        System.out.println(a*(b.charAt(2) - '0'));
        System.out.println(a*(b.charAt(1) - '0'));
        System.out.println(a*(b.charAt(0) - '0'));
        // Integer.parseInt() 문자열에 들어있는 숫자를 int로 변환
        System.out.println(a*Integer.parseInt(b));
    }
}
