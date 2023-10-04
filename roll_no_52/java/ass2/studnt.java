import java.util.Scanner;
class Symark
{
 int comp;
 int math;
 int ele;
 Symark(int comp,int math,int ele)
 {
 	this.comp=comp;
 	this.math=math;
 	this.ele=ele;
 	
 }
}
class Tymark
{

	int theory;
	int practical;
	Tymark(int theory,int practical)
	{
	 this.theory=theory;
	 this.practical=practical;
	 
	}
}
public class studnt
{
	int roll;
	String name="";
	Symark symark;
	Tymark tymark;
	studnt(int roll,String name,Symark symark,Tymark tymark)
	{
		this.roll=roll;
		this.name=name;
		this.symark=symark;
		this.tymark=tymark;
		
	}
	int ttotalmark()
	{
		return symark.comp+symark.math+symark.ele+tymark.theory+tymark.practical;
	}
	char calculate()
	{
		int totalmark=ttotalmark();
		if(totalmark>=70)
		{
		return 'A';
		}
		else if(totalmark>=60)
		{
		return 'B';
		}
		else if(totalmark>=50)
		{
		return 'C';
		}
		else if(totalmark>=40)
		{
		return 'D';
		}
		else
		{
		return 'F';
		}
	}
	void display()
	{
	 char grade=calculate();
	 System.out.println("Roll no.:"+roll);
	 System.out.println("Name.:"+name);
	 System.out.println("Total mark :"+ttotalmark());
	 System.out.println("Grade.:"+grade);
	 System.out.println();
	 
	}
	public static void main(String[] args)
	{
	 int i,n;
	 Scanner s=new Scanner(System.in);
	 System.out.print("Enter the number of student :");
	 n=s.nextInt();
	 for(i=0;i<n;i++)
	 {
	  System.out.print("Enter the detail of student :"+(i+1)+":");
	  System.out.print("Roll no.:");
	  int roll=s.nextInt();
	  System.out.print("Name :");
	  String name=s.next();
	  System.out.print("Enter Symark(COMPUTER,MATHS,ELECTRONICS):");
	  int comp=s.nextInt();
	  int math=s.nextInt();
	  int ele=s.nextInt();
	  Symark symark=new Symark(comp,math,ele);
	  System.out.print("Enter TYMARK(THEORY,PRACTICAL):");
	  int theory=s.nextInt();
	  int practical=s.nextInt();
	  Tymark tymark=new Tymark(theory,practical);
	  studnt st=new studnt(roll,name,symark,tymark);
	  st.display();
	  System.out.println();
	 }
	}
}
