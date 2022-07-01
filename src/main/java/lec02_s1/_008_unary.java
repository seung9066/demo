package lec02_s1;

public class _008_unary {
    public static void main(String[] args) {
        // + 양수, 실제로 사용할 필요 x
        // - 음수
        // ++ 증가 연산자로 항의 값을 1씩 증가 3++ = 3+1
        // -- 감소
        int i = 3;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        // 아래 문장에서는 값은 적용되지만 나타나지는 않는다. 그래서 그 아래 문장을 통해서 출력
        System.out.println(i++);
        System.out.println(i);
    }
}
