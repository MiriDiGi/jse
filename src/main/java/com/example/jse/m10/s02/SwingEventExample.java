package com.example.jse.m10.s02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SwingEventExample extends JFrame {   //Swing incluso in grava, framework per costruire programmi gui
    private static final long serialVersionUID = 1L;
    private JButton button;
    private int counter;

    public SwingEventExample() {
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");

        button = new JButton("Click Me!");
        button.addActionListener(new ClickListener());    //interfaccia che dice cosa fare quando avviene un evento

        JPanel panel = new JPanel();
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    private class ClickListener implements ActionListener {    //inner class che serve per gestire gli eventi, le classi inner mi danno accesso anche alla parte privata delle classi in cui sono contenute 
        public void actionPerformed(ActionEvent e) {             //il codice delle innerclass hanno accesso privilegiato alle parti private della classe stessa
            counter += 1; 
            button.setText("Click counter is " + counter);
        }
    }

    public static void main(String[] args) {
        new SwingEventExample();
    }
}