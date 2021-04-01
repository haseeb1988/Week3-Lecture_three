package conditionalStatmenets;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Year");
		Scanner sc = new Scanner(System.in);
		int year =  sc.nextInt();
		
		if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			//System.out.println(year + " is LEAP YEAR");
			System.out.format("%d is LEAP YEAR", year);
		}
		else
		{
			System.out.format("%d is NOT LEAP YEAR", year);
		}
		
	
		}
	}

