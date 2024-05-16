package ciclos;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Practica7_1 {
	
	public static void main(String[] args) {
		
		int codMenuPpal = 0, codMenuTipico = 0, codMenuALaCarta = 0, codMenuInternacional = 0, contadorPlatos = 0, contadorPlatosTipicos = 0, contadorPlatosCarta = 0,
				contadorPlatosInternacionales = 0, contadorFrijoles = 0, contadorSopaVerduras = 0, contadorTrucha = 0, contadorSolomillo = 0, contadorCostilla = 0,
				contadorPastas = 0, contadorPaella = 0, contadorCausa = 0, precioFinal = 0, precioTipicos = 0, precioALaCarta = 0, precioInternacionales = 0,
				precioFrijoles = 12000, precioSopaVerduras = 8000, precioTrucha = 30000, precioSolomillo = 40000, precioCostilla = 50000, precioPastas = 35000,
				precioPaella = 40000, precioCausa = 45000;
		String nombreUsuario = JOptionPane.showInputDialog("Por favor ingrese su nombre"), nombreRestaurante = "Cocina D'Autor", ciudad = "Armenia, Quindío",
				nit = "Nit: 1.094.245.258-3";
		
		do {
			contadorPlatosTipicos = contadorFrijoles + contadorSopaVerduras;
			contadorPlatosCarta = contadorTrucha + contadorSolomillo + contadorCostilla;
			contadorPlatosInternacionales = contadorPastas + contadorPaella + contadorCausa;
			contadorPlatos = contadorPlatosTipicos + contadorPlatosCarta + contadorPlatosInternacionales;
			
			precioTipicos = (contadorFrijoles*precioFrijoles) + (contadorSopaVerduras*precioSopaVerduras);
			precioALaCarta = (contadorTrucha*precioTrucha) + (contadorSolomillo*precioSolomillo) + (contadorCostilla*precioCostilla);
			precioInternacionales = (contadorPastas*precioPastas) + (contadorPaella*precioPaella) + (contadorCausa*precioCausa);
			precioFinal = precioTipicos + precioALaCarta + precioInternacionales;
			
			String menu = "MENU RESTAURANTE\n\n"
					+ "1. Plato Tipico\n"
					+ "2. Plato a la Carta\n"
					+ "3. Plato Internacional\n"
					+ "4. Salir\n\n"
					+ "Seleccione una opción\n";
			codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (codMenuPpal) {
			case 1:
				do {
					String menuTipico = "MENU TIPICO\n\n"
							+ "1. Frijoles\n"
							+ "2. Sopa de Verduras\n"
							+ "3. Regresar\n\n"
							+ "Por favor seleccione una opción\n";
					codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
							
					switch (codMenuTipico) {
					case 1:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado un plato de Frijoles, el costo es de $" + precioFrijoles);
						contadorFrijoles += 1;
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado una Sopa de Verduras, el costo es de $" + precioSopaVerduras);
						contadorSopaVerduras += 1;
						break;
					case 3:
						
						break;

					default:
						JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido",
								"ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
						break;
					}
					
					if (codMenuTipico == 3) {
						break;
					}
					
					codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menú Tipico, "
							+ "de lo contrario regresará al menú principal"));
					
					if (codMenuTipico != 1) {
						codMenuTipico = 3;
					}
				} while (codMenuTipico != 3);				
				
				break;
			case 2:
				do {
					String menuALaCarta = "MENU A LA CARTA\n\n"
							+ "1. Trucha al Ajillo\n"
							+ "2. Solomillo de Cordero al Horno\n"
							+ "3. Costilla de Cerdo con Vino Tinto\n"
							+ "4. Regresar\n\n"
							+ "Por favor seleccione una opción";
					codMenuALaCarta = Integer.parseInt(JOptionPane.showInputDialog(menuALaCarta));
					
					switch (codMenuALaCarta) {
					case 1:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado una Trucha al Ajillo, el costo es de $" + precioTrucha);
						contadorTrucha += 1;
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado un Solomillo de Cordero al Horno, el costo es de $" + precioSolomillo);
						contadorSolomillo += 1;
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado una Costilla de Cerdo con Vino Tinto, el costo es de $" + precioCostilla);
						contadorCostilla += 1;
						break;
					case 4:
						
						break;

					default:
						JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido",
								"ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
						break;
					}
					 
					if (codMenuALaCarta == 4) {
						break;
					}
					
					codMenuALaCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menú a la Carta, "
							+ "de lo contrario regresará al menú principal"));
					
					if (codMenuALaCarta != 1) {
						codMenuALaCarta = 4;
					}					
				} while (codMenuALaCarta != 4);
				
				break;
			case 3:
				do {
					String menuIntercacional = "MENU INTERNACIONAL\n\n"
							+ "1. Pastas a la Napolitana\n"
							+ "2. Paella\n"
							+ "3. Causa Limeña\n"
							+ "4. Regresar\n\n"
							+ "Por favor seleccione una opción";
					codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuIntercacional));
					
					switch (codMenuInternacional) {
					case 1:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado unas Pastas a la Napolitana, el costo es de $" + precioPastas);
						contadorPastas += 1;
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado una Paella, el costo es de $" + precioPaella);
						contadorPaella += 1;
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Usted ha solicitado una Causa Limeña, el costo es de $" + precioCausa);
						contadorCausa += 1;
						break;
					case 4:
						
						break;
					default:
						JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido"
								, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
						break;
					}
					
					if (codMenuInternacional == 4) {
						break;
					}
					
					codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menú Internacional, "
							+ "de lo contrario regresará al menú principal"));
					
					if (codMenuInternacional != 1) {
						codMenuInternacional = 4;
					}
				} while (codMenuInternacional != 4);
				
				break;
			case 4:
				if (contadorPlatos == 0) {
					JOptionPane.showMessageDialog(null, nombreUsuario + " gracias por elegirnos\n"
							+ "Esperamos que la proxima vez encuentre el plato que estaba buscando");
				} else {
					JOptionPane.showMessageDialog(null, nombreUsuario + " el total de platos pedidos fué: " + contadorPlatos + "\n\n"
						+ "Número de platos Tipicos: " + contadorPlatosTipicos + "\n"
						+ "Número de platos a la Carta: " + contadorPlatosCarta + "\n"
						+ "Número de platos Internacionales: " + contadorPlatosInternacionales + "\n\n"
						+ "El costo total es de $" + precioFinal);
					
					System.out.println(nombreRestaurante + "\n" + ciudad + "\n" + nit + "\n\n"
							+ "Factura N° 15234\n\n"
							+ LocalDateTime.now() + "\n"
							+ "Descripción\n"
							+ "Valor por concepto de platos tipicos: $" + precioTipicos + "\n"
							+ "Valor por concepto de platos a la carta: $" + precioALaCarta + "\n"
							+ "Valor por concepto de platos internacionales: $" + precioInternacionales + "\n\n"
							+ "Valor total del servicio: $" + precioFinal);
				}
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido",
						"ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
				break;
			}
			
		}while(codMenuPpal != 4);
		
	}

}
