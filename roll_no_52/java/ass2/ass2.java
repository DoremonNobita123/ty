import java.util.Scanner;
class Student
{
	private int rollno;
	private String name;
	private double percentage;
	public Student(int rollno,String name,double percentage)
{
	this.rollno=rollno;
	this.name=name;
	this.percentage=percentage;
}
public int getRollno()
{
	return rollno;
}
public String getName()
{
	return name;
}

public double getPercentage()
{
	return percentage;
}
public static void sortStudent(Student[] students)
{
  for(int i=0;i<students.length-1;i++)
  {
   for(int j=0;j<students.length-i-1;j++)
   {
     if(students[j].getPercentage() < students[j+1].getPercentage())
     {
     Student temp=students[j];
     students[j]=students[j+1];
     students[j+1]=temp;
     }
   }
  }
}
}
public class ass2
{
  public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students :");
	int n=sc.nextInt();
	Student[] students=new Student[n];
	for(int i=0;i<n;i++)
	{
  	System.out.println("Enter the details of students :"+(i+1));
  	System.out.println("Roll no.:");
  	int rollNo=sc.nextInt();
  	System.out.println("Name:");
  	String name=sc.next();
  	System.out.println("percentage  :");
  	double percentage=sc.nextDouble();
  	students[i]=new Student(rollNo,name,percentage);
	}
	Student.sortStudent(students);
	System.out.println("Enter the number of students :");
      	 for(Student student:students)
	  {
		System.out.println("roll number :"+student.getRollno());
		System.out.println("Name :"+student.getName());
		System.out.println("Percentage :"+student.getPercentage());
		System.out.println();
	  }

 }
}
