
package calculadora;

import java.util.Scanner;

public class CalculadoraEnde {
	
	
	public static void main(String[] args)
	{
		int opcion = 0;
		boolean opcionVal = true;
		int resultado = 0;
		Scanner entrada = new Scanner(System.in);
		
		do
		{	//pedimos los números con los que vamos a realizar la operación
			System.out.println("Introduce el primer número: ");
			int operando1 = entrada.nextInt();
			System.out.println("Introduce el segundo número");
			int operando2 = entrada.nextInt();
			
			System.out.println("Seleccione la operación que quiera realizar");
			System.out.println("1-Suma");
			System.out.println("2-Resta");
			System.out.println("3-Multiplicación");
			System.out.println("4-División");
			System.out.println("5-Salir");
			do
			{
				opcion = entrada.nextInt();
				opcionVal = (opcion >= 1 && opcion <= 5);
				if(!opcionVal)
					System.out.println("Opción no válida, introduce otra.");
			}while(!opcionVal);
			
			switch(opcion) 
			{
				case 1:
					resultado = operando1 + operando2;
					System.out.println("El resultado de la suma es: " + resultado);
					break;
				case 2:
					resultado = operando1 - operando2;
					System.out.println("El resultado de la resta es: " + resultado);
					break;
				case 3:
					resultado = operando1 * operando2;
					System.out.println("El resultado de la multiplicación es: " + resultado);
					break;
				case 4:
						resultado = operando1 / operando2;
						System.out.println("El resultado de la división es: " + resultado);
					break;
				case 5:
					System.out.println("Fin");
			}	
		}while(opcion != 5);
	}
}