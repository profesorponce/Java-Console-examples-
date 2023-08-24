// ARRAY LOOP
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 
// La propiedad cars.length permite saber cuántos 
// elementos hay dentro del array cars

public class MiApicacionJava1 {
    public static void main(String[] args){

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
    }

   } // fin del main
} // fin de la clase principal