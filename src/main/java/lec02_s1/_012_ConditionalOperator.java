package lec02_s1;

public class _012_ConditionalOperator {
    public static void main(String[] args) {
        // && : 좌항 우항 값이 모두 참일 때. and 라고 읽음
        if (true && true){
            System.out.println(1);
        }
        // true && false = false 둘중 하나라도 false 면 false.
        if (true && false) {
            System.out.println(2);
        }

        // || : or
        if (true || true) {
            System.out.println(1);
        }
        // true || false 는 실행
        if (true || false) {
            System.out.println(2);
        }
        // 둘 다 false 는 거짓이므로 실행 x
        if (false || false){
            System.out.println(3);
        }

        // ! : not. !true = false
        if (!true){
            System.out.println(1);
        }
        if (!false){
            System.out.println(2);
        }
    }
}
