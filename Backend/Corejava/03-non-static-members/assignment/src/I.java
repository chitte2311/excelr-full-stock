class I

{

        I(){

                this(10);

                System.out.println("I()");

        }

        I(int i){

                this(i, i);

                System.out.println("I(int)");

        }

        I(int i, int j){

                System.out.println("I(int, int)");

        }

        public static void main(String[] args) 

        {

                System.out.println("Main begin");

                I obj1 = new I();

                System.out.println("------------");

                I obj2 = new I();

                System.out.println("------------");

                I obj3 = new I(30);

                System.out.println("------------");

                I obj4 = new I(30, 40);

                System.out.println("------------");

                System.out.println("Main end");

        }

}

