package retos;

import java.util.Scanner;

public class Funciones2 {
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
}
