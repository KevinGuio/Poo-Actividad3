/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

public class Triangulo {
    public static double calcularArea(double base, double altura) {
    return (base * altura / 2);
    }

    //perímetro del triangulo
    public static double calcularPerímetro(double base, double altura, double c) {
    return (base + altura + c); 
    } // calculo la hipotenusa

    //calculo hipotenusa del triangulo
    public static double calcularHipotenusa(double base, double altura) {
        double c;
        c = Math.pow(base*base + altura*altura, 0.5);
        return c;
    }

}
