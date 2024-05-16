package condicionales;

/*
 * algoritmo para determinar cuándo un número es mayor, menor o igual a cero.
 */

public class Ejemplo3 {

	public static void main(String[] args) {
		
		int valor = 80;
		
		if(valor>0) {
			System.out.println("El número es mayor a cero");
		} else {
			if(valor<0) {
				System.out.println("El número es menor a cero");
			} else {
				System.out.println("El número es igual a cero");
			}
		}

	}

}


/*
 *
 * int valor = -10;
		
		if(valor>0) {
			System.out.println("El número es mayor a cero");
		}else if(valor==0) {
			System.out.println("El número es igual a cero");
		}else {
			System.out.println("El número es menor a cero");
		}
 */