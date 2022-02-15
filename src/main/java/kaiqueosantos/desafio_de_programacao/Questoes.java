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

}
