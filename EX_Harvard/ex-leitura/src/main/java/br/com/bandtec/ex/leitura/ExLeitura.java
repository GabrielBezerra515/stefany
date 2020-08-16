/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.ex.leitura;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExLeitura {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Text: ");
        String texto = ler.nextLine();

        char[] texto_array = texto.toCharArray();
        int letras = 0;
        int palavras = 1;
        int frases = 0;

        for (int i = 0; i < texto_array.length; i++) {
            if (Character.isLetterOrDigit(texto_array[i])) {
                letras++;
            }
            if (texto_array[i] == '.' || texto_array[i] == '!'
                    || texto_array[i] == '?') {
                frases++;
            }
            if (Character.isSpaceChar(texto_array[i])) {
                palavras++;
            }
        }

        double indice = (0.0588 * (((float) letras / (float) palavras) * 100))
                - (0.296 * (((float) frases / (float) palavras) * 100)) - 15.8;

        if (Math.round(indice) >= 16) {
            System.out.println("Grade 16+");
        } else if (Math.round(indice) < 2) {
            System.out.println("Before Grade 1");
        } else {
            System.out.println("Grade " + Math.round(indice));
        }
    }
}
