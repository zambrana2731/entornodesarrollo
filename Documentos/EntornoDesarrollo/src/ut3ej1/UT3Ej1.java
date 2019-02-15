package ut3ej1;

import java.util.Scanner;

public class UT3Ej1 {

	public static void main(String[] args) {

	int a, b, c, Mayor, Medio, Menor;

	Scanner entrada = new Scanner(System.in);

		System.out.println("Dado 3 numeros devolver los 3 en orden ascendente");
		
		System.out.println("Introduce el 1º numero");
		a = entrada.nextInt();
		
		System.out.println("Introduce el 2º numero");
		b = entrada.nextInt();
			
		System.out.println("Introduce el 3º numeero");
		c = entrada.nextInt();
		
		if (a > b && a > c) {
			Mayor = a;
				} else if (b > a && b > c) {
					Mayor = b;
				} else {
					Mayor = c;
				}
		
		if (a < b && a < c) {
			Menor = a;
				} else if (b < a && b < c) {
					Menor = b;
				} else {
					Menor = c;
				}
		
		Medio = (a + b + c) - (Mayor + Menor);
		

		System.out.println("El orden de mayor a menor es: ");
		
		System.out.println(Mayor + " " + Medio + " " + Menor);
	}
}