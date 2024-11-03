import java.util.Scanner;

public class GuessingGame {

    private int mysteryNumber;
    private int currentGuess;
    private int numberOfGuesses;

    public GuessingGame() {

        this.numberOfGuesses = 0;
        this.mysteryNumber = (int) (Math.random() * 100) + 1;

    }

    public void StartGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game");

        while (this.currentGuess != this.mysteryNumber){
            System.out.println("Please guess a number");
            this.numberOfGuesses = this.numberOfGuesses + 1; //or this.numberOfGuesses++;
            this.currentGuess = scanner.nextInt();
            if (this.currentGuess > this.mysteryNumber) {
                System.out.println("too large");
            } else if (this.currentGuess < this.mysteryNumber){
                System.out.println("too small");
            }
        }
        System.out.println("correct guess");
        System.out.println("You guessed right in " + this.numberOfGuesses + " tries.");

    }
}
    /*Objective:
    Write a guessing game which prompts a user to guess a mystery number within some range.
    After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
    Upon termination, the program should display the number of guesses before successfully guessing correctly.
    A number that is input consecutively, should register as a single guess.
            Purpose:
    To establish familiarity with
    Control Flow
    Conditionals
    User input
    The Random class
    Object instantation/declaration
    Method invokation

     */



