public class PowerUpEntity extends Entity {
	
	private Game game;
	
	private boolean used = false;
	
	public PowerUpEntity(Game game, String sprite, int x, int y) {
		super(sprite, x, y);
		
		this.game = game;
	}
	public void collidedWith(Entity other) {
		
		if (used) {
			return;
		}
		
		if (other instanceof ShipEntity) {
			// remove the affected entities

			game.removeEntity(this);
			game.removeEntity(other);

			used = true;
		}
	}
}
