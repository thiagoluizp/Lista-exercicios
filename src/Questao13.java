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
public class Questao13 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args)
    {
        int qtdeComprada;
        double valorCompra;
        Scanner s = new Scanner (System.in);
        System.out.println("Digite a Quantidade Comprada de Maçãs: ");
        qtdeComprada = s.nextInt();
        DecimalFormato df = new DecimalFormato("0.00");
        if (qtdeComprada > 12)
        {
            valorCompra = qtdeComprada * 1.00;
            System.out.println("O Valor da Compra é: "+ df.format(valorCompra));
        }
        else
        {
            valorCompra = qtdeComprada * 1.30;
            System.out.println("O Valor da Compra é: "+ df.format(valorCompra));
        }
    }
    
}