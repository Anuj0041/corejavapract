package learning.enums;

public class EnumDemo {
public static void main(String[] args) {
	TrafficSignal ts=new TrafficSignal(Colors.RED);
	ts.showMeaning();
}
}

class TrafficSignal
{
	Colors color;//enum reference variables
	public TrafficSignal(Colors color) 
	{
		this.color=color;
	}
	public void showMeaning() 
	{
		switch(color)
		{
		case RED:
			System.out.println("Stop");
			break;
		case GREEN:
			System.out.println("Go");
			break;
		case YELLOW:
			System.out.println("Ready to go");
			break;
			default:
				System.out.println("Does not belong to traffic signal color");
		}
	}
}
