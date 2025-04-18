package learning.interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		Poet p=new Poet();
		p.write("Twinkle twinkle Littile Star");
		p.read();
	}

}

interface Reading{
	public void read();
	}
interface Writing{
	
	public String INKCOLOR= " Blue ";
	
	public void write (String text);
}
class Poet implements Writing,Reading
{
	public void write(String text)//method overriding
	{
		System.out.println("color of text is" + INKCOLOR);
	}
	public void read()
	{
		System.out.println("Reading Poem");
	}
}
