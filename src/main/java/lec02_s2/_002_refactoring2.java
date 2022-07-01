package lec02_s2;

public class _002_refactoring2 {

    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void main(String[] args) {
        int left, right;

        // 반복
        // 연관
        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);

        // 연관
        left = 20;
        right = 30;

        sum(left, right);
        avg(left, right);
        // 반복
    }
}
