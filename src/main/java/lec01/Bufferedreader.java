package lec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        int N = Integer.parseInt(br.readLine()); // readLine으로 받은 입력 데이터 String임.
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
    }
}