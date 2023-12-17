class C 

{

        C(){

                System.out.println("C()");

        }

        C(double i){

                System.out.println("C(double)");

        }

        C(int i){

                System.out.println("C(int)");

        }

        C(int i, double j){

                System.out.println("C(int, double)");

        }

        public static void main(String[] args) 

        {

                System.out.println("main begin");

                C a1 = new C(20);

                System.out.println("---------------------");

                C b2 = new C(20.5);

                System.out.println("---------------------");

                C b3 = new C(20);

                System.out.println("---------------------");

                C b4 = new C();

                System.out.println("---------------------");

                System.out.println("main end");

        }

}

