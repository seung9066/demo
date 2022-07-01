package lec02_s1;
// 하나의 return에서 배열을 통해 여러개의 데이터 출력 가능
public class _018_methoddemo_outputvalue_3 {
    public static String[] getMembers() {
        String[] members = {"최승현", "김영인", "김엄지"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
    }
}
