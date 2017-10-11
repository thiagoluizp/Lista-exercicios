/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunoadm
 */
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
            Scanner media = new Scanner(System.in);
            int i, j, k;
		String nome;
		
		System.out.println("Aluno ");
		nome = media.nextLine();
		System.out.println("nota1");
		i = media.nextInt();
		System.out.println("nota2");
		j = media.nextInt();
		System.out.println("nota3");
		k = media.nextInt();
		
		
		int resultado = (i + j + k) / 3;
		
		if (i <= 3 || j <= 3 || k <= 3) {
		System.out.println("oi " + nome + "Media total " + resultado);
		} else {
		
		System.out.println("oi " + nome + "Media soma " + resultado);
		}
	}
}