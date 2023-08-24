// Estructura IF/ELSE
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
//
// Programa que pregunta la hora en formato 24 horas
// y en base a la hora, emite un saludo

import java.util.*;

public class MiApicacionJava1 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("¿Qué hora es? (en formato de 24 horas, por favor...)");
    int time = scanner.nextInt();
    scanner.close();

    if (time < 18) {
        System.out.println("Buen dia");
    } else {
        System.out.println("Buenas noches");
    }
    // Dependiendo de la hora asignada el programa responde una u otra frase
          

   } // fin del main
} // fin de la clase principal