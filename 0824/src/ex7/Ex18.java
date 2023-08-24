package ex7;

public class Ex18 {
	
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
//			DanceRobot danceRobot = (DanceRobot) r;
//			danceRobot.dance();
			
			((DanceRobot) r).dance();
		} else if (r instanceof SingRobot) {
//			SingRobot singRobot = (SingRobot) r;
//			singRobot.sing();
			
			((SingRobot) r).sing();
		} else if (r instanceof DrawRobot) {
//			DrawRobot drawRobot = (DanceRobot) r;
//			drawRobot.draw();
			
			((DrawRobot) r).draw();
		} else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		Robot[] arr = {
				new DanceRobot(), new SingRobot(), new DrawRobot()
		};
		
		for(int i = 0;i < arr.length;i++) {
			action(arr[i]);
		}

	}

}

class Robot {
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}