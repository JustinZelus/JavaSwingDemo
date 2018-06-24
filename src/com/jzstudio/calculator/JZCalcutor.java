package com.jzstudio.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JZCalcutor extends JFrame{
    private static final int WIDTH = 230;
    private static final int HEIGHT = 360;

    private JPanel panel;
    private JButton clear_Btn;
    private JButton number7_Btn;
    private JButton number8_Btn;
    private JButton number9_Btn;
    private JButton number4_Btn;
    private JButton number5_Btn;
    private JButton number6_Btn;
    private JButton number1_Btn;
    private JButton number2_Btn;
    private JButton number3_Btn;
    private JButton number0_Btn;
    private JButton dot_Btn;
    private JButton divide_Btn;
    private JButton multiply_Btn;
    private JButton subtract_Btn;
    private JButton add_Btn;
    private JButton equal_Btn;
    private JButton percent_Btn;
    private JButton sign_Btn;
    private JLabel display_Lbl;

    public JZCalcutor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        /*加入content pane*/
        add(panel);
        /*用來將視窗中的各個元件，自動依版面配置作適當的排列。*/
        pack();

        number7_Btn.addActionListener(new Action());
        number8_Btn.addActionListener(new Action());
        number9_Btn.addActionListener(new Action());


    }

    public class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object object = e.getSource();
//            JButton f = (JButton) object;
//
            String text = number7_Btn.getText();
            System.out.println(text);
        }
    }


}
