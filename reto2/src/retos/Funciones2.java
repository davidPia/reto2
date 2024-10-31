package retos;

import java.util.Scanner;

public class Funciones2 {
	public static void submenuTemperatura(Scanner sc) {
		int num2=89;
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
	public static void submenuVolumen(Scanner sc) {
		int num2=89;
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
	public static double Celsius_Fahrenheit( Scanner sc) {
		String texto = "Introduce una temperatura en Celsius";
		double cels = Funciones.dimeDouble(texto, sc);
		double fahren = (cels*9/5)+32;
		return fahren;
	}
	public static double Fahrenheit_Celsius( Scanner sc) {
		String texto = "Introduce una temperatura en Fahrenheit";
		double fahren = Funciones.dimeDouble(texto, sc);
		double cels = (fahren-32)*5/9;
		return cels;
	}
	public static double Litros_Galones( Scanner sc) {
		String texto = "Introduce un volumen en Litros";
		double litros = Funciones.dimeDouble(texto, sc);
		double galones = litros*0.264172;
		return galones;
	}
	public static double Galones_Litros( Scanner sc) {
		String texto = "Introduce un volumen en Galones";
		double galones = Funciones.dimeDouble(texto, sc);
		double litros = galones/0.264172;
		return litros;
		} 
	}


