package lec02_s1;

public class _011_Switchdemo {
    public static void main(String[] args) {
        System.out.println("switch");
        // switch () 괄호 안 숫자와 맞는 숫자를 출력, 없으면 default 값을 출력
        switch(4){
            case 1 :
                System.out.println("one");
                // break; : 괄호 안 숫자와 일치시 중지
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }

        // switch 는 if 로 대체가능
        int val = 1;
        if (val == 1){
            System.out.println("one");
        } else if (val == 2){
            System.out.println("two");
        } else if (val == 3) {
            System.out.println("three");
        }
    }
}
