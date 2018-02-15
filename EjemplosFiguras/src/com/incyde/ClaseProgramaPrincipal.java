package com.incyde;

public class ClaseProgramaPrincipal {
	
	public static void main(String[] args) {
        Triangulo trianguloAngela = new Triangulo();
        float[] templongitudes = {2,3,5};
        trianguloAngela.longitudes = templongitudes;
        System.out.println("El perimetro es " + trianguloAngela.perimetro());
        trianguloAngela.base = 5f;
        trianguloAngela.altura = 8f;
        System.out.println(trianguloAngela.toString());
        System.out.println("El perimetro es" + trianguloAngela.area());
        
        Triangulo trianguloPeter = new Triangulo();
        float[] templongitudes1 = {2,3,5};
        trianguloPeter.longitudes = templongitudes1;
        System.out.println("El perimetro es" + trianguloPeter.perimetro());
        trianguloPeter.base = 10f;
        trianguloPeter.altura =12f;
        System.out.println("El area es" + trianguloPeter.area());
        
        
        
    }   
        
}
