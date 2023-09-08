package service;

import java.util.Scanner;

public class BaseBallService {
	public void regTeam() {
		System.out.println("[팀 등록]");
		System.out.print("팀명: ");
		String teanName = sc.nextLine();
		System.out.print("연고지: ");
		String local = sc.nextLine();
	}
	
	// 특정 팀 조회 (팀명)
	// 팀 목록 조회
	
	// 선수 등록
	public void regPlayer() {
		System.out.println("[선수 등록]");
		System.out.print("선수명: ");
		String playername = sc.nextLine();
		System.out.print("등번호: ");
		Integer backNum = Integer.parseInt(sc.nextLine());
		System.out.println("팀 선택>>");
		// 1: SSG 랜더스
		// 2: 키움 히어로즈
		// 3: LG트윈스
		// 4: KT위즈
		System.out.print("선택>>");
		// switch문
		
	}
	// 특정 선수 조회 (이름)
	// 특정 선수 조회 (등번호)
	// 특정 선수 조회 (번호)
	// 특정팀 소속 선수 목록 조회
	
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("[야구 팀/선수 등록/조회]");
		System.out.println("1. 팀 등록");
		System.out.println("2. 특정 팀 조회");
		System.out.println("3. 팀 목록 조회");
		System.out.println("---------");
		System.out.println("4. 선수 등록");
		System.out.println("5. 특정 선수 조회 (이름)");
		System.out.println("6. 특정 선수 조회 (등번호)");
		System.out.println("7. 특정 선수 조회 (번호)");
		System.out.println("8. 특정 팀 선수 목록 조회");
		System.out.print("선택>>");
		
		return Integer.parseInt(sc.nextLine());
	}
}
