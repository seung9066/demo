package lec02_s2;

class Calculator2 {
    static double PI = 3.14;
    static int base = 0;
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right + base)/2);
    }
}

public class _004_instance {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        System.out.println(c1.PI);

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20,40);
        c2.sum();
        c2.avg();
        System.out.println(c2.PI);

        Calculator2.base = 10;
        c1.sum();
        c1.avg();
        c2.sum();
        c2.avg();

        System.out.println(Calculator2.PI);
    }
}
