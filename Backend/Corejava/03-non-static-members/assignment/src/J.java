class J 

{

        J(){

                System.out.println("J()");

                this(90);

        }

        J(int i){

                System.out.println("J(int)");

        }

        public static void main(String[] args) 

        {

                J j1 = new J();

                J j1 = new J(10);

                System.out.println("Hello World!");

        }

}