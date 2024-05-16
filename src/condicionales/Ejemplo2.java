package condicionales;

/*
 * Ej: algoritmo que determina cuando una persona es mayor o menor de edad, teniendo como mayor de edad
 * las personas con edades iguales o superiores a 18 años.
  */

public class Ejemplo2 {
	
	public static void main(String[] args) {
		
		int edad = 5;
		
		if(edad>=18) {
			System.out.println("La persona es mayor de edad.");
		}else {
			System.out.println("La persona no es mayor de edad.");
		}

	}

}
