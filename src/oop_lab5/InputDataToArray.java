package oop_lab5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//1.input Data from user
//2.find summation of data in array
//3.find average value of data in array
//4.find maximum value of data in array
//5.find minimum valule of data un array
public class InputDataToArray {
    private static final int MAX = 10;
    public static void main(String[] args) {
        Integer num[] = new Integer[MAX];
        num = inputData(num);
        showData(num);
        summation(num);
        findMax(num);
        findMin(num);
        DescendingOrder(num);
        AscendingOrder(num);
    }// main

    private static void AscendingOrder(Integer[] num) {
        Arrays.sort(num,Collections.reverseOrder());
        System.out.println("Ascending Order: ");
        showData(num);
    }//AscendingOrder(Integer

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Descending Order: ");
        showData(num);
    }//DescendingOrder

    private static void findMin(Integer[] num) {
        System.out.println("The maximum value is: "+ (Collections.min(Arrays.asList(num))));
    }//findMin

    private static void findMax(Integer[] num) {
        System.out.println("The maximum value is: "+ (Collections.max(Arrays.asList(num))));
        //max value with basic code
        Integer max=num[0];
        for (int i=0;i<num.length;i++){
            if (max<=num[i]){
                max=num[i];
            }
        }
    }//findMax

    private static void summation(Integer[] num) {
        int total = 0;
        for (int i=0;i<num.length;i++){
            total += num[i];
        }
        System.out.println("\nThe summation of " + "value in array is:"+total);
        System.out.println("The average value " + " in array is:"+total/MAX);
    }

    private static void showData(Integer[] num) {
        System.out.println("Data in array");
        for (int val : num)
            System.out.print(val+" ");
    }

    private static Integer[] inputData(Integer []num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleae enter data to array: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();
        }

        return num;
    }
}// class
