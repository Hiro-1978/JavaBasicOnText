/*
    จงเขียนโปรแกรมแสดงวันที่ โดยจัดให้อยู่ในรูปแบบ "%tB %te %tY%n"
 */
package javabasic;

import java.util.Calendar;

public class ex3_12 {
    public static void main(String[] args){
        System.out.printf("%tB %te %tY%n",Calendar.getInstance(),
                Calendar.getInstance(),Calendar.getInstance());
    }
}
