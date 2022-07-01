package home;

public class count2 {
    public static void main(String[] args) {
        int r = 1;
        int b = 3;
        int sum_r = 1;
        int sum_b = 3;
        while(sum_b - sum_r != 28) {
            r = r + 4;
            sum_r += r;
            b = b + 4;
            sum_b += b;
        }
        System.out.println(sum_b + sum_r);
    }
}
