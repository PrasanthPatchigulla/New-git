import java.util.*;
class Rolldice{
    public static void main(String[] args){
        
        //JAVA DICE ROLLER PROGRAM
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numofdice;
        int total=0;
        
        System.out.println("Enter the number of dice to be rolled: ");
        numofdice=sc.nextInt();
        
        if(numofdice>0){
            
            for(int i=0;i<numofdice;i++){
                int roll=random.nextInt(1,7);
                dieprint(roll);
                System.out.println("You rolled "+roll);
                total+=roll;
            }
            System.out.println("Your total is: "+total);
        }
        else{
            System.out.println("Number of dice must be greater than zero");
        }
    }
    static void dieprint(int roll){
        
        String die1= """
                    ----------
                    |        |
                    |    ●   |
                    |        |
                    ----------
        
                    """;
        
        String die2= """
                    ----------
                    | ●      |
                    |        |
                    |       ●|
                    ----------
        
                    """;
                    
        String die3= """
                    ----------
                    | ●      |
                    |    ●   |
                    |       ●|
                    ----------
        
                    """;
                    
        String die4= """
                    ----------
                    | ●     ●|
                    |        |
                    | ●     ●|
                    ----------
        
                    """;
        String die5= """
                    ----------
                    | ●     ●|
                    |    ●   |
                    | ●     ●|
                    ----------
        
                    """;
        String die6= """
                    ----------
                    | ●     ●|
                    | ●     ●|
                    | ●     ●|
                    ----------
        
                    """;
        switch(roll){
            case 1-> System.out.println(die1);
            case 2-> System.out.println(die2);
            case 3-> System.out.println(die3);
            case 4-> System.out.println(die4);
            case 5-> System.out.println(die5);
            case 6-> System.out.println(die6);
            default->System.out.println("Invalid input ");
        }
    }
}