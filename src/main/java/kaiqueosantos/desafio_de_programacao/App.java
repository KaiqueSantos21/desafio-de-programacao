package kaiqueosantos.desafio_de_programacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    	Scanner sc = new Scanner(System.in);
		
		System.out.println("Questao 1");
		System.out.println("Insira o tamanho desejado da escada.");
		
		try {
			int tamanhoEscada = sc.nextInt();
			sc.nextLine();
			
			Questoes.questao1(tamanhoEscada);
			
			System.out.println();
			
			System.out.println("Questao 2");
			System.out.println("Insira uma senha.");
			String Senha = sc.nextLine();
			
			Questoes.questao2(Senha);
			
			System.out.println();
		}
		catch (InputMismatchException exception) {
			System.out.println("Erro inesperado: entrada invalida.");
		}
		finally {
			sc.close();
		}
	}
}
