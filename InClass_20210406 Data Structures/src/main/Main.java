package main;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> myData = new HashSet<String>();	// Declare and Instantiate
		
		myData.add("Apple");
		myData.add("Guava");
		myData.add("Pear");
		myData.add("Cookie");
		myData.add("Doughnut");
		// Can I print it?
		System.out.println(myData.toString());
		// Can I iterate over it?
		for (String tmp : myData) {
			System.out.println(tmp);
		}
		// Can I sort it?
		// Sorting HashSet using TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(myData);	// Pass the HashSet to the Constructor!
        System.out.println(treeSet.toString()); // Automagically sorted as the elements are added to the TreeSet
        
        // Can I add duplicates?
        myData.add("Apple");
		System.out.println(myData.toString()); // Does not print out 'Apple' twice. No duplicates
		
		// Can I delete an element
		myData.remove("Apple");
		System.out.println(myData.toString()); 
		
		// What happens if I try to remove an element that's not there?
		myData.remove("Apple");
		System.out.println(myData.toString()); 
		
		// Is it case-sensitive?
		myData.remove("pear");		// Will this delete 'Pear'?
		System.out.println(myData.toString()); 
		
		// How fast is it? Faster than ArrayList... HashTable... array... etc.
		// Is it thread-safe?
		

        
	}

}
