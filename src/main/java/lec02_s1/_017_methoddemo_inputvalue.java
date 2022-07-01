package lec02_s1;

public class _017_methoddemo_inputvalue {
    public static void numbering(int limit) /* (int limit) = 매개변수(parameter) */ {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void numbers(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(5);// (5) = 인자(argument), 5를 limit 에 넣는다. 즉 numbering 메소드에 int limit = 5; 를 넣은 것과 같다.
        numbers(1, 5); // init = 1, limit = 5 따라서 1~4까지 나타냄
    }
}
