package kaiqueosantos.desafio_de_programacao;

import org.junit.Assert;
import org.junit.Test;

public class QuestoesTest {
	
	@Test
	public void questao2Test() {
		Assert.assertEquals(Questoes.questao2(" "), 0); 		     // Nao apresenta nenhum dos requisitos de seguranca
		Assert.assertEquals(Questoes.questao2("abc"), 1);		     // (1/5) contem apenas letras minusculas
		Assert.assertEquals(Questoes.questao2("HELLO"), 1);		     // (1/5) contem apenas letras minusculas
		Assert.assertEquals(Questoes.questao2("Hello"), 2);          // (2/5) contem letras maiusculas e minusculas
		Assert.assertEquals(Questoes.questao2("H3ll0"), 3);		     // (3/5) contem numeros, letras maiusculas e minusculas
		Assert.assertEquals(Questoes.questao2("H3ll00"), 4);	   	 // (4/5) contem numeros, letras maiusculas e minusculas e o comprimento minimo
		Assert.assertEquals(Questoes.questao2("Str0ngP@$$w0rd"), 5); // (5/5) apresenta todos os requisitos
	}
	
	@Test
	public void questao3Test() {
		
		Assert.assertEquals(Questoes.questao3("cavalo"), 2); // [1, 3]; [[1, 2], [2, 3]];
		
		Assert.assertEquals(Questoes.questao3("bobo"), 5); 	// [0, 2]; [1, 3]; [[0, 1], [1, 2]];
															// [[0, 1], [2, 3]]; [[1, 2], [2, 3]];
		
		Assert.assertEquals(Questoes.questao3("casca"), 6);	// [0, 3]; [1, 4]; [[0, 1], [3, 4]];
															// [[0, 1, 2], [1, 2, 3]]; 
															// [[0, 1, 2], [2, 3, 4]];
															// [[1, 2, 3], [2, 3, 4]];
	}
}
