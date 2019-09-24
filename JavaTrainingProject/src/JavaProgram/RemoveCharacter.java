package JavaProgram;

public class RemoveCharacter {

	public static void main(String[] args) {
		
		String s ="&^^^ latin string %*^";
		//Regular expression :[^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
