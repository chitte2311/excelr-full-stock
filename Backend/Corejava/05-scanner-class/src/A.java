import java.util.Scanner;
class A
  
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a complete token or a charecter");
		Scanner sc =new Scanner(System.in);
		String token = sc.nextLine();
		System.out.println("the token that you have entered is :|"+ token + "|");
		sc.close();
	}
}
//token is a tecnical word.before the space what ever the charecters are ther is token.
