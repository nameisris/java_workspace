import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
//			fis = new FileInputStream("news.txt");
//			fos = new FileOutputStream("news2.txt");
			
			// 파일 읽기
			fis = new FileInputStream("dog.jpeg");
			// 파일 쓰기
			fos = new FileOutputStream("dog2.jpeg");
			
			// 보조 스트림에 1차 스트림을 끼워즘
			// 보조 스트림으로 다 해결
			// 1차 스트림과 동일하지만, 파일의 크기가 크면 성능 면에서 좋음
			// 대체로 보조 스트림 사용
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(bos);
			
//			int data;
//			// fis의 파일을 data에 읽어오고, fos에서 지정한 경로의 파일로 씀
//			while((data = fis.read()) != -1) {
//				fos.write(data); // data에 넣기
//			}
			
			byte[] buff = new byte[1024];
			
			int len;
			
			while((len = fis.read(buff)) > 0) {
				fos.write(buff, 0, len); // len만큼만 write
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				// 만약 안 닫혀있으면 닫아줌
//				if(fis != null) {
//					fis.close();
//				}
//				
//				if(fos != null) {
//					fos.close();
//				}
				
				// 2차 스트림을 닫아주면 (보조 스트림), 1차 스트림도 닫힘
				if(bis != null) {
					bis.close();
				}
				
				if(bos != null) {
					bos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
