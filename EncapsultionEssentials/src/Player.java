public class Player {
	public String name, weapon;
	public int health;
	
	public Player() {
		
	}
	
	public Player(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.health = health;
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
