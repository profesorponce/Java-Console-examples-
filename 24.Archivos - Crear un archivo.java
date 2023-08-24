// Crear un archivo
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

import java.io.File;  // Importar la clase Archivo I/O
import java.io.IOException;  // Import la clase IOException para captura de errores

public class MiApicacionJava1 {
    public static void main(String[] args){

    try {
      File myObj = new File("miarchivo.txt");
      if (myObj.createNewFile()) {
        System.out.println("Archivo creado: " + myObj.getName());
      } else {
        System.out.println("Archivo ya existe.");
      }
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error.");
      e.printStackTrace();
    }

   } // fin del main
} // fin de la clase principal