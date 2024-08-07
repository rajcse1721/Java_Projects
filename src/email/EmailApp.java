package email;

public class EmailApp {

	public static void main(String[] args) {
		Email Emp1 = new Email("Tarun","Ketini");
		System.out.println(Emp1.showInfos());
		
//		Emp1.setAlternateEmail("xyz@gmail.com");
//		System.out.println("Alternate email : " + Emp1.getAlternateEmail());
//		
//		Emp1.changePassword("tarun.k@xyz.com");
//		System.out.println("changed password is " + Emp1.getPassword());
	}

}
