package oop_lab7;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar SuperCar1 = new SuperCar(); //ออฟเจ็คของคลาสstudent

        SuperCar1.setBrand("Honda");
        SuperCar1.setColor("Rad");
        SuperCar1.setEngineSize("125");
        SuperCar1.setMaxSpeed("100");
        SuperCar1.setCountry("Japan");
        System.out.println(SuperCar1.toString());

        SuperCar superCar2 = new SuperCar("toyota","red","160","200","japan");
        System.out.println(superCar2.toString());

        SuperCar SuperCar2 = new SuperCar();
        SuperCar2 = inputData(SuperCar2);
        System.out.println(SuperCar2.toString());
    }//main


    private static SuperCar inputData(SuperCar  s) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Brand : ");
        s.setBrand(scanner.nextLine());
        System.out.print("Enter Car Color : ");
        s.setColor(scanner.nextLine());
        System.out.print("Enter Engine Size : ");
        s.setEngineSize(scanner.nextLine());
        System.out.print("Enter MaxSpeed : ");
        s.setMaxSpeed(scanner.nextLine());
        System.out.print("Enter Country of origin : ");
        s.setCountry(scanner.nextLine());
        return (s);


    }

}//class
