package lec02_s1;
// return 여러개 적기
public class _018_methoddemo_outputvalue_2 {

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

       // i==1 이므로 "zero"는 넘어가고 "one" 값을 출력하게 된다.
}
