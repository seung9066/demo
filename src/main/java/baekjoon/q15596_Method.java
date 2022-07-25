package baekjoon;

public class q15596_Method {
    long sum (int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }

}
