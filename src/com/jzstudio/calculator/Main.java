package com.jzstudio.calculator;


import javax.swing.*;

public class Main {//外部類別
    private int xx = 100;//全域變數
    JLabel label = new JLabel();

















    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JZCalcutor calcutor = new JZCalcutor();
                calcutor.setVisible(true);
            }
        });

//        System.out.println("asdasdasdasd");












    }

    public void test() {
        xx = 1000;

        Xman john = new Student();
        Xman blackMan = new BlackPerson();


    }

    //內部類別
    class Student extends Person{
        public Student() {
            xx = 100000;


        }

        public void doSomething() {
            label.setText("dddd");
        }
    }

    class Person implements Xman {

        @Override
        public void transformer() {
            System.out.println("變身~~~");

        }
    }

    class BlackPerson extends Person {

    }

    interface Xman {
        void transformer();
    }
}
