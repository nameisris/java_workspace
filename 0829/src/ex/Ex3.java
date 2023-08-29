package ex;

import java.util.StringTokenizer;

public class Ex3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparatetest.java";
		String path = "";
		String fileName = "";
		
		int i = fullPath.lastIndexOf('\\');
		
		path = fullPath.substring(0, i);
 

		System.out.println("fullPath: " + fileName);
		System.out.println("path: " + fullPath.substring(0, i));
		System.out.println("fileName: " + fullPath.substring(i + 1));
	}

}
