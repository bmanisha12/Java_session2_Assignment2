
public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime number from 1 to 100\n" );
		
		int i, j,isPrime; for(i=1; i<=100; i++)  
	    {  
	        isPrime = 1;   
	  
	        for(j=2; j<=i/2; j++)  
	        {  
	            if(i%j==0)  
	            {  
	                isPrime = 0;  
	                break;  
	            }  
	        }  
	  
	        if(isPrime==1)  
	        {  
	            System.out.print(" "+i);
	        }  
	    }  

	}

}
