/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.ex.moedas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExMario {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float preco;
        
        do {
            System.out.print("Insira o valor: ");
            preco = ler.nextFloat();
        } while (preco <= 0);
        
        float mult = preco * 100;
        
        int moedas = 0;
        int vc = 0;
        int dez = 0;
        int cinco = 0;
        int um = 0;

        while (mult > 0) {
            if (mult >= 25) {
                vc++;
                moedas++;

                mult = mult - 25;
            } else if (mult >= 10) {
                dez++;
                moedas++;

                mult = mult - 10;
            } else if (mult >= 5) {
                cinco++;
                moedas++;

                mult = mult - 5;
            } else {
                um++;
                moedas++;

                mult = mult - 1;
            }
        }
        
        System.out.println("\nTotal de moedas: " + moedas);
        System.out.println("Moedas de 25 centavos: " + vc);
        System.out.println("Moedas de 10 centavos: " + dez);
        System.out.println("Moedas de 5 centavos: " + cinco);
        System.out.println("Moedas de 1 centavo: " + um);
    }
}
