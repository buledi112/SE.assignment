import java.util.*;

class Calculator
{
	void add()
	{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter value one");
			int value1=obj.nextInt();
			System.out.println("Enter value two");
			int value2=obj.nextInt();
			int c=value1+value2;
			System.out.println("Addition is :"+c);
			
	}
	void sub()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter value one");
		int value1=obj.nextInt();
		System.out.println("Enter value two");
		int value2=obj.nextInt();
		int c=value1-value2;
		System.out.println("Subtraction is:"+c);
	}
	void multi()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter value one");
		int value1=obj.nextInt();
		System.out.println("Enter value two");
		int value2=obj.nextInt();
		int c=value1*value2;
		System.out.println("Multiplication is:"+c);
	}
	void divi()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter value one");
		int value1=obj.nextInt();
		System.out.println("Enter value two ");
		int value2=obj.nextInt();
		int c=value1/value2;
		System.out.println("Division is:"+c);
	}
	void rem()
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter value one");
	int value1=obj.nextInt();
	System.out.println("Enter value two");
	int value2=obj.nextInt();
	int c=value1%value2;
	System.out.println("Reminder is:"+c);
	}
}
class Loops_series
{
	void factoril()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=obj.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=i*fact;
			
		}
		System.out.println("factorial is:"+fact);
	}
	void even_series()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=obj.nextInt();
		for(int i=1;i<=num;i+=2)
		{
			System.out.print(i+"\t");
		}
	}
		void odd_series()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter number :");
			int num=obj.nextInt();
			for(int i=0;i<=num;i+=2)
			{
				System.out.println(i+"\t");
			}
		}
		void fibonic()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Number:");
			int num=obj.nextInt();
			int fib;
			int n1=0;
			int n2=1;
			for(int i=1;i<=num;i++)
			{
				System.out.println(n1+"\t");
				fib=n1+n2;
				n1=n2;
				n2=fib;
				
				
				
			}
		}
		void prime_series()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter number");
			int num=obj.nextInt();
			int k=1;
			for(int i=2;i<num;i+=1)
			{
				for(int j=2;j<=i;j+=1)
				{
				if(num%i==0)
			
					k=2;
					break;
				
				}
		
			
			}
				if(k==2)
					System.out.println("it is not prime number");
				else
					System.out.println(":it is prime number");
			
		}
		void table()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Table number:");
			int tab=obj.nextInt();
			System.out.println("Enter counter number");
			int count=obj.nextInt();
			for(int i=0;i<=count;i++)
			{
				System.out.println(tab+"*"+i+"="+tab*i);
			}

		}
		void table_series()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter row");
			int row=obj.nextInt();
			System.out.println("Enter column");
			int column=obj.nextInt();
			for(int i=1;i<=row;i++)
			{
				
				for(int j=1;j<=column;j++)
				{
					System.out.print(j*i+"\t");
				}
				System.out.println();
				
			}
		}	
}
class Marksheet
{
	void obtain()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Java Marks:");
		int java=obj.nextInt();
		System.out.println("Enter C++ Marks");
		int cplus=obj.nextInt();
		System.out.println("Enter C Marks:");
		int c=obj.nextInt();
		 System.out.println("Enter VB");
		 int vb=obj.nextInt();
		 System.out.println("Enter Orcle");
		 int orcle=obj.nextInt();
		 
		 int obtain=java+cplus+c+vb+orcle;
		 System.out.println("Total marks is::"+500);
		 
		 System.out.println("Obtain marks is:"+obtain);
		 per(obtain,500);
	}
	void per(int obt,int total)
	{
	int percentage=obtain*100/total;
	System.out.println("Percentage is:"+percentage);
	grade(percentage);
	}
	void grade(int p)
	{
		
		if(p>=90 && p<=100)
			System.out.println("A1 Grade:");
		if(p>=80 && p<90)
			System.out.println("A Grade");
		if(p>=60 && p<80)
			System.out.println("B grade");
		if(p>=40&& p<60)
			System.out.println("C grade");
		if(p>=0 && p<=39)
			System.out.println("You are fail");
	}
	
}	
class Unit
{
	void feet_inches()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Feets");
		int feet=obj.nextInt();
		int inches=feet*12;
		System.out.println("Inches are :"+inches);
	}
	void inches_feet()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter inches ");
		int inches=obj.nextInt();
		int feet=inches/12;
		System.out.println("Feets are :"+feet);
	}
	void kilo_gram()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Kilo:");
		int kilo=obj.nextInt();
		int gram=kilo*1000;
		System.out.println("Grams are :"+gram);
	}
	void gram_kilo()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter grams: ");
		int grams=obj.nextInt();
		int kilo=grams/1000;
		System.out.println("Kilos are :"+kilo);
	}
}

class Mini
{
	public static void main(String[] args)
	{ 
		Scanner obj=new Scanner(System.in);
		Calculator c=new Calculator(); 
		Loops_series l=new Loops_series();
		Marksheet m=new Marksheet();
		Unit u=new Unit();
		do{
		System.out.println("1.Calculator:");
		System.out.println("2.Loop Series:");
		System.out.println("3.Marksheet:");
		System.out.println("4.Unit Converter:");
		int num=obj.nextInt();
		if(num==1)
		{
			System.out.println("1.Manual Calculator:");
			System.out.println("2.Operational:");
			System.out.println("Enter your choice");
			int choice=obj.nextInt();
			if(choice==1)
			{
				System.out.println("1.Addition:");
				System.out.println("2.Subtraction:");
				System.out.prinltn("3.Multiplication:");
				System.out.println("4.Division:");
				System.out.prinltn("5.Reminder");
				System.out.prinltn("Enter your Selection:");
				int select=obj.nextInt();
				if(select==1)
				{
					c.add();
				}
				if(select==2)
				{
					c.sub();
				}
				if(select==3)
				{
					c.multi();
				}
				if(select==4)
				{
					c.divi();
				}
				if(select==5)
				{
					c.rem();
				}
				
			}
			if(choice==2)
			{
				
				System.out.prinltn("+");
				System.out.println("-");
				System.out.println("*");
				System.out.prinltn("/");
				System.out.prinltn("%");
				System.out.println("Enter your Operation:");
				char ch=obj.next();
				if(ch=='+')
				{
					c.add();
				}
				if(ch=='-')
				{
					c.sub();
				}
				if(ch=='*')
				{
					c.multi();
				}
				if(ch=='/')
				{
					c.divi();
					
				}
				if(ch=='%')
				{
					c.rem();
				}
					
			}
		}
		if(num==2)
		{
			System.out.prinltn("1.factorial");
			System.out.prinltn("2.fibonic");
			System.out.println("3.Even");
			System.out.println("4.Odd");
			System.out.println("5.table");
			System.out.println("6.table series");
			System.out.println("7.Prime series");
			System.out.println("Enter Your Choice:");
			int selection=obj.nextInt();
			if(selection==1)
			{
				l.fact();
			}
			if(selection==2)
			{
				l.fib();
			}
			if(selection==3)
			{
				l.even_series();
			}
			if(selection==4)
			{
				l.odd_series();
			}
			if(selection==5)
			{
				l.table();
			}
			if(selection==6)
			{
				l.table_series();
			}
			if(selection==7)
			{
				l.prime_series();
			}
		}
		if(num==3)
		{
			m.obtain();
			m.per();
			m.grade();
		}
		if(num==4)
		{
			System.out.println("1.Feet To Inches");
			System.out.println("2.Inches To Feet");
			System.out.println("3.Kilo to Grams");
			System.out.println("4.Grams To kilo");
			System.out.println("Enter your unit");
			int con=obj.nextInt();
			if(con==1)
			{
				u.feet_inches();
			}
			if(con==2)
			{
				u.inches_feet();
			}
			if(con==3)
			{
				u.kilo_gram();
			}
			if(con==4)
			{
			u.gram_kilo();	
			}
		}
		System.out.println("Do You want again another option yes or no");
		char cho=obj.next();
		
	}while(cho=='Y' || cho=='y');
	
	

	}
}
	











