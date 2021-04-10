package segundoEjercicio;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {


	private static String[] getPalabras(String[] palabras){
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Ingrese palabra: " + i);
			palabras[i] = input.nextLine();
		};
		
		return palabras;
		
	};
	
	private static void showInvertedPalabras(String[] palabras) {
			
			for(int i=9;i>=0;i--) {
				System.out.println(palabras[i]);
			};
		
	}


	public static void main(String[] args) {

		String[] palabras = new String[10];
		
		palabras = getPalabras(palabras);
		showInvertedPalabras(palabras);
		
	}

}
