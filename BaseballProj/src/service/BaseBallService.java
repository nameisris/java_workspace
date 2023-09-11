package service;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import dao.PlayerDAO;
import dao.TeamDAO;
import dto.Player;
import dto.Team;
import exc.BaseBallError;
import exc.BaseBallException;

public class BaseBallService {
	Scanner sc = new Scanner(System.in);
	
//	public TeamDAO teamDAO;
//	public PlayerDAO playerDAO;
//	
//	public BaseBallService() {
//		teamDAO = new TeamDAO();
//		playerDAO = new PlayerDAO();
//	}
	
	// 1. 팀 등록
	public void regTeam() throws BaseBallException {
		Connection conn = TeamDAO.getConnection();
		
		String teamname = "";
		
		while(teamname.isEmpty()) {
			System.out.println("[팀 등록]");
			teamname = selTeamByNum();
		}

		Team team = TeamDAO.selectTeam(conn, teamname);
		
		// 팀이 존재한다면
		if(team != null) {
			
			TeamDAO.close(conn);
			throw new BaseBallException("팀 오류", BaseBallError.TEAMEXISTED);
		}
		
		// 연고지 설정
		String local = "";
		
		switch(teamname) {
		case "SSG 랜더스":
			local = "인천";
			break;
		case "키움 히어로즈":
			local = "서울";
			break;
		case "LG 트윈스":
			local = "수원";
			break;
		case "KT 위즈":
			local = "수원";
			break;
		case "KIA 타이거즈":
			local = "광주";
			break;
		case "NC 다이노스":
			local = "창원";
			break;
		case "삼성 라이온즈":
			local = "대구";
			break;
		case "롯데 자이언츠":
			local = "부산";
			break;
		case "두산 베어스":
			local = "서울";
			break;
		case "한화 이글스":
			local = "대전";
			break;
		}

//		System.out.print("연고지: ");
//		String local = sc.nextLine();
		
		int cnt = TeamDAO.insertTeam(conn, new Team(null, teamname, local));
		
		if(cnt > 0) {
			System.out.println(cnt + "개의 팀 생성");
		}
		
		TeamDAO.close(conn);
	}
	
	// 2. 특정 팀 조회 (팀명)
	public void selTeam() throws BaseBallException {
		Connection conn = TeamDAO.getConnection();
		
		String teamname = "";
		
		while(teamname.isEmpty()) {
			System.out.println("[팀 조회]");
			teamname = selTeamByNum();
		}
		
		Team team = TeamDAO.selectTeam(conn, teamname);
		
		// 팀이 존재하지 않는다면
		if(team == null) {
			TeamDAO.close(conn);
			throw new BaseBallException("팀 오류", BaseBallError.TEAMNOTEXISTED);
		}
		
		System.out.println(team);
		
		TeamDAO.close(conn);
	}
	
	// 3. 팀 목록 조회
	public void selAllTeam() throws BaseBallException {
		Connection conn = TeamDAO.getConnection();
		
		System.out.println("[팀 목록 조회]");
		
		List<Team> teamList = TeamDAO.selectTeamList(conn);
		
		// 팀이 존재하지 않는다면
		if(teamList.isEmpty()) {
			TeamDAO.close(conn);
			throw new BaseBallException("팀 오류", BaseBallError.TEAMNOTEXISTED);
		}
		
		for(Team team : teamList) {
			System.out.println(team);
		}
		
		TeamDAO.close(conn);
	}
	
	// 4. 선수 등록
	public void regPlayer() throws BaseBallException {
		Connection connPlayer = PlayerDAO.getConnection();
		
		System.out.println("[선수 등록]");
		System.out.print("선수명: ");
		String pname = sc.nextLine();
		System.out.print("등번호: ");
		Integer backnum = Integer.parseInt(sc.nextLine());
		
		String teamname = "";
		while(teamname.isEmpty()) {
			teamname = selTeamByNum();
		}
		
		// 팀이 존재하지 않는다면
		Connection connnTeam = TeamDAO.getConnection();
		Team team = TeamDAO.selectTeam(connnTeam, teamname);
		
		if(team == null) {
			TeamDAO.close(connnTeam);
			PlayerDAO.close(connPlayer);
			throw new BaseBallException("팀 오류", BaseBallError.TEAMNOTEXISTED);
		}
		
		int cnt = PlayerDAO.insertPlayer(connPlayer, new Player(null, pname, backnum, null, teamname));
		
		if(cnt > 0) {
			System.out.println(cnt + "개의 선수 등록");
		}
		
		TeamDAO.close(connnTeam);
		PlayerDAO.close(connPlayer);
	}
	// 5. 특정 선수 조회 (이름)
	public void selPlayerByName() throws BaseBallException {
		Connection conn = PlayerDAO.getConnection();
		
		System.out.println("[선수 조회 (이름)]");
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		List<Player> playerList = PlayerDAO.selectPlayerByName(conn, name);
		
		// 선수가 존재하지 않는다면
		if(playerList.isEmpty()) {
			PlayerDAO.close(conn);
			throw new BaseBallException("선수 오류", BaseBallError.PLAYERNOTEXISTED);
		}
		
		for(Player player : playerList) {
			System.out.println(player);
		}	
		
		PlayerDAO.close(conn);
	}
	
	// 6. 특정 선수 조회 (등번호)
	public void selPlayerByBackNum() throws BaseBallException {
		Connection conn = PlayerDAO.getConnection();
		
		System.out.println("[선수 조회 (등번호)]");
		System.out.print("등번호: ");
		Integer backnum = Integer.parseInt(sc.nextLine());
		
		List<Player> playerList = PlayerDAO.selectPlayerByBacknum(conn, backnum);
		
		// 선수가 존재하지 않는다면
		if(playerList.isEmpty()) {
			PlayerDAO.close(conn);
			throw new BaseBallException("선수 오류", BaseBallError.PLAYERNOTEXISTED);
		}
		
		for(Player player : playerList) {
			System.out.println(player);
		}	
		
		PlayerDAO.close(conn);
	}
	
	// 7. 특정 선수 조회 (번호)
	public void selPlayerByNum() throws BaseBallException {
		Connection conn = PlayerDAO.getConnection();
		
		System.out.println("[선수 조회 (번호)]");
		System.out.print("번호: ");
		Integer num = Integer.parseInt(sc.nextLine());
		
		List<Player> playerList = PlayerDAO.selectPlayerByNum(conn, num);
		
		// 선수가 존재하지 않는다면
		if(playerList.isEmpty()) {
			PlayerDAO.close(conn);
			throw new BaseBallException("선수 오류", BaseBallError.PLAYERNOTEXISTED);
		}
		
		for(Player player : playerList) {
			System.out.println(player);
		}	
		
		PlayerDAO.close(conn);
	}
	
	// 8. 특정팀 소속 선수 목록 조회
	public void selPlayerWhatTeam() throws BaseBallException {
		Connection connPlayer = PlayerDAO.getConnection();
		Connection connTeam = TeamDAO.getConnection();
		
		String teamname = "";
		
		while(teamname.isEmpty()) {
			System.out.println("[선수 조회 (팀명)]");
			teamname = selTeamByNum();
		}
		
		Team team = TeamDAO.selectTeam(connTeam, teamname);
		
		// 팀이 존재하지 않는다면
		if(team == null) {
			PlayerDAO.close(connPlayer);
			TeamDAO.close(connTeam);
			throw new BaseBallException("팀 오류", BaseBallError.TEAMNOTEXISTED);
		}
		
		System.out.println(team);
		
		// 만약 선수가 없더라도, 선수 없이 빈 팀 목록 출력
		List<Player> playerList = PlayerDAO.selectPlayerByTeam(connPlayer, teamname);
		
		for(Player player : playerList) {
			System.out.println(player);
		}	
		
		PlayerDAO.close(connPlayer);
		TeamDAO.close(connTeam);
	}
	
	// 메인 메뉴 선택
	public int menu() {
		System.out.println("\n[야구 팀/선수 등록/조회]");
		System.out.println("0. 종료");
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
	
	// 팀 선택 (숫자)
	public String selTeamByNum() {
		String teamname = "";
	
		System.out.println("1: SSG 랜더스");
		System.out.println("2: 키움 히어로즈");
		System.out.println("3: LG 트윈스");
		System.out.println("4: KT 위즈");
		System.out.println("5: KIA 타이거즈");
		System.out.println("6: NC 다이노스");
		System.out.println("7: 삼성 라이온즈");
		System.out.println("8: 롯데 자이언츠");
		System.out.println("9: 두산 베어스");
		System.out.println("10:한화 이글스");
		
		System.out.print("팀 선택>>");
		int teamnum = Integer.parseInt(sc.nextLine());
		
		switch(teamnum) {
		case 1:
			teamname = "SSG 랜더스";
			break;
		case 2:
			teamname = "키움 히어로즈";
			break;
		case 3:
			teamname = "LG 트윈스";
			break;
		case 4:
			teamname = "KT 위즈";
			break;
		case 5:
			teamname = "KIA 타이거즈";
			break;
		case 6:
			teamname = "NC 다이노스";
			break;
		case 7:
			teamname = "삼성 라이온즈";
			break;
		case 8:
			teamname = "롯데 자이언츠";
			break;
		case 9:
			teamname = "두산 베어스";
			break;
		case 10:
			teamname = "한화 이글스";
			break;
		default:
			System.out.println("입력 오류");
			teamname = "";
		}
		
		return teamname;
	}
}
