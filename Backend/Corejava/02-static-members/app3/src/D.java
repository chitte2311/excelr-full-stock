class D 
{
	static 
	{
		System.out.println("D-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("D-main-begin");
		C.main(null);
		C.main(args);
		System.out.println("D-main-end");
	}
}
