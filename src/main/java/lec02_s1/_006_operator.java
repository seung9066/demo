package lec02_s1;

public class _006_operator {
    public static void main(String[] args) {

        // 산술연산자 : +더하기 -빼기 *곱하기 /나누기 %나누기 후 나머지

        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result + 8;
        System.out.println(result);

        result = result % 7;
        System.out.println(result);

        int a = 3;
        // 0 나누기 3은 나눌 수 없기에 0 / 1 나누기 3은 나눌 수 없기에 0 그리고 나머지는 1
        System.out.println(0%a);
        System.out.println(1%a);
        System.out.println(2%a);
        System.out.println(3%a);
        System.out.println(4%a);
        System.out.println(5%a);
        System.out.println(6%a);

        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
}
