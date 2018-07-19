package com.jzstudio.calculator;


import javax.swing.*;

public class Main {//外部類別

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JZCalcutor calcutor = new JZCalcutor();
                calcutor.setVisible(true);
            }
        });


    }


}
