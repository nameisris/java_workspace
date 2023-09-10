package main;

import exc.BaseBallException;
import service.BaseBallService;

public class BaseBallMain {
	
	public static void main(String[] args) {
		BaseBallService bbs = new BaseBallService();
		int sel = 0;
		System.out.println("[BaseBall Project]");
		
		while(true) {
			try {
				sel = bbs.menu();
				
				if(sel == 0) {
					System.out.println("종료");
					break;
				}
				
				switch(sel) {
				case 1:
					bbs.regTeam();
					break;
				case 2:
					bbs.selTeam();
					break;
				case 3:
					bbs.selAllTeam();
					break;
				case 4:
					bbs.regPlayer();
					break;
				case 5:
					bbs.selPlayerByName();
					break;
				case 6:
					bbs.selPlayerByBackNum();
					break;
				case 7:
					bbs.selPlayerByNum();
					break;
				case 8:
					bbs.selPlayerWhatTeam();
					break;
				default:
					System.out.println("입력 오류");
					continue;
				}
			} catch(NumberFormatException e) {
				System.out.println("입력 형식이 맞지 않습니다. 다시 선택하세요.");
			} catch(BaseBallException e) {
				System.out.println(e);
			}
			
		}
	}

}
