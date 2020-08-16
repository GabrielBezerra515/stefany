/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.ex.mario;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Tamanho: ");
        int a = ler.nextInt();

        if (a < 1 || a > 9) {
            System.out.println("Por favor insira um número de 1 a 9");
        } else {
            for (int i = 0; i < a; i++) {
                for (int g = 0; g < (a - (i + 1)); g++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("#");
                }

                System.out.print(" ");
                System.out.print(" ");

                for (int j = 0; j <= i; j++) {
                    System.out.print("#");
                }

                System.out.print("\n");
            }
        }
    }
}
