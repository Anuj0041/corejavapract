package learning.exception;
import java.awt.*;
import java.awt.event.*;
public class CalculationFrame extends Frame implements ActionListener,WindowListener
{
	private Label lblnumber,lblresult;
	private TextField txtnumber,txtresult;
	private Button btnsqrt,btnpower;
	public void createComponents()
	{
		lblnumber=new Label("Enter Number");//create object of La
		lblnumber.setBounds(30, 50,80,40);
		//lblnumber.setBackground(Color.GREEN);
		add(lblnumber);
		txtnumber=new TextField();
		txtnumber.setBounds(120,50,80,30);
		add(txtnumber);
		lblresult=new Label("Result");
		lblresult.setBounds(30,100,80,40);
		lblresult.setBackground(Color.ORANGE);
		add(lblresult);
		txtresult=new TextField();
		txtresult.setBounds(130,90,80,30);
		add(txtresult);
		btnsqrt=new Button("Sqrt");
		btnsqrt.setBounds(60, 180, 80, 40);
		btnsqrt.setBackground(Color.CYAN);
		btnsqrt.addActionListener(this);//this refered to calculation frme class object
		//RTP with interface
		//register the listener with button
		add(btnsqrt);
		btnpower=new Button("Power");
		btnpower.setBounds(160, 180, 90, 40);
		btnpower.setBackground(Color.cyan);
		btnpower.addActionListener(this);
		add(btnpower);
		
		
		
		
	}
	public void actionPerformed(ActionEvent e) 
	//overriding method of action listener
	{
		
		String caption=  e.getActionCommand();//it returns the text written on a button/Menuitem
		System.out.println(caption+"Button is being clicked");
		String num=txtnumber.getText();//it will fetch the data from textfield
	double number=Double.parseDouble(num);
	double res=0.0;
	if(caption.equalsIgnoreCase("sqrt"));
	{
		res=Math.sqrt(number);
	}
	if(caption.equals("power"))
	{
	res=Math.pow(number, number);	
	}
	String output=String.valueOf(res);//it is used to convert any datatype into string
	
	txtresult.setText(output);//setText ->set value in the text field
	
	
	}
	public CalculationFrame(String title)
	{
		this.addWindowListener(this);//this refer to object of calculation frame
		//register the WindowListener with frame
		setTitle(title);
		setSize(500,400);
		setLayout(null);//to change the default BorderLayout as null for the frame
		createComponents();
	}
public static void main(String[] args) 
{
	CalculationFrame frame=new CalculationFrame("Calculation");
	frame.setVisible(true);
}
@Override
public void windowOpened(WindowEvent e) {
	
	
}

public void windowClosing(WindowEvent e) {
	this.dispose();//to destroy the frame object from memory
	
}

public void windowClosed(WindowEvent e) {
	
	
}

public void windowIconified(WindowEvent e) {
	
	
}

public void windowDeiconified(WindowEvent e) {

	
}

public void windowActivated(WindowEvent e) {
	
	
}
public void windowDeactivated(WindowEvent e) {
	
	
}
}
