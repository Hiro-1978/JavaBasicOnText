package javabasic;


import javax.swing.JOptionPane; //ส่วนของการเรียกใช้งานแพคเกจ javax.swing.jOptionPane เข้าร่วม

public class Ex4_14 { //เริ่มต้นคลาส

    public static void main(String args[]) { //ส่วนเมธอดหลักและเริ่มต้นคำสั่ง
        String name; //ประกาศตัวแปรสตริง name
//แสดงไดอะล็อกซ์และเก็บข้อมูลที่ผู้ใช้ป้อนไว้ที่ name
        name = JOptionPane.showInputDialog("Input Message");
        JOptionPane.showMessageDialog(null, name); //แสดงข้อมูลที่ป้อนเข้าไปในไดอะล็อกซ์
    } //จบส่วนคำสั่งของเมธอดหลัก 
} //จบคลาส
