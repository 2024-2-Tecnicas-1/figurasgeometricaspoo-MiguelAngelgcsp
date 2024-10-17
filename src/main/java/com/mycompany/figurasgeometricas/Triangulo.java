
package com.mycompany.figurasgeometricas;


public class Triangulo extends FiguraGeometrica
{

    private double base;
    private double altura;
    
    public Triangulo(String nombre , String color, double base , double altura) 
    {
        super(nombre , color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    @Override
    public double obtenerArea ()
    {
    double lado = (2 * altura) / Math.sqrt(3);
    return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
    
    @Override
    public double obtenerPerimetro()
    {
    double lado = (2 * altura) / Math.sqrt(3);
     return 3 * lado;

    }
    
    
}
