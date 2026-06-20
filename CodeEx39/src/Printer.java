public class Printer {
	private int tonerLevel, pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ?  tonerLevel : -1;
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount <= 0 || ((this.tonerLevel + tonerAmount) <= 0) || ((this.tonerLevel + tonerAmount) > 100))
			return -1;
		
		this.tonerLevel += tonerAmount;
		
		return this.tonerLevel;
	}
	
	public int printPages(int pages) {
		int pagesToPrint = this.duplex ? (int) Math.ceil((double) pages/2) : pages;
		
		System.out.print(this.duplex ? "Printing in duplex mode\n":"");
		this.pagesPrinted += pagesToPrint;
		
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return this.pagesPrinted;
	}
}
