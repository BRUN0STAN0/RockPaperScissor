import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome in the game,");
        System.out.println("\n\tWrite Rock, Paper or Scissor\n");
        String[] rps = {"Rock","Paper","Scissor"};
        int index = random.nextInt(rps.length);
        System.out.print("You have chosen: \t");
        int input = in.next().charAt(0);
        

        while (true) {
            if (input == 'r' || input == 'R'){
                System.out.println("The computer has chosen: "+rps[index]);
                if (index == 0)
                    System.out.println("Tie :|");
                if (index == 1)
                    System.out.println("Lost :(");
                if (index == 2)
                    System.out.println("Won :)");
            }
            else if (input == 'p' || input == 'P'){
                System.out.println("The computer has chosen: "+rps[index]);
                if (index == 0)
                    System.out.println("Won :)");
                if (index == 1)
                    System.out.println("Tie :|");
                if (index == 2)
                    System.out.println("Lost :(");
            }
            else if (input == 's' || input == 'S'){
                System.out.println("The computer has chosen: "+rps[index]);
                if (index == 0)
                    System.out.println("Lost :(");
                if (index == 1)
                    System.out.println("Won :)");
                if (index == 2)
                    System.out.println("Tie :|");
            }
            else 
                System.err.println("ERROR:\tWrite Rock, Paper or Scissor");
            
                System.out.print("\n\nDo you want to continue? ");
                char play = in.next().charAt(0);
    
                if (play == 'y' || play == 'Y')
                {
                    index = random.nextInt(rps.length);
                    System.out.println("---------------------------------");
                    System.out.println("Welcome in the game,");
                    System.out.println("\n\tWrite Rock, Paper or Scissor\n");
                    System.out.print("\nYou have chosen: \t");
                    input = in.next().charAt(0);
                }
                else {
                    System.err.println("Byebye! See you soon.");
                    break;
                }
        }
        
        
        in.close();
    }
}