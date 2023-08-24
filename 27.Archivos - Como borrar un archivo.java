// Como borrar un archivo
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

import java.io.File;  // Importar la clase archivo

public class MiApicacionJava1 {
    public static void main(String[] args){

    File myObj = new File("miarchivo.txt"); 
    if (myObj.delete()) { 
      System.out.println("Borrado el archivo: " + myObj.getName());
    } else {
      System.out.println("Falla al borrar el archivo.");
    } 

   } // fin del main
} // fin de la clase principal