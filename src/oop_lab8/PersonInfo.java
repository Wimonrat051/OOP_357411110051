package oop_lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student("180990064790","Aun","Female",23,"357411110051","IS:Manangement Technoluge");
        System.out.println(student.toString());
        System.out.println(student.getName()); //getname อยู่ใน Persion
        Employee employee = new Employee("1809900648596","AunAun","Female",23,"1001","การเงิน",25000);
        System.out.println(employee.toString());

    }//main
}//class
