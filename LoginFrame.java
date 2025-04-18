package learning.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JPasswordField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1037, 765);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(148, 175, 233));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Userid");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(207, 156, 68, 76);
		contentPane.add(lblNewLabel);
		
		txtid = new JTextField();
		txtid.setBounds(308, 180, 146, 36);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.setBackground(new Color(0, 255, 255));
		
		btnsubmit.setBounds(308, 405, 164, 76);
		contentPane.add(btnsubmit);
		
		JLabel lblNewLabel_1 = new JLabel("Password\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(190, 243, 104, 45);
		contentPane.add(lblNewLabel_1);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(308, 247, 146, 45);
		contentPane.add(txtpass);
	}
}
