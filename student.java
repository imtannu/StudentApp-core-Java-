package studentdatabaseapp;

import java.util.Scanner;

public class student {

	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor: promoted user to enter student's name and year
	public student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - First Year \n2 - Second Year\n3 - Third Year\n4 - Last Year\n Enter Class Year: ");
		this.year = in.nextInt();
		setStudentID();
		//System.out.println(firstName + " " + lastName + " " + year + " " + studentID);
		
		
	}
	
// Generate an ID
	public void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = year + "" + id;
	}
	
// enroll courses
	public void enroll() {
		do {
		System.out.print("Enter the Courses: (Enter Q to Quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(! course.equals("Q")){
			courses = courses + "\n  " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
			}
		else {break;}
	} while(1 != 0);
				
     //System.out.println("ENROLLED IN:" + courses);
    // System.out.println("TUITION BALANCE:" + tuitionBalance);
     
 }
// view Balance
	public void viewbalance() {
		System.out.println("Your tuition balance is :" + tuitionBalance);
	}
	
// pay tuition
	public void payTuition() {
		viewbalance();
		System.out.println("Enter your Payment Amount:");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for Payement of Rs/-" + payment);
		viewbalance();
	
	}
// show status
	public String status() {
		return "Name: " + firstName + " " + lastName +
				"\nEnrolled courses:" + courses +
				"\nAdmition Year:" + year +
				"\nStudentID:" + studentID +
				"\n Balance Amount : " + tuitionBalance ;
	}
	

}
