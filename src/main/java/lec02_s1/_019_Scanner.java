package lec02_s1;

import java.util.Scanner;

public class _019_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1을 입력하면 1000이 나옴
        /*
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
         */

        // while문을 이용하면 Int를 반복적으로 입력 가능, Int가 아닌 것이 입력되면 종료.
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }
}
