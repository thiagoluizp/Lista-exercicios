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
public class Questao15 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {
        int qtdeEstoque;
        int qtdeMaxima;
        int qtdeMinima;
        int mediadoEstoque;

        Scanner s = new Scanner(System.in);
        System.out.println("Entre com a Quantidade de Estoque Atual: ");
        qtdeEstoque = s.nextInt();
        System.out.println("Entre com a Quantidade Maxima de Estoque: ");
        qtdeMaxima = s.nextInt();
        System.out.println("Entre com a Quantidade Minima de Estoque: ");
        qtdeMinima = s.nextInt();
        
        mediadoEstoque = (qtdeMaxima + qtdeMinima)/2;
        System.out.println("A Média do estoque é " + mediadoEstoque );
        
        if (qtdeEstoque <= mediadoEstoque) 
        {
            System.out.println("Não efetuar Compra");
        }
        else
        {
            System.out.println("Efetuar Compras");
        }
    }
}