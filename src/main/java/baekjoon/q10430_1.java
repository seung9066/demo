package baekjoon;

import java.util.Scanner;

public class q10430_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 5, 8, 4
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        System.out.println((A+B)%C);
        System.out.println((A%C)+(B%C)%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
