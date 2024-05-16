package ciclos;

import javax.swing.JOptionPane;

public class Practica7_2 {

	public static void main(String[] args) {
		
		int i = 0, codMenuPrincipal = 0, numero1 = 0, numero2 = 0, suma = 0, n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea que se repita el ciclo"));	
		String menuPrincipal = "MENU PRINCIPAL\n\n"
				+ "1. Saludar.\n"
				+ "2. Pedir Nombre de una Persona.\n"
				+ "3. Sumar 2 Números.\n\n"
				+ "Por Favor Elija una Opción";
				
		do {
			codMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
			
			switch (codMenuPrincipal) {
			case 1:
				JOptionPane.showMessageDialog(null, "Hola bienvenido al programa Ejercicio 7.2");
				break;
			case 2: 
				String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
				JOptionPane.showMessageDialog(null, "El nombre ingresado fué: " + nombre);
				break;
			case 3:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
				suma = numero1 + numero2;
				JOptionPane.showMessageDialog(null, "La suma de los números ingresados es : " + suma);
				break;
			default:
				JOptionPane.showMessageDialog(null, "El código ingresado no corresponde a ninguna Opción");
				break;
			}
			
			i++;
						
		} while (i<n);

	}

}
