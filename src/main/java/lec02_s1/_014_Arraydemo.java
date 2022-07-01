package lec02_s1;
// 배열은 연관된 정보를 그룹핑 하는데 사용
public class _014_Arraydemo {
    public static void main(String[] args) {
        String[] classGroup = {"최승현", "김영인", "김엄지"}; // 데이터 형식[] 변수 이름 = {"원소", "원소", "원소"};
        System.out.println(classGroup.length);
        System.out.println(classGroup[0]); // [0] = index (색인)
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        /*
        System.out.println(classGroup[3]);
        오류(예외) 배열은 초기화할 때 그 크기가 정해지고 이 이상의 값을 넣을 수 없다.
         */

        // 배열의 또 다른 방법
        String[] ClGroup = new String[3]; // ClGroup 배열의 원소는 총 3개이다. 이 방식은 먼저 갯수 지정을 필수로 해야함.
        ClGroup[0] = "최승현"; // 0번째 이름은 최승현이다.
        System.out.println(ClGroup.length); // 원소의 이름을 하나만 지정해도 이미 원소의 갯수는 3개이다. 즉 "최승현", "", "" 상태
        System.out.println(ClGroup[1]); // 1번째 원소 이름 지정 x 따라 null("") 로 나타남
        ClGroup[1] = "김영인";
        ClGroup[2] = "김엄지";
        System.out.println(ClGroup.length);
        System.out.println(ClGroup[0]);
        System.out.println(ClGroup[1]);
        System.out.println(ClGroup[2]);
    }
}
