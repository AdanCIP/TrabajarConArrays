/**
* Ejercicio trabajar con Arrays
* 
* @author  Adán García Santos
* @version 1.0
* @since   04-02-2018
*/

package com.cip.prog;
import java.util.Scanner;

public class TrabajarConArrays {
	
	//----- DECLARACIÓN MÉTODOS ----------------------------------	
	//MÉTODO: Encontrar valor más alto en array dado 
	public static int mayorValor (int[] numeros) {
		int mayor = 0;
		for(int i=0;i<numeros.length;i++) {		//Recorrer array
			if (mayor < numeros[i]) {
				mayor = numeros[i];				//Si el numero es mayor al anterior encontrado se almacena en variable mayor
			}
		}
		return mayor;
	}
	
	//MÉTODO: Encontrar valor menor en array dado 
	public static int menorValor (int[] numeros) {
		int menor = numeros[0];
		for(int i=0;i<numeros.length;i++) {		//Recorrer array
			if (menor > numeros[i]) {			
				menor = numeros[i];				//Si el numero es menor al anterior encontrado se almacena en variable mayor
			}
		}
		return menor;
	}

	//MÉTODO: Calcular media de un array dado
	public static int calcularMedia (int[] numeros) {
		int suma = 0;
		for(int i=0;i<numeros.length;i++) {		//Se recorre array
			suma = suma + numeros[i];			//Se almacena el valor de la posición del array a la suma de las anteriores
		}
		return suma/numeros.length;
	}
		
	//MÉTODO: Imprimir todos los valores de un array dado
	public static void imprimirArray(int [] numeros) {
		for(int i=0;i<numeros.length;i++) {		//Se recorre array
			System.out.print(numeros[i] + ", ");	//Se muestra uno a uno
		}
		System.out.println("");
	}
	
	//MÉTODO: Encontrar número en un array dado
	public static int encontrarNumero (int[] numeros, int numero) {
		int encontrado = 0;
		for(int i=0;i<numeros.length;i++) {		//Se recorre array
			if (numero == numeros[i]) {			//Se compara si es con el que se desea buscar
				encontrado++;					//En caso de ser igual se aumenta en uno el valor de la variable que suma los encontrados
			}
		}
		return encontrado;
	}
	
	
	public static void main(String[] args) {
		
		//---- DECLARACÓN VARIABLES, ARRAYS, ETC. ------------------------------------------
		int opcion = 10;
		Scanner sc_opcion = new Scanner(System.in);		//Se inicializa lector de opcion
		Scanner sc_numero = new Scanner(System.in);
		int[] numeros = new int[20];						//Array de 20 números enteros
		
		
		//----- GENERAR NÚMEROS ALEATORIOS ARRAY -------------------------------------------
		for(int i=0;i<20;i++) {
			numeros[i]=(int)(Math.random()*20*1);		//Se genera número aleatorio 1-20
		}
		
		
		//----- IMPRESIÓN DE MENU EN PANTALLA ----------------------------------------------
		while (opcion != 0) {
			
			System.out.println("----------------------------------------------------");
			System.out.println("1. Imprimir el mayor valor del array.");
			System.out.println("2. Imprimir el menor valor del array.");
			System.out.println("3. Calcular la media de todos los valores del array.");
			System.out.println("4. Imprimir todos los valores del array.");
			System.out.println("5. Encontrar número en array.");
			System.out.println("----------------------------------------------------");
			
			System.out.println("Escoja una opción: ");
			opcion = sc_opcion.nextInt();				//Se almacena en variable la opción seleccionada	
		
			switch (opcion) {
				case 1: System.out.println(mayorValor(numeros)); break;
				case	 2: System.out.println(menorValor(numeros)); break;
				case 3: System.out.println(calcularMedia(numeros)); break;
				case 4: imprimirArray(numeros); break;
				case 5: System.out.println("Introduzca número que quiere buscar: ");
						int numero_buscar =  sc_numero.nextInt();	//Se pide por teclado número a encontrar
						System.out.println(encontrarNumero(numeros, numero_buscar));
						break;
				default: System.out.println("Introduzca un número correcto");
			}
		}
		sc_numero.close();
		sc_opcion.close();
	}
}
