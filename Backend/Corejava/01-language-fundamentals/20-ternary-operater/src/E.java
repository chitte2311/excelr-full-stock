class E 
{
	public static void main(String[] args) 
	{
		int firstNum = 110;
		int secondNum = 116;
		int thirdNum =101;
		if(firstNum < secondNum && firstNum < thirdNum)
		{
		
		System.out.println("Among firstNum and secondNum :" + firstNum + "is minimum ");
        }
		else if (secondNum < thirdNum)
		{
			System.out.println("Among firstNum and secondNum :" + secondNum + "is minimum");
	     }
		 else
		{
			 System.out.println("Among secondNum and ThirdNum :" + thirdNum + "is minimum");
		}
	}
}

