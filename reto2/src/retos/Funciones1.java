package retos;

import java.util.Scanner;

public class Funciones1 {

	public static void submenuLongitudes(Scanner sc) {
		double num2 = 89;
		do {
			System.out.println("1.Millas a Km");
			System.out.println("2.Km a Millas");
			System.out.println("0.Salir");
			String texto1 = "  ";
			num2 = Funciones.dimeEntero(texto1, sc);
			if (num2 == 1) {
				System.out.println(Funciones1.Millas_Km(sc));
			} else if (num2 == 2) {
				System.out.println(Funciones1.Km_Millas(sc));
			}
		} while (num2 != 0);
	}

	public static void submenuPesos(Scanner sc) {
		double num2 = 89;
		do {
			System.out.println("1.kg a libras");
			System.out.println("2.libras a kg");
			System.out.println("0.Salir");
			String texto1 = "  ";
			num2 = Funciones.dimeEntero(texto1, sc);
			if (num2 == 1) {
				System.out.println(Funciones1.Kg_Libras(sc));
			} else if (num2 == 2) {
				System.out.println(Funciones1.Libras_Kg(sc));
			}
		} while (num2 != 0);
	}

	public static double Millas_Km(Scanner sc) {
		String texto = "Introduce la longitud en millas";
		double millas = Funciones.dimeDouble(texto, sc);
		double Km = millas * 1.60934;
		return Km;
	}

	public static double Km_Millas(Scanner sc) {
		String texto = "Introduce la longitud en kilometros";
		double Km = Funciones.dimeDouble(texto, sc);
		double millas = Km / 1.60934;
		return millas;
	}

	public static double Kg_Libras(Scanner sc) {
		String texto = "Introduce el peso en kilogramos";
		double kg = Funciones.dimeDouble(texto, sc);
		double libras = kg * 2.20462;
		return libras;
	}

	public static double Libras_Kg(Scanner sc) {
		String texto = "Introduce el peso en libras";
		double libras = Funciones.dimeDouble(texto, sc);
		double kg = libras / 2.20462;
		return kg;
	}
}
