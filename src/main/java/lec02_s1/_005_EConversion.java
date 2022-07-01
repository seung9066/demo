package lec02_s1;

public class _005_EConversion {
    public static void main(String[] args) {

        // <자동 형 변환>
        // 3.0F가 자동으로 double 타입으로 형 변환. double > float. 타입을 변경해도 정보의 손실 x 일 경우 자동 형 변환이 일어난다.
        double a = 3.0F;

        // 3.0은 double 형인데 이를 b라는 float 변수에 담으려 하기에 오류가 난다. double > float.
        //float b = 3.0;

        // byte < short / char(문자) < int < long < float < double

        int c = 3;
        float d = 1.0F;
        // c가 3.0F로 변환. 3.0F + 1.0F = 4.0F / int + folat가 float + float로 변환 그리고 그 결과값은 double로 변환
        double e = c + d;

        // <명시적 형 변환> Explict Conversion
        // 아래의 예제는 오류가 일어남
        //float f = 100.0;
        // (float)를 앞에 붙여주면 오류가 일어나지 않음.
        float f = (float)100.0;

    }
}
