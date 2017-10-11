/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;

/**
 *
 * @author alunoadm
 */
public class Questao10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        for (a = 2; a <= 11; a += 3) {
            for (b = a; b <= 2; b++) {
                for (c = 1; c <= a; c += b) {
                    System.out.println("" + a + b + c);
                    
                }
            }
        }
    }
}
