package project;
import java.util.Scanner;

public class BankingApplication {

private String customerName;

private String customerAddress;

private long phoneNumber;

private double balance;

BankingApplication(String customerName,String customerAddress,long phoneNumber,double balance)
{
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.phoneNumber=phoneNumber;
	this.balance=balance;
}
public void deposit(int amount)
{
	balance=balance+amount;
	System.out.println("Deposit Successfull,available balance is "+balance);
}
public void withdraw(int amount)
{
	if(balance<amount)
	{
		System.out.println("Insuffiecient funds");
	}
	else {
		balance=balance-amount;
		System.out.println("Withdraw successfull,available balence is "+balance);
	     }
	
}
public void showBalance()
{
	System.out.println("Present balence in your account :"+balance);
}
public void exit()
{
	System.out.println("Thank you!");
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your name :");
	String customerName=sc.nextLine();
	System.out.println("Enter your address :");
	String customerAddress=sc.nextLine();
	System.out.println("Enter your phone number :");
	long phoneNumber=sc.nextLong();
	System.out.println("Enter initial balence in your account :");
	double balence=sc.nextDouble();
	BankingApplication obj=new BankingApplication(customerName,customerAddress,phoneNumber,balence);
	System.out.println("What do you want to do");
	System.out.println("Enter 1 for deposit");
	System.out.println("Enter 2 for withdraw");
	System.out.println("Enter 3 to check balence");
	System.out.println("Enter 4 to exit");
	int operation=sc.nextInt();
	switch(operation)
	{
	case 1:
		System.out.println("Enter amount to deposit :");
		int amount=sc.nextInt();
		obj.deposit(amount);
		break;
		
	case 2:
		System.out.println("Enter amount to withdraw :");
		amount=sc.nextInt();
		obj.withdraw(amount);
		break;
		
	case 3:
		obj.showBalance();
		break;
	case 4:
		obj.exit();
		
	default:
		System.out.println("Enter correct input");
	}
	sc.close();
		
		
		
	}
}
