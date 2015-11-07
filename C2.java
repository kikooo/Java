package chapter2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 size of a circle
		/*double radius;
		double area;
		//step1: read in radius 
		//radius=20;
		
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		//step2: compute area
		area=radius*radius*3.14;
		
		//step3: display the area
		System.out.println(area);*/
		
		//2 average of 3 numbers
		/*int num1,num2,num3;
		Scanner input=new Scanner(System.in);
		num1= input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		double average=0;
		average=1.0*(num1+num2+num3)/3;
		System.out.println(average);*/
		
		//3 diaplay time
		/*int sec;
		int minute=0,second=0;
		Scanner input=new Scanner(System.in);
		sec=input.nextInt();
		minute=sec/60;
		second=sec%60;
		
		System.out.println(minute+"'"+second+'\"');*/
		
		//test
		//System.out.println(1.0-0.9);
		
		//4 show current time
		/*long totalMilliseconds=System.currentTimeMillis();
		long totalsecond=totalMilliseconds/1000;
		long totalminute=totalsecond/60;
		long currentsecond=totalsecond%60;
		long totalhour=totalminute/60;
		long currentminute=totalminute%60;
		long currenthour=totalhour%24;
		
		System.out.println(currenthour+":"+currentminute+":"+currentsecond+"GMT");*/
		
		//5 sales tax
		/*Scanner input=new Scanner(System.in);
		double purchaseAmount=input.nextDouble();
		double tax=0.06*purchaseAmount;
		
		System.out.println((int)(tax*100)/100.0);*/
		
		//6 compute change
		/*Scanner input=new Scanner(System.in);
		double number=input.nextDouble();
		
		int i =(int)(100*number);
		int a = i/100;
		i%=100;
		int b = i/25;
		i %= 25;
		int c = i/10;
		i%=10;
		int d = i/5;
		i%=5;
		
		System.out.println(number+"dollar is"+a+"dollar,"+b+"quarter,"+c+"dime,"+d+"nickel and"+i+"penny.");*/
		
		//7 using input dialog
		String annualInterestRateString=JOptionPane.showInputDialog("Enter yearly interest rate,for example 8.25:");
		double annualInterestRate= Double.parseDouble(annualInterestRateString);
		double monthlyInterestRate=annualInterestRate /1200;
		
		String numberOfYearsString=JOptionPane.showInputDialog("Enter number of years as an integer,for example 5:");
		int numberOfYear = Integer.parseInt(numberOfYearsString);
		
		String loanString = JOptionPane.showInputDialog("Enter loan amount,for example 120000.25:");
		double loan= Double.parseDouble(loanString);
		
		double monthlyPayment = loan * monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,12*numberOfYear)));
		double totalPayment = monthlyPayment*numberOfYear * 12;
		
		monthlyPayment = (int)(100*monthlyPayment)/100;
		totalPayment = (int)(100*totalPayment)/100;
		
		String output = "Monthly Payment:"+monthlyPayment+'\n'+"Total Payment:"+totalPayment;
		JOptionPane.showMessageDialog(null, output);
	}
}
