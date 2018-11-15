package myJava.cts.guessingGame;

public class GameLauncher {
	Player p1;
	Player p2;
	Player p3;
	
public void startGame(){
	p1= new Player();
	p2= new Player();
	p3= new Player();
	int i = 0;
	while(true){
		i++;
		int number = (int) (10*Math.random());
		System.out.println("Guess number between 0-9");
		System.out.println("Number to be Guessed is "+ number);
		
		p1.guessedNumber();
		p2.guessedNumber();
		p3.guessedNumber();
		
		System.out.println("Number guessed by player 1 is "+ p1.number);
		System.out.println("Number guessed by player 2 is "+ p2.number);
		System.out.println("Number guessed by player 3 is "+ p3.number);
		
		if(number==p1.number && number==p2.number && number==p3.number){
			Boolean check = (number==p1.number && number==p2.number) || (number==p2.number && number==p3.number) || (number==p1.number && number==p3.number);
			String s = check ? "s": "";
			System.out.println("Winner"+s+" "+ (check?"are ":"is ")+(number==p1.number? "Player 1 ":"")+(number==p2.number? "Player 2 ":"")+(number==p3.number? "Player 3 ":""));
			System.out.println("No. of time game played: "+ i);
			break;
		}else{
			System.out.println("No body Wins. Please try again");
		}
		
	}
}


}
