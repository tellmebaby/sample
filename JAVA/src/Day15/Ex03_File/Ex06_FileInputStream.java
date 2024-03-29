package Day15.Ex03_File;

import java.io.FileInputStream;

public class Ex06_FileInputStream {

	public static void main(String[] args) {
		// 바이트 스트림 클래스
		// FileInputStream 객체로 바이트 코드
		// * 문자 스트림 클래스와 다르게 문자로 변환하는 작업
		byte[] data = new byte[100];

		try {
			FileInputStream fis = new FileInputStream("./src/Day15/Test.out");

			int i = 0, b;
			while ((b = fis.read()) != -1) {
				// 읽어온 바이트 b 를 바이트 배열에 형변환하여 대입
				data[i] = (byte) b;
				i++;
			}

			for (byte a : data) {
				System.out.print((char) a);
			}
			fis.close();
		} catch (Exception e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}

	}
}
