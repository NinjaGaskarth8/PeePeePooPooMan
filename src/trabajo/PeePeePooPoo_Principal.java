package trabajo;

import java.util.Scanner;

public class PeePeePooPoo_Principal {

	public static void main(String[] args) {

		System.out.println("El Pee Pee Poo Poo Man quiere crear una calculadora, �le ayudas?");
		System.out.println("S�lo tienes que decir 3 veces su nombre (Pee Pee Poo Poo)");

		// METER "PEEPEEPOOPOO POR TECLADO
		Scanner ent = new Scanner(System.in);
		boolean correcto = false;
		boolean completado = true;
		do {
			System.out.println("Adelante: ");
			String nombre1 = ent.nextLine();
			if (nombre1.equalsIgnoreCase("Pee Pee Poo Poo Man")) {
				correcto = true;
				System.out.println("Dos veces m�s: ");
				String nombre2 = ent.nextLine();
				if (nombre2.equalsIgnoreCase("Pee Pee Poo Poo Man")) {
					correcto = true;
					System.out.println("Una �ltima vez... ");
					String nombre3 = ent.nextLine();

					if (nombre3.equalsIgnoreCase("Pee Pee Poo Poo Man")) {
						correcto = true;
						completado = true;

					} else {

						correcto = false;
					}
				} else {
					correcto = false;
				}
			} else {
				correcto = false;
			}
			if (correcto == false) {
				System.out.println("Nombre incorrecto, el Pee Pee Poo Poo Man se est� enfadando...");

			}
		} while (correcto == true && !completado);

		
		// CALCULADORA
		Scanner ent2 = new Scanner(System.in);
		int opcion = 0;
		float op1 = 0.0f, op2 = 0.0f;

		do {
			System.out.println("Calculadora PeePeePooPoo: \n" + "1�) Suma \n" + "2�) Resta \n" + "3�) Multiplicaci�n \n"
					+ "4�) Divisi�n \n" + "5�) Salir \n");

			opcion = ent2.nextInt();

			if (opcion >= 1 && opcion <= 4) {
				System.out.println("Introduce un n�mero:");
				op1 = ent2.nextFloat();
				System.out.println("Introduce el otro n�mero:");
				op2 = ent2.nextFloat();
			}

			switch (opcion) {
			case 1:
				sumar(op1, op2);
				break;
			case 2:
				restar(op1, op2);
				break;
			case 3:
				multiplicar(op1, op2);
				break;
			case 4:
				dividir(op1, op2);
				break;
			case 5:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opci�n no v�lida.");
			}

		} while (opcion != 5);

		System.out.println("Gracias por ayudar al PeePeePooPoo Man, jam�s lo olvidar�");
		
	}
	//M�TODOS CORRESPONDIENTES PARA REALIZAR LAS OPERACIONES :)
	
	public static void sumar(float op1, float op2) {
		
		System.out.println("La suma de " + op1 + " y " + op2 + " es: " + (op1+op2));
		
	}
	
	public static void restar(float op1, float op2) {
		
		if(op1>op2) {
			
			System.out.println("La resta de " + op1 + " y " + op2 + " es: " + (op1-op2));
			
		}else {
			
			System.out.println("La resta de " + op2 + " y " + op1 + " es: " + (op2-op1));
			
		}

	}
	
	   public static void multiplicar(float op1, float op2) {
		   float resul=0f;
			resul= op1*op2;
			System.out.println("La multiplicaci�n de " + op1 + " por " + op2 + " es " + resul);
	    }
	  
	   public static void dividir(float op1, float op2) {
		   float resul=0f;
			resul= op1/op2;
			System.out.println("La divisi�n de " + op1 + " entre " + op2 + " es " + resul);
	   }
	
}
