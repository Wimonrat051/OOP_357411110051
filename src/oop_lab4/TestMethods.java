package oop_lab4;

public class TestMethods {
    //global variable
    public static  int number = 1000;

        //Method
        // type 1
        public static void A () {
            System.out.println("Hello A");

        }//A
        //type 2
        public static void B (int x) {
        System.out.println("Hello B"+x);
        }


        //type 3
        public static int C (int x,int y){
            System.out.println("Hello C"+1000);

            return x+y;
        }


        public static void main (String[] args){


        System.out.println("Hello Main");
        //calling method
        //A();
        //B(10);
       int number = C(10,20);
       System.out.println(number);
       System.out.println(C(50,50));
            //local variable
            int x = 1000;
}

    }

