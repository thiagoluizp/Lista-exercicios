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
public class Questao18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        Scanner leitorDos = new Scanner(System.in);
        System.out.println("Entre com valor de n");
        n = leitorDos.nextInt();
        for(int linha = 1; linha<=n; linha++){
            for(int coluna = 1; coluna<=n; coluna++){
                System.out.print(""+linha+coluna+" ");
            }
            System.out.println("");
        }
//        forDeLinha: for(int linha = 1; /*linha<=n*/; linha++){
//            if(linha>n){
//                break;
//            }
//            if((linha%2)==1)
//                continue;
//            
//            for(int coluna = 1; /*coluna<=n*/; coluna++){
//                if(coluna>n)
//                    break;
//                
//                if ((coluna%2)==1)
//                    continue;
//                
//                System.out.print(""+linha+coluna+" ");
//                if ((coluna%2)==0)
//                    continue forDeLinha;
//            }
//            
//            System.out.println("");
//        }
        
    }
}