package lec01;

public class sentence {

    public static void main(String[] args) {
        // 컴퓨터는 바보라서 큰 따옴표가 있으면 문장(string)으로 생각한다.
        System.out.println("3"+"3");

        // 큰 따옴표가 없으면 숫자라고 생각한다.
        System.out.println(3+3);

        // 숫자에도 종류가 있다. 정수, 실수, 음수
        System.out.println(-100);

        // 문장(String)은 "" 문자(Character)는 '' 사용
        System.out.println('C');

        // 특수 문자 표기시 역슬래시(\) 사용
        System.out.println("\"Hello world\"");

        // \n 사용시 엔터를 칠 수 있다. \t : 탭 \b : 백스페이스
        System.out.println("Hello\nWorld");

    }

}
