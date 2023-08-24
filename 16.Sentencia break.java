// Sentencia BREAK
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 
// Observe que el break se ejecuta ANTES del print
// es por eso que cuando i=4 el programa SALE del 
// bucle FOR sin imprimir el valor de i

public class MiApicacionJava1 {
    public static void main(String[] args){

    System.out.println("Impresión interrumpida por el break");

    for (int i = 0; i < 10; i++) {
        if (i == 4) {
            break;
        }
        System.out.println(i);
    }

   } // fin del main
} // fin de la clase principal