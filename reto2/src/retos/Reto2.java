package retos;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 89;
		double num2 = 89;

		do {
			System.out.println("Selecciona el tipo de conversion");
			System.out.println("1.Longitud");
			System.out.println("2.Peso");
			System.out.println("3.Temperatura");
			System.out.println("4.Volumen");
			System.out.println("0.Salir");
			String texto = "  ";
			num = Funciones.dimeEntero(texto, sc);

			if (num == 1) {
				Funciones1.submenuLongitudes(sc);
			} 
			
			
			else if (num == 2) {				
				Funciones1.submenuPesos(sc);
			}
			
			else if (num == 3) {				
				do {
					System.out.println("1.Celsius a fahrenheit");
					System.out.println("2.Fahrenheit a celsius");
					System.out.println("0.Salir");
					String texto1 = "  ";
					num2 = Funciones.dimeEntero(texto1, sc);
					if (num2 == 1) {
						System.out.println(Funciones2.Celsius_Fahrenheit(sc));
					} else if (num2 == 2) {
						System.out.println(Funciones2.Fahrenheit_Celsius(sc));
					}
				} while (num2 != 0);
			}
			else if (num == 4) {				
				do {
					System.out.println("1.Litros a galones");
					System.out.println("2.Galones a litros");
					System.out.println("0.Salir");
					String texto1 = "  ";
					num2 = Funciones.dimeEntero(texto1, sc);
					if (num2 == 1) {
						System.out.println(Funciones2.Litros_Galones(sc));
					} else if (num2 == 2) {
						System.out.println(Funciones2.Galones_Litros(sc));
					}
				} while (num2 != 0);
			}
			
			

		} while (num != 0);
		
		

	}

}
