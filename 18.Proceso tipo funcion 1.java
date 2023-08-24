// Proceso tipo funcion 
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

import java.util.*;

public class PrimerPrograma {
    
     public static void main(String[] args){

        String Msg1 = "Esto es un ";
        String Msg2 = "mensaje unificado";

        String Msg;
        Msg = mensaje(Msg1,Msg2);
        System.out.println(Msg);

   } // fin del main

   public static String mensaje (String m1,String m2) { // declaracion de proceso tipo funcion
       String resultado;
       resultado = m1 + m2;
       return resultado;
       } // fin del proceso cantidad

} // fin de la clase principal