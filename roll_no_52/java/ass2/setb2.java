import java.util.Scanner;
class CricketPlayer
{
	String name;
	int noOflnnings;
	int noOfTimesNotOut;
	int totalRuns;
	double batAvg;
	public CricketPlayer(String name,int noOflnnings,int noOfTimesNotOut,int totalRuns)
	{
	  this.name=name;
	  this.noOflnnings=noOflnnings;
	  this.noOfTimesNotOut=noOfTimesNotOut;
	  this.totalRuns=totalRuns;
	  this.batAvg=avg(totalRuns,noOflnnings-noOfTimesNotOut);
	  
	}
	public static double avg(int totalRuns,int numOuts)
	{
	 if(numOuts==0)
	 {
	 return 0.0;
	 }
	 return(double)totalRuns / numOuts;
	 
	}
	public static void sort(CricketPlayer[] players)
	{
	  for(int i=0;i<players.length-1;i++)
	  {
	   for(int j=0;j<players.length-i-1;j++)
	   {
	   if(players[j].batAvg<players[j+1].batAvg)
	   {
	    CricketPlayer temp=players[j];
	    players[j]=players[j+1];
	    players[j+1]=temp;
	   }
	  }
	}
	}
	public static void displayPlayers(CricketPlayer[] players)
	{
	System.out.println("players detailed (Sorted by bating Average):");
	System.out.println(".............................................................");
	for (CricketPlayer player:players)
	{
	System.out.println("Name."+player.name);
	System.out.println("Bating avergae :"+player.batAvg);
	System.out.println("Total runs."+player.totalRuns);
	System.out.println("Numbers of innings ;"+player.noOflnnings);
	System.out.println("number of time not out :"+player.noOfTimesNotOut);
	System.out.println("..................................................................");
	
	}
	}
}
public class setb2
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the numbers of players :");
  int n=scanner.nextInt();
  
  CricketPlayer[] players=new CricketPlayer[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter the detail of students "+(i+1)+":");
   System.out.println("Name.");
   String name=scanner.next();
   System.out.println("Numbers of innings:");
   int innings=scanner.nextInt();
   System.out.println("Numers of Times not out :");
   int notOut=scanner.nextInt();
   System.out.println("Totals Runs :");
   int runs=scanner.nextInt();
players[i]=new CricketPlayer(name,innings,notOut,runs);
   
  }
  CricketPlayer.sort(players);
  CricketPlayer.displayPlayers(players);
 }
}
