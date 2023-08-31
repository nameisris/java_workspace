import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		// 파일 읽기
//		FileInputStream fis = null;
		FileReader fis = null;
		BufferedReader br = null;
		
		// fis에 대한 생성자는 try에서 해줘야 하지만
		// fis는 finally에서 close() 할 것이므로
		// 선언은 밖에서, 생성은 try에서
		try {
			fis = new FileReader("news.txt");
			br = new BufferedReader(fis);
			int data;
			
			while((data = br.read()) != -1) {
				System.out.print((char)data);
				// ASCII 코드 값을 char로 casting
				// FileInputStream을 사용하면 깨진 형태로 출력
				// 스트림은 1바이트 단위이므로 2바이트 단위를 반밖에 못 가져와서 깨지게 됨
				// 따라서, 문자기반 스트림인 FileReader를 사용
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
