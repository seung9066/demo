package lec02_s1;

public class _002_variable {
    public static void main(String[] args) {
        int a;
        // 데이터 형식의 숫자, 변수의 이름
        a = 1;
        System.out.println(a+1);
        a = 2;
        System.out.println(a+1);

        // 중복의 제거 : 동일한 성격의 것들을 똑같은 변수의 이름으로 지정하여 가독성과 유지 보수의 용이성 좋아짐
        // System.out.println(100+10);으로 하지 않고 100이 중복되므로 int b = 100;으로 변수의 이름을 지정
        int b = 100;
        System.out.println(b+10);
        System.out.println((b+10)/(10));
        System.out.println((b+10)/(10)-10);

    }
}
