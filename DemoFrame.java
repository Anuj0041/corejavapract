package learning.gui;
import java.awt.*;
//color class //belong to awt package

//Font class
//Font(String fontname,int style,int size)constructor
public class DemoFrame extends Frame
{
	Color c;//instance variaable
	TextField txtname,txtage;//instance variable
	Label lblname,lblage;
	Button btnsubmit;
	Font f;
	public void createComponents()
	{
		f=new Font("Arial",Font.BOLD,20);
		//create objects of the components and add it into frames
		lblname=new Label("Name");//label class object using parameterised constructor
		lblname.setFont(f);
		lblname.setForeground(Color.GREEN);
		add(lblname);//it is used to add Label on the frame
		txtname=new TextField(30);//create object of Textfield using pc
		txtname.setBackground(Color.GRAY);
		txtname.setBackground(Color.RED);
		add(txtname);
		lblage=new Label("Age");
		lblage.setFont(f);
		lblage.setForeground(Color.GREEN);
		add(lblage);
		txtage=new TextField(30);
		txtage.setBackground(Color.GRAY);
		txtage.setBackground(Color.RED);
		add(txtage);
		btnsubmit=new Button("Submit");//create object of Button using pc
		add(btnsubmit);
	}
	public DemoFrame() 
	{
	setTitle("MyFrame");
	//setBackground(Color.cyan);
	c=new Color(240,106,218);// color(int r,int g,int b,)range will be from 0 to 255
	setBackground(c);
	FlowLayout layout=new FlowLayout();
	setLayout(layout);//set layout is used to set the layout of the frame
	createComponents();//calling method
		
	}
	
	public static void main(String[] args)
	{
		DemoFrame frame=new DemoFrame();
		
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	

}
