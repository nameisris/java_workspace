package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Player;

public class PlayerDAO {
	// 선수 삽입
	public int insertPlayer(Player player) {
		int cnt = 0;
		
		return cnt;
	}
	
	// 선수 조회 (이름)
	public List<Player> selectPlayerByName(String name) {
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}
	
	// 선수 조회 (등번호)
	public List<Player> selectPlayerByBacknum(Integer backnum) {
		List<Player> playerList = new ArrayList<>();
			
		return playerList;
	}

	// 선수 조회 (번호)
	public List<Player> selectPlayerByNum(Integer num) {
		List<Player> playerList = new ArrayList<>();
				
		return playerList;
	}
	
	// 선수 조회 (팀)
	public List<Player> selectPlayerByTeam(Integer teamName) {
		List<Player> playerList = new ArrayList<>();
				
		return playerList;
	}
}
