public class EnhancedPlayer {
	private String name, weapon;
	private int health;
	
	public EnhancedPlayer(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.health = health > 0 && health <= 100 ? health : (health <= 0 ? 1 : 100);
	}

	public EnhancedPlayer(String name) {
		this(name,"hands",50);
	}
	public void loseHealth(int damage){
		this.health -= damage;
		if(this.health < 0) {
			this.health = 0;
			System.out.println("Player knocked out");
		}
	}
	
	public void restoreHealth(int extraHealth) {
		this.health += extraHealth;
		if(this.health > 100) {
			this.health = 100;
			System.out.println("Player fully restored");
		}
	}
	
	public int healthRemaining() {
		return this.health;
	}
	
}
