class Employee{
private int id;
private String name;
private String deptName;
private double salary;
private static int objectCount=0;

public Employee()
 {
	objectCount++;
	this.id=0;
	this.name="";
	this.deptName="";
	this.salary=0.0;
	
 }
public Employee(int id,String name,String deptName,double salary)
{
	this();
	this.id=id;
	this.name=name;
	this.deptName=deptName;
	this.salary=salary;	
}
public static int getObjectCount(){
return objectCount;

}
public void display()
{
	System.out.println("Employee id:"+id);
	System.out.println("Employee name :"+name);
	System.out.println("Departmengt :"+deptName);
	System.out.println("Salary :"+salary);
	
}
}

public class ass1
{
 public static void main(String[] args)
 {
 Employee emp1=new Employee(1,"shavan","hr",50000.0);
 System.out.println("Object count"+Employee.getObjectCount());
 emp1.display();
 System.out.println();
 Employee emp2=new Employee(2,"Aman ","IIT",250000.0);
 System.out.println("Object count"+Employee.getObjectCount());
 emp2.display();
 }
}
