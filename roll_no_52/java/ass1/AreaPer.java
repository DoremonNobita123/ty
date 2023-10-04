import java.util.Scanner;
public class AreaPer
{
public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the lenght of rectangle :");
 float lenght=sc.nextFloat();
 
 System.out.println("Enter the breadth of rectangle:");
 float breadth=sc.nextFloat();
 float area=lenght*breadth;
 float perimeter=2*(lenght+breadth);
 System.out.println("Area of rectangle ="+area);
 System.out.println("perimeter of rectangle ="+perimeter);
 sc.close();
 }
}
