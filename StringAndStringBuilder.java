package week4;

public class StringAndStringBuilder {
	
	public static void main(String[] args) {
		
		String firstName = "Elijah";
		String lastName = "Gamalong";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = muliplyString("Hi", 3);
		System.out.println(tripleHi);
		
	    firstName = firstName.concat(lastName); 
	    System.out.println(firstName);
	    
	    StringBuilder fullName = new StringBuilder("Jordan");
	    fullName.append( "Gamalong");
	    System.out.println(fullName.toString());
	    
	    System.out.println(fullName.charAt(5));
//	    System.out.println(fullName.deleteCharAt(5));
//	    System.out.println(fullName.delete(1, 3));
	    System.out.println(fullName.indexOf("am"));
	    System.out.println(fullName.replace(4, 9, "Lopez"));
	    System.out.println(fullName.reverse());
		
	}

	public static String muliplyString(String str, int num) {
		StringBuilder results = new StringBuilder();
	
		for (int i = 0; i < num; i++) {
			results.append(str);
		}
		return results.toString();
			
	

	
		

	
	

	
			
		
		
	}
}
