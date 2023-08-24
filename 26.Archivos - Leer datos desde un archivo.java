// Como leer datos desde un archivo
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

import java.io.File;  // Importar la clase archivo
import java.io.FileNotFoundException;  // Importar la clase para captura de errores
import java.util.Scanner; // Importar la clase scanner para leer archivos

public class MiApicacionJava1 {
    public static void main(String[] args){

    try {
      File myObj = new File("miarchivo.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Ha ocurrido un error.");
      e.printStackTrace();
    }

   } // fin del main
} // fin de la clase principal