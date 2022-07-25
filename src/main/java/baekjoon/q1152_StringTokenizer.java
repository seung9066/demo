package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q1152_StringTokenizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        StringTokenizer B = new StringTokenizer(A, " ");

        System.out.println(B.countTokens());
    }
}
