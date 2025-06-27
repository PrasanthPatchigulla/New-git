import java.util.*;
import java.io.*;
class Hangman
{
	public static void main(String[] args) {
	    
	    String filePath= "Words.txt";
	    
	    ArrayList<String> Words = new ArrayList<>();
	    
	    try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
	        String line;
	        while((line = reader.readLine()) !=null){
	            Words.add(line.trim());
	        }
	    }
	    catch(FileNotFoundException e){
	        System.out.println("Could not find the file ");
	    }
	    catch(IOException e){
	        System.out.println("Something went wrong");
	    }
	    
	    Random random = new Random();
	    String word=Words.get(random.nextInt(Words.size()));
	    
	    System.out.println(word);
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> wordstate = new ArrayList<>();
		int wrongGuesses= 0;
		
		for(int i=0;i<word.length();i++){
		    wordstate.add('_');
		}
		
		System.out.println("************************");
		System.out.println("Welcome to Java Hangman!");
		System.out.println("************************");
		
        while(wrongGuesses < 6 ){
                
                System.out.println(getHangmanArt(wrongGuesses));
		    
    		    System.out.print("Word: ");
    		for(char c : wordstate){
    		    System.out.print(c+" ");
    		}
    		System.out.println();
    		
    		System.out.println("Guess a letter: ");
    		char guess = sc.next().toLowerCase().charAt(0);
    		
    		if(word.indexOf(guess) >= 0){
    		    System.out.println("Correct guess!");
    		    
    		    for(int i=0;i<word.length();i++){
    		        if(word.charAt(i)==guess){
    		            wordstate.set(i, guess);
    		        }
    		    }
    		    if(!wordstate.contains('_')){
    		        System.out.println(getHangmanArt(wrongGuesses));
    		        System.out.println("YOU WIN!");
    		        break;
    		    }
    		}
    		else{
    		    wrongGuesses++;
    		    System.out.println("Wrong Guess!!");
    		}
		
	    }
		
		if(wrongGuesses>=6){
		    System.out.println(getHangmanArt(wrongGuesses));
		    System.out.println("!!GAME OVER!!");
		    System.out.println("The word was: "+word);
		}
	    sc.close();	
	    }
	
	static String getHangmanArt(int wrongGuesses){
	    
	    return switch(wrongGuesses){
	       case 0 ->  """
	                    
	                    
	                  """;
	         
	       case 1 ->   """
	                    O
	                    
	                    
	                    
	                   """; 
           case 2 ->   """
	                    O
	                    |
	                    
	                    
	                   """; 
	                   
	       case 3 ->   """
	                    O
	                   /|
	                    
	                    
	                   """; 
	       case 4 ->   """
	                    O
	                   /|\\
	                    
	                    
	                   """;
	       case 5 ->   """
	                    O
	                   /|\\
	                   /
	                    
	                   """;
	       case 6 ->   """
	                    O
	                   /|\\
	                   / \\
	                    
	                   """;
	                   
	       default ->" ";
	       
	    };
	    
	    
	    }
    }

