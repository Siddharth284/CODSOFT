import java.util.*;
public class Number_Game {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    static int TotalScore = 0;
    int Score;
    int Guess;
    public void Game(){
        int RandomNumber = random.nextInt(101);
        for(int i=0;i<10;i++){
            System.out.println("Chances left:" + (10-i));
            System.out.print("Enter Your Guess :");
            Guess = scan.nextInt();
            if(RandomNumber==Guess){
                System.out.println("You Guess Is Correct");
                Score = (10 - i);
                return;
            }
            else if(RandomNumber<Guess){
                System.out.println("Your Guess Is Greater Than The Number.");
            }
            else if(RandomNumber>Guess){
                System.out.println("Your Guess Is Less Than The Number.");
            }
            
            }
            System.out.println("You Lost This Round");
            Score = 0;
            return;
            }
            public static void main (String[] args){
               Number_Game NG = new Number_Game();
              for(int i=1;i<=5;i++){
                System.out.println("Round " + i);
                NG.Game();
                System.out.println("Round " + i +" Score : "+NG.Score);
                Number_Game.TotalScore +=NG.Score;
            }
            System.out.println("Total Score: "+Number_Game.TotalScore);
            NG.scan.close();
            }
            
        }
