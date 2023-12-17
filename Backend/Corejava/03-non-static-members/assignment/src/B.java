class B 

{

        B(double i){

                System.out.println("B(double)");

        }

        B(int i){

                System.out.println("B(int)");

        }

        public static void main(String[] args) 

        {

                System.out.println("main begin");

                B a1 = new B(20);

                System.out.println("---------------------");

                B b2 = new B(20.5);

                System.out.println("---------------------");

                B b3 = new B(20);

                System.out.println("---------------------");

                System.out.println("main end");

        }

}