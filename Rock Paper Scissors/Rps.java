import java.util.Scanner;
public class Rps{
    public static void main(String[] args) {

        Pick choice = new Pick();
        Scanner scany = new Scanner(System.in);
        int playersChoice;
        while(true){
            System.out.println("Wellcome to the Rock Paper Scissors game\nPlease type 0 for rock 1 for paper and 2 for scissors or -1 to close");
            playersChoice = scany.nextInt();
            if(playersChoice == -1){
                scany.close();
                break;
            }
            choice.setPlayerChoice(playersChoice);
            choice.botpick();
            System.out.println(choice.whoWins()+ "\n\n");
        }
        scany.close();
    }
}
