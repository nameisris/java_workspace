
public class IfTest1 {

	public static void main(String[] args) {
		int i = 55;
		String grade = "";
		
		if (i >= 90) {
			grade = "A";
			if (i >= 97) {
				grade = "A+";
			} else if (i >= 94) {
				grade = "A0";
			} else {
				grade = "A-";
			}
		} else if (i >= 80) {
			grade = "B";
			if (i >= 87) {
				grade += "+";
			} else if (i >= 84) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (i >= 70) {
			grade = "C";
			if (i >= 77) {
				grade += "+";
			} else if (i >= 74) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (i >= 60) {
			grade = "D";
			if (i >= 67) {
				grade += "+";
			} else if (i >= 64) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (i >= 50) {
			grade = "E";
			if (i >= 57) {
				grade += "+";
			} else if (i >= 54) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}

	}

}
