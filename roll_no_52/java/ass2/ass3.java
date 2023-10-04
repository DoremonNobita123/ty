import java.util.Scanner;
import java.util.Arrays;
public class ass3
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int []a=new int[5];
 System.out.println("Enter 5 unsorted  array elements :");
 for(int i=0;i<a.length;i++)
 {
  a[i]=sc.nextInt();
  
 }Arrays.sort(a);
 System.out.println("sorted  array elements :");
 for(int i=0;i<a.length;i++)
 {
  System.out.println(a[i]+" ");
  
 }	
}
}
/*
import java.util.Scanner;
public class NameFormat
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your full name(first middle last): ");
String firdtName=scanner.next();
String middleName=scanner.next();
String lastName=scanner.nextInt();
middleName=middleName.substring(0,1).toUpperCase()+middleName.substring(1);
System.out.println("Formatted name:"+lastName+","+firstName+""+middleName);
sc.close();

}
}
*/
