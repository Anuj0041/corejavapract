package learning.inheritance;

public class Super_Constructor {
	public static void main(String[] args) {
		WhiteBoard wb=new WhiteBoard(200,400,"we are learning java");
		wb.show();
		WhiteBoard w=new WhiteBoard();//using default constructor
	}

}
class Board
{
	private int width,height;
	public Board()
	{
		System.out.println("In default constructor");
	}
	public Board(int width,int height)
	{
		this.width=width;
		this.height=height;
		System.out.println("In parametrised constructor of board class");
	}
	public void show()
	{
		System.out.println("width and height of board is "+width+ " "+height);
	}
}

class WhiteBoard extends Board
{
	String contents;
	public WhiteBoard()
	{
		System.out.println("In white board default constructor");
	}
	public WhiteBoard(int width,int height,String contents)
	{
		super(width,height);//calling super class parameterised constructor
		this.contents=contents;
		System.out.println("In parameterised constructor of WhiteBoard class ");
	}
	public void show()
	{
		super.show();
		System.out.println("contents of whiteBoard is " +contents);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}