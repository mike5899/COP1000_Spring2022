
public class Welcome 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Display message Welcome to Java! on the console
		System.out.println("Welcome to Java!");
		/*
		 * 
		 * 
		 * Hello
		 * World*/
		
		//divide by zero
//		System.out.println(5/0);
		
		//multiply 
		System.out.println("3.5 * 4 / 2 - 2.5 is");
		System.out.println(
				multiply(3.5, 4) / 2 - 2.5);
		
		
		

	}

	public static double multiply(double num1, double num2) {
		if(num1 == 0
			&&
			num2 == 0)
		{
			
			return 0;
		}
		
		return num1 * num2;
	}
}

