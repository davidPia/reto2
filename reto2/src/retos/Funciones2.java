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

	

