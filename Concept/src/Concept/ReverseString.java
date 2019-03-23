package Concept;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Ashish";
		
		String rev="";
		
		int length= name.length();
		System.out.print(length);
		
		
		for(int i=length-1;i>=0;i--){
			
			
			rev=rev+name.charAt(i);
			
			
			
		}
		
		System.out.print(rev);
		

	}

}
