package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConversionArrayToArrayList {

	public static void main(String[] args) {

		String arr[] = { "Selenium", "QTP", "JAVA" };

		// 1. Using asList() method
		System.out.println("*****************Using asList() method********");

		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
		arrList.add("Test complete");
		arrList.add("QTP");
		arrList.add("JAVA");// It allow duplicate values

		System.out.println(arrList);
		// 2.Using Collection.addAll() method
		System.out.println("*****************Using Collection.addAll() method********");

		String Testing[] = { "Selenium", "QTP", "JAVA" };
		ArrayList<String> arrList2 = new ArrayList<String>();

		Collections.addAll(arrList2, Testing);
		arrList2.add("Jenkins");
		arrList2.add("Cucumber");
		System.out.println(arrList2);

		// 3.Adding each Array element into Arraylist
		System.out.println("*****************Adding each Array element into Arraylist********");
		String Testing2[] = { "Selenium", "QTP", "JAVA" };
		ArrayList<String> arrList3 = new ArrayList<String>();
		arrList3.add("ANT");
		arrList3.add("Maven");

		for (int i = 0; i < Testing.length; i++) {
			arrList3.add(Testing2[i]);
		}
		System.out.println(arrList3);

	}

}
