package oop_lab6;

public class myString {
    public static void main(String[] args) {
        char[] c = {'H','e','l','l','o'}; //เก็บค่า
        String str1 = new String(c) ; //แปลงเป็นสตริง
        System.out.println(str1);
        String str2 = "Wimonrat Neamsun"; //สร้างสตริงแบบง่าย
        System.out.println(str2);
        //String concatenation
        //type 1 (+)
        String str3 = str1+" "+str2; //+""+เป็นการเอาตริงมาต่อกัน
        System.out.println(str3);
        //type 2 (concat() method)
        String str4 = str3.concat(" RMUTSV");  //เก็บผลลัพธ์ในstr4 ต่อตริง 2 ค่า
        System.out.println(str4);
        //String Methods
        System.out.println(str4.length()); //นับอักขระในข้อความรวามสเปชบา
        System.out.println(str4.substring(10,20)); //ตัดข้อความบางส่วนที่จะนำออกมาแสดง
        System.out.println(str4.toUpperCase()); //ทำเป็นตัวพิมใหญ่ทั้งหมด
        System.out.println(str4.toLowerCase()); //ทำเป็นตัวพิมเล็กทั้งหมด
        System.out.println(str4.replace('m','r'));//การเปลี่ยนแปลง เอา r มาแทนที่ m


    }//main
}//class
