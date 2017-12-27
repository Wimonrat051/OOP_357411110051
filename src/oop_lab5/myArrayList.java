package oop_lab5;

import java.util.ArrayList;

public class myArrayList { //list ช่วยลดข้อจำกัดของArray จองพื้นที่ในหน่วยความจำของอาเรย์ เก็บเมื่อมีการใส่ค่าข้อมูลเข้ามาเท่าจำนวนข้อมูล
    public static void main(String[] args) {
        //ArrayList
        ArrayList list = new ArrayList();
        list.add("AUN"); // ข้อทูลแรกที่ใส่จะอยู่ตำแหน่งที่ 0
        list.add("NAT");
        list.add("SAI");
        System.out.println(list);
        list.add(2,2017);
        System.out.println(list);
        list.remove(1); //ลบตำแหน่ง
        System.out.println(list);
        System.out.println(list.size());
        list.remove("SAI");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.indexOf(2017)); //2017 อยู่ตำแหน่งใด


    }//maim

}//class
