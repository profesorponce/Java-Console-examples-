// Tabla en consola
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Este programa muestra como encolumnar datos en la
// consola para una visualización ordenada
// 
// Usa librerías estándar y no requiere librerías adicionales

public class SecuenciasEscape {

    public static void main(String[] args){

	// secuencias de escape		significado
        // ----------------------------------------
	// 	\b			borrar hacia atras
	// 	\n			cambia a nueva linea
	// 	\t			salto de tabulador
	// 	\r			salto de linea
	// 	\\			dibujar contrabarra
	// 	\"			dibujar comillas dobles
	// 	\'			dibujar comilla simple

        System.out.println ("Tabla de datos \"Desordenada\"");
        System.out.println ("Nombre Altura");
        System.out.println ("----------------------------");
        System.out.println ("Juan 1,69");
        System.out.println ("Carlos 1,70");
        System.out.println ("Ana 1,73");
        System.out.println ("Inés 1,65");
        System.out.println ("Lucía 1,73");

        System.out.println ("Tabla de datos \"Ordenada\"");
        System.out.println ("Nombre \t\tAltura");
        System.out.println ("----------------------------");
        System.out.println ("Juan \t\t1,69");
        System.out.println ("Carlos \t\t1,70");
        System.out.println ("Ana \t\t1,73");
        System.out.println ("Inés \t\t1,65");
        System.out.println ("Lucía \t\t1,73");

    } //fin del main

} // fin de la clase
