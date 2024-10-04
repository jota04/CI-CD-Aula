/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author 823136305
 */
public class Calculadora {
    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }
    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }
    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return numero1 / numero2;
    }
    public double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }
   
}
