import java.util.Scanner;

class Player1 {
    int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player1: Please guess the number: ");
        int numberToReturn = scan.nextInt();
        return numberToReturn;
    }
}

class Player2 {
    int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player2: Please guess the number: ");
        int numberToReturn = scan.nextInt();
        return numberToReturn;
    }
}

class Guesser {
    int giveNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser: Please enter a number: ");
        int numberToReturn = scan.nextInt();
        return numberToReturn;
    }
}

class BeginPlay {
    void start() {
        int guesserNumber = (new Guesser()).giveNumber();
        int player1Number = (new Player1()).guessNumber();
        int player2Number = (new Player2()).guessNumber();
        if(player1Number == guesserNumber) {
            printWinner(1);
        } else if(player2Number == guesserNumber) {
            printWinner(2);
        } else {
            System.out.println("No one wins!");
        }
    }
    
    void printWinner(int winnerPlayer) {
        System.out.printf("Player%d wins!!", winnerPlayer);
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        (new BeginPlay()).start();
    }
}
