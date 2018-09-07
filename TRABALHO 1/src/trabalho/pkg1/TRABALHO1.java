/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkg1;

import java.util.Scanner;

/**
 *
 * @author ads
 */
public class TRABALHO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opção = 0;
        int espacos;
        int valor;

        System.out.println("Entre a quantidade de valores:");
        espacos = entrada.nextInt();
        Conjuntodevalores conjunto = new Conjuntodevalores(espacos);

        while (true) {
            System.out.println("0  Menu");
            System.out.println("1  Cadastrar Valor");
            System.out.println("2  Maior Valor");
            System.out.println("3  Menor Valor");
            System.out.println("4  Ler Média");
            System.out.println("5  sair");
            opção = entrada.nextInt();

            switch (opção) {
                case 0:
                    System.out.println("Menu");
                    break;
                case 1:
                    System.out.println("Cadastrar Valor");
                    for (int i = 0; i < espacos; i++) {
                        System.out.println("Entre o número " + (i + 1) + ":");
                        valor = entrada.nextInt();
                        conjunto.cadastrar(i, valor);
                    }
                    break;
                case 2:
                    System.out.println("Maior Valor");
                    break;
                case 3:
                    System.out.println("Menor Valor");
                    break;
                case 4:
                    System.out.println("Ler Média");
                  
                    System.out.println( conjunto.media() 
                    );
                        
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("opção invalida");

            }
        }

        // TODO code application logic here
    }

}
