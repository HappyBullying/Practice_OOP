package ru.mirea.pr4;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myform extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JLabel label3;
    private JLabel label1;
    private JLabel label2;
    int madrid = 0, Ac = 0;
    public myform() {
        label1.setText("0");
        label2.setText("0");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ac++;
                label1.setText(Integer.toString(Ac));
                if (Ac == 2) {
                    label3.setText("AC Milan wins");
                    new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    }).start();
                }

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                label2.setText(Integer.toString(madrid));
                if(madrid == 2) {
                    label3.setText("Real Madrid wins");
                    new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.exit(0);
                        }
                    }).start();
                }
            }
        });
    }

    public  static void main(String[] args){
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setContentPane(new myform().panel1);
        app.pack();
        app.setVisible(true);
    }


}
