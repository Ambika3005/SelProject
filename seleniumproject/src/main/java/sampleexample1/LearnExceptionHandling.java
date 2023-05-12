package sampleexample1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
		      //code that may raise exception  
		      int data=100/10; 
		      System.out.println("The quotient is:" +data);
		   }catch(ArithmeticException e){
			   System.out.println(e); 
          } 
		  
     finally{
			  System.out.println("Exception has been handled successfully");
		  }
	}

}
