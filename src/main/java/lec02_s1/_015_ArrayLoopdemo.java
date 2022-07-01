package lec02_s1;
/*
1. 1반 학생들을 번호순으로 정렬해서 줄을 세운다.
2. 상담받은 학생의 숫자를 기록.
3. 대기중인 학생과 상담
4. 상담 받은 학생의 수를 1 증가
5. 총원보다 상담 받은 학생의 수가 작다면 3번 절차로 돌아간다.
   총원과 상담 받은 학생의 수가 같다면 상담을 종료한다.
 */
public class _015_ArrayLoopdemo {
    public static void main(String[] args) {
        String[] members = {"최승현", "김영인", "김엄지", "춘식이"};

        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + " 이(가) 상담을 받았습니다.");
        }

        System.out.println("단순화");

        // for each 문
        // 데이터 형식(String) 변수(e) : 이름(members)
        for (String e : members) {
            System.out.println(e + " 이(가) 상담을 받았습니다.");
        }
    }
}
