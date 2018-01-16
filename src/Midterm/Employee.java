package Midterm;

import java.util.Scanner;

public class Employee {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String id = getID();
        String name = getName();
        String salary = getSalary();
        String overtime = getOverTime();
    }

    private static String getOverTime() {
        System.out.print("Enter employee overtime: ");
        return scanner.nextLine();
    }

    private static String getSalary() {
        System.out.print("Enter employee salary: ");
        return scanner.nextLine();
    }

    private static String getName() {
        System.out.print("Enter employee name: ");
        return scanner.nextLine();
    }

    private static String getID() {
        System.out.print("Enter employee id: ");
        return scanner.nextLine();

    }

}
