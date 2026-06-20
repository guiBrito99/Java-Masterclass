public class Main {
	public static void main(String args[]) {
		Player p1 = new Player();
		
		p1.name = "Gui";
		p1.weapon = "Axe";
		p1.health = 20;
		
		p1.loseHealth(10);
		System.out.println("Remaining health: " + p1.healthRemaining());
		
		p1.loseHealth(11);
		System.out.println("Remaining health: " + p1.healthRemaining());
		
		EnhancedPlayer p2 = new EnhancedPlayer("Brito", "Axe", 200);
		System.out.println("Initial health is " + p2.healthRemaining());
	}
}
