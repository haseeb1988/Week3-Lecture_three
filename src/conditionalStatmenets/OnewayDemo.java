package conditionalStatmenets;

import java.util.Scanner;

public class OnewayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		if(age <= 20)
		{
			// body or block for if
			//System.out.println("You are above 20: You are elible to buy this product");
		}
		
		
		
		System.out.println("Please Enter number");
		
		Scanner sc = new Scanner(System.in);
		int number =  sc.nextInt();
		
		
		//int number = 11;
		// check if number is divide by 2 or not
		if(number%2 == 0)
		{
			System.out.println(number + " is Even Number");
		}
		else {
			System.out.println(number + " is Odd Number");
		}
			
		
	}

}
