package chapter2;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class C2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.1
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius:");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0/5)*celsius + 32;
		System.out.println(celsius+" Celsius is "+fahrenheit+"Fahrenheit.");*/
		
		//2.2
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder:");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		final double PI = 3.1415926;
		
		double area = radius * radius * PI;
		double volume = area * length;
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);*/
		
		//2.3
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for feet:");
		int feet = input.nextInt();
		double meter = 0.305*feet;
		System.out.println(feet+" feet is "+meter+" meters.");*/
		
		//2.4
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds:");
		double pound = input.nextDouble();
		double kilogram = 0.454*pound;
		System.out.println(pound+" pounds is "+kilogram+" kilograms.");*/
		
		//2.5
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate:");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		double gratuity = subtotal*rate/100;
		double total = subtotal+ gratuity;
		
		System.out.println("The gratuity is "+gratuity+" and total is "+total);*/
		
		//2.6
		/*System.out.println("Enter a number between 0 and 1000:");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int a = i/100;
		i %= 100;
		int b = i/10;
		i %= 10;
		System.out.println("Sum of the digits is "+(a+b+i));*/
		
		//2.7
		/*System.out.println("Enter the number of minutes:");
		Scanner input = new Scanner(System.in);
		int minute = input.nextInt();
		int day = minute/(24*60);
		int year = day/365;
		day %= 365;
		System.out.println(minute+" minutes is "+year+" years and "+day+" days.");*/
		
		//2.8
		/*System.out.println("Enter an ASCII code:");
		Scanner input = new Scanner(System.in);
		int code = input.nextInt();
		System.out.println("The character for ASCII code "+code+" is "+(char)code);*/
		
		//2.9
		/*Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		
		int i =number;
		int a = i/100;
		i%=100;
		int b = i/25;
		i %= 25;
		int c = i/10;
		i%=10;
		int d = i/5;
		i%=5;
		
		System.out.println(number+" pennies is"+a+" dollar,"+b+" quarter,"+c+" dime,"+d+" nickel and "+i+" penny.");*/
		
		//2.10
		/*String number = JOptionPane.showInputDialog("Enter total pennies:");
		int i = Integer.parseInt(number);
		int a = i/100;
		i%=100;
		int b = i/25;
		i %= 25;
		int c = i/10;
		i%=10;
		int d = i/5;
		i%=5;
		String answer = number + " pennies is "+a+" dollar,"+b+" quarter,"+c+" dime,"+d+" nickel and "+i+" penny.";
		JOptionPane.showMessageDialog(null, answer);*/
		
		//2.11 (1)
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		String name = input.next();
		
		System.out.println("Enter number of hours worked in a week:");
		double hour = input.nextDouble();
		
		System.out.println("Enter hourly pay rate:");
		double rate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate:");
		double tax1 = input.nextDouble();
		double fed = tax1*hour*rate;
		fed = 0.01*(int)(100*fed);
		
		System.out.println("Enter state tax withholding rate:");
		double tax2 = input.nextDouble();
		double sta = tax2*hour*rate;
		sta = 0.01*(int)(100*sta);
		
		System.out.println("Employee Name:"+name+'\n'
				+"Hours Worked:"+hour+'\n'
				+"Pay Rate:$"+rate+'\n'
				+"Gross Pay:$"+(hour*rate)+'\n'
				+"Deductions:"+'\n'
				+'\t'+"Federal Withholding ("+(100*tax1)+"%):$"+fed+'\n'
				+'\t'+"State Withholding ("+(100*tax2)+"%):$"+sta+'\n'
				+'\t'+"Total Deduction:$"+(fed+sta)+'\n'
				+"Net Pay:$"+((hour*rate)-(fed+sta)));*/
		
		//2.11 (2)
		/*String name = JOptionPane.showInputDialog("Enter employee's name:");
		String shour = JOptionPane.showInputDialog("Enter number of hours worked in a week:");
		String srate = JOptionPane.showInputDialog("Enter hourly pay rate:");
		String stax1 = JOptionPane.showInputDialog("Enter federal tax withholding rate:");
		String stax2 = JOptionPane.showInputDialog("Enter state tax withholding rate:");
		
		double hour = Double.parseDouble(shour);
		double rate = Double.parseDouble(srate);
		double tax1 = Double.parseDouble(stax1);
		double tax2 = Double.parseDouble(stax2);
		
		double fed = tax1*hour*rate;
		fed = 0.01*(int)(100*fed);
		double sta = tax2*hour*rate;
		sta = 0.01*(int)(100*sta);
		
		String answer = "Employee Name:"+name+'\n'
				+"Hours Worked:"+hour+'\n'
				+"Pay Rate:$"+rate+'\n'
				+"Gross Pay:$"+(hour*rate)+'\n'
				+"Federal Withholding ("+(100*tax1)+"%):$"+fed+'\n'
				+"State Withholding ("+(100*tax2)+"%):$"+sta+'\n'
				+"Total Deduction:$"+(fed+sta)+'\n'
				+"Net Pay:$"+((hour*rate)-(fed+sta));
		JOptionPane.showMessageDialog(null, answer);*/
		
		//2.12 (1)
		/*System.out.println("Enter balance and interest rate:");
		Scanner input = new Scanner(System.in);
		double balance = input.nextDouble();
		double rate = input.nextDouble();
		
		float interest = (float)balance * ((float)rate/1200);
		System.out.println("The interest is "+interest);*/
		
		//2.12(2)
		/*String sbalance = JOptionPane.showInputDialog("Enter balance:");
		String srate = JOptionPane.showInputDialog("Enter interest rate:");
		
		double balance = Double.parseDouble(sbalance);
		double rate = Double.parseDouble(srate);
		float interest = (float)balance * ((float)rate/1200);
		
		String answer = "The interest is "+interest;
		JOptionPane.showMessageDialog(null, answer);*/
		
		//2.13
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		int investment = input.nextInt();
		System.out.println("Enter monthly interest rate:");
		double rate = input.nextDouble();
		System.out.println("Enter number of years:");
		int year = input.nextInt();
		
		double value = investment * Math.pow((1+rate*0.01/12), 12*year);
		System.out.println("Accumulated value is "+value);*/
		
		//2.14
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double pound = input.nextDouble();
		double kilo = 0.45359237*pound;
		
		System.out.println("Enter height in inches:");
		double inch = input.nextDouble();
		double meter = 0.0254*inch;
		
		double bmi = kilo/(meter*meter);
		bmi = ((int)(10000*bmi))/10000.0;
		System.out.println("BMI is "+bmi);*/
		
		//2.15
		/*final int money = 100;
		final double rate = 0.05/12;
		double value = 0;
		for(int i=0;i<5;i++)
		{
			value = (value+100)*(1+rate);
		}
		System.out.println(value);*/
		
		//2.16
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms:");
		double kilo = input.nextDouble();
		
		System.out.println("Enter the initial temperature:");
		double initial = input.nextDouble();
		System.out.println("Enter the final temperature:");
		double fina = input.nextDouble();
		
		double energy = kilo*(fina-initial)*4184;
		System.out.println("The energy needed is "+energy);*/
		
		//2.17
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		double tem = input.nextDouble();
		System.out.println("Enter the wind speed miles per hour:");
		double speed = input.nextDouble();
		
		double v = Math.pow(speed, 0.16);
		double chill = 35.74+0.6215*tem-35.75*v+0.4275*v*tem;
		System.out.println("The wind chill index is "+chill);*/
		
		//2.18
		/*System.out.println("a"+'\t'+"b"+'\t'+"pow(a,b)");
		double p=0;
		int a=0;
		for(int i = 1;i<6;i++)
		{
			a=i;
			p=Math.pow(a, a+1);
			System.out.println(a+"\t"+(a+1)+"\t"+(int)p);
		
		}*/
		
		//2.19
		long time = System.currentTimeMillis();
		int ran = (int)(time/1000);
		ran %= 26;
		char random = (char)(65+ran);
		System.out.println(random);

	}

}
