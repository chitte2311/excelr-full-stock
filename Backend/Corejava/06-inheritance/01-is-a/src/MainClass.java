class DriverClass //super clss
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from Driver class");
	}
}
class Derived1 extends DriverClass//child class
{
	static int i;
	static 
	{
		Derived1.main(null);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello from Derived1 class");
	}
}
class Derived2 extends DriverClass//child class
{
	static int j;
	static
	{
		Derived2.main(null);
}
public static void main(String[] args) 
	{
		System.out.println("Hello from Derived2 class");
	}
}
class MainClass
{
	public static void main(String[] args)
	{
		System.out.println("MainClass begin");
		System.out.println(Derived1.i);
		System.out.println(Derived2.j);
		System.out.println("MainClass end");
}
}