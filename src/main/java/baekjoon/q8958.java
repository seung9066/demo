package baekjoon;

import java.util.Scanner;

public class q8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String OX[] = new String[scan.nextInt()];

        for (int i = 0; i < OX.length; i++) {
            OX[i] = scan.next();
        }

        for (int i = 0; i < OX.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = 0; j < OX[i].length(); j++) {
                if (OX[i].charAt(j) == 'O') {
                    count++;
                } else if (OX[i].charAt(j) == 'X') {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}