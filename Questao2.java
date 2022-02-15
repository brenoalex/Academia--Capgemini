/*# Questão 02
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza 
se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é 
o número mínimo de caracteres que devem ser adicionados para uma string qualquer 
ser considerada segura.

 */


import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
import java.util.regex.Pattern;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(calculaCaracteres(entrada.nextLine()));
    }

    public static boolean temDigito(String senha){
        String regex = ".*[0-9].*";
        return senha.matches(regex);
    }

    public static boolean temMinuscula(String senha){
        String regex = ".*[a-z].*";
        return senha.matches(regex);
    }

    public static boolean temMaiuscula(String senha){
        String regex = ".*[A-Z].*";
        return senha.matches(regex);
    }

    public static boolean temCaractereEspecial(String senha){
        String regex = "[!@#$%^&*()-+].*";
        return senha.matches(regex);
    }

    /* O algoritmo checa cada uma das condições faltantes e adiciona 1 ao contador.
    No final também checa se o tamanho da senha + caracteres obrigatórios faltantes 
    ultrapassa o mínimo de 6 caracteres exigidos, senão adiciona a quantidade
    necessária para esse mínimo*/
    public static int calculaCaracteres(String senha) {
        int cont = 0;
        if(!temDigito(senha)) cont++;
        if(!temMinuscula(senha)) cont++;
        if(!temMaiuscula(senha)) cont++;
        if(!temCaractereEspecial(senha)) cont++;

        if(senha.length() + cont < 6) {
            cont+= 6 - (cont + senha.length()) ;
        }

        return cont;
    }


}
