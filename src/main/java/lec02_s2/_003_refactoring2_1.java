package lec02_s2;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        // 함수를 호출한 객체가 가지고 있는 left에 다가 함수의 Argument로 받은 left의 값을 할당한다.
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class _003_refactoring2_1 {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        // new Calculator = 객체 c1 = 변수
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20,40);
        c2.sum();
        c2.avg();
    }

}
