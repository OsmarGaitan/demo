/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.og.dm_mvc.controller;

import com.og.dm_mvc.models.Person;
import com.og.dm_mvc.views.PersonFrom;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JADPA_15
 */
public class Person_Crontroller  implements ActionListener {
    
   
    
    Person persona;
    PersonFrom personfrom;

    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case "save":
               save():
               break;
           case "cancel":
               calcel():
               break;
               
       }
    }

    private void save() {
      JOptionPane.showMessageDialog(personfrom,"Evento Guardado", JOptionPane.INFORMATION_MESSAGE); 
    }

    private void calcel() {
       personfrom.dispose();
    }
    
    
    
    
    
    
    
 }
