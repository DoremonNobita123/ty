import java.util.Scanner;
public class arayrev
{
public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of  elements :");
 int n=sc.nextInt();
 int[] array=new int[n];
 System.out.println("Enter the array elements:");
 for(int i=0;i<n;i++)
 {
 array[i]=sc.nextInt();
 
 }
 //System.out.println("array elements is :"+array[i]);
 System.out.println("reverse order is::");
 for(int i=n-1;i>=0;i--)
 {
 System.out.println(array[i]);
 }
 sc.close();
 }
}
