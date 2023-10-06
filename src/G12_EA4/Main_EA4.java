/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G12_EA4;

import Entidades.Circulo;
import Servicios.CirculoServicio;
import java.util.Scanner;

/**
 *
 * @author Sergio Jurado
 */
public class Main_EA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo circ = new Circulo();
        CirculoServicio cs = new CirculoServicio();
        Scanner leer = new Scanner(System.in);

        int opc;

        System.out.println("---- SISTEMA PARA EL CÁLCULO DE AREA Y PERÍMETRO ----");
        System.out.println("");
        System.out.println("1 - Calcular el área de un círculo");
        System.out.println("2 - Calcular el perímetro de un círculo");
        System.out.println("3 - Calcular el área de un rectángulo");
        System.out.println("4 - Calcular el perímetro de un rectángulo");
        System.out.println("5 - SALIR");
        System.out.println("");

        do {

            System.out.println("Por favor seleccione la opción deseada:");
            opc = leer.nextInt();
            System.out.println("");

            switch (opc) {
                case 1:
                    System.out.println("CALCULAR EL ÁREA DE UN CIRCULO");
                    System.out.println("");
                    circ.setArea(cs.CalcularArea());
                    System.out.println("El área del circulo es: " + circ.getArea());
                    break;
                case 2:
                    System.out.println("CALCULAR EL PERÍMETRO DE UN CIRCULO");
                    System.out.println("");
                    circ.setPerimetro(cs.CalcularPerimetro());
                    System.out.println("El perímetro del circulo es: " + circ.getPerimetro());
                    break;
                case 3:
                    System.out.println("EN CONSTRUCCIÓN");
                    break;
                case 4:
                    System.out.println("EN CONSTRUCCIÓN");
                    break;
                case 5:
                    System.out.println("HASTA PRONTO...!!");
                    break;
                default:
                    System.out.println("Seleccionaste una opción inválida, por favor intenta de nuevo");
            }
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("");

        } while (opc != 5);

    }

}
