package retos;

import java.util.Scanner;

public class Funciones1 {
	
	
	public static double Millas_Km(Scanner sc) {
		String texto="Introduce la longitud en millas";
		double millas=Funciones.dimeDouble(texto, sc);
		double Km=millas*1.60934;
		return Km;
	}
	
	public static double Km_Millas(Scanner sc) {
		String texto="Introduce la longitud en kilometros";
		double Km=Funciones.dimeDouble(texto, sc);
		double millas=Km/1.60934;
		return millas;
	}
}
