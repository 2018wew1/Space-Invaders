public class ShipEntity extends Entity {
	/** The game in which the ship exists */
	private Game game;
	
	/**
	 * Create a new entity to represent the players ship
	 *  
	 * @param game The game in which the ship is being created
	 * @param ref The reference to the sprite to show for the ship
	 * @param x The initial x location of the player's ship
	 * @param y The initial y location of the player's ship
	 */
	public ShipEntity(Game game,String ref,int x,int y) {
		super(ref,x,y);
		
		this.game = game;
	}
	
	/**
	 * Request that the ship move itself based on an elapsed amount of
	 * time
	 * 
	 * @param delta The time that has elapsed since last move (ms)
	 */
	public void move(long delta) {
		// if we're moving left and have reached the left hand side

		// of the screen, don't move

		if ((dx < 0) && (x < 10)) {
			return;
		}
		
		// If we move up and have reached the top side
		
		// of the screen, don't move
		
		if ((dy < 0) && (y < 10)) {
			return;
		}
		
		// If we move down and have reached the bottom
		
		// of the screen, don't move
		
		if ((dy > 0) && (y > 580)) {
			return;
		}
		// if we're moving right and have reached the right hand side

		// of the screen, don't move

		if ((dx > 0) && (x > 780)) {
			return;
		}
		
		super.move(delta);
	}
	
	/**
	 * Notification that the player's ship has collided with something
	 * 
	 * @param other The entity with which the ship has collided
	 */
	public void collidedWith(Entity other) {
		// if its an alien, notify the game that the player

		// is dead

		if (other instanceof AlienEntity) {
			game.notifyDeath();
		}
	}
}