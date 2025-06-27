import java.util.*;
class Main{
    public static void main(String[] args){
        
        //Java slot machine
        
        Scanner sc=new Scanner(System.in);
        int balance=100;
        int bet;
        int payout;
        String uservariable;
        String[] row;
        System.out.println("");
        System.out.println(" Welcome To java  Slots ");
        System.out.println("Symbols: 🍊  🍉  🍓  🍄");
        System.out.println("");
        
        while(balance>0){
            System.out.println("Current balance:$ "+balance);
            System.out.print("Place your bet amount: ");
            bet=sc.nextInt();
            
            if(bet>balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if(bet<=0){
                System.out.println("BET must be greater than 0 ");
                continue;
            }
            else{
                balance-=bet;
            }
            
            System.out.println("Spinning......");
            row= spinrow();
            printrow(row);
            payout=getPayout(row, bet);
            if(payout>0){
                System.out.println("You won:$ "+payout);
                balance+=payout;
            }
            else{
                System.out.println("You lost ");
            }
           System.out.print("Do you want to play again(Y/N): ");
           uservariable=sc.next().toUpperCase();
           if(!uservariable.equals("Y")){
               break;
           }
        }
        System.out.println("THANKS FOR PLAYING THE GAME \nYour balance:$ "+balance);
        
      sc.close();  
    }
    static String[] spinrow(){
        
        String[] Symbols={"🍊","🍉","🍓","🍄"};
        String[] row = new String[3];
        Random random=new Random();
        
        for(int i=0;i<3;i++){
            row[i]=Symbols[random.nextInt(Symbols.length)];
        }

        return row;
    }
    static void printrow(String[] row){
        System.out.println("");
        System.out.println(" "+String.join(" | ",row));
        System.out.println("");
    }
    static int getPayout(String[] row , int bet){
        
        if(row[0].equals(row[1])&& row[1].equals(row[2])){
            return switch(row[0]){
                case "🍊" -> bet*3;
                case "🍉"-> bet*2;
                case "🍓" -> bet*2;
                case "🍄" -> bet*4;
                default -> 0;
            };
        }
        return 0;
    }

}