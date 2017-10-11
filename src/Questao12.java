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
public class Questao12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ladox, ladoy, ladoz;
        int opcao = 1;
        while (opcao == 1) {
            Scanner s = new Scanner(System.in);
            System.out.println(" Lado x:");
            ladox = s.nextInt();
            System.out.println("                           ");
            System.out.println("Lado y:");
            ladoy = s.nextInt();
            System.out.println("                           ");
            System.out.println("Lado z:");
            ladoz = s.nextInt();
            System.out.println("                           ");
            if ((ladox < ladoy + ladoz) && (ladoy < ladox + ladoz) && (ladoz < ladox + ladoy)) {
                if (ladox == ladoy && ladox == ladoz) {
                    System.out.println("Triangulo Equilatero");
                } else if ((ladox == ladoy) || (ladox == ladoz)) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            } else {
                System.out.println("Não é um triangulo!");
            }
            System.out.println("                             ");
            System.out.println("Deseja continuar? 1 = sim, 2 = não");
            opcao = s.nextInt();
            System.out.println("                             ");
        }
        System.out.println("Adeus!");
    }
}
