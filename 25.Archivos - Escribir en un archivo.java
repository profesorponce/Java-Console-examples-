// Escribir un archivo
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

import java.io.FileWriter;   // Importar la clase para escribir archivos
import java.io.IOException;  // Importar la clase IOException para captura de errores

public class MiApicacionJava1 {
    public static void main(String[] args){

    try {
      FileWriter myWriter = new FileWriter("miarchivo.txt");
      myWriter.write("Ejemplo de como escribir en un archivo");
      myWriter.close();
      System.out.println("Se escribio correctamente en el archivo.");
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error.");
      e.printStackTrace();
    }

   } // fin del main
} // fin de la clase principall