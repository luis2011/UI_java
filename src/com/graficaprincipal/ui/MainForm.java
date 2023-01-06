package com.graficaprincipal.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class MainForm {


    private JTextField text1;
    private JButton btn1;
    private JPanel taxPane;


    public MainForm() {

        text1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                String newText = text1.getText() + "ñ";
                text1.setText(newText);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text1.setText("esto se escribio al oprimir el boton");
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing");
        frame.setContentPane(new MainForm().taxPane);
        frame.setSize(new Dimension(450,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
