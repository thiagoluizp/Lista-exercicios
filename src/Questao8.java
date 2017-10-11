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
public class Questao8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nt1;
        int nt2;
        double media;
        
        Scanner notaMediana = new Scanner (System.in);
        
        System.out.println("Digite a nota 1: ");
        nt1 = notaMediana.nextInt();
        
        System.out.println("Digite a nota 2: ");
        nt2 = notaMediana.nextInt ();
        
        media = (nt1 + nt2) /2;
        if (media >= 6){
            System.out.println(" Aprovado!");
        } else{
            System.out.println(" Reprovado!");
        }
    }
    
}
