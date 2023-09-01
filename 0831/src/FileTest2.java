import java.io.File;

public class FileTest2 {
	
	public static void main(String[] args) {
		File f = new File("c:\\ris\\java_workspace");
		
		if(!f.exists() || !f.isDirectory()) { // f가 존재하지 않거나, 디렉토리가 아니라면
			return;
		}
		
//		String[] files = f.list();
//		
//		for(String file : files) {
//			System.out.println(file);
//		}
		
		File[] files = f.listFiles();
		
		int totLength = 0;
		
		for(File file : files) {
			totLength += file.length();
			System.out.println(file.isDirectory()? "[" + file.getName() + "]" : file.getName());
//			if(file.isDirectory()) { // 디렉토리일 경우
//				System.out.println("[" + file.getName() + "]");
//			} else { // 파일일 경우
//				System.out.println(file.getName());
//			}
		}
		
		System.out.println(totLength);
	}
}
