/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circulo;
import Interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author Sergio Jurado
 */
public final class CirculoServicio implements CalculosFormas {

    Scanner leer = new Scanner(System.in);
    Circulo circ = new Circulo();
    
    @Override
    public Double CalcularArea() {
        
        System.out.println("Por favor, ingrese el radio del circulo");
        circ.setRadio(leer.nextDouble());
        circ.setArea(CONSTPI * (Math.pow(circ.getRadio(), 2)));
        return circ.getArea();
        
    }

    @Override
    public Double CalcularPerimetro() {
        
        System.out.println("Por favor, ingrese el diámetro del circulo");
        circ.setDiametro(leer.nextDouble());
        circ.setPerimetro(CONSTPI * circ.getDiametro());
        return circ.getPerimetro();
        
    }
    
    
    
}
