class M15 
{
	static void test()
	{
		System.out.println("from test");
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		//code reusebility
		test();
		test();
		test();
		test();
		System.out.println("from main end");
	}
}
