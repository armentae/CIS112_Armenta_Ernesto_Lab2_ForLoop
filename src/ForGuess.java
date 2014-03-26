import java.util.Scanner;


public class ForGuess 
{

	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		int computerNum;
		int userNum;
		for (int i =0; i<3; i++)
		{
			computerNum = 0 + (int) (Math.random()*10);
		
		System.out.println ("Please guess a number");
		
		userNum = input.nextInt();
		System.out.printf("The computer number is %d ",computerNum);
		if (computerNum == userNum) 
		{
			System.out.println (" correct guess");
		}
		else if (computerNum>userNum) {
			System.out.println ("Your number is too low");
		}
		else
		{
			System.out.println("Your number is too High");
		}
		}
	}
}