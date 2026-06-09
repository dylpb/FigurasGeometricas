/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Dylan
 */
public abstract class FiguraGeometrica {

    protected double area;
    protected double perimetro;
    
    public double getArea(){
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
   
    
    //metodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
}
