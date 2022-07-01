package lec02_s1;

public class _007_TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        // int는 정수이므로 3에서 끝남
        System.out.println(a/b);
        // float는 실수이므로 3.333333...로 나타남
        System.out.println(c/d);
        // int < float이므로 int 정수값이 float 실수값으로 자동 형 변환
        System.out.println(a/d);
    }
}
