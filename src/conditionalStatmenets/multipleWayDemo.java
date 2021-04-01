package conditionalStatmenets;

public class multipleWayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 90;
		
		if(marks < 50)
		{
			System.out.println("Your are fail");
		}
		else if(marks >= 50 && marks < 60)
		{
			System.out.print("YOu got C grade");
		}
		else if(marks >= 60 && marks < 70)
		{
			System.out.println("Your grade is B");
		}
		
		else if (marks >= 70 && marks < 80 )
		{
			System.out.println("Your grade is A");
		}
		else if(marks >= 80 && marks < 90)
		{
			System.out.println("Your grade is A+");
		}
		
		else if(marks >= 90 && marks <= 100)
		{
			System.out.println("Your grade is A++");
		}
		else { System.out.println( "your grades are in pending");}
	}

}
