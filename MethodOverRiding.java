package learning.inheritance;

public class MethodOverRiding {
public static void main(String[] args) {
	WaterTransport wt= new WaterTransport();
	wt.travel("Boat");
	AirTransport at=new AirTransport();
	at.travel("Helicopter");
	LandTransport lt=new LandTransport();
	lt.travel("Bus");
    }
    } 
class Transport
{
	public void travle(String name)
	{
		System.out.println(name+" travels");
		
	}
    }

class WaterTransport extends Transport {
	public void travel(String name)
	{
		System.out.println(name+" travels on the water");
	}
    }
class AirTransport extends Transport{
	public void travel(String name)
	{
		System.out.println(name +" fly in the sky");
	}
    }
class LandTransport extends Transport{
	public void travel(String name)
	{
		System.out.println(name+"travels on the landS");
	}
    }