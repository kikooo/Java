package chapter3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 A simple math tool
		/*int number1 = (int)(System.currentTimeMillis()%10);
		int number2 = (int)(System.currentTimeMillis()*7 % 10);
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+" ?");
		int answer = input.nextInt();
		
		System.out.println(number1+" + "+number2+" = "+answer+" is "+(number1+number2==answer));*/
		
		//2 simple if demo
		/*System.out.println("Enter a number.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		if(a%5==0)
			System.out.println("HiFive");
		if(a%2==0)
			System.out.println("HiEven");*/
		
		//3 guess birthday
		/*Scanner input = new Scanner(System.in);
		
		String set1 = "1	3	5	7\n9	11	13	15\n17	19	21	23\n25	27	29	31";
		String set2 = "2	3	6	7\n10	11	14	15\n18	19	22	23\n26	27	30	31";
		String set3 = "4	5	6	7\n12	13	14	15\n20	21	22	23\n28	29	30	31";
		String set4 = "8	9	10	11\n12	13	14	15\n24	25	26	27\n28	29	30	31";
		String set5 = "16	17	18	19\n20	21	22	23\n24	25	26	27\n28	29	30	31";
		
		System.out.println("Is your birthday in set1?\n0 for yes and 1 for no.");
		System.out.println(set1);
		int answer = input.nextInt();
		int day = 0;
		if(answer==1)
			day += 1;
		
		System.out.println("Is your birthday in set2?\n0 for yes and 1 for no.");
		System.out.println(set2);
		answer = input.nextInt();
		if(answer==1)
			day += 2;
		
		System.out.println("Is your birthday in set3?\n0 for yes and 1 for no.");
		System.out.println(set3);
		answer = input.nextInt();
		if(answer==1)
			day += 4;
		
		System.out.println("Is your birthday in set4?\n0 for yes and 1 for no.");
		System.out.println(set4);
		answer = input.nextInt();
		if(answer==1)
			day += 8;
		
		System.out.println("Is your birthday in set5?\n0 for yes and 1 for no.");
		System.out.println(set5);
		answer = input.nextInt();
		if(answer==1)
			day += 16;
		
		System.out.println("Your birthday is "+day+"th.");*/
		
		//4 sub quiz
		/*Scanner input = new Scanner(System.in);
		int number1 = (int)(System.currentTimeMillis()%10);
		int number2 = (int)(System.currentTimeMillis()*7 % 10);
		int ans = 0;
		if(number1>=number2)
		{
			System.out.print("What is "+number1+" - "+number2+" ?");
			ans = number1-number2;
		}
		else
		{
			System.out.print("What is "+number2+" - "+number1+" ?");
			ans = number2-number1;
		}
		int answer = input.nextInt();
		if(answer == ans)
			System.out.println("True");
		else
			System.out.println("False");*/
		
		//5 bmi
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double pound = input.nextDouble();
		double kilo = 0.45359237*pound;
		
		System.out.println("Enter height in inches:");
		double inch = input.nextDouble();
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
		
		//6 tax
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your status(0 for single filer,1 for married jointedly,2 for married seperately and 3 for house hold)");
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
		
		//7 leap year
		/*System.out.println("Enter a year:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if(((year%4==0)^(year%100==0)) || (year%400==0))
		{
			System.out.println(year+" is a leap year.");
		}
		else
			System.out.println(year+" is not a leap year.");*/
		
		//8 lottery
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a number(2 digits):");
		int chosen = input.nextInt();
		int lot = (int)(100*Math.random());
		System.out.println("The chosen number is "+lot);
		int money = 0;
		if(lot==chosen)
		{
			money = 10000;
		}
		else if((chosen%10)==(lot/10)&&(chosen/10)==(lot%10))
		{
			money = 3000;
		}
		else if((chosen%10)==(lot/10)||(chosen/10)==(lot%10)||(chosen/10)==(lot/10)||(chosen%10)==(lot%10))
		{
			money = 1000;
		}
		else
		{
			System.out.println("Sorry,no match.");
			System.exit(0);
		}
		System.out.println("Congratulations! You win "+money+" dollars.");*/
		
		//9
		String set1 = "1  3  5 7\n9 11 13 15\n17 19 21 23\n25 27 29 31";
		String set2 = "2 3 6 7\n10 11 14 15\n18 19 22 23\n26 27 30 31";
		String set3 = "4 5 6 7\n12 13 14 15\n20 21 22 23\n28 29 30 31";
		String set4 = "8 9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
		String set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";
		
		int day = 0;
		int answer = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n"+set1);
		if(answer==0)
			day+=1;
		answer = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n"+set2);
		if(answer==0)
			day+=2;
		answer = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n"+set3);
		if(answer==0)
			day+=4;
		answer = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n"+set4);
		if(answer==0)
			day+=8;
		answer = JOptionPane.showConfirmDialog(null, "Is your birthday in these numbers?\n"+set5);
		if(answer==0)
			day+=16;
		
		JOptionPane.showMessageDialog(null, "Your Birthday Is "+day+" !");
		
	}

}
