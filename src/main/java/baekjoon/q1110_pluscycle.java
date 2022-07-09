package baekjoon;

import java.util.Scanner;

public class q1110_pluscycle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int copy = N;
        int count = 0;
        while (true) {
            N = (N % 10) * 10 + (((N/10)+(N%10)) % 10);
            count++;
            if (copy == N){
                break;
            }
        }
        System.out.println(count);
    }
}
