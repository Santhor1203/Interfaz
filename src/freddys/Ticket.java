/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freddys;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author srg12
 */
public class Ticket extends JFrame implements ActionListener {
    JButton btn1;
    public Ticket(){
        setTitle("Ticket"); //Establece el título de la ventana
        setSize(600, 400); //Dimenciona la ventana (largo y ancho)
        setLayout(null); //Posicionamiento de los objetos
        cuerpo4(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(Boolean.TRUE); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
    }
    public void cuerpo4(){
    btn1 = new JButton();
     btn1= new JButton("Cerrar");
     btn1.setBounds(250,250,100,25);
     add(btn1);
     btn1.addActionListener(this);
    }
     public void actionPerformed(ActionEvent e){
     if(e.getSource()==btn1);
     {
         dispose();
         System.exit(0);
     }
 }
}