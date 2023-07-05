package com.EduBridge.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EduBridge.PlayerModel;

public interface PlayerDAOInterface extends JpaRepository <PlayerModel,Integer> {

}
