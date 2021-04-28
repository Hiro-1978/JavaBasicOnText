package javabasic;


import javax.swing.JOptionPane; //ส่วนการเรียกใช้งานแพคเกจ javax.swing.jOptionPane เข้าร่วม

public class Ex4_15 { //เริ่มต้นคลาส

    public static void main(String args[]) { //ส่วนเมธอดหลัก และเริ่มต้นคำสั่ง
        String number1; //ประกาศตัวแปรสตริง number1
        String number2; //ประกาศตัวแปรสตริง number2
//ส่วนการรับข้อมูลด้วยไดอะล็อกซ์และเก็บไว้ในตัวแปร number1 และ number2
        number1 = JOptionPane.showInputDialog("Input Numer 1:");
        number2 = JOptionPane.showInputDialog("Input Numer 2:");
        int total = Integer.parseInt(number1) + Integer.parseInt(number2); //ส่วนการคำนวณ
        JOptionPane.showMessageDialog(null, String.valueOf(total)); //ส่วนแสดงผล
    } //จบส่วนคำสั่งของเมธอดหลัก
} //จบคลำส
