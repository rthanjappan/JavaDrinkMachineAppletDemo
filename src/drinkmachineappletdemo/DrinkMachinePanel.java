/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkmachineappletdemo;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Rosemol
 */
public class DrinkMachinePanel extends JPanel{
    String drinksArray[];
        
    final int NUM_DRINKS=20;
    final double PRICE=0.75;
    
    private JButton drinks[];
    private Drink objDrinks[];
    //JTextField txtFieldMoney;
    //JButton btnSelectDrink;
    //JTextField txtFieldChange;
    //JTextField txtFieldStatus;
    
    public DrinkMachinePanel(){
        this.setLayout(new GridLayout(10,0));
        setPreferredSize(new Dimension(125,300));
        createDrinks();
        
        for(int i=0;i<drinks.length;i++){
            add(drinks[i]);
        }
//        ImageIcon img=new ImageIcon("cola.png");
//        JButton b=new JButton("The button",img);
        
        //b.setIcon(img);
//        add(b);
    }

    private void createDrinks(){
    drinksArray=new String[]{"Cola","Lemon-Lime soda",
        "Grape soda","Root beer","Dasani"};
        setObjDrinks(new Drink[drinksArray.length]);
        setDrinks(new JButton[drinksArray.length]);
      for(int i=0;i<getDrinks().length;i++)    {
            getDrinks()[i]=new JButton(drinksArray[i]+"($0.75)");
            getObjDrinks()[i]=new Drink(drinksArray[i]);
            //getDrinks()[i].addActionListener(new ButtonListener());
      }
      
    }

    /**
     * @return the drinks
     */
    public JButton[] getDrinks() {
        return drinks;
    }

    /**
     * @param drinks the drinks to set
     */
    public void setDrinks(JButton[] drinks) {
        this.drinks = drinks;
    }

    /**
     * @return the objDrinks
     */
    public Drink[] getObjDrinks() {
        return objDrinks;
    }

    /**
     * @param objDrinks the objDrinks to set
     */
    public void setObjDrinks(Drink[] objDrinks) {
        this.objDrinks = objDrinks;
    }
    
//    private class ButtonListener implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            
//            for(int i=0;i<getDrinks().length;i++){
//                if (e.getSource().equals(getDrinks()[i])){
////                    txtAreaStatus.setText(
////                            getObjDrinks()[i]
////                            .getName()+" selected .(#0.75");
//                }
//            }
//            //lblPrice.setText(e.getSource().equals(e))
//        
//        }
//        
//        
//    }
}
