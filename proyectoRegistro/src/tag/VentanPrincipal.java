package tag;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author criizziiy
 */
public class VentanPrincipal extends JFrame {
    JButton b;
    
    VentanPrincipal(String titulo){
        super(titulo); 
        this.setSize(400,424); 
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        initComponents();
    
    }
    
    public void initComponents(){
    
    
    }
    
    public void MiVentana(){
    
    
    
    }
    
    
    
    public static void main(String[] args) {
        VentanPrincipal V = new VentanPrincipal("Ventana Principal");
    }
    
}
