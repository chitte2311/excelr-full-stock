class D 

{

        D(int i){

                System.out.println("D(int i)");

        }

        D(int j){

                System.out.println("D(int j)");

                System.out.println("D(int j)");

                System.out.println("D(int j)");

                System.out.println("D(int j)");

        }

        public static void main(String[] args) 

        {

                System.out.println("main begin");

                D d1 = new D(20);

                System.out.println("-------------");

                D d1 = new D(30);

                System.out.println("-------------");

                System.out.println("Main end");

        }

}