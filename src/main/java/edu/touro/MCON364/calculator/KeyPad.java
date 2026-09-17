package edu.touro.MCON364.calculator;

import javax.swing.*;
import java.awt.*;

public class KeyPad
{
    static void main()
    {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //NORTH Input number

        JPanel input = new JPanel(new GridLayout(0, 2, 4, 4));
        JTextField inputFeild = new JTextField("0", 10);
        input.add(inputFeild);
        inputFeild.setEditable(false);

        //Center Numbers and operations0;
        JPanel numberButtons = new JPanel(new GridLayout(4, 3));
        numberButtons.add(new JButton("0"));
        numberButtons.add(new JButton("1"));
        numberButtons.add(new JButton("2"));
        numberButtons.add(new JButton("3"));
        numberButtons.add(new JButton("4"));
        numberButtons.add(new JButton("5"));
        numberButtons.add(new JButton("6"));
        numberButtons.add(new JButton("7"));
        numberButtons.add(new JButton("8"));
        numberButtons.add(new JButton("9"));
        numberButtons.add(new JButton("."));
        numberButtons.add(new JButton("="));

        JPanel operationButtons = new JPanel(new GridLayout(0, 1));
        operationButtons.add(new JButton("+"));
        operationButtons.add(new JButton("-"));
        operationButtons.add(new JButton("*"));
        operationButtons.add(new JButton("/"));




        JPanel content = new JPanel(new BorderLayout(0, 8));
        content.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        content.add(input, BorderLayout.NORTH);
        content.add(numberButtons, BorderLayout.CENTER);
        content.add(operationButtons, BorderLayout.EAST);
        frame.add(content);
        frame.pack();

        frame.setVisible(true);



    }
}
