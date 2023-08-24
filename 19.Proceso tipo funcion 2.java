// Proceso tipo funcion en Java (método de clase)
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

import java.util.*;

public class PrimerPrograma {
    
    public static void main(String[] args){

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[cantidad()]);

    // Imprime el miembro 0 (cero)

   } // fin del main

   public static int cantidad () { // declaracion de proceso tipo funcion
       Scanner scanner = new Scanner(System.in);
       System.out.println("¿Qué elemento imprimo? (de cero(0) a tres (3), por favor...)");
       int cual = scanner.nextInt();
       scanner.close();
       return cual;
       } // fin del proceso cantidad

} // fin de la clase principal