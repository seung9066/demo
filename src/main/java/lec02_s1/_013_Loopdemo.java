package lec02_s1;

public class _013_Loopdemo {
    public static void main(String[] args) {

        // 반복문 while(조건) { 반복 실행 영역 }. () true 인 동안 {}반복 실행한다.
        int i = 0; // 초기값
        while (i<10) // 종료조건
            {
            System.out.println("Coding Everybody" + i);
            i++; // 반복
        }

        // for (초기값; 종료조건; 반복실행) { 반복할 구문 }
        for (int n = 0; n <= 10; n=n+2) {
            System.out.println("Coding Everybody" + n);
            if (n == 8) // {
                break; // } 반복문 제어(종료) if 문이 한줄일 경우 중괄호 생략 가능
        }

        for (int k = 0; k <= 10; k = k+2) {
            if (k == 8)
                continue; // continue 를 만나는 순간은 사라지고 다음 문장부터 이어짐
            System.out.println("Coding Everybody" + k);
        }

        // 반복문 중첩
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++){
                System.out.println(a + "" + b);
                /* j 값이 먼저 출력 되어 a = 0 b = 1 이기에 01 02 03 ~ 09가 되는 순간
                    a = 0 b = 10 이 되어 b = false 가 된다 이에 상위 for 문을 출력하여 a = 1이 되고
                    b 값은 초기화 되어 0이 되고 10이 출력된다. 이후 반복되어 11 12 13 ~ 99 출력
                 */
            }
        }
    }
}
