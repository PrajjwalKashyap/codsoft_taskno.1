import java.util.Random;
import java.util.Scanner;

class Game{
    public int Inputnumber;
    public int number;
    public int noOfGuesses = 0;

    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    Game() {
        Random num = new Random();
        number = num.nextInt(100);
    }
    public void takeUserInput() {
        System.out.println("Guess the No. : ");
        Scanner sc = new Scanner(System.in);
        Inputnumber = sc.nextInt();
        
        
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (Inputnumber == number){
            System.out.format("yes, you have got the %d\n in %d attempts ",number,noOfGuesses);
            return true ;
        }
        else if (Inputnumber > number){
            System.out.println("too high.");
        }
        else if (Inputnumber<number ){
            System.out.println("too low.");
        }
        return false;
    }
}
public class Number{
    public static void main(String[] args) {
        Game Num = new Game();
        boolean bool = false;
        while (!bool) {
            Num.takeUserInput();
            bool = Num.isCorrectNumber();                 
        }
    } 
}