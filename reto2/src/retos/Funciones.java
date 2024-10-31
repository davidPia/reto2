package retos;

import java.util.Scanner;

public class Funciones {

	public static boolean esInt(String s) {

		try {
			int i = Integer.parseInt(s);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public static boolean esDouble(String s) {

		try {
			Double i = Double.parseDouble(s);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s1 = sc.nextLine();
				int num = Integer.parseInt(s1);
				return num;
			} catch (Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		} while (true);
	}

	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s1 = sc.nextLine();
				Double num = Double.parseDouble(s1);
				return num;
			} catch (Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		} while (true);
	}
}
