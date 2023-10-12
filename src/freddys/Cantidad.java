/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freddys;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author srg12
 */
public class Cantidad extends JFrame implements ActionListener {
    JButton btn3;
    JPanel BaG;
    
    public Cantidad(){
        setTitle("Cantidad"); //Establece el título de la ventana
        setSize(600, 400); //Dimenciona la ventana (largo y ancho)
        setLayout(null); //Posicionamiento de los objetos
        cuerpo2(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(Boolean.TRUE); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
    }
    public void cuerpo2(){
    BaG = new JPanel();
    BaG.setBackground(Color.black);
    BaG.setSize(600, 600);    
    btn3 = new JButton();
     btn3= new JButton("Siguiente");
     btn3.setBounds(400,250,100,25);
     
     btn3.addActionListener(this);
     add(btn3);
     add(BaG);
}
     public void actionPerformed(ActionEvent e){
     if(e.getSource()==btn3);
     {
         JOptionPane.showMessageDialog(null,"Estas seguro de que quieres continuar?");
         Ingredientes ing=new Ingredientes();
         ing.setVisible(true);
         dispose();
     }
 }
        public static void main(String[] args) {
   Cantidad ventana= new Cantidad();    
// TODO code application logic here
    }
}
