package kaiqueosantos.desafio_de_programacao;

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
			System.out.println("A senha deve ter mais " + (6 - senha.length()) + " caracteres.");
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

}
