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


    String mNumber = "";
    String operator = "";
    String answer = "";

    public JZCalcutor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        /*加入content pane*/
        add(panel);
        /*用來將視窗中的各個元件，自動依版面配置作適當的排列。*/
        pack();

        number1_Btn.addActionListener(new NumberAction());
        number2_Btn.addActionListener(new NumberAction());
        number3_Btn.addActionListener(new NumberAction());
        number4_Btn.addActionListener(new NumberAction());
        number5_Btn.addActionListener(new NumberAction());
        number6_Btn.addActionListener(new NumberAction());
        number7_Btn.addActionListener(new NumberAction());
        number8_Btn.addActionListener(new NumberAction());
        number9_Btn.addActionListener(new NumberAction());

        divide_Btn.addActionListener(new OperatorAction());
        multiply_Btn.addActionListener(new OperatorAction());
        add_Btn.addActionListener(new OperatorAction());
        subtract_Btn.addActionListener(new OperatorAction());

        equal_Btn.addActionListener(new EqualAction());
        clear_Btn.addActionListener(new ClearAction());
    }

    public class ClearAction implements  ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            answer = "";
            mNumber = "";
        }
    }

    //運算子的響應
    public class OperatorAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            JButton btn = (JButton)obj;

            if(!operator.equals(""))
                doCalculate();
            else {
                answer = mNumber;
                mNumber = "";
            }

            operator = btn.getText();
        }
    }

    //等於符號的響應
    public class EqualAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(!operator.equals(""))
                doCalculate();
        }
    }

    //數字的響應
    public class NumberAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object object = e.getSource();
            JButton btn = (JButton) object;
            String text = btn.getText();
            mNumber += text;
            display_Lbl.setText(mNumber);

        }
    }

    //加
    public int add(int x , int y) {
        return x + y;
    }

    //減
    public int subtract(int x , int y) {
        return x - y;
    }

    //乘
    public int multiply(int x, int y) {
        return x * y;
    }

    //除
    public int divide(int x, int y) {
        return x/y;
    }

    public void doCalculate() {
        switch (operator) {
            case "+":
                answer = "" + add(Integer.parseInt(answer),Integer.parseInt(mNumber));
                break;
            case "−":
                answer = "" + subtract(Integer.parseInt(answer),Integer.parseInt(mNumber));
                break;
            case "×":
                answer = "" + multiply(Integer.parseInt(answer),Integer.parseInt(mNumber));
                break;
            case "÷":
                answer = "" + divide(Integer.parseInt(answer),Integer.parseInt(mNumber));
                break;
        }

        //運算後將mNumber變數清空
        mNumber = "";
        display_Lbl.setText("" + answer);
    }
}
