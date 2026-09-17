package learning.ab;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String...strings) {
		LinkedList<Place> itinerary = new LinkedList<>();
		
		itinerary.add(new Place("Sydney",0));
		itinerary.add(new Place("Adelaide", 1374));
		itinerary.add(new Place("Alice Springs", 2771));
		itinerary.add(new Place("Brisbane", 917));
		itinerary.add(new Place("Darwin", 3972));
		itinerary.add(new Place("Melbourne", 877));
		itinerary.add(new Place("Perth", 3923));
		
		for(int i = 1; i < itinerary.size(); i++) {
			int previous = itinerary.get(i-1).getDistance();
			int current = itinerary.get(i).getDistance();
			
			if(current < previous) {
				Place previousPlace = itinerary.get(i-1);
				itinerary.set(i-1, itinerary.get(i));
				itinerary.set(i, previousPlace);
				i = 0;
			}	
		}
		
		char command = 'a', lastCommand;
		ListIterator<Place> iterator = itinerary.listIterator();
		
		do {
			System.out.println("Available actions (select word or letter):");
			System.out.println("(F)orward");
			System.out.println("(B)ackward");
			System.out.println("(L)ist Places");
			System.out.println("(M)enu");
			System.out.println("(Q)uit");
			
			lastCommand = command;
			
			command = scanner.nextLine().toLowerCase().charAt(0);
			
			switch(command) {
			case 'f':
				if(lastCommand == 'b')
					iterator.next();
				
				if(iterator.hasNext())
					System.out.println("Moving to " + iterator.next().getName());
				else
					System.out.println("Cannot move further, end of the itinerary");
				
				break;
			case 'b':
				if(lastCommand == 'f')
					iterator.previous();
				
				if(iterator.hasPrevious())
					System.out.println("Moving to " + iterator.previous().getName());
				else
					System.out.println("Cannot move backward, start of the itinerary");
				
				break;
			case 'l':
				System.out.print("Start: ");				
				for(int i = 0; i < itinerary.size() - 1; i++)
					System.out.print(itinerary.get(i).getName() + " --> ");
				System.out.println(itinerary.getLast().getName());
				break;
			case 'm':case 'q':
				break;
				
			default:
				System.out.println("Type in valid command");
			}
			
		}while(command != 'q');
		
	}
}
