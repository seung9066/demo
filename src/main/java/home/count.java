package home;
// 파란구슬 1, 빨간 구슬 3으로 서로 ㄴ자 모양으로 감싼다. 점차 커지는 두 구슬 총 합의 차이가 28일 때 두 구슬 총합의 수는?
public class count {
    public static void main(String[] args) {
        int sum_b = 1; // 파란 구슬의 총 값
        int sum_r = 3; // 빨간 구슬의 총 값
        int r = 3; // 빨간 구슬 마지막 라인 값
        int b = 1; // 파란 구슬 마지막 라인 값
        int b_f = 1; // if, else 위해 임의로 넣은 수
        while ((sum_r - sum_b) != 28) {
            if (b_f == 1){
                b = b + 4;
                sum_b += b;
                b_f = 0;
            } // end if
            else{
                r = r + 4;
                sum_r += r;
                b_f = 1;
        }  //end else
    }// end while
        System.out.println(r);
        System.out.println(b);
        System.out.println(sum_r + sum_b);
    }
}
