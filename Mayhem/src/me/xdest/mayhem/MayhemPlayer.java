package me.xdest.mayhem;

import java.util.UUID;

/**
 * This class is used to keep track of all RPG / non vanilla elements of the player.
 * @author xDest
 *
 */
public class MayhemPlayer {

	private final UUID playerUUID;
	
	private int playerXP;
	
	private int strength,agility,vitality,stamina;
	
	
	public MayhemPlayer(UUID playerUUID) {
		this.playerUUID = playerUUID;
	}
	
	public UUID getUUID() {
		return this.playerUUID;
	}
	
}

