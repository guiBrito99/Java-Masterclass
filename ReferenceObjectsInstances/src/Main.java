
public class Main {

	public static void main(String[] args) {
		House h1 = new House("blue");
		House h2 = h1;
		
		System.out.println(h1.getColor());
		System.out.println(h2.getColor());
		
		h2.setColor("yellow");
		
		System.out.println(h1.getColor());
		System.out.println(h2.getColor());
		
		House h3 = new House("green");
		
		h2 = h3;
		
		System.out.println(h1.getColor());
		System.out.println(h2.getColor());
		System.out.println(h3.getColor());

	}

}
