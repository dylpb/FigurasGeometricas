/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;

import figurasgeometricas.FiguraGeometrica;

/**
 *
 * @author Dylan
 */
public class Circulo extends FiguraGeometrica{
    
    private double radio;
    private static final double PI = Math.PI;

    public double getRadio() {
        return radio;
    }

    public static double getPI() {
        return PI;
    }
    
    public double getDiametro(){
        return radio*2;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

//    metodo constructor
    public Circulo(double radio) { 
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea(){
        this.area = Math.pow(radio, 2) * PI;  // math.pow se usa para elevar
        return area;
    
    }
    
    @Override
    public double calcularPerimetro(){
        this.perimetro = 2 * PI * radio;
        
        return perimetro;
    }
    
}
