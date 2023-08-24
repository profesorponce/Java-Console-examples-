// Estructura SWITCH
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
//  
// Programa que pregunta por el día de la semana
// en formato numerico y devuelve el día actual

import java.util.*;

public class MiApicacionJava1 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("¿Qué día de la semana es? (en número de 1 a 7, por favor...)");
    int day = scanner.nextInt();
    scanner.close();

    System.out.print("Entonces hoy es... ");

    switch (day) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println(" ¡no lo sé!");
            break;
    }
    // Dependiendo del dia imprime una leyenda        

   } // fin del main
} // fin de la clase principal