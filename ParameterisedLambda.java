package learning.lambda;
interface Playing1{
	void play(String sportsName);
}
interface Singing{
	void sing(String singerName,String type);
}
public class ParameterisedLambda
{
public static void main(String[] args) 
{
	//Playing1 p=(sportsName)->{
	//System.out.println("Playing "+sportsName);	
	//};
	Playing1 p=sportsName->System.out.println("Playing "+sportsName);	
		
	//method accepting one parameter so we can skip()	
	p.play("Cricket");//method calling
	
	//creating Lambda expression for singing <<interface>>
      Singing s=(name,type)->
		System.out.println(name+"sings "+type +" song");
	
	s.sing("Anoop Jalota","Classical ");
}
}
