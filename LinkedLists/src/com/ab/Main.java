package com.ab;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<>();
		
		placesToVisit.add("Sydney");
		placesToVisit.add(0,"Canberra");
		System.out.println(placesToVisit);
		
		addMoreElements(placesToVisit);
		System.out.println(placesToVisit);
	}
	
	private static void addMoreElements(LinkedList<String> list) {
		list.addFirst("Darwin");
		list.addLast("Hobart");
		
		list.offer("Melbourne");
		list.offerFirst("Brisbane");
		list.offerLast("Toowoomba");
		
		list.push("Alice Springs");
	}
	
	private static void removeElements(LinkedList<String> list) {
		
	}
}
