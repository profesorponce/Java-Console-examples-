// Manejo de ARRAYs
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Julio 2022
// 
// El programa incluye una función (METODO) para que
// el usuario elija un numero de elemento del  array

public class MiApicacionJava1 {

 public static void main(String[] args){
        System.out.println("Elige un elemento del array");
        
        int numero =  cantidad(0);
        
        // Elementos ->   0        1      2       3
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.print("Elegiste el número de array "+ numero +" = ");
        System.out.println(cars[numero]);
        
        } // fin de main
    
    public static int cantidad (int n) { // declaracion del metodo
        int aux; // declaracion local
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige entre cero (0) y tres (3), por favor...)");
        aux = scanner.nextInt();
        scanner.close();
        return aux;
        } // fin del proceso factorial    

} // fin de la clase principal