package miniQuizApp;

public class Main {

	public static void main(String[] args) {
		QuizBank qb = new QuizBank();
		System.out.println("Welcome to Mini Quiz.\n");
		System.out.println("Here are 5 questions related to Android development.");
		qb.showQuestions();
		System.out.println("Your Total Score is: "+qb.calScore());
		qb.displayAns();
		System.out.println("\nThankyou for attending the Quiz.");
	}
}
