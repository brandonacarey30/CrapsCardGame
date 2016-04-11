//Brandon Carey
//CSC 111
//September 11 2013
//This program simulates a game of Craps. A player rolls two-six sided dice.
//If the total is 2, 3, or 12, the player loses immediately. If the total is 7
//the player wins immediately. 

public class Craps
{
  public static void main(String[] args)
  {
    int numbGames = Integer.parseInt(args[0]);
    int lose = 0;
    int win = 0;
    int i;

    for(i = 0; i < numbGames; i++){

      if (playGame()){
        win = win + 1;
      }

      else{
        lose = lose + 1;
      }
    }
    
    System.out.println("The player won " + win + " games!");
    System.out.println("The house won " + lose + " games!");
    
  }
 
  public static boolean playGame()
  {
    int dice0 = (int) (6*Math.random())+1;
    int dice1 = (int) (6*Math.random())+1;
    int dice3 = dice0 + dice1;

    if(dice3 == 2 || dice3 == 3 || dice3 == 12){

      return false;

    }else if(dice3 == 7){

      return true;

    }else{

        dice0 = (int) (6*Math.random())+1;
        dice1 = (int) (6*Math.random())+1;
        int point = dice0 + dice1;

        while(point !=7){
          if(dice3 == point){
            return true;
          }
          dice0 = (int) (6*Math.random())+1;
          dice1 = (int) (6*Math.random())+1;
          point = dice0 + dice1;
          
        }
        return false;
    } 
  }
}   
        
       

















