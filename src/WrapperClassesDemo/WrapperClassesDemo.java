package WrapperClassesDemo;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 111;  
		Byte bb = 10;
		
		short s = 50;
		Short ss = 50;
		
		int i = 5455;
		Integer ii = 2;
		
		long l = 47856;
		Long lg = 44548l;
		
		float f = 256.25545f;
		Float fl = 48555.8554f;
		
		double d = 484555.574;
		Double dd = 478569.2365;
		
		char c = 'A';
		Character cc = 'A';
		System.out.println(cc.isLetter('B'));

		              
		String st = "hello";
		
	  //System.out.print(ii.compareTo(542154));

	 // System.out.println(ii.doubleValue());
		
	   String new_st = ii.toString(); // This return a String object respresenting the value of this integer
	   System.out.println(ii);
	   
	   String amount = "00000100";
	   
	   Integer amountInInt =  Integer.parseInt(amount);
	   System.out.println(amountInInt);
	   
	    Integer aa =  Integer.valueOf(amount);
	    System.out.println(aa);
	    
	   System.out.println(amount.concat(st));
	   
// ---------- Auto boxing-------------------
/*Auto boxing conversion of primitive types to the object of their corresponding wrapper classes
is known as AutoBoxing for e.g conversion of int into Integer
Primitive values is automatically convert to its matching wrapper class object
 */
	  // Integer nn = i;        
	   Integer nn = Integer.valueOf(i); // conversion of int into Integer
	    			
	   System.out.println(nn + i);
	  
	  // compiler will write integer.valueof(int) internally;
	  //Integer nn = i; 
	 
	  
	   
	   double de = 25.5;
 // Double da =  Double.valueOf(de); // autoboxing
	   Double da = de; // autoboxing
	     
	     Character ca = 'a';
		 char caa = ca; // unboxing 
	     
	   
	}

}
