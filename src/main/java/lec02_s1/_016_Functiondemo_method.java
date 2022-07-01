package lec02_s1;

public class _016_Functiondemo_method {
    // 메소드 정의 (main 없으면 출력 안됨)
    public static void numbering () /* numbering = method */{
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    // 메소드 호출
    // main = 약속, 개발자는 main 메소드를 작성하고 java 는 main 메소드를 실행
    // 메소드가 없다면 numbering 메소드를 main 메소드 안에 여러번 적어야 해서 코드의 양이 많아짐. 즉 유지보수가 어려워진다.
    public static void main(String[] args) /* main = method */{
        numbering(); // numbering 메소드가 호출(실행)됨
    }
}
