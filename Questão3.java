/* # Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma 
palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, 
desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
*/


import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;


public class Questão3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.nextLine();
        separaSubString(palavra);
    }

    static void separaSubString( String s ){
        HashMap<String, Integer> map = new HashMap<>();

        for(int i  = 0; i <= s.length(); i++){
            for( int j = i; j < s.length(); j++ ){
                char[] caractere = s.substring(i, j+1).toCharArray();
                Arrays.sort(caractere);
                String sub = new String(caractere);
                if(map.containsKey(sub))
                    map.put(sub, map.get(sub) + 1);
                else
                    map.put(sub,1);
            }
        }
        int contadorDePares = 0;
        for(String key: map.keySet()) {
            int n = map.get(key);
            contadorDePares += (n*(n-1))/2;
        }
        System.out.println(contadorDePares);
    }

}
