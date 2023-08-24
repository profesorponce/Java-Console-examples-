// Sentencia CONTINUE
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
//
// La sentencia CONTINUE PERMITE saltarse lo que esta
// programado dentro del for

public class MiApicacionJava1 {
    public static void main(String[] args){

    for (int i = 0; i < 10; i++) {
        if (i == 4) {
            continue;
        }
        System.out.println(i); //no se ejecuta si coincide con la condición del IF
    }

   } // fin del main
} // fin de la clase principal