/**
 * Questao1: Escreva um algoritmo que mostre na tela uma escada de tamanho n 
 * utilizando o caractere * e espaços. A base e altura da escada devem ser 
 * iguais ao valor de n. A última linha não deve conter nenhum espaço.
 */

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Questao1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamanho = entrada.nextInt();

        escrevePiramide(tamanho);

    }

    public static void escrevePiramide (int tamanho) {
        for(int linha = 1; linha <= tamanho; linha++ ) {
            for(int espacos = tamanho - linha; espacos > 0; espacos-- ){
                System.out.print(" ");
            }
            for(int asteristicos = 1; asteristicos <= linha; asteristicos++) {
                System.out.print("*");
            }
            System.out.println();   // quebra de linha
        }
    }
}