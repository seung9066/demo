package lec02_s1;
// return은 method를 중단시키는 역할도 한다. return2 로는 도달할 수 없기에 return 1에서 종료된다.
public class _018_methoddemo_outputvalue_1 {

        public static int one() {
            return 1;
            // return 2;
            // return 3;
        }

        public static void main(String[] args) {
            System.out.println(one());
        }
}
