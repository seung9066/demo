package lec01;

// 외부에 만들어져 있는 Scanner를 가져온다.
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        //입력을 받을 스캐너를 만든다. scan = 내가 마음대로 지정하는 이름 다른것도 가능 new = 새로운, System.in = 시스템 안으로 스캔한다.
        Scanner scan = new Scanner(System.in);

        //String = 문장이라는 뜻
        //str = 입력받은 문장의 이름
        //scanner.nextLine() = 한 줄을 입력받는다.
        String str = scan.nextLine();

        //str을 출력
        System.out.println(str);
    }
    /*
     * scan.nextline()을 하는 순간
     * str이라는 이름표가 붙은 상자가 하나 생긴다.
     * 이 상자에는 '문장'만 들어올 수 있다.
     *
     * System.out.printin(str);을 하게 되면 상자 안에 있는 '문장을 가져와서 출력한다.
     */
}
