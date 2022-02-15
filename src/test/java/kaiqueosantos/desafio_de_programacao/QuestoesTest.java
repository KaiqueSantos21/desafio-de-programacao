package kaiqueosantos.desafio_de_programacao;

import org.junit.Assert;
import org.junit.Test;

public class QuestoesTest {
	
	@Test
	public void questao2Test() {
		Assert.assertEquals(Questoes.questao2(" "), 0);
		Assert.assertEquals(Questoes.questao2("abc"), 1);
		Assert.assertEquals(Questoes.questao2("Hello"), 2);
		Assert.assertEquals(Questoes.questao2("H3ll0"), 3);
		Assert.assertEquals(Questoes.questao2("H3ll00"), 4);
		Assert.assertEquals(Questoes.questao2("G00dP@$$w0rd"), 5);
	}
		
}
