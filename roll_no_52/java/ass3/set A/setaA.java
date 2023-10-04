import java.util.Scanner;
class Continent{
String cName; 
Continent(String cName){
this.cName=cName;
}
}

class Country extends Continent
{
String coName;
Country(String cName,String coName)
{
super(cName);
this.coName=cName;
}
}

class State extends Country
{
String stateName;
State(String cName,String coName,String stateName){
super(cName,coName);
this.stateName=stateName;
}
}
public class setaA{
public static void main(String[] args)
{
Scanner sc=new Scanner(System .in);
System.out.print("Enter the continents name :");
String cName=sc.nextLine();

System.out.print("Enter the country name :");
String coName=sc.nextLine();

System.out.print("Enter the state name :");
String stateName=sc.nextLine();

State s=new State(cName,coName,stateName);
System.out.print("Place :"+s.stateName);
System.out.print("State :"+s.coName);
System.out.print("Country :"+s.cName);
System.out.print("Contienents :"+s.cName);

}
}
