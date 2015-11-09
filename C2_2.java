package chapter2;

import java.util.*;

public class C2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//2.20
		/*System.out.println("Enter x1 and y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2 and y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double a = Math.pow((x1-x2), 2);
		double b = Math.pow((y1-y2), 2);
		System.out.println("The distnce of the two points is "+Math.pow((a+b),0.5));*/
		
		//2.21
		/*System.out.println("Enter x1 and y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2 and y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Enter x3 and y3:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a1 = Math.pow((x1-x2), 2);
		double b1 = Math.pow((y1-y2), 2);
		double side1 = Math.pow((a1+b1),0.5);
		double a2 = Math.pow((x2-x3), 2);
		double b2 = Math.pow((y2-y3), 2);
		double side2 = Math.pow((a2+b2),0.5);
		double a3 = Math.pow((x1-x3), 2);
		double b3 = Math.pow((y1-y3), 2);
		double side3 = Math.pow((a3+b3),0.5);
		
		double s = (side1+side2+side3)/2;
		double area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
		area = ((int)(10*area))/10.0;
		
		System.out.println("The area of the triangle is "+area);*/
		
		//2.22
		/*System.out.println("Enter the side:");
		double side = input.nextDouble();
		
		double area = 3*Math.pow(3, 0.5)*side*side/2;
		area = ((int)(10000*area))/10000.0;
		System.out.println("The area of the hexagon is "+area);*/
		
		//2.23
		/*System.out.println("Enter v0,v1,and t:");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double acc = (v1-v0)/t;
		acc=((int)(10000*acc))/10000.0;
		System.out.println("The average acceleration is "+acc);*/
		
		//2.24
		/*System.out.println("Enter v and a:");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = (v*v)/(2*a);
		length = ((int)(1000*length))/1000.0;
		System.out.println("The minimum runway length for this airplane is "+length);*/
		
		//2.25
		System.out.println("Enter the timezong offset to GMT");
		int offset = input.nextInt();
		long totalMilliseconds=System.currentTimeMillis();
		long totalsecond=totalMilliseconds/1000;
		long totalminute=totalsecond/60;
		long currentsecond=totalsecond%60;
		long totalhour=totalminute/60+offset;
		long currentminute=totalminute%60;
		long currenthour=totalhour%24;
		
		System.out.println(currenthour+":"+currentminute+":"+currentsecond+"GMT");

	}

}
