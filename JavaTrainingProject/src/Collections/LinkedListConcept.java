package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("JAVA");

		System.out.println("Linkedlist element are" + ll);

		// addFirst
		ll.addFirst("Test");
		System.out.println("Linkedlist element are" + ll);

		// addLast
		ll.addLast("Anand");
		System.out.println("Linkedlist element are" + ll);

		// Get element
		System.out.println(ll.get(2));

		// set

		ll.set(0, "RPA");
		System.out.println("Linkedlist element are" + ll);
		System.out.println(ll.get(0));
		// removeFirst
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Linkedlist element are" + ll);
		// how to print the values
		// 1. using For loop
		System.out.println("********Using for loop********");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));

		}
		//2.Using Advance forloop
		System.out.println("********Using Advance for loop********");
		for(String str: ll) {
			System.out.println(str);

		}
		//3. Using itreater
		System.out.println("********Using itreater********");

	Iterator<String> it1=ll.iterator();
	while(it1.hasNext()) {
		
	System.out.println(it1.next());

	}
	//Using while loop
	System.out.println("********Using while loop********");

	int num=0;
	while(ll.size()>num) {
		System.out.println(ll.get(num));
		num++;

	}

	}

}
