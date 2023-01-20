/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplojava2023;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EjemploJava2023 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);	
		int suma = 0;
		int[][] matriz = new int[4][4];
		int[] resultado = new int[10];
		int matrizres = 0;
		
	for(int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			System.out.println("Introduce un numero para la matriz (introduccion en filas):");
				matriz[j][i] = scan.nextInt();
		}
	}
	
	System.out.println(Arrays.deepToString(matriz));
	//filas
	suma = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0];
		resultado[0] = suma;
	suma = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1];
		resultado[1] = suma;
	suma = matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2];
		resultado[2] = suma;
	suma = matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3];
		resultado[3] = suma;
	
	//columnas
	suma = matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3];
		resultado[4] = suma;
	suma = matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3];
		resultado[5] = suma;
	suma = matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3];
		resultado[6] = suma;
	suma = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3];
		resultado[7] = suma;
	//diagonales
	suma = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
		resultado[8] = suma;
	suma = matriz[3][0] + matriz[2][1] + matriz[1][2] + matriz[0][3];
		resultado[9] = suma;
		
	System.out.println(Arrays.toString(resultado));	
		
		for(int i = 1; i < resultado.length - 1; i++) {
			if(resultado[i] == resultado[i - 1]) {
				matrizres++;
				
			}
		}
		
		if(matrizres == 8) {
			System.out.println("Se trata de una matriz magica.");
		}
    }
}
