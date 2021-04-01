package conditionalStatmenets;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight =300;
		int age = 20;
		boolean smoker  = false;
		
		if(weight > 200)
		{
			if(age > 18)
			{
				
				if(smoker)  // equlient to smoker == true
				{
					System.out.println("you are not eligible to donate blood.  plz do not smoke");
				}
				else {
					System.out.println("you are eligible to donate blood");
				}
			}
			else {
				System.out.println("you are not eligible to donate blood");
			}
		}
		else {
			System.out.println("Your are under weight. You are not eligible to donate blood");
		}
		
		
		
	}
	
}
