package Exercises;

import java.util.Scanner;

public class Exercises1 {

    Scanner leitura = new Scanner(System.in);

    String nome;
    String sobrenome;
    Integer idade;

    public void cadastroNome(){

        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();

        System.out.println("Digite o seu sobrenome:");
        sobrenome = leitura.nextLine();

        System.out.println("Qual sua idade?");
        idade = leitura.nextInt();
    }

    public void resultadoNome(){
        System.out.println("Resultado da Resposta:\n" + nome + " " +sobrenome + "\n");
        System.out.println("Idade:" + idade);
    }
}
