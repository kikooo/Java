package chapter3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//3-1
		/*System.out.println("Enter the value of a,b,c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double x1,x2;
		String answer = " ";
		double del = b*b-4*a*c;
		if(del > 0)
		{
			x1 = ((Math.pow(del, 0.5))-b)/(a*2);
			x2 = ((0-Math.pow(del, 0.5))-b)/(a*2);
			answer = "The roots are "+x1+" and "+x2;
		}
		else if(del == 0)
		{
			x1 = (0-b)/(2*a);
			answer = "The root is "+x1;
		}
		else
		{
			System.out.println("The equation has no real root.");
			System.exit(0);
		}
		System.out.println(answer);*/
		
		//3-2
		/*System.out.println("Enter an integer:");
		int num = input.nextInt();
		System.out.println("Is "+num+" an integer? "+(num%2==0));*/
		
		//3-3
		/*System.out.println("Enter a,b,c,d,e,f:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double x,y;
		
		if(a*d==b*c)
		{
			System.out.println("The equatiion has no root.");
		}
		else
		{
			x = (e*d-b*f)/(a*d-b*c);
			y = (a*f-e*c)/(a*d-b*c);
			System.out.println("x is "+x+" and y is "+y);
		}*/
		
		//3-4
		/*int a = (int)(100*Math.random());
		int b = (int)(100*Math.random());
		System.out.printf("What is %d and %d?",a,b);
		int num = input.nextInt();
		System.out.println((num==(a+b)));*/
		
		//3-5
		/*int a = (int)(10*Math.random());
		int b = (int)(10*Math.random());
		int c = (int)(10*Math.random());
		System.out.printf("What is %d and %d and %d?",a,b,c);
		int num = input.nextInt();
		System.out.println((num==(a+b+c)));*/
		
		//3-6
		/*System.out.println("Enter weight in pounds,height in foot and inches:");
		double pound = input.nextDouble();
		double kilo = 0.45359237*pound;
		double foot = input.nextDouble();
		double inch = input.nextDouble();
		inch = 12*foot + inch;
		double meter = 0.0254*inch;
		double bmi = kilo/(meter*meter);
		bmi = ((int)(10000*bmi))/10000.0;
		System.out.println("Your BMI is "+bmi);
		
		if(bmi<16)
			System.out.println("You are seriously under weight.");
		else if(bmi<18)
			System.out.println("You are under weight");
		else if(bmi<24)
			System.out.println("You are normal weight.");
		else if(bmi<29)
			System.out.println("You are over weight.");
		else if(bmi<35)
			System.out.println("You are seriously over weight.");
		else 
			System.out.println("You are gravely over weight.");*/
		
		//3-7
		/*System.out.println("Enter a value:");
		double money = input.nextDouble();
		
		int i =(int)(100*money);
		int a = i/100;
		i%=100;
		int b = i/25;
		i %= 25;
		int c = i/10;
		i%=10;
		int d = i/5;
		i%=5;
		String a1,a2,a3,a4,a5;
		if(a!=0)
		{
			if(a==1)
				a1=a+"dollar ";
			else
				a1=a+"dollars ";
		}
		else
			a1="";
		
		if(b!=0)
		{
			if(b==1)
				a2=b+"quarter ";
			else
				a2=b+"quarters ";
		}
		else
			a2="";
		
		if(c!=0)
		{
			if(c==1)
				a3=c+"dimes ";
			else
				a3=c+"dimes ";
		}
		else 
			a3="";
		
		if(d!=0)
		{
			if(d==1)
				a4=d+"nickels ";
			else
				a4=d+"nickels ";
		}
		else
			a4="";
		
		if(i!=0)
		{
			if(i==1)
				a5=i+"penny";
			else
				a5=i+"pennies";
		}
		else 
			a5="";
		
		System.out.println(money+" dollars is "+a1+a2+a3+a4+a5);*/
		
		//3-8
		/*String snum1 = JOptionPane.showInputDialog("Enter the first number.");
		int num1 = Integer.parseInt(snum1);
		String snum2 = JOptionPane.showInputDialog("Enter the second number.");
		int num2 = Integer.parseInt(snum2);
		String snum3 = JOptionPane.showInputDialog("Enter the third number.");
		int num3 = Integer.parseInt(snum3);
		
		int temp;
		if(num2>num3)
		{
			temp=num2;
			num2=num3;
			num3=temp;
		}
		if(num1>num2)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num2>num3)
		{
			temp=num2;
			num2=num3;
			num3=temp;
		}
		String s = "The three numbers are:"+num1+","+num2+" and "+num3;
		JOptionPane.showMessageDialog(null, s);*/
		
		//3-10
		/*int a = (int)(100*Math.random());
		int b = (int)(100*Math.random());
		System.out.printf("What is %d and %d?",a,b);
		int num = input.nextInt();
		System.out.println((num==(a+b)));*/
		
		//3-9
		/*String number = input.nextLine();
		int num = Integer.parseInt(number);
		int demo = 0;
		for(int i=0;i<9;i++)
		{
			demo+=(num%10)*(i+1);
			num/=10;
		}
		switch(demo%11)
		{
		case 10:
			System.out.println(number+"X");
			break;
		default:
			System.out.println(number+(demo%11));
		}*/
		
		//3-11
		/*String syear = JOptionPane.showInputDialog("Enter a year.");
		int year = Integer.parseInt(syear);
		int flag=0;
		if(((year%4==0)^(year%100==0)) || (year%400==0))
		{
			flag = 1;
		}
		int day = 0;
		String smonth = JOptionPane.showInputDialog("Enter a month");
        switch(smonth)
		{
			case "Janurary":
				day = 31;
				break;
			case "February":
				if(flag==1)
					day=29;
				else
					day=28;
				break;
			case "March":
				day = 31;
				break;
			case "April":
				day = 30;					
				break;
			case "May":
				day= 31;
				break;
			case "June":
				day = 30;
				break;
			case "July":
				day = 31;
				break;
			case "Augest":
				day = 31;
				break;
			case "September":
				day = 30;
				break;
			case "October":
				day = 31;
				break;
			case "November":
				day = 30;
				break;
			case "December":
				day = 31;
				break;
		}
		System.out.println(smonth +" "+syear+" has "+day+" days.");*/
		
		//3-12
		/*System.out.println("Enter an Integer:");
		int number = input.nextInt();
		int flag = 0;
		
		if((number%5)==0)
		{
			if((number%6)==0)
				flag = 1;
			else
				flag = 2;
		}
		else
		{
			if((number%6)==0)
				flag = 2;
			else
				flag = 3;
		}
		switch(flag)
		{
		case 1:
			System.out.println(number+" is divisable by both 5 and 6.");
			break;
		case 2:
			System.out.println(number+" is divisable by 5 or 6,but not both.");
			break;
		case 3:
			System.out.println(number+" is not divisable by either 5 or 6.");
		}*/
		
		//3-13
		/*System.out.println("Enter your status(0 for single filer,1 for married jointedly,2 for married seperately and 3 for house hold)");
		int status = input.nextInt();
		
		System.out.println("Enter the taxable income:");
		double income = input.nextDouble();
		double tax = 0;
		
		if(status == 0)
		{
			if(income <= 8350)
			{
				tax = income *0.1;
			}
			else if(income <= 33950)
			{
				tax = 8350*0.1+(income-8350)*0.15;
			}
			else if(income <= 52250)
			{
				tax = 8350*0.1+25600*0.15+(income-33950)*0.25;
			}
			else if(income <= 171550)
			{
				tax = 8350*0.1+25600*0.15+(52250-33950)*0.25+(income-52250)*0.28;
			}
			else if(income <= 372950)
			{
				tax = 8350*0.1+25600*0.15+(52250-33950)*0.25+(171550-52250)*0.28+(income-171550)*0.33;
			}
			else
			{
				tax = 8350*0.1+25600*0.15+(52250-33950)*0.25+(171550-52250)*0.28+(372950-171550)*0.33+(income-372950)*0.35;
			}
		}
		else if(status == 1)
		{
			if(income <= 16700)
			{
				tax = income *0.1;
			}
			else if(income <= 67900)
			{
				tax = 16700*0.1+(income-16700)*0.15;
			}
			else if(income <= 137050)
			{
				tax = 16700*0.1+(67900-16700)*0.15+(income-67900)*0.25;
			}
			else if(income <= 208850)
			{
				tax = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(income-137050)*0.28;
			}
			else if(income <= 372950)
			{
				tax = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(income-208850)*0.33;
			}
			else
			{
				tax = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(372950-208850)*0.33+(income-372950)*0.35;
			}
		}
		else if(status == 2)
		{
			if(income <= 8350)
			{
				tax = income *0.1;
			}
			else if(income <= 33950)
			{
				tax = 8350*0.1+(income-8350)*0.15;
			}
			else if(income <= 68525)
			{
				tax = 8350*0.1+25600*0.15+(income-33950)*0.25;
			}
			else if(income <= 104425)
			{
				tax = 8350*0.1+25600*0.15+(68525-33950)*0.25+(income-68525)*0.28;
			}
			else if(income <= 186475)
			{
				tax = 8350*0.1+25600*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(income-104425)*0.33;
			}
			else
			{
				tax = 8350*0.1+25600*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(186475-104425)*0.33+(income-186475)*0.35;
			}
		}
		else if(status == 3)
		{
			if(income <= 11950)
			{
				tax = income *0.1;
			}
			else if(income <= 45500)
			{
				tax = 11950*0.1+(income-11950)*0.15;
			}
			else if(income <= 117450)
			{
				tax = 11950*0.1+(45500-11950)*0.15+(income-45500)*0.25;
			}
			else if(income <= 190200)
			{
				tax = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(income-117450)*0.28;
			}
			else if(income <= 372950)
			{
				tax = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(income-190200)*0.33;
			}
			else
			{
				tax = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(372950-190200)*0.33+(income-372950)*0.35;
			}
		}
		else
		{
			System.out.println("Error:invalid status");
			System.exit(0);
		}
		System.out.println("You should pay "+tax+" for tax.");*/
		
		//3-14
		/*System.out.println("Enter 0 or 1:");
		int guess = input.nextInt();
		double ran = Math.random();
		if((ran>=0.5&&guess==1)||(ran<0.5)&&guess==0)
			System.out.println("Right");
		else
			System.out.println("Wrong");*/
		
		//3-15
		/*System.out.println("Enter a number (3 digits):");
		int chosen = input.nextInt();
		int lot = (int)(1000*Math.random());
		System.out.println("The chosen number is "+lot);
		int money = 0;
		int c1 = chosen/100;
		int c2 = (chosen/10)%10;
		int c3 = chosen%10;
		
		int l1 = lot/100;
		int l2 = (lot/10)%10;
		int l3 = lot%10;
		if(lot==chosen)
		{
			money = 10000;
		}
		else if((c1==l1)&&(c2==l3)&&(c3==l2)||(c1==l3)&&(c2==l2)&&(c3==l1)||(c1==l2)&&(c2==l1)&&(c3==l3)||(c1==l2)&&(c2==l3)&&(c3==l1)||(c1==l3)&&(c2==l1)&&(c3==l2))
		{
			money = 3000;
		}
		else if((c1==l1)||(c1==l2)||(c1==l3)||(c2==l1)||(c2==l2)||(c2==l3)||(c3==l1)||(c3==l2)||(c3==l3))
		{
			money = 1000;
		}
		else
		{
			System.out.println("Sorry,no match.");
			System.exit(0);
		}
		System.out.println("Congratulations! You win "+money+" dollars.");*/
		
		//3-17
		/*System.out.println("Scissors(0),rock(1),paper(2):");
		int man = input.nextInt();
		double dran = Math.random();
		int ran = (int)(100*dran);
		int flag = 0;
		
		if((ran<33)&&(man==1)||(ran>67)&&(man==0)||(ran>33)&&(ran<67)&&(man==2))
			flag = 1;
		else if((ran<33)&&(man==0)||(ran>67)&&(man==2)||(ran>33)&&(ran<67)&&(man==1))
			flag = 2;
		else
			flag = 3;
		String answer = "";
		switch(flag)
		{
		case 1:
			answer = "You win!";
			break;
		case 2:
			answer = "It's a draw.";
			break;
		case 3:
			answer = "You lose...";
			break;
		}
		System.out.println(answer);*/
		
		//3-18
		/*String syear = JOptionPane.showInputDialog("Enter a year.");
		int year = Integer.parseInt(syear);
		if(((year%4==0)^(year%100==0)) || (year%400==0))
		{
			JOptionPane.showMessageDialog(null, "It's a leap year.");
		}
		else
			JOptionPane.showMessageDialog(null, "It's not a leap year.");*/
		
		//3-19
		/*System.out.println("Enter three edges:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int temp;
		if(num2>num3)
		{
			temp=num2;
			num2=num3;
			num3=temp;
		}
		if(num1>num2)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num2>num3)
		{
			temp=num2;
			num2=num3;
			num3=temp;
		}
		System.out.println("Can edges "+num1+", "+num2+" and "+num3+" form a triangle? "+((num1+num2)>num3));*/
		
		//3-20
		System.out.println("Enter the temperature in Fahrenheit:");
		double tem = input.nextDouble();
		if(((tem+58)>0)&&(tem<41))
		{}
		else
		{
			System.out.println("The input value is invalid.");
			System.exit(0);
		}
		System.out.println("Enter the wind speed miles per hour:");
		double speed = input.nextDouble();
		
		if(speed>=2)
		{
			double v = Math.pow(speed, 0.16);
			double chill = 35.74+0.6215*tem-35.75*v+0.4275*v*tem;
			System.out.println("The wind chill index is "+chill);
		}
		else
			System.out.println("The input value is invalid.");
	}

}
