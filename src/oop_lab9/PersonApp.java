package oop_lab9;

public class PersonApp {
    public static void main(String[] args) {
        Address address = new Address("123","Nakon sri Thammarat","80190");
        Job job = new Job("พนักงานบัญชี",20000);

        Person person = new Person("1001","Aun",address,job);
        System.out.println(person.toString());

        person.getJob().setSalary(25000); //เปลี่ยนแปลงค่าเงินเดือน
        //ดูบางส่วน
        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());

    }
}
