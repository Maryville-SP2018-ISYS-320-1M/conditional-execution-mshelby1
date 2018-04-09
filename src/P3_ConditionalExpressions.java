import java.util.Scanner;

/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/8/2018
*/

/*
 Your expected result:
 
 1. True - Correct
 2. False - Correct
 3. False - Correct
 4. True - Correct
 
 5. False - Correct
 6. True - Correct
 7. True - Correct
  
 */
public class P3_ConditionalExpressions {

	public static void main(String[] args) {
		int x = 4;
		int y = -3;
		int z = 4;
		
		// Replace "YOUR EXPRESSION HERE" with the expression you're validating
		System.out.println("Expression evaluates to: " + (x == 4) );
		System.out.println("Expression evaluates to: " + (x != z) );
		System.out.println("Expression evaluates to: " + (z == y) );
		System.out.println("Expression evaluates to: " + (x + y > 0) );
		System.out.println("Expression evaluates to: " + (y * y <= z) );
		System.out.println("Expression evaluates to: " + (y / y == 1) );
		System.out.println("Expression evaluates to: " + (x * (y + 2) > y - (y+ z) * 2) );
	}

}
