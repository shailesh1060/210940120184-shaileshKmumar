/* Create java application for the following Accept 2 numbers from user & operation to perform 1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit. Display the result of the operation. Java app must continue to run till user chooses exit option. */

import java.util.Scanner;
class A4_1b{
		public static void main(String args[])
		{
			int num1,num2,choice=0;
			boolean shouldContinue=true;
			Scanner sc=new Scanner();
			do
			{
				System.out.println("Enter the first number: ");
				num1=sc.nextInt();
				System.out.println("Enter the second number: ");
				num2=sc.nextInt();
				System.out.println("1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Exit");
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:
					System.out.println("Sum of two numbers is: " + (num1+num2));
					break;
			
					case 2:
					System.out.println("Difference of two numbers is: " + (num1-num2));
					break;

					case 3:
					System.out.println("Multiplication of two nuymbers is: " + (num1*num2));
					break;
					
					case 4:
					System.out.println("Division is : " + (num1/num2*1.0f));
					break;
					
					case 5:
					shouldContinue=false;
					break;

					default:
					System.out.println("Invalid Choice");
					break;
				}
			}while(shouldContinue);
		sc.close();
		}	
}		