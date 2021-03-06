package oop_lab7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //create Objects as Student
        Student student1 = new Student(); //ออฟเจ็คของคลาสstudent

        student1.setId("111111111111");
        student1.setMajor("Information System");
        student1.setFaculty("Management Technology");
        student1.setName("Boy saiyai");
        System.out.println(student1.toString());

        Student student2 = new Student("222222222222", "Management", "Business Management", "Girl songkhla");
        System.out.println(student2.toString());
        student2.setName("Girl Trang"); //แก้ไขเป็นเกิลตรัง
        System.out.println(student2.toString());

        Student student3 = new Student();
        //student3 = inputData(student3);
        //System.out.println(student3.toString());
        System.out.println(student1.gender); //เรียกกับobject
        System.out.println(Student.gender);


    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student data: ");
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Faculty: ");
        s.setFaculty(scanner.nextLine());
        System.out.print("Major: ");
        s.setMajor(scanner.nextLine());
        return s;
    }
}//class

