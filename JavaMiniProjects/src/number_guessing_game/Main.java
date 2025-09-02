package number_guessing_game;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RandNumGenerator numClass = new RandNumGenerator();
		int number = numClass.generateNum();
		int num, attempts = 1;
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I have choosen a number between 1 and 100.\n");
		while(true) {
			System.out.println("Enter your guess: ");
			num = sc.nextInt();
			if(num < number) {
				System.out.println("Too low! Try again.");
				attempts++;
			} else if(num > number) {
				System.out.println("Too high! Try again.");
				attempts++;
			} else {
				System.out.println("Congratulations! You guessed the correct number "+number+" in "+attempts+" attempts.");
				break;
			}
		}
		
	}

}
