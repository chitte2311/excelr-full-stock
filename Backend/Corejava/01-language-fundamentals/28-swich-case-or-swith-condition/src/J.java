class J
{
	public static void main(String[] args) 
	{
		int i=10;
		switch(i)
		{
				default:
		        System.out.println(" from case default");
				break;
			case 2:
		        System.out.println("from case 2");
			    break;
				default:
		        System.out.println(" from case default");
				break;
			case 3:
				System.out.println("from case 3");
			    break;
				default:
		        System.out.println(" from case default");
				break;
			case 5:
				System.out.println("from case 5");
			    break;
		}
	}
}
//only one defalt case are allowed.