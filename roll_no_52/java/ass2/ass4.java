import java.util.Scanner;
public class ass4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your full name(first middle last): ");
String firstName=sc.next();
String middleName=sc.next();
String lastName=sc.next();
middleName=middleName.substring(0,1).toUpperCase()+middleName.substring(1);
System.out.println("Formatted name:"+lastName+" "+firstName+" "+middleName);
sc.close();

}
}
