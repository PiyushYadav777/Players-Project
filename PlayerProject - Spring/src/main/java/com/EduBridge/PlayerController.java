package com.EduBridge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin (origins="http://localhost:4200")
@RestController
public class PlayerController {
@Autowired
PlayerService ps;

@GetMapping("players")
/* @RequestMapping(value="/players", method=RequestMethod.GET) */
public List<PlayerModel> getPlayers(){
	return this.ps.getAllPlayers();
}
/*
 * @RequestMapping(value="/player/{id}", method=RequestMethod.GET) public
 * PlayerModel getPlayerById(@PathVariable int id) { return
 * this.ps.getByIdp(id); }
 * 
 * @RequestMapping(value="/updateplayer/{id}/{newid}/{newname}",method =
 * RequestMethod.GET) public String updatePlayer(@PathVariable("id") Integer
 * id, @PathVariable("newid") Integer nid, @PathVariable("newname") String name
 * ) {
 * 
 * return this.ps.updatePlayer(id, nid,name);
 * 
 * 
 * }
 * 
 * @RequestMapping(value="/insertplayer/{id}/{name}", method =
 * RequestMethod.GET) public String insertPlayer(@PathVariable("id") Integer
 * id, @PathVariable("name") String name) { return this.ps.insertPlayer(id,
 * name); }
 */
@PostMapping("saveplayer")
/* @RequestMapping(value="/player/save", method = RequestMethod.POST) */
public void savePlayer(@RequestBody PlayerModel p) {
	this.ps.addNewPlayer(p);
	
}
@RequestMapping(value="/player/update", method = RequestMethod.PUT)
public void updatePlayer(@RequestBody PlayerModel p) {
	this.ps.updatePlayersName(p);
}
@RequestMapping(value="/player/delete/{id}", method = RequestMethod.DELETE)
public void deletePlayer(@PathVariable int id) {
	this .ps.deletePlayersRecord(id);
}

}
