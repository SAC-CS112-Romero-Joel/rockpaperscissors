import java.util.Scanner;

public class MAingame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner op =  new Scanner(System.in);
		int computerNum;
		int userchoice;				
		computerNum = 1 + (int) ( Math.random() * 3 );
		
		double Rock = 1, Paper = 2, Knife = 3;
		
		
		
		System.out.print(" Enter either Rock=1 Paper=2 or Knife=3 " );
		 userchoice= input.nextInt();
		
		computerNum = 1 + (int) ( Math.random() * 3 );

		if ( computerNum == userchoice )
			System.out.print( " Tie ");
			
		else if ( computerNum == Paper || userchoice == Rock )
			System.out.print("Computer Wins");
		else if ( computerNum == Rock || userchoice == Paper )
			System.out.print("You win");
		else if ( computerNum == Rock || userchoice == Knife )
			System.out.print("Computer Wins");
		else if ( computerNum == Knife || userchoice == Rock )
			System.out.print("You win");
		else if ( computerNum == Knife || userchoice == Paper )
			System.out.print("Computer Wins");
		else if ( computerNum == Paper || userchoice == Knife )
			System.out.print("You win");
	System.out.print( " my Choice was "+computerNum);
	}
}
