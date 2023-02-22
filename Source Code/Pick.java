import java.util.Random;
public class Pick {

    private String playerChoice;
    private String botChoice;
    private String picked; 
    private String winner; 

    public void botpick(){
        Random rand = new Random();
        botChoice = identifyPick(rand.nextInt(3));
    }
    public String identifyPick(int picked){
        if(picked == 0){
            this.picked = "Rock";
        }
        else if(picked == 1){
            this.picked = "Paper";
        }
        else if(picked == 2){
            this.picked = "Scissors";
        }
        else{
            this.picked = "You Fucked Up";
        }
        return this.picked;
    }
    public String whoWins(){
        if(playerChoice == botChoice){
            winner = "Theres a tie";
        }
        switch(playerChoice){
            case("Rock"):
                caseRock();
                break;
            case("Paper"):
                casePaper();
                break;
            case("Scissors"):
                caseScissors();
                break;
        }
        return winner;
    }
    public void caseRock(){
        if(playerChoice == "Rock" && botChoice == "Paper"){
            winner = "Bot Wins With Paper";
        }
        else if(playerChoice == "Rock" && botChoice == "Scissors"){
            winner = "You Win. Bot Picked Scissors";
        }
    }
    public void casePaper(){
        if(playerChoice == "Paper" && botChoice == "Scissors"){
            winner = "Bot Wins With Scissors";
        }
        else if(playerChoice == "Paper" && botChoice == "Rock"){
            winner = "You Win. Bot Picked Rock";
        }
    }
    public void caseScissors(){
        if(playerChoice == "Scissors" && botChoice == "Rock"){
            winner = "Bot Wins With Rock";
        }
        else if(playerChoice == "Scissors" && botChoice == "Paper"){
            winner = "You Win. Bot Picked Paper";
        }
    }
    //Set methods
    public void setPlayerChoice(int playerPicked){
        playerChoice = identifyPick(playerPicked);
    }

}
