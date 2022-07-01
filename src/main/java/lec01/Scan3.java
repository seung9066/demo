package lec01;

import java.util.Scanner;

public class Scan3 {
    public static void main(String[] args) {
        //스캐너 만들기
        Scanner scan = new Scanner(System.in);

        // 숫자 출력 순서 바꾸기
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println(number2);
        System.out.println(number1);
    }
}
