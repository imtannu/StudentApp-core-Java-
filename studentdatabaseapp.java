package studentdatabaseapp;

import java.util.Scanner;

public class studentdatabaseapp {

	public static void main(String[] args) {
		
// Ask how many new Students we want to add
		System.out.println("Enter Number of student to enroll");
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		
		student[] students = new student[numberOfStudents];
				
// Create n number of new Students			
		for(int n=0; n< numberOfStudents; n++)
		{
		students[n]= new student();
		students[n].enroll();
		students[n].payTuition();
		}
	
		for(int n = 0; n<numberOfStudents; n++) 
		{
		System.out.println(students[n].status());
		}
		
	
	}

}
