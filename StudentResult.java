package project;

import java.util.Scanner;

public class StudentResult {
	
	private String stName;

	private int stId;

	private String courseName;

	private double totalMarks;
	
	StudentResult(String stName,int stId,String courseName,double totalMarks)
	{
		this.stName=stName;
		this.stId=stId;
		this.courseName=courseName;
		this.totalMarks=totalMarks;
	}
	public void addMarks(double marks)
	{
		if(marks<=0)
		{
			System.out.println("Invalid marks entered");
		}
		totalMarks+=marks;
		System.out.println("Marks added successfully,Updated marsk : "+totalMarks);
	}
	public void grade(double totalMarks)
	{
		if(totalMarks>=90)
			System.out.println("Congrats you get A grade and your marks :"+totalMarks);
		else if(totalMarks>80 && totalMarks<=89)
			System.out.println("Congrats you get B grade and your marks :"+totalMarks);
		else if(totalMarks>70 && totalMarks<=79)
				System.out.println("Congrats you get C grade and your marks :"+totalMarks);
		else if(totalMarks>60 && totalMarks<=69)
					System.out.println("Congrats you get D grade and your marks :"+totalMarks);
		else if(totalMarks<60)
			System.out.println("you are Fail");
		
	}
	public void yourMarks()
	{
		System.out.println("Your total marks is "+totalMarks);
	}
	public void exit()
	{
		System.out.println("Thank you!");
	}
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your name :");
	String stName=sc.nextLine();
	System.out.println("Enter your student Id :");
	int stId=sc.nextInt();
	System.out.println("Enter your course name :");
	String courseName=sc.next();
	System.out.println("Enter your marks :");
	double totalMarks=sc.nextDouble();
	StudentResult obj=new StudentResult(stName,stId,courseName,totalMarks);
	
	int choice=0;
	do {
	System.out.println("What do you want to do");
	System.out.println("Enter 1 to add marks to previous marks");
	System.out.println("Enter 2 to calculate grade");
	System.out.println("Enter 3 to view total marks");
	System.out.println("Enter 4 to exit");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter marks to add :");
		int marks=sc.nextInt();
		obj.addMarks(marks);
		break;
		
	case 2:
		obj.grade(totalMarks);
		break;
		
	case 3:
		obj.yourMarks();
		break;
		
	case 4:
		obj.exit();
		break;

	}}while(choice!=4);
	sc.close();
	
	
}
}
