package guianny_rivera_assignment02;

import javax.swing.JOptionPane;

public class Guianny_Rivera_Assginment02 {

	public static void main(String[] args) {
			String firstName;
			char middleInitial;
			String lastName;
			int age;
			double grossAnnualPay;
			double taxRate;
			double netAnnualPay;
		
				firstName = JOptionPane.showInputDialog("Enter your first name:");
			
				middleInitial = JOptionPane.showInputDialog("Enter your middle initial:").charAt(0);
	        
				lastName = JOptionPane.showInputDialog("Enter your last name:");
	        
				age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
	        
				grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your annual gross pay:"));
	        
				taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your tax rate (as a decimal):"));

	        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

	        System.out.println("Hello " + firstName + " " + middleInitial + " " + lastName);
	        System.out.println("You are " + age + " years old now!");
	        System.out.println("It's amazing that you made $" + grossAnnualPay + " this year. With a tax");
	        System.out.println("rate of " + taxRate + " you can take home $" + netAnnualPay + ".");
	}

}
