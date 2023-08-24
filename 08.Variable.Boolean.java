// Uso de variables: Boolean
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Este programa muestra como se declaran las variables en
// el elnguaje Java
// 
// Usa librerías estándar y java.io.*

import java.io.*;

public class VariableString {

    public static void main(String[] args){

	// Tipos de variables usadas en Java
	// ---------------------------------
	// 	• byte
	// 	• short
	// 	• int
	// 	• long
	// 	• float
	// 	• double
	// 	• boolean
	// 	• char
	//
	// Descripción de cada tipo de variables usadas en Java
	// ----------------------------------------------------
	// 
	//	• byte: Representa un tipo de dato de 8 bits (1 Byte) con signo. 
	//              Puede almacenar los valores numéricos de -128 a 127 
	//              (ambos inclusive).
	// 
	//	• short: Representa un tipo de dato de 16 bits con signo (2 Bytes). 
	//               Almacena valores numéricos de -32.768 a 32.767
	//               En algunos apuntes se le llama "entero corto" 
	// 
	//	• int: Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. 		//             Valor mínimo (-231), el valor máximo es (231 – 1).
	//             En algunos apuntes se le llama "integer" o "entero"
	//  
	//  	• long: Es un tipo de dato de 64 bits con signo que almacena valores numéricos
	//              entre -263 a 263 - 1
	//              En algunos apuntes se le llama "largo"
	//
	//	• float: Es un tipo dato para almacenar números en coma flotante con precisión
	//               simple de 32 bits.
	//
	//	• double: Es un tipo de dato para almacenar números en coma flotante con doble 			//	          precisión de 64 bits.
	//
	//	• boolean: Sirve para definir tipos de datos booleanos. Es decir, aquellos que 
	//                 tienen un valor de true o false. Ocupa 1 bit de información.
	//
	//	• char: Es un tipo de datos que representa a un carácter Unicode sencillo de 16 
	//	        bits.
	//	        Java no tiene un tipo de dato específico para cadenas de caracteres que
	//              incluya letras mayúsculas, letras minúsculas, caracteres numéricos y
	// 		caracteres de teclado. Para ese tipo de datos, Java tiene una clase 
	//              especial llamada String que es usada para el manejo de cadenas.

	boolean mi_variable; // declaracion de variable

	// definición de una variable tipo caracter o string
	// las variables logicas pueden contener dos valores
	// verdadero - falso 

	System.out.println(""); // no hay forma directa de borrar la consola en Java
	mi_variable = true;

	System.out.println("Variable logica:");
	System.out.println(" ");
	System.out.println("mi_variable = "+mi_variable);
	System.out.println(" ");
	System.out.println("Presione una tecla para seguir");
	System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
	System.out.println(""); // no hay forma directa de borrar la consola en Java

	mi_variable = false;
	System.out.println("Variable logica:");
	System.out.println(" ");
	System.out.println("mi_variable = "+mi_variable);
	System.out.println(" ");
	System.out.println("Presione una tecla para seguir");
	System.out.println("  ");
	System.out.println("Fin del programa");

    } //fin del main

} // fin de la clase
