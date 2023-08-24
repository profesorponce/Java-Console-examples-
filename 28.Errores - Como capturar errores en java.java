// Como capturar errores en Java
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

public class MiApicacionJava1 {
    public static void main(String[] args){

    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Ha ocurrido un error.");
    }

   } // fin del main
} // fin de la clase principal