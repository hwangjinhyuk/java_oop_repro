package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame ();
		frame.setVisible(true);
		frame.setSize(500,350);
		frame.setLocation(new Point (200,100));
		frame.setTitle("Window Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setIconImage(new ImageIcon("src/img1.jpg").getImage ());	
		frame.setLayout(new BorderLayout ());
		
		JButton btnlogin = new JButton();
	    btnlogin.setText("Login Button");
	    btnlogin.setBackground(Color.blue);
	    frame.add(btnlogin,BorderLayout.EAST);

	    JButton btncancel = new JButton();
	    btncancel.setText("Cancel");
	    btncancel.setBackground(Color.red);
	    frame.add(btncancel,BorderLayout.NORTH);
	    
	    JButton btncancel1 = new JButton();
	    btncancel1.setText("Cancel");
	    btncancel1.setBackground(Color.red);
	    frame.add(btncancel1,BorderLayout.SOUTH);
	    
	    JTextField txtname = new JTextField();
	    txtname.setText("Admin User");
	    txtname.setColumns(10);
	    txtname.setBackground(Color.blue);
	    frame.add(txtname,BorderLayout.WEST);
	    
	    JButton btnclick = new JButton();
	    btnclick.setText("Click Me");
	    btnclick.setBackground(Color.yellow);
	    frame.add(btnclick,BorderLayout.CENTER);
	    
	    
	   
	}

}
