package lec01;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriter {
    public static void main(String[] args) throws IOException { // buffer 사용시 throws IOException 필수
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new OutputStreamWriter(System.out)); // 선언, 임포트 필수
        bw.write("Hello World");
        bw.flush(); // write로 담은 내용 출력 후, 버퍼를 비움.
        bw.close();
    }
}
