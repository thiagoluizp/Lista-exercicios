/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author alunoadm
 */
public class Questao11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numeroEntrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int i = numeroEntrada.nextInt();
        if (i < 10) {
            System.out.println(i + " É menor que 10");
        } else if (i > 10){
            System.out.println(i + " É maior que 10");
        } else if (i == 10){
            System.out.println(i + " É igual a 10");
        }
    }

}
