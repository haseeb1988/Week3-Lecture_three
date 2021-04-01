package LoopExample;

public class forloopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 100; i ++) {
			
			//System.out.println(i + " - Welcome to Java World!");
			//System.out.println(i);
		}
		
		// ------ nested loop -----------------
		
		for(int x = 1; x <= 3 ; x++)
		{
			// Outer loop body
			for(int j = 1; j <= 3; j++)
			{
				System.out.println(x + " " +j);
			} // ENd INNER LOOP HERE
		} // END outerloop here
		
// value x 1 , j = 1   --> 1  1
// value x 1 , j = 2  -->  1  2
// value x 1 , j = 3  -->  1  3
// value x 2 , j = 1   --> 2  1
//		 x 2 , j = 2  -->  2 2	
	 // x 2  , j = 3 -->   2 3
	//   x 3,j = 1   -->   3 ,1
	//   x 3 ,j = 2 -->    3 , 2
	//   x 3,j = 3  -->   3, 3
		
		
	}

}
