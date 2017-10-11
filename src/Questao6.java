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
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numeroEnter = new Scanner (System.in);
        System.out.println("Digite um numero: "); 
        int i = numeroEnter.nextInt();
        if (i % 2 == 0)
        {
        System.out.println(i + " O numero é par");
        } else{
        System.out.println(i + " O numero é impar");}
}
}