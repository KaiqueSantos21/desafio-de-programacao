package kaiqueosantos.desafio_de_programacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questoes {
	
	public static void questao1(int tamanhoEscada) {
		
		System.out.println();
		
		for (int i = 1; i <= tamanhoEscada; i++) {
			
			// Verifica quantos "espacos" faltam para comecar a impressao de asteriscos e imprime
			// os espacos em branco correspondentes
			for (int espacosEmBranco = 0; espacosEmBranco < tamanhoEscada - i; espacosEmBranco++) {
				System.out.print(" ");
			}
			
			// Imprime n asteriscos na n-esima linha
			for (int quantidadeAsteriscos = 0; quantidadeAsteriscos < i; quantidadeAsteriscos++) {
				System.out.print("*");
			}
			
			// Quebra de linha
			System.out.println();

		}
	}
	
	public static int questao2(String senha) {
		
		// Usado na contagem de requisitos minimos de seguranca cumpridos
		int forcaSenha = 0;
		
		if (senha.length() < 6) {
			System.out.println("A senha deve ter mais " + (6 - senha.length()) + " caractere(s).");
		} else {
			forcaSenha++;
		}
		
		if (SegurancaSenha.temUmNumero(senha)) {
			forcaSenha++;
		} else {
			System.out.println("A senha deve conter pelo menos um numero.");
		}
		
		if (SegurancaSenha.temUmaLetraMinuscula(senha)) {
			forcaSenha++;
		} else {
			System.out.println("A senha deve conter pelo menos uma letra minuscula.");
		}
		
		if (SegurancaSenha.temUmaLetraMaiuscula(senha)) {
			forcaSenha++;
		} else {
			System.out.println("A senha deve conter pelo menos uma letra maiuscula.");
		}
		
		if (SegurancaSenha.temUmCaractereEspecial(senha)) {
			forcaSenha++;
		} else {
			System.out.println("A senha deve conter pelo menos um caractere especial.");
		}
		
		if (forcaSenha == 5) {
			System.out.println("Senha forte.");
		}
		
		return forcaSenha;
	}
	
public static int questao3(String palavra) {
		
		palavra = palavra.toLowerCase();
		
		int quantidadeParesAnagramas = 0;
		
		// Contador do passo de contagem dos blocos de letras na palavra
		// Ex: na palavra "ovo", primeiro busca-se Strings de uma letra - o, v, o
		// Em seguida, busca-se grupos de duas letras - ov e vo
		for (int passo = 1; passo < palavra.length(); passo++) {
			
			for (int indicePrimeiraLetra = 0; indicePrimeiraLetra < palavra.length() - passo ; indicePrimeiraLetra++) {
				
				// Busca grupos de letras na palavra e adiciona-os a um array de caracteres,
				// a fim de, posteriormente, organiza-lo e, entao, comparar com demais grupos de letras encontrados
				char[] buscaBase = palavra.substring(indicePrimeiraLetra, indicePrimeiraLetra + passo).toCharArray();
				
				List<String> listaBuscas = new ArrayList<>();
				
				for (int indiceSegundoGrupo = indicePrimeiraLetra + 1; indiceSegundoGrupo <= palavra.length() - passo; indiceSegundoGrupo++) {
					// Busca grupos de letras na palavra e adiciona-os a uma lista, que posteriormente
					// sera utilizada para comparacao com o primeiro grupo escolhido
					String segundoGrupo = palavra.substring(indiceSegundoGrupo, indiceSegundoGrupo + passo);
					listaBuscas.add(segundoGrupo);
				}
				
				// Ordena o array buscaBase e compara-o com a lista de grupos de letras formada anteriormente,
				// tendo esta sido previamente transformada em array e organizada
				// Se os arrays contem as mesmas letras, entao os grupos de palavras sao iguais e, portanto,
				// encontrou-se um anagrama.
				Arrays.sort(buscaBase);
				for (String grupo : listaBuscas) {
					char[] vetorBuscas = grupo.toCharArray();
					Arrays.sort(vetorBuscas);
					
					if (Arrays.equals(buscaBase, vetorBuscas)) {
						quantidadeParesAnagramas++;
					}
				}
				
			}
			
		}
		
		return quantidadeParesAnagramas;
		
	}

}
