public class Printer {
	private int tonerLevel, pagesPrinted;
	private boolean duplex;
	
	public Printer(boolean duplex) {
		this.duplex = duplex;
		this.pagesPrinted = 0;
		this.tonerLevel = 0;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount <= 0 || (tonerAmount + this.tonerLevel) > 100) {
			System.out.println("Cannot refil this amount of toner");
			return -1;
		}
		
		this.tonerLevel += tonerAmount;
		return this.tonerLevel;
	}
	
	public int printPages(int pages) {
		if(pages*10 > this.tonerLevel) {
			System.out.println("Cannot print that many pages");
			return -1;
		}
		
		this.tonerLevel -= pages*10;
		
		int printed = (int) Math.ceil(pages/(this.duplex ? 2 : 1));
		this.pagesPrinted += printed;
		
		return printed;
	}

	public int getPagesPrinted() {
		System.out.println(this.pagesPrinted + " pages printed");
		return pagesPrinted;
	}

	public int getTonerLevel() {
		System.out.println("Toner level at " + this.tonerLevel + "%");
		return tonerLevel;
	}
	
}
