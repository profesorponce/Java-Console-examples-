// Test GUI en Java
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Este programa sirve para controlar la salida GUI
// del IDE de programación que usted use en el curso
// 
// Usa librerías swing y awt

import javax.swing.*;
import java.awt.*;

clase gui {   
    public static void main(String args[]) {        

// ---------------------------------------

        // Creando el Marco        
        JFrame frame = new JFrame("Primer Marco");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(400, 400);        

        // Creando el panel en la parte inferior y agregando componentes       
        JPanel panel = new JPanel(); // el panel no está visible en la salida      
        JLabel label = new JLabel("Mi primer GUI en Java");               
        panel.add(label); 

        // Agregar componentes al marco ordenados con BORDERLAYOUT      
        //     NORTH
        //WEST CENTER EAST
        //     SOUTH
        frame.getContentPane().add(BorderLayout.CENTER, panel);   // al "CENTRO"

        // Hacer visible al marco
        frame.setVisible(true);   

    }	//fin de main

} //fin de la clase