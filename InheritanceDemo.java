package learning.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		CricketPlayer cp=new CricketPlayer();
		cp.setPlayer("Virat Kohli","India");
		cp.setCP("All Rounder", 10);
		cp.getPlayer();
		cp.getCP();
		FootBallPlayer fb=new FootBallPlayer();
		fb.setPlayer("Ronaldo", "Portgal");
		
		fb.setFP("Attacker",18);
		fb.getPlayer();
		
		
		
	}
	
}
class Player
{
 String name,country;
public void setPlayer(String name,String country)
{
	this.name=name;
	this.country=country;
	
}
public void getPlayer()
{
	System.out.println("Player Name is "+name+"And country is "+country);
}
}
class CricketPlayer extends Player
{
	private String type;
	private int jersyNumber;
	public void setCP(String type,int jersyNumber)
	{
		this.type=type;
		this.jersyNumber=jersyNumber;
}
	public void getCP()
	{
		System.out.println(name+ " is "+type+" and his/her jersy number is " +jersyNumber);
	}

}


class FootBallPlayer extends Player
{
	
	
	private String type;
	private int jersyNumber;
	public void setFP(String type,int jersyNumber)
	{
		this.type=type;
		this.jersyNumber=jersyNumber;
}
	public void getFP()
	{
		System.out.println(name+ " is "+type+" and his/her jersy number is " +jersyNumber);
	}
}

