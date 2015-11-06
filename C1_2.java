package chapter1;

public class C1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-2
		for(int i=0;i<5;i++)
		{
			System.out.println("Welcome to Java!");
		}
		
		//1-3
		System.out.println("   J     A     V     V     A");
		System.out.println("   J    A A     V   V     A A");
		System.out.println("J  J   AAAAA     V V     AAAAA");
		System.out.println(" JJ   A     A     V     A     A");
		
		//1-4
		System.out.println("a		a^2		a^3");
		System.out.println("1		1		1");
		System.out.println("2		4		8");
		System.out.println("3		9		27");
		System.out.println("4		16		64");
		
		//1-5
		System.out.println(((9.5*4.5)-(2.5*3))/(45.5-3.5));
		
		//1-6
		int k=0;
		for(int i=1;i<10;i++)
		{
			k += i;
		}
		System.out.println(k);
		
		//1-7
		double p=0;
		int flag=1;
		double pi=0;
		for(int i=0;i<100000000;i++)
		{
			p=1.0/(2*i+1);
			pi += 4*flag*p;
			flag=0-flag;
		}
		System.out.println(pi);
	}

}
