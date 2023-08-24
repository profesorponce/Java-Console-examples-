// FOR EACH LOOP
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 

public class MiApicacionJava1 {
    public static void main(String[] args){

    System.out.println("Imprimiendo los elementos del array [cars]:");    
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    
    int num = 1;
    
    for (String i : cars) {
        System.out.print(num);
        System.out.print(".");
        System.out.println(i);
        num++; // num = num + 1
        }

   } // fin del main
} // fin de la clase