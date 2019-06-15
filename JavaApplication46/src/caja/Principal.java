
package caja;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// PUNTO 6

		Caja dibujar = new Caja();

		// PETICIÓN DE DATOS POR TECLADO

		Scanner Datos_Caja = new Scanner(System.in);

		System.out.print("Introduce el carácter de la caja: ");

		dibujar.establece_caracter(Datos_Caja.nextLine());

		System.out.print("Introduce el núemro de columnas: ");

		dibujar.establece_columnas(Datos_Caja.nextInt());

		System.out.print("Introduce el número de filas: ");

		dibujar.establece_filas(Datos_Caja.nextInt());

		System.out.println("");
		System.out.println("");
		System.out.println("");

		for (int contador_col = 0; contador_col < dibujar.dime_filas(); contador_col++) {
			System.out.print(dibujar.dime_caracter());

			for (int contador_fil = 1; contador_fil < dibujar.dime_columnas(); contador_fil++)

				System.out.print(dibujar.dime_caracter());

			System.out.println("");

		}

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.print("Introduce el valor para agrandar la anchura de la caja: ");

		dibujar.aumentarAnchura(Datos_Caja.nextInt());

		System.out.println("");
		System.out.println("");
		System.out.println("");

		for (int contador_col = 0; contador_col < dibujar.dime_filas(); contador_col++) {
			System.out.print(dibujar.dime_caracter());

			for (int contador_fil = 1; contador_fil < dibujar.dime_anchura(); contador_fil++)

				System.out.print(dibujar.dime_caracter());

			System.out.println("");
		}

                System.out.println("");
		System.out.println("" + dibujar.dime_incremento());

		// COMPROBACIONES

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("El carácter es: " + dibujar.dime_caracter());

		System.out.println("El número de columnas es: " + dibujar.dime_columnas());

		System.out.println("Y el número de filas es: " + dibujar.dime_filas());

		System.out.println("Y el número de columnas aumentado es: " + dibujar.dime_anchura());

	}

}