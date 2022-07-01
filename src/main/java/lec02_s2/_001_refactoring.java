package lec02_s2;

public class _001_refactoring {
    public static void sum(int left, int right) {
        System.out.println(left+right);
    }
    public static void main(String[] args) {
        sum(10, 20);
        sum(20, 30);
        // = System.out.println(10 + 20);, System.out.println(20 + 30); 즉 메소드를 활용하여 중복을 제거해준다.
    }
}
