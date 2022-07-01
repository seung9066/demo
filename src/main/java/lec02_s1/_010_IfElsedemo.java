package lec02_s1;

public class _010_IfElsedemo {
    public static void main(String[] args) {

        // if 절 if(true/false){ }
        if (true) {
            System.out.println("result : true");
        }

        if (true) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);

        // 5만 출력된다
        if (false) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);

        // if 뒤가 true면 if 뒤에 따라오는 것을 실행. false면 else 뒤 실행. else if 뒤도 마찬가지.
        if (false) {
            System.out.println(1);
        } else if (false) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } // 앞의 if true 이므로 밑의 else 실행 x
        else {
            System.out.println(4);
        }
    }

        // args[0]; : 입력값
        /*
         * String id = args[0];
         * String password = args[1];
         *   if (id.equals("egoing")) {
         *   if (password.equals("111111")) {
         *     System.out.println("right");
         *   } else {
         *     System.out.println("wrong");
         *   }
         *   } else {
         *     System.out.println("wrong");
         *   }
          */

    /*
     * String id = args[0];
     * // egoing or k8805 and 111111
     *  if (id.equals("egoing") || id.equals("k8805") && password.equals("111111")){
     *      System.out.println("right");
     *      }{ else {
     *          System.out.println("wrong")
     *      }
     *  }
     */

}
