class G 
{
	public static void main(String[] args) 
	{
		int firstNum = 11;
		int secondNum = 6;
		int thirdNum = 10;
		int min = (firstNum < secondNum && secondNum < thirdNum) ? secondNum : thirdNum;
		System.out.println(min);
	}
}
