import java.util.Scanner;
class mynum
{
	private int no;
	mynum(){
	no=0;
	}
	mynum(int no)
	{
	 this.no=no;
	}
	void negative()
	{
	if(no<0)
	System.out.println(+no+"is Negative");
	}
	
	void positive()
	{
	if(no>0)
	System.out.println(+no+"is positive");
	}
	
	void zero()
	{
	if(no==0)
	System.out.println(+no+"is zero");
	}
	
	void even()
	{
	if(no%2==0)
	System.out.println(+no+"is even");
	}
	
	void odd()
	{
	if(no%2!=0)
	System.out.println(+no+"is odd");
	}
public static void main(String[] args)
 {
 	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a numer :");
	int number=sc.nextInt();
	mynum m=new mynum(number);
	m.negative();
	m.positive();
	m.zero();
	m.even();
	m.odd();
		
 }
}
