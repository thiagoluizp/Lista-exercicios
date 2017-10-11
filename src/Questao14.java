/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author alunoadm
 */
public class Questao14 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[]args)
    {
        int horasTrabalhada;
        double valorPorHoraTrabalhada;
        double salario;
        double valorPorHora;
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhada: ");
        horasTrabalhada = s.nextInt();
        System.out.println("Digite o valor por hora trabalhada: ");
        valorPorHoraTrabalhada = s.nextDouble();

        if (horasTrabalhada > 40)
        {
            valorPorHora = (valorPorHoraTrabalhada + (valorPorHoraTrabalhada)/2);
            salario = horasTrabalhada * valorPorHora;
            System.out.println("O valor do Sálario é: "+ df.format(salario));
        }
        else
        {
            salario = horasTrabalhada * valorPorHoraTrabalhada;
            System.out.println("O valor do Sálario é: "+ df.format(salario));
        }
    
    }
}
