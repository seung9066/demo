package lec02_s1;

public class _009_EqualDemo {
    public static void main(String[] args) {
        // Boolean = true, false
        // == : 좌항과 우항 비교값을 true, false로 나타냄
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println("one"=="two");
        System.out.println("one"=="one");
        // != : 부정
        System.out.println(1!=2);
        System.out.println(1!=1);
        // 부등호
        System.out.println(1>2);
        System.out.println(1<2);
        // <= 크거나(작거나) 같다.
        System.out.println(1<=2);
        System.out.println(1>=2);
        System.out.println(1<=1);
        // .equals 문자열 비교
        String a = "Hello world";
        String b = new String("Hello world");
        // 아래 문장은 false
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
