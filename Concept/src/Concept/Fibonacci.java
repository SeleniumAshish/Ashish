package Concept;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//O/p: 1 1 2 3 5 8 13 21 34
		
		
		
		int t1=1;
		int t2=0;
		int n=9;
		int sum=0;
		
		
		
		for(int i=0;i<=n;i++){
			
			
			
			 sum =t1+t2;
			 
			 t1=t2;
			 t2=sum;
			 System.out.print(t1);
			 
			 
		
			 
		}
		
		
		
		
		

	}

}
