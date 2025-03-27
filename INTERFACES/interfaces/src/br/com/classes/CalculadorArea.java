package br.com.classes;

public class CalculadorArea {
    public double somarAreas(FiguraGeomatrica figuraA, FiguraGeomatrica figuraB){
        return figuraA.calcularArea() + figuraB.calcularArea();
    }
}
