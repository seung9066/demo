package lec02_s1;

public class _018_methoddemo_outputvalue {
    // String = numbering method의 return 값이 문자열이다.
    public static String numbering(int init, int limit){
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i<limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            // main method로 인해 i는 1부터 시작해서 5미만으로 끝난다.
            output += i;
            i++;
        }
        // 중요! output에 담겨 있는 문자열을 메소드 외부로 변환하려면 아래와 같이 return을 배치하면 된다.
        return output;

        /* return은 method를 중단시키는 역할도 한다.

        ex) return 1; return 2; return3; 이렇게 3개를 적어도 main에서 sout하면 1만 나오며 return2, 3은 실행되지 않는다.
        public static int one() {
            return 1;
            return 2;
            return 3;
        }
        public static void main(String[] args){
            System.out.println(one());

         */

        /* 그렇다고 꼭 return을 하나만 적어야 하는 것은 아니다.

        public class ReturnDemo{
            public static String num(int i){
                if(i==0){
                    return "zero";
                    } else if(i==1) {
                    return "one";
                    } else if(i==2) {
                    return "two";
                    }
                    return "none";
            }
        public static void main(String[] args) {
            System.out.println(num(1));
        }

        i==1 이므로 "zero"는 넘어가고 "one" 값을 출력하게 된다. */
    }

    // void = 빈 공간 main method의 return 값은 존재하지 않는다.
    public static void main(String[] args) {
        // 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(1, 5);
        // 변수 return의 값을 화면에 출력
        System.out.println(result);
    }
}
