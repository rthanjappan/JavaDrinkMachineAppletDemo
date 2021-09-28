/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkmachineappletdemo;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Rosemol
 */
public class ActivityPanel extends JPanel{
    
    JLabel labels[];
    JTextField textFields[];
    
    JTextArea txtAreaStatus ;
    double moneyGiven;
    public ActivityPanel(){
        
        
        this.setLayout(new GridLayout(4,0));
        //setPreferredSize(new Dimension(225,300));
        
        
        createLabels();
        createTextFields();
        for(int i=0;i<labels.length-1;i++){
            JPanel panel=new JPanel();
            labels[i].setPreferredSize(new Dimension(150,25));
            textFields[i].setPreferredSize(new Dimension(150,25));
            textFields[i].addActionListener(new TextListener());
            panel.add(labels[i]);
            panel.add(textFields[i]);
            add(panel);
        }
        JLabel lblStatus = new JLabel("Status : ");
        add(lblStatus);
        txtAreaStatus=new JTextArea(5,25);
        add(txtAreaStatus);
//        JTextField t=new JTextField(25);
//        add(t);
//        for(int i=0;i<textFields.length;i++){
//            add(textFields[i]);
//        }
        //add(labels)
}

    private void createLabels() {
        labels=new JLabel[3];
        labels[0]=new JLabel("Please enter the amount : ");
        labels[1]=new JLabel("The change : ");
        labels[2]=new JLabel("The Status : ");
        
    }
    
    
    private void createTextFields() {
        textFields=new JTextField[3];
        textFields[0]=new JTextField(10);
        textFields[1]=new JTextField(10);
        textFields[2]=new JTextField(10);
    }
    
    private class TextListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            moneyGiven=Double.parseDouble(textFields[0].getText());
            txtAreaStatus.setText("Please select a Drink.");
            
        
        }
}
}

    
