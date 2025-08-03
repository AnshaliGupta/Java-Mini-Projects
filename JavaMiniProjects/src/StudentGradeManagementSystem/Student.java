package StudentGradeManagementSystem;
//import java.util.Scanner;
public class Student {
	//Scanner sc = new Scanner(System.in);
	int rollNo;
	String name;
	double[] marks = new double[5];  //five subjects
	double total;
	char grade;
	/* Student() {
		System.out.println("Enter RollNo.:- ");
		rollNo = sc.nextInt();
		System.out.println("Enter Name:- ");
		name = sc.nextLine();
		System.out.println("Enter marks of 5 subjects - Java, DSA, DBMS, OS, CN respectively:-");
		for(int i=0; i<5; i++) {
			marks[i] = sc.nextDouble();
		}
	} */
	/* void setData(int rollNo, String name, double marks[]) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	} */
	void CalTotGrade() {
		total = 0;
		for(int i=0; i<5; i++) {
			total = total + marks[i];
		}
		if(total >= 250 && total <= 300) {
			grade = 'A';
		} else if(total >= 200 && total < 250) {
			grade = 'B';
		} else if(total >= 150 && total < 200) {
			grade = 'C';
		} else if(total >= 100 && total < 150) {
			grade = 'D';
		} else if(total >= 50 && total < 100) {
			grade = 'E';
		} else if(total >= 0 && total < 50) {
			grade = 'F';
		} else {
			System.out.println("Invalid Marks");
		}
	}
	void displayData() {
		System.out.println("RollNo. -> "+rollNo);
		System.out.println("Name -> "+name);
		CalTotGrade();
		System.out.println("Total Marks -> "+total);
		System.out.println("Grade -> "+grade);
	}
}
