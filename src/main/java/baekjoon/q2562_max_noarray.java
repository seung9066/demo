package baekjoon;

import java.util.Scanner;

public class q2562_max_noarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int b = 0;
        for (int i = 0; i < 9; i++) {
            int a = scan.nextInt();
            if (max < a) {
                max = a;
                b = i;
            }
        }
        System.out.println(max + " " + (b+1));
    }
}
