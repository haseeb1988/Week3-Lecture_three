package formetterdemo;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1024;
		byte b = 127;
		double d = 1.232, tiny = d / 1000000.0;
		boolean bool = true;
		String st = "Good morning";

		//System.out.println("This is an integer " + i + " and this is a byte " + b + "this is String: " + st);
		
		
		System.out.format("This is an integer %d  and this is a byte %d this is String %s" ,i, b,  st);
		
		int orderprice = 600;
		float tax = 2.5f;
		String name = "Haseeb";
		
System.out.printf("Hello %s: Your order is placed sucessfully. Total cast is %d and tax is %f",name, orderprice,tax );	

DecimalFormat df = new DecimalFormat("0.000"); 
double input = 1205.6358;

System.out.println("salary : " + input);

// DecimalFormat, default is RoundingMode.HALF_EVEN
System.out.println("salary : " + df.format(input));      //1205.64

df.setRoundingMode(RoundingMode.DOWN);
System.out.println("salary : " + df.format(input));      //1205.63

df.setRoundingMode(RoundingMode.UP);
System.out.println("salary : " + df.format(input));      //1205.64




	}

}
