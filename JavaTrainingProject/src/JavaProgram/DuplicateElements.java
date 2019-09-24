package JavaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	private static Object entrySet;

	public static void main(String[] args) {
		
		String names[]= {"Java","JavaScript","Ruby","Python","Java"};
		//1.Compare each element: 0(nxn)--------- worst solution
		
		for(int i=0;i<names.length;i++) {
			
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is:" + names[i] );
				}
			}
		}
		System.out.println("__________________");
		
		//2.using Hashset:: Java collection : it store unique valuses:0(n)
		
		Set<String> store =new HashSet<String>();
		for(String name : names) {
			if(store.add(name)==false) {
			System.out.println("Duplicate element is :"+ name);
		     }
		
		}
		System.out.println("__________________");
		
		//3.Using Hasmap :0(2n)
		
		Map<String,Integer> storeMap =new HashMap<String,Integer>();
		for (String name : names) {
		Integer count=	storeMap.get(name);
		if (count==null) {
			storeMap.put(name, 1);
			
		}else {
			storeMap.put(name, ++count);
		}
		}
		//get the values from this Hashmap:
		
	Set<Entry<String ,Integer>>	entrySet =storeMap.entrySet();
for(Entry<String ,Integer> entry : entrySet) {
	if(entry.getValue()>1) {
		System.out.println("Duplicate element is :"+ entry.getKey());
	}
}
  }
}
