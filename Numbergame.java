package firsttask;
import java.util.Random.*;
import java.util.*;
public class Numbergame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		boolean playagain=true;
		int totalscore=0;
		int rounds=0;
		int win=0;
		
		while(playagain) {
			rounds++;
			int targetnum=ra.nextInt(100)+1;
			int attempts=0;
			boolean correctguess=false;
			int maxattempts=5;
			
			System.out.println("Round"+rounds+":Guess the Number between 1 to 100.you have "+maxattempts+" attemptes");
			
			while(!correctguess &&attempts<maxattempts) {
				attempts++;
				
				System.out.print("attempts"+attempts+":enter your guess:");
				int userguess=sc.nextInt();
				if(userguess<targetnum) {
					System.out.println("Too low");
				}
				else if(userguess>targetnum) {
					System.out.println("Too high");
				}
				else {
					System.out.println("Conguratulation!!you've guessed the number correctly.");
					correctguess=true;
					win++;
				}
			}
			if(!correctguess) {
				System.out.println("Sorry!! you've used all "+maxattempts+" attempts.The correct number was "+targetnum+".");
			}
			totalscore+=maxattempts-attempts+1;
			System.out.println("Do you wants play another round???(yes/no)");
			String response=sc.next();
			playagain=response.equalsIgnoreCase("yes");
		}
		System.out.println("Game over!!!you've played "+rounds+" rounds....your total win score is:"+win+"."+"and attempts score is:"+totalscore);
		sc.close();
	}
}