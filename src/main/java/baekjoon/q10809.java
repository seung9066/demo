package baekjoon;

import java.util.Scanner;

public class q10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = scan.next();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
                System.out.println(arr[ch - 'a']);
            }
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }

    }

}
