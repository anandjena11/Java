package Collections;

import java.util.ArrayList;
import java.util.Iterator;

//In arraylist we can add duplicate values
// it maintains insertion order
// Syncronised
//allows random acess to fetch the element ,it store it stores the values on the basis of indexs
public class ArrayListconcept {

	public static <E> void main(String[] args) {
		// int a[] =new int [3] ; // This static array
		ArrayList arrList = new ArrayList(); // it is a diynamic array
		arrList.add(456);
		arrList.add("TOM");
		arrList.add(88.99);
		arrList.add("TOM");

		System.out.println(arrList.size());
		System.out.println(arrList.get(2));
		System.out.println(arrList);
		// to print all the values from arraylist by using
		// 1. for loop
		// 2. Itreator
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
	

		}
		System.out.println("***************");
		// non Generics vs generics 
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		//ar.add(12.22); this is not allow as we metion integer so it is call generics concept of Java

		ArrayList<E> ar2 = new ArrayList<E>();//we use E when we don't know which kind of data type we want to add

		//Here we are converting one class variabe in to  a arrayList
		Employee e1= new Employee("Anand", 22, "QA");
		Employee e2= new Employee("TOM", 27, "DEV");
		Employee e3= new Employee("Peter", 29, "Admin");
		
// create a arraylist 
		ArrayList<Employee> ar4 =new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// Itreator to traverse the values 
		Iterator<Employee> it =ar4.iterator();
		while(it.hasNext()){
		Employee emp =it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
        System.out.println(emp.dept);

		
		}
		System.out.println("******addAll*********");
		//addAll
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("test");
		ar3.add("selenium");
		ar3.add("QTP");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("DEV");
		ar5.add("Java");
		ar5.add("JavaScript");
		ar3.addAll(ar5);
		for(int i=0;i<ar3.size();i++) {
			System.out.println(ar3.get(i));

			}
		
		System.out.println("*******removeAll********");
		
		//removeAll
		ar3.removeAll(ar5);
		for(int i=0;i<ar3.size();i++) {
			System.out.println(ar3.get(i));

			}
		System.out.println("*******retainAll********");
		//retainAll -it show the common element
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("test");
		ar6.add("selenium");
		ar6.add("DEV");
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("DEV");
		ar7.add("Java");
		ar7.add("JavaScript");
		
		ar6.retainAll(ar7);
		for(int i=0;i<ar6.size();i++) {
			System.out.println(ar6.get(i));

			}

	}
	
}

