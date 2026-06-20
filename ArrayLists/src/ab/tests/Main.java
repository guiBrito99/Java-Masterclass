package ab.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count) {
	public GroceryItem(String name) {
		this(name, "DAIRY", 1);
	}
	
	public String toString() {
		return String.format("%d %s in %s", this.count, this.name.toUpperCase(), this.type);
	}
}

public class Main {
	public static void main(String... strings) {
		Object[] groceryArray = new Object[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("apples", "fruit", 6);
		groceryArray[2] = new GroceryItem("letuce", "vegetable", 3);
		
		System.out.println(Arrays.deepToString(groceryArray));
		
		ArrayList<Object> objectList = new ArrayList<>();
		
		objectList.add(new GroceryItem("butter"));
		objectList.add("Yogurt");
		System.out.println(objectList.toString());
		
		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("Cream Cheese"));
		groceryList.add(new GroceryItem("Chocolate milk"));
		groceryList.add(0, new GroceryItem("Mayo", "Condiments", 1));
		
		System.out.println(groceryList.toString());
		
		String[] items = {"apples", "bananas", "milk", "eggs"};
		
		List<String> list = List.of(items);
		
		System.out.println(list);
		
		ArrayList<String> groceries = new ArrayList<>(list);
		groceries.add("cheese loaf");
		
		ArrayList<String> extraList = new ArrayList<>(List.of("milk caramel", "flavoured cheese"));
		
		groceries.addAll(extraList);
		
		System.out.println(groceries.toString());
		
		System.out.println("Third item = " + groceries.get(2));
		
		if(groceries.contains("milk"))
			System.out.println("Found milk");
		
		groceries.add("milk");
		
		System.out.println(groceries.toString());
		
		groceries.remove("milk");
		
		System.out.println(groceries.toString());
		
		groceries.retainAll(List.of("apple", "orange", "milk"));
		
		System.out.println(groceries.toString());
		
		groceries.addAll(List.of("milk caramel", "flavoured cheese"));
		
		groceries.sort(Comparator.naturalOrder());
		
		System.out.println(groceries.toString());
		
		
	}
}
