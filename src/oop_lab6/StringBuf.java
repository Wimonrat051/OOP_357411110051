package oop_lab6;

public class StringBuf {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer buffer=new StringBuffer();
        buffer.append("Hello");
        buffer.append(" Welcome");
        buffer.append(" to");
        buffer.append(" RMUTSV");
        System.out.println(buffer);
        System.out.println(buffer.length()); //นับอักขระ
        buffer.replace(0,5,"OOP");//การแทนที่
        System.out.println(buffer);
        System.out.println(buffer.reverse()); //สลับคำ หลัง-หน้า  หน้า-หลัง
        buffer.delete(0,3); //ระบุว่าจะลบอักขระที่เท่าไหร่
        System.out.println(buffer);



    }//main
}//class
