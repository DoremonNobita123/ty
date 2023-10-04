import java.util.Scanner;
public class menu
{
public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("...This is menu...");
 int choice;
 do{
    System.out.println("1)Calculate volume of cylinder:");
    System.out.println("2)find the factorial of given number:");
    System.out.println("3)Check armstrong or not:");
    System.out.println("4)Exit:");
    System.out.println("5)Enter your choice:");
    choice=sc.nextInt();
    switch(choice)
    {
     case 1:
     	   System.out.println("Enter the height :");
     	   int height=sc.nextInt();
     	   System.out.println("Enter the radious :");
     	   int r=sc.nextInt();
     	   double volume=3.142*r*r*height;
     	   System.out.println(" Volume ofcylinder:"+volume);
     	   break;
     case 2:
     	   System.out.println("Enter the element :");
     	   int num=sc.nextInt();
     	   int fact=1;
     	   for(int i=1;i<num;i++)
     	   {
     	   fact*=i;
     	   }
     	   System.out.println("Factorial of"+num+":"+fact);
     	   break;
     case 3:
           System.out.println("Enter the number:");
           int armstrong=sc.nextInt();
           int originalnum=armstrong;
           int sum=0;
           while(armstrong>0)
           {
            int digit=armstrong%10;
            sum+=Math.pow(digit,3);
            armstrong/=10;
            
           }
           if(sum==originalnum)
           {
           System.out.println(originalnum+"is an armstrong number.");
           }else{
           System.out.println(originalnum+"is not a armstrong.");
           }break;
     case 4:
     	    System.out.println("exit");
     	    break;
     default :
             System.out.println("Invalid choice please select proper choice :");
    }
   } while(choice!=4);
    sc.close();
   
 }
}
