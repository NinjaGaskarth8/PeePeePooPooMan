package trabajo;

import java.util.Scanner;

public class PeePeePooPoo_Principal {

	public static void main(String[] args) {

		System.out.println("El Pee Pee Poo Poo Man quiere crear una calculadora, ¿le ayudas?");
		System.out.println("Sólo tienes que decir 3 veces su nombre (Pee Pee Poo Poo)");

		// METER "PEEPEEPOOPOO POR TECLADO
		Scanner ent = new Scanner(System.in);
		boolean correcto = false;
		boolean completado = true;
		do {
			System.out.println("Adelante: ");
			String nombre1 = ent.nextLine();
			if (nombre1.equalsIgnoreCase("Pee Pee Poo Poo Man")) {
				correcto = true;
				System.out.println("Dos veces más: ");
				String nombre2 = ent.nextLine();
				if (nombre2.equalsIgnoreCase("Pee Pee Poo Poo Man")) {
					correcto = true;
					System.out.println("Una última vez... ");
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
				System.out.println("Nombre incorrecto, el Pee Pee Poo Poo Man se está enfadando...");

			}
		} while (correcto == true && !completado);

		
		// CALCULADORA
		Scanner ent2 = new Scanner(System.in);
		int opcion = 0;
		float op1 = 0.0f, op2 = 0.0f;

		do {
			System.out.println("Calculadora PeePeePooPoo: \n" + "1º) Suma \n" + "2º) Resta \n" + "3º) Multiplicación \n"
					+ "4º) División \n" + "5º) Salir \n");

			opcion = ent2.nextInt();

			if (opcion >= 1 && opcion <= 4) {
				System.out.println("Introduce un número:");
				op1 = ent2.nextFloat();
				System.out.println("Introduce el otro número:");
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
				System.out.println("Opción no válida.");
			}

		} while (opcion != 5);

		System.out.println("Gracias por ayudar al PeePeePooPoo Man, jamás lo olvidará");
		
	}
	//MÉTODOS CORRESPONDIENTES PARA REALIZAR LAS OPERACIONES :)
	
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
			System.out.println("La multiplicación de " + op1 + " por " + op2 + " es " + resul);
	    }
	  
	   public static void dividir(float op1, float op2) {
		   float resul=0f;
			resul= op1/op2;
			System.out.println("La división de " + op1 + " entre " + op2 + " es " + resul);
	   }
	
}
