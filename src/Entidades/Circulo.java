/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Sergio Jurado
 */
public class Circulo{
    
    private Double area;
    private Double perimetro;
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double area, Double perimetro, Double radio, Double diametro) {
        this.area = area;
        this.perimetro = perimetro;
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    
    
    
}
