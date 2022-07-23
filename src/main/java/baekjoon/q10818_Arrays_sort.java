package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class q10818_Arrays_sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
       Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
    }
}
