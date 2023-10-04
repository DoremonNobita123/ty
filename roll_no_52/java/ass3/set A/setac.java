import java.util.Scanner;
interface Operation
{
 void input();
 void output();
 
}
class Cylinder implements Operation
{
 double radius;
 double height;
 public void input()
 {
 Scanner s=new Scanner(System.in);
 System.out.println("Entyer teh radius:");
 radius=s.nextDouble();
 System.out.println("Entyer teh height:");
 height=s.nextDouble();
 
 }
 public void output()
 {
  double area=(2*3.14*radius*height)+(2*3.14*radius*height);
  double volume=3.142*radius*radius*height;
  System.out.println("Area of Cylinder:"+area);
  System.out.println("Volume of Cylinder:"+volume);
  
 }
 }
 public class setac{
 public static void main(String[] args)
 {
 Cylinder c=new Cylinder();
 c.input();
 c.output();
 }
 }

