/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package application;
import entities.Calculadora;
import java.util.Locale;
import java.util.Scanner;
//import javax.swing.JOptionPane;
/**
 *
 * @author 823136305
 */
public class Program {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        /*System.out.println("Selecione a operação: ");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");*/
        
        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
                     
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        double soma = calc.somar(numero1, numero2);
        System.out.println("Soma: " + soma);
        
        double subtracao = calc.subtrair(numero1, numero2);
        System.out.println("Subtração: " + subtracao);
        
        double divisao = calc.dividir(numero1, numero2);
        System.out.println("Divisão: " + divisao);
        
        double multiplicacao = calc.multiplicar(numero1, numero2);
        System.out.println("Multiplicação: " + multiplicacao);
    
        
        
     sc.close();
    }
}
