import java.util.*;
public class Rockpaper
{
	public static void main(String[] args) {
		
		//Rock paper Scissors
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		
		String[] choices={"rock","paper","scissors"};
		String playerchoice;
		String computerchoice;
		String playagain="yes";
		
        do{
            System.out.print("Enter your movie(rock,paper,scissors): ");
    		playerchoice=sc.nextLine().toLowerCase();
    		
    	   if(!playerchoice.equals("rock")&& 
    	      !playerchoice.equals("paper")&& 
    	      !playerchoice.equals("scissors")){
    	       System.out.println("Enter the valid input");
    	       continue;
    	   }
    	   computerchoice=choices[random.nextInt(3)];
    	   System.out.println(computerchoice);
    		
    	    if(playerchoice.equals(computerchoice)){
    	        System.out.println("It's a tie ");
    	    }
    	    else if(playerchoice.equals("rock")&& computerchoice.equals("scissors") ||
    	            playerchoice.equals("paper")&&computerchoice.equals("rock") ||
    	            playerchoice.equals("scissors")&&computerchoice.equals("paper")){
    	        System.out.println("You win ");
    	    }
    	    else{
    	        System.out.println("You lose ");
    	    }
    	    
    	    System.out.println("Do you want to play again(yes/no): ");
    	    playagain=sc.nextLine().toLowerCase;
        }
	    while(playagain.equals("yes"))
		sc.close();
	System.out.println("Thanks for playing....");
	}
}
