import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamTest {
	public static void main(String[] args) {
		// 두 파일을 하나의 파일로
		// 두 개의 inputStream 이용
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		
		SequenceInputStream sis = null;
		FileOutputStream fos = null;
		
		Vector<InputStream> v = new Vector<>();
		
		try {
//			fis1 = new FileInputStream("news.txt");
//			fis2 = new FileInputStream("test.txt");
//			
//			// fis1, fis2를 같이 읽어올 SequenceInputStream
//			// 만일 2개보다 많이 넣고 싶으면, Vector 사용
//			sis = new SequenceInputStream(fis1, fis2);
			
			
			v.add(new FileInputStream("news.txt"));
			v.add(new FileInputStream("test.txt"));
			
			sis = new SequenceInputStream(v.elements());
			
			// 출력 스트림 (total.txt 생성을 위한)
			fos = new FileOutputStream("total.txt");
			
			byte[] buff = new byte[1024];
			int len = 0;
			
			while((len = sis.read(buff)) > 0) {
				fos.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sis != null) {
					sis.close();
				}
				
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
