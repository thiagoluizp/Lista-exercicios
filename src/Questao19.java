/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author alunoadm
 */
public class Questao19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int conta1;
        float saldo, saldoAtualizado;
        float credito;
        float debito;

        Scanner s = new Scanner(System.in);
        System.out.println("Número da Conta: ");
        conta1 = s.nextInt();
        System.out.println(" Saldo da Conta: ");
        saldo = s.nextFloat();
        System.out.println(" Valor do Credito: ");
        credito = s.nextFloat();
        System.out.println(" Valor do Dedito: ");
        debito = s.nextFloat();

        saldoAtualizado = saldo - debito + credito;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O Saldo Atual é : " + df.format(saldoAtualizado));
        if (saldoAtualizado >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
