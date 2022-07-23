package baekjoon;

import java.util.Scanner;

public class q2577_Integer_toString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = (scan.nextInt()*scan.nextInt()*scan.nextInt());
        String B = Integer.toString(A); // A의 정수를 String형으로 바꾸어 B에 담는다

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < B.length(); j++) {
                if ((B.charAt(j)-'0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
