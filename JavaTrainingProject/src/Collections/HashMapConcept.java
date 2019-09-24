package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	// Hashmap is a class implements map interface 
	//extends AbstractMap
	//it contains only unique element
	// store the values in <key , value> pair 
	// it may have one null key and multiple null values
	//it maintains no order 
	//Hashmap is non-synchronised - it is thread safe 
	// concurent modification exception -- Fail- Fast condition 
	// we use Hashmap in case of multitherading 
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "RPA");
		hm.put(4, "TestComplete");
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));// it will give null 
		// print the object
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());

		}
		System.out.println("Before remove ");
		System.out.println(hm);
		hm.remove(3);
		System.out.println("After remove ");

		System.out.println(hm);
		
		//How to create a hashmap object
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		Employee e1 = new Employee("Tom",25,"QA");
		Employee e2 = new Employee("Peter",35,"DEV");
		Employee e3 = new Employee("Steve",45,"Admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		//Traverse the hashmap
		for (Entry <Integer,Employee> m : emp.entrySet()){
			
			int key = m.getKey();
			Employee e =m.getValue();
			System.out.println("Employee "+key+ " info" );
			System.out.println(e.name +e.age+ " "+e.dept );
			
		}
				

	}

}
