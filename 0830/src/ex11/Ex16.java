package ex11;

import java.util.StringTokenizer;

public class Ex16 {

	public static void main(String[] args) {
		String data = "123.456.789.5";
		StringTokenizer st = new StringTokenizer(data, ".");
		
		String tmp = "";
		
		while(st.hasMoreTokens()) {
			tmp += st.nextToken();

			if(st.countTokens() == 1) {
				tmp += "." + st.nextToken();
				break;
			}
		}
		System.out.println(tmp);
		
		Double ban = Double.parseDouble(tmp);
		System.out.println(ban);

	}

}
