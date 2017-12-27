package oop_lab6;

public class StringCompare {
    public static void main(String[] args) {
        //Compare String
        String str1 = "Hello";
        String str2 = "Hellooo";
        //type 1 (==)
        if (str1==str2)System.out.println("true");
        else System.out.println("false"); // str1 มีค่าเท่ากับ str2 หรือไม่ คำตอบ true
        //type 2 (equals() method
        if (str1.equals(str2))System.out.println("true");
        else System.out.println("false");
        //type 3 (compareTo() method
        // ค่าที่ดึงออกมามี 3 ค่า -,สตริงทางขวามากกว่าตริงทางซ้ายออกมาเป็น+, ผลลัพธ์0 สตริง 2 ค่าเท่ากัน
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if (str1.compareTo(str2)>=1)
            System.out.println("str 2 more than str1");
        else
            System.out.println("str1 less than str2");
    }
}
