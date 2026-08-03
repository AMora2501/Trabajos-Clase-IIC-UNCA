package interfazGrafica;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class interfazManual extends JFrame{
    
    public interfazManual(){
        iniciarComponentes();
    }
    
    public void iniciarComponente(){
        setLayout(new FlowLayout);
        setSize(400, 400);
        JButton boton1 = new JButton("Click");
            
        add(boton1);
    }
}
