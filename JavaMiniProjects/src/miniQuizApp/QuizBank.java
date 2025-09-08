package miniQuizApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizBank {
	HashMap<Integer, Character> answerList = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	char result[] = new char[5];
	
	{
		answerList.put(1, 'c');
		answerList.put(2, 'b');
		answerList.put(3, 'd');
		answerList.put(4, 'b');
		answerList.put(5, 'c');
	}
	
	public void showQuestions() {
		System.out.println("\n1. What is APK in android?\r\n" + "(a)	Android packages\r\n"
				+ "(b)	Android pack\r\n"
				+ "(c)	Android packaging kit\r\n"
				+ "(d)	None of the above.\r\n" 
				+ "choose one: ");
		result[0] = sc.next().charAt(0);
		
		System.out.println("\n2. View Pager is used for\r\n"
				+ "(a)	Swiping Activities\r\n"
				+ "(b)	Swiping Fragments\r\n"
				+ "(c)	Paging Down List Items\r\n"
				+ "(d)	View Pager Is Not Supported By Android SDK\r\n" 
				+ "choose one: ");
		result[1] = sc.next().charAt(0);
		
		System.out.println("\n3. What is a thread in android?\r\n"
				+ "(a)	Same as services\r\n"
				+ "(b)	Background activity\r\n"
				+ "(c)	Broadcast Receiver\r\n"
				+ "(d)	Independent dis-patchable unit is called a thread\r\n"
				+ "choose one: ");
		result[2] = sc.next().charAt(0);
		
		System.out.println("\n4. SharedPreferences stores the data in which format?\r\n"
				+ "(a)	TXT\r\n"
				+ "(b)	XML\r\n"
				+ "(c)	DOC\r\n"
				+ "(d)	None of the above.\r\n"
				+ "choose one: ");
		result[3] = sc.next().charAt(0);
		
		System.out.println("\n5. In which file, permissions are set in Android?\r\n"
				+ "(a)	Src\r\n"
				+ "(b)	Bin\r\n"
				+ "(c)	AndroidManifest.xml\r\n"
				+ "(d)	Java\r\n"
				+ "choose one: ");
		result[4] = sc.next().charAt(0);
	}
	
	public int calScore() {
		int score = 0;
		for(int i=0; i<5; i++) {
			if(result[i] == answerList.get(i+1)) {
				score++;
			}
		}
		return score;
	}
	
	public void displayAns() {
		System.out.println("\nDo you want to know the answers? yes/no: ");
		String str = sc.next();
		if(str.equals("yes")) {
			for(Map.Entry<Integer, Character> entry : answerList.entrySet()) {
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
		} else {
			return;
		}
	}
}
