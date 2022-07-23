package baekjoon;

import java.util.Scanner;

public class q4344_student_avg_percent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int a = 0;
            int d = scan.nextInt();
            double[] sum = new double[d];
            int[][] c = new int[d][];
            for (int i = 0; i < c.length; i++) {
                a = scan.nextInt();
                c[i] = new int[a];
                for (int j = 0; j < a; j++) {
                    int b = scan.nextInt();
                    c[i][j] = b;
                }
            }

            for (int i = 0; i < c.length; i++) {
                sum[i] = 0;
                for (int j = 0; j < c[i].length; j++) {
                    sum[i] += c[i][j];
                }
            }

            double[] avg = new double[sum.length];
            for (int i = 0; i < sum.length; i++) {
                double count = 0;
                avg[i] = sum[i]/c[i].length;
                for(int j = 0; j < c[i].length; j++) {
                    if (avg[i] < c[i][j]) {
                        count++;
                    }
                }
                System.out.printf("%.3f%%\n",(count/c[i].length)*100);
            }
    }
}
