import java.util.Scanner;
class facebook  
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to facebook! pleace Register");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name");
		String firstName = sc.next();

		System.out.println("Enter your sir Name");
		String sirName = sc.next();

		System.out.println("Enter your mobile Number");
		long mobileNumber = sc.nextLong();

		System.out.println("Enter your Email Id");
		String emailId = sc.next();

		System.out.println("Enter New password");
		String newpassword = sc.next();

		System.out.println("Enter your DOB");
		String dateOfBirth = sc.next();

		System.out.println("Enter your Gender");
		String gender = sc.next();

		System.out.println("Enter your salary");
		double salary = sc.nextDouble();

		System.out.println("Enter your first initials");
		String firstInitials = sc.next();

		System.out.println("Enter your Favorite qoute");
		sc.nextLine();
		String qoute = sc.nextLine();

		System.out.println("Are you Alive?");
		boolean status = sc.nextBoolean();


		System.out.println("\n________________________________\n your deatils are listed below\n" +
			"First name : " + firstName + "\n" +  
			"sir name : " + sirName + "\n" + 
			"mobile Number : " + mobileNumber + "\n" + 
			"Email Id : " + emailId + "\n" + 
			"password: " + newpassword + "\n" + 
			"date of Birth : " + dateOfBirth + "\n" + 
			"salary : " + salary + "\n" + 
			"First Initials : " + firstInitials + "\n" + 
			"qoute : " + qoute + "\n" +
			"Are you Alive : " + status);

		     sc.close();
	}

}
