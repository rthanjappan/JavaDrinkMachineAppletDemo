/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkmachineappletdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Rosemol
 */
public class DrinkMachineAppletDemo extends JApplet{
    DrinkMachinePanel drinkPanel;
        ActivityPanel actPanel;
        double moneyGiven;
    @Override
    public void init(){
        super.init();
        
        //this.setPreferredSize(new Dimension(500,500));
        
        drinkPanel=new DrinkMachinePanel();
        for(int i=0;i<drinkPanel.getDrinks().length;i++)    {
//            drinkPanel.getDrinks()[i]=new JButton(drinkPanel.drinksArray[i]+"($0.75)");
//            drinkPanel.getObjDrinks()[i]=new Drink(drinkPanel.drinksArray[i]);
            drinkPanel.getDrinks()[i].addActionListener(new ButtonListener());
      }
        actPanel=new ActivityPanel();
        JPanel panel=new JPanel();
        getContentPane().add(drinkPanel,BorderLayout.WEST);
        panel.add(actPanel);
        
        getContentPane().add(panel,BorderLayout.CENTER);
        
        
       // getContentPane().setPreferredSize(new Dimension(500,500));
    }
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton[] drinks=drinkPanel.getDrinks();
            Drink[] objDrinks=drinkPanel.getObjDrinks();
            
            try{
                moneyGiven=Double.parseDouble(
                        actPanel.textFields[0].getText());
                double change;
                if(moneyGiven >= 0.75 ){
                    change = moneyGiven-0.75;
                    actPanel.textFields[1].setText(""+change);
                    for(int i=0;i<drinks.length;i++){
                        if (e.getSource().equals(drinks[i])){
                        actPanel.txtAreaStatus.setText(objDrinks[i]
                                .getName()+" selected .($0.75) \n");
                        if(objDrinks[i].getStock()<=0){
                            String text=actPanel.txtAreaStatus.getText();
                            actPanel.txtAreaStatus.setText(text+objDrinks[i]
                                .getName()+" out of stock");
                        actPanel.textFields[1].setText(""+moneyGiven);
                        }
                        else{//if stock is available
                            actPanel.txtAreaStatus.setText(" You can take "+objDrinks[i]
                            .getName());
                            objDrinks[i].setStock(objDrinks[i].getStock()-1);
                        }
                        }
                        
                    }
                }
                else{
                    actPanel.txtAreaStatus.setText("please enter enough money.\n"+
                            "Price for a drink is $0.75.");
                }
            }
            catch(Exception ex){
                actPanel.txtAreaStatus.setText("please enter enough money.\n"+
                        "Price for a drink is $0.75.");
            }
                        
            
//            for(int i=0;i<drinks.length;i++){
//                if (e.getSource().equals(drinks[i])){
//                    actPanel.txtAreaStatus.setText(objDrinks[i]
//                            .getName()+" selected .($0.75) \n");
//                    
//                    //check for available stock
//                    if(objDrinks[i].getStock()<=0){
//                        String text=actPanel.txtAreaStatus.getText();
//                        actPanel.txtAreaStatus.setText(text+objDrinks[i]
//                            .getName()+" out of stock");
//                        actPanel.textFields[1].setText(""+moneyGiven);
//                    }
//                    else{//if stock is available
//                        
//                        String text=actPanel.txtAreaStatus.getText();
////                        
//                        try{
//                        double moneyGiven=Double.parseDouble(
//                                actPanel.textFields[0].getText());
//                        double change;
//                        if(moneyGiven >= 0.75 ){
//                            change = moneyGiven-0.75;
//                            actPanel.textFields[1].setText(""+change);
//                            actPanel.txtAreaStatus.setText(text+
//                                " You can take "+objDrinks[i]
//                            .getName());
//                            objDrinks[i].setStock(objDrinks[i].getStock()-1);
//                        }
//                        else{
//                            actPanel.txtAreaStatus.setText("please enter enough money.\n"+
//                                    "Price for a drink is $0.75.");
//                        }
//                        }
//                        catch(Exception ex){
//                            actPanel.txtAreaStatus.setText("please enter enough money.\n"+
//                                    "Price for a drink is $0.75.");
//                        }
//                        
//                        
//                    }
//                    }
//                    
//                }
            }

        
        
    }
}
