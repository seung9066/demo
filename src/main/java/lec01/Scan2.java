package lec01;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. int : 작은 정수 (+- 21억 까지) number는 지정 이름
        // int number = scan.nextInt();

        // 2. long : 큰 정수 (+- 2^63-1 )
        // long number = scan.nextLong();

        // 3. float : 작은 실수 (소수점)
        // float number = scan.nextFloat();

        // 4. double : 큰 실수
        // double number = scan.nextDouble();

        // 문장이랑 숫자 각각 입력
        String name = scan.nextLine();
        int age = scan.nextInt();

        System.out.println("이름 : " + name);
        System.out.println("나이 : "  + age);
    }
}
