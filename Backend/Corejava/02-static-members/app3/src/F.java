class F
{
	static 
	{
		System.out.println("F-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("F-main-begin");
		System.out.println(E.i);
		System.out.println(E.i);
		System.out.println(E.i);
		System.out.println(E.i);
		System.out.println("F-main-end");
	}
}
