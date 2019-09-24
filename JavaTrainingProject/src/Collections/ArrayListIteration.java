package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//Different ways of iterating an ArrayList || Important Java Interview Question

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of thrones");
		tvSeries.add("Big bang Theory");
		tvSeries.add("Friends");
		tvSeries.add("MOM");
		
	System.out.println("------Print using forEach with lamba in java 8-------");
	
	//1. Using java 8 with for each with lambda expression :
	tvSeries.forEach(shows ->{
		System.out.println(shows);
	});
	System.out.println("------Print using Iterator-------");
	//2. Using Iterator 
	Iterator<String> it =tvSeries.iterator();
	while(it.hasNext()) {
		String show = it.next();
		System.out.println(show);
	}
	System.out.println("------Print using forEachRemaing() method in java 8-------");

	//3. Using  forEachRemaing() method 
	 Iterator it1=tvSeries.iterator();
	 it1.forEachRemaining(show2 -> {
		 System.out.println(show2);
	 });
		System.out.println("------Print using forEach loop in java 8-------");
   //4. Using for each loop
		for(String show : tvSeries) {
			 System.out.println(show);

		}
		System.out.println("------Print using for loop in java 8-------");

	//5. Using for loop with order/index:
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
	//6. Using a listIterator() to traverse in both direction
		System.out.println("------Print using listIterator()-------");
 ListIterator<String> tvSerieslistIterator =tvSeries.listIterator(tvSeries.size());
 while(tvSerieslistIterator.hasPrevious()) {
	String shows= tvSerieslistIterator.previous();
	System.out.println(shows);
 }
		
		
}
}
