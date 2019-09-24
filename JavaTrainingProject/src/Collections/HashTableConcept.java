package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

//it is simplar to HashMap,but it is synchronised 
// stores the values on the key and value format 
// key----->object ----Hashcode----> value
public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "JAVA");

		// create a clone copy/shallow copy

		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		System.out.println("the value of h1" + h1);
		System.out.println("the value of h2" + h2);
		h1.clear();
		System.out.println("the value of h1" + h1);
		System.out.println("the value of h2" + h2);

		// contains value

		Hashtable st = new Hashtable();
		st.put("A", "ANAND");
		st.put("B", "RAVI");
		st.put("c", "DON");
		if (st.contains("ANAND")) {
			System.out.println("Value is found");

			// print all the vlaues from hashtable by using - Enumeration -element()
			Enumeration e = st.elements();
			System.out.println("Print values from st using Enumeration");
			while (e.hasMoreElements()) {
				System.out.println(e.nextElement());

			}

			// get all the values from hashtable by using entrySet()--- set of hashtable
			// values:
			System.out.println("Print values from st using entrySet()");
			Set s = st.entrySet();
			System.out.println(s);

			Hashtable st1 = new Hashtable();
			st1.put("A", "ANAND");
			st1.put("B", "RAVI"); // st1.put("D",null)// null pointer exeception 
			st1.put("C", "DON"); // st1.put("C", "DON"); it contais only unique values
			
			// check both the hashtable are equal or not :
			if (st.equals(st1)) {
				System.out.println("Both are equal");
			}
			// get the values from a key
			System.out.println(st.get("A"));

			// get the hashcode of shahtable object:
			System.out.println("the hashcode value of the objct st 1 is " + st1.hashCode());

		}

	}

}
