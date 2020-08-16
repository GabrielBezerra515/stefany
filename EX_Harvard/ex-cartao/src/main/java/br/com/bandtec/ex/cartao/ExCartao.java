/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.ex.cartao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExCartao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        long number;

        do {
            System.out.print("Insira o número do Cartão: ");
            number = ler.nextLong();
        } while (number < 0);

        String numero = Long.toString(number);
        int[] array;
        array = new int[numero.length()];
        for (int i = 0; i < numero.length(); i++) {
            array[i] = Character.getNumericValue(numero.charAt(i));
        }
        int[] array_copia = new int[numero.length()];
        for(int i = 0; i < numero.length(); i++){
            array_copia[i] = array[i];
        }

        int soma = 0;
        int soma1 = 0;

        for (int i = numero.length() - 2; i >= 0; i = i - 2) {
            array[i] *= 2;
            if (array[i] > 9) {
                int prov = array[i];
                soma = (prov % 10) + soma;
                soma = (Math.round(prov / 10)) + soma;
            } else {
                soma = array[i] + soma;
            }
        }
        for (int i = numero.length() - 1; i >= 0; i = i - 2) {
            soma1 = array[i] + soma1;
        }

        int total = soma + soma1;
        int numero_final = total % 10;

        if ((numero.length() == 15) && (array_copia[0] == 3)
                && ((array_copia[1] == 4) || (array_copia[1] == 7))) {

            if (numero_final == 0) {
                System.out.println("American Express");
            } else {
                System.out.println("Cartão inválido.");
            }

        } else if (numero.length() == 16) {
            if ((array_copia[0] == 5) && ((array_copia[1] == 1)
                    || (array_copia[1] == 2) || (array_copia[1] == 3)
                    || (array_copia[1] == 4) || (array_copia[1] == 5))) {
                if (numero_final == 0) {
                    System.out.println("MasterCard");
                } else {
                    System.out.println("Cartão inválido.");
                }
            }
            if (array_copia[0] == 4) {
                if (numero_final == 0) {
                    System.out.println("Visa");
                } else {
                    System.out.println("Cartão inválido.");
                }
            }
        } else {
            if ((numero_final == 0) && (numero.length() == 13)
                    && (array_copia[0] == 4)) {
                System.out.println("Visa");
            } else {
                System.out.println("Cartão inválido.");
            }
        }
    }
}
