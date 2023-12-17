class A 
{
	static int i;// field,property,attribute.
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
  1. static is a keyword or reserved word.
2.we can declare a variable with static keyword.
3.static means somthing that doesnt change very aften.
4.static member also called as class members.
         
		 how staic members are procced?
		 ------------------------------
		1. All the static members gets loadded whenever the class
		   is loading to the memory.
		2. in case of static variabels they are going to be loaded 
		   with their default values Ex: int ==>0,double ==>0.0 ,
		   boolean ==> false,string ==>null etc....
	    3. after the all static member gets loadded to the memory.
		   the next step is that all the stativ members gets inizialised
		   and executed from top to bottem only once.
		4. All the static member get loadded ,inlized and executed
		    from top to bottem only once execution when the class 
			is loaded to the memory.
		5. after all the static member gets loaded,initialized and exeute
		   from top to bottem contorl comes to the main method.
		   starts exicution from the main method.
inter view qution ==> is ther any posibility of executing somthng befor
the executionof main.
*/


