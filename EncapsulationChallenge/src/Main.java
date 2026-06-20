public class Main {
	public static void main(String args[]) {
		Printer noDuplex = new Printer(false);
		
		noDuplex.addToner(200);
		noDuplex.addToner(0);
		
		noDuplex.addToner(23);
		
		noDuplex.getTonerLevel();
		noDuplex.addToner(78);
		
		noDuplex.printPages(3);
		noDuplex.getPagesPrinted();
		
		noDuplex.printPages(2);
		noDuplex.getTonerLevel();
		
		noDuplex.getPagesPrinted();
		
		System.out.println("----------------------------------------------------");
		
		Printer duplex = new Printer(true);
		
		duplex.addToner(200);
		duplex.addToner(0);
		
		duplex.addToner(23);
		
		duplex.getTonerLevel();
		duplex.addToner(78);
		
		duplex.printPages(3);
		duplex.getPagesPrinted();
		
		duplex.printPages(2);
		duplex.getTonerLevel();
		duplex.getPagesPrinted();
	}
}
