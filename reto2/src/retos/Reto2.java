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
				Funciones2.submenuTemperatura(sc);
			} else if (num == 4) {
				Funciones2.submenuVolumen(sc);
			}

		} while (num != 0);

	}

}
