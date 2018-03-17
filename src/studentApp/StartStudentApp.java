package studentApp;

import java.util.Scanner;

public class StartStudentApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
// Ask how many new Students we want to add
		System.out.println("------------------------------------");
		System.out.println("Enter Number of student to Enroll: ");
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		student[] students = new student[numberOfStudents];
		
// Create n number of new Students			
		for(int n=0; n< numberOfStudents; n++)
		{
		students[n]= new student();
		students[n].enroll();
		students[n].payTuition();
		System.out.println("------------------------------------");
		pressanyKey();
		System.out.println(students[n].status());
		}

	}

	@SuppressWarnings("resource")
	private static void pressanyKey() {
		Scanner in = new Scanner(System.in);
		System.out.println("Press Enter to See Student Details:...");
		in.nextLine();
	}
}
