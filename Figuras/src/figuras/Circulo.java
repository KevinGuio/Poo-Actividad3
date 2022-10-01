/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

public class Circulo {
    //cálculo area del circulo
    public static double calcularArea(double radio) {
    return Math.PI*Math.pow(radio,2);
    }
    //perímetro del circulo
    public static double calcularPerímetro(double radio) { 
    return 2*Math.PI*radio;
    }
}
