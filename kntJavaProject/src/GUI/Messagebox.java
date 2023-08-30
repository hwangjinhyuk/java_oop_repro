package GUI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Messagebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner (System.in);
		System.out.print("Enter Username: ");
		String username=sc.nextLine();
		System.out.print("Enter Password: ");
		String pw = sc.next();*/
		
		String username="Admin";
		String pw="123!@#";
		if (username.equals("Admin") && pw.equals("123!@#"))
			JOptionPane.showMessageDialog(null, "Login Sucessfully");
		
		else 
			JOptionPane.showMessageDialog(null, "Invaild login", "login error", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invaild login", "login error", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invaild login", "login error", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invaild login", "login error", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invaild login");
		
		int option = JOptionPane.showConfirmDialog(null, "Do another yes/no?");
		if (option ==0)
			JOptionPane.showConfirmDialog(null, "Do you remove item?", "Delete title", JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
		else if (option ==1)
			JOptionPane.showMessageDialog(null, "No");
		else if (option == 2)
			JOptionPane.showMessageDialog(null, "Cancel");
		
		int yes = JOptionPane.YES_OPTION;
		int no = JOptionPane.NO_OPTION;
		int cancel = JOptionPane.CANCEL_OPTION;
		JOptionPane.showMessageDialog(null, yes+" "+ no+ " "+cancel);
		
		String name = JOptionPane.showInputDialog(null, "Enter your name");
		String age = JOptionPane.showInputDialog(null, "Enter your age", "Age title",JOptionPane.INFORMATION_MESSAGE);
		
		if (name.equals("Admin") && age.equals("34"))
			JOptionPane.showMessageDialog(null, "Login sucessfully");

	}

}
