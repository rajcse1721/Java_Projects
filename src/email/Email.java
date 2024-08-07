package email;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "xyz.com";
	private int mailBoxCapacity = 5;
	private String alternateEmail;

	// constructor to accept first and lastname .
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// call a method asking for department
		this.department = setDepartment();

		// call a method that return a random password
		this.password = randomPassword(8);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}

	// department
	private String setDepartment() {
		System.out.println(
				"Department code \n1 for Development\n2 for Testing\n3 for Human Resources\n0 for none\nEnter the Department code");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice == 1) {
			return "Dev";
		} else if (depChoice == 2) {
			return "QA";
		} else if (depChoice == 3) {
			return "HR";
		} else
			return "Not assigned";
	}

	// Generate randoem Password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	// set the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfos() {
		return "Display Employee Info: " + firstName + " " + lastName + "\nCompany Email: " + email
				+ "\nGenerated Password: " + password + "\nMailBox capacity: " + mailBoxCapacity + "mb";
	}

}
