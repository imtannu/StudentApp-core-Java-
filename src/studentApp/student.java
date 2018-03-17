package studentApp;

import java.util.Scanner;

public class student {

	private String firstName;
	private String lastName;
	private String year;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
// Constructor: promoted user to enter student's name and year
	public student() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("Enter new Student Details:");
		System.out.println("Enter First Name: ");
		this.firstName = in.nextLine();
		System.out.println("------------------------------------");
		System.out.println("Enter Last Name: ");
		this.lastName = in.next();
		System.out.println("------------------------------------");
		System.out.println("Class Years: ");
		System.out.println("1 - MCA-I \n2 - MCA-II \n3 - MCA-III \n Enter Year No. : ");
		int d = in.nextInt();
		if(d==1) {this.year = "MCA-I";}
		if(d==2) {this.year = "MCA-II";}
		if(d==3) {this.year = "MCA-III";}
		setStudentID();
	}
	
// Generate an ID
	public void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = costOfCourse + "" + id;
	}
	
// enroll courses
	public void enroll() {
		System.out.println("------------------------------------");
		System.out.println("  Courses:(Rs:600/- per Course) \n History \n Mathematics \n English \n Chemistry \n Computer Science");
		System.out.println("------------------------------------");
		do {
		System.out.print("Enter the Courses Names:(press ok to Submit): ");
		@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(! course.equals("ok")){
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
			}
		else {break;}
	} while(1 != 0);
     
 }
// view Balance
	public void viewbalance() {
		System.out.println("------------------------------------");
		System.out.println("Your tuition balance is :" + tuitionBalance);
	}
	
// pay tuition
	public void payTuition() {
		viewbalance();
		System.out.println("------------------------------------");
		System.out.println("Enter your Payment Amount:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("------------------------------------");
		System.out.println("Thank you for Payement of Rs: " + payment+"/-");
		viewbalance();
	}
	
// show student status
	public String status() {
		return "Name: " + firstName + " " + lastName +
				"\nStudentID: " + studentID +
				"\nAdmition Year: " + year +
				"\nEnrolled Courses:" + courses +
				"\nBalance Amount : " + tuitionBalance ;
	}
	
}
