package learning.enums;

public class OrdinalMethodDemo {
	enum Level{
		LOW,MEDIUM,HIGH;
	}
public static void main(String[] args) 
{
	String[] message = {"Take it easy", "Be Alert","Take an action Immediately"};
Level level=Level.HIGH;
int index=level.ordinal();//return2
System.out.println("meassage level is "+level +"and meassage is"+ message[index]);

}
}
