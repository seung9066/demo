package lec02_s1;

public class _004_IntDatatypeDemo {
    public static void main(String[] args) {
        byte a;
        a = 127;
        System.out.println(a);

        short b;
        b = 32767;
        System.out.println(b);

        int c;
        c = 2147483647;
        System.out.println(c);

        // d값은 int 형으로 취급되어 있으므로 뒤에 L을 붙여 long 형으로 변형 : 자동 형 변환 (int 이하의 상수는 기본형으로 인정되어 그냥 사용 가능)
        long d;
        d = 2147483648L;
        System.out.println(d);

        // double 형 실수를 float 형으로 표시하기 위해서는 뒤에 F를 붙여준다.
        float e = 2.2F;
        System.out.println(e);

        double f = 2.2;
        System.out.println(f);
    }
}
