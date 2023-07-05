package com.EduBridge;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EduBridge.DAO.PlayerDAOInterface;

@Service
public class PlayerService {
List<PlayerModel> list=new ArrayList <PlayerModel>();

/*
 * public PlayerService() { list.add(new PlayerModel (101, "MSD")); list.add(new
 * PlayerModel (102, "Shubhman Gill")); list.add(new PlayerModel (103,
 * "Virat Kohli")); list.add(new PlayerModel (104, "Yuvi")); list.add(new
 * PlayerModel (105, "SuryaKumar Yadav")); }
 */
@Autowired
PlayerDAOInterface pdi;
public List getAllPlayers() {
	return pdi.findAll();
}
public PlayerModel getByIdp(int id) {
	/*
	 * for(PlayerModel p:list) { if(p.getId()==id) { return p; } } return null;
	 */
	Optional<PlayerModel> pm=pdi.findById(id);
	if(pm.isPresent()) {
		return pm.get();
	}
	else {
		return null;
	}
}
public void addNewPlayer(PlayerModel p) {
	pdi.save(p);
}
public void updatePlayersName(PlayerModel p) {
	pdi.save(p);
}
public void deletePlayersRecord(int id) {
	PlayerModel p=pdi.getOne(id);
	pdi.delete(p);
	}
/*
 * public String updatePlayer(int id, int newid, String name) { int flag = 0;
 * for (PlayerModel p : list) { if (p.getId() == id) { p.setId(newid);
 * p.setName(name); flag=1; }
 * 
 * } if (flag == 0) { return "Player not updated";
 * 
 * } return "Player updated"; } public String insertPlayer(int id, String name)
 * { PlayerModel newPlayer = new PlayerModel(id, name); list.add(newPlayer);
 * return "Player inserted"; } public String addNewPlayer(PlayerModel p) {
 * this.list.add(p); return "New Player added in tthe list"; } public void
 * updatePlayer(PlayerModel p) { for (PlayerModel p1:list) {
 * if(p1.getId()==p.getId()) { p1.setName(p.getName()); } } } public void
 * deletePlayersRecord(int id) { // TODO Auto-generated method stub
 * this.list.remove(id); } 
 */
}