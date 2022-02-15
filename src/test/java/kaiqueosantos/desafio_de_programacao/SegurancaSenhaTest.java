package kaiqueosantos.desafio_de_programacao;

import org.junit.Assert;
import org.junit.Test;

public class SegurancaSenhaTest {
	
	@Test
	public void temUmNumeroTest() {
		Assert.assertTrue(SegurancaSenha.temUmNumero("123"));
		Assert.assertTrue(SegurancaSenha.temUmNumero("abc_123"));
		Assert.assertTrue(SegurancaSenha.temUmNumero("p_assword1"));
		Assert.assertTrue(SegurancaSenha.temUmNumero("01101967"));
		Assert.assertTrue(SegurancaSenha.temUmNumero("1234567890"));		
		
		Assert.assertFalse(SegurancaSenha.temUmNumero("qwerty"));
		Assert.assertFalse(SegurancaSenha.temUmNumero("abcd"));
		Assert.assertFalse(SegurancaSenha.temUmNumero("password"));		
		Assert.assertFalse(SegurancaSenha.temUmNumero("password_One"));
		Assert.assertFalse(SegurancaSenha.temUmNumero("BadPassword"));
	}
	
	@Test
	public void temUmaLetraMinusculaTest() {
		Assert.assertTrue(SegurancaSenha.temUmaLetraMinuscula("PaSSWORD"));
		Assert.assertTrue(SegurancaSenha.temUmaLetraMinuscula("qwerty"));
		Assert.assertTrue(SegurancaSenha.temUmaLetraMinuscula("QWERTy"));
		Assert.assertTrue(SegurancaSenha.temUmaLetraMinuscula("PASSWORDCREATINGISMYPaSSION"));	
		Assert.assertTrue(SegurancaSenha.temUmaLetraMinuscula("insertagoodpasswordhere"));
		
		Assert.assertFalse(SegurancaSenha.temUmaLetraMinuscula("FUTEBOL"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMinuscula("123456"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMinuscula("IMVERYANGRY04"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMinuscula("H3LL0W0RLD"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMinuscula("TH@NKY0U"));
	}
	
	@Test
	public void temUmaLetraMaiusculaTest() {
		Assert.assertTrue(SegurancaSenha.temUmaLetraMaiuscula("PaSSWORD"));
		Assert.assertTrue(SegurancaSenha.temUmaLetraMaiuscula("Sr.JoaoDaSilva"));
		Assert.assertTrue(SegurancaSenha.temUmaLetraMaiuscula("IWasBornThisWay"));
		Assert.assertTrue(SegurancaSenha.temUmaLetraMaiuscula("IWasBornThisWay"));
		Assert.assertTrue(SegurancaSenha.temUmaLetraMaiuscula("ILoveFunnyJokes!"));
		
		Assert.assertFalse(SegurancaSenha.temUmaLetraMaiuscula("h3ll0world"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMaiuscula("idontlikeuppercaseletters"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMaiuscula("tiaocarreiroepardinho"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMaiuscula("tiaocarreiroepardinho"));
		Assert.assertFalse(SegurancaSenha.temUmaLetraMaiuscula("123456"));
	}
	
	@Test
	public void temUmCaractereEspecialTest() {
		Assert.assertTrue(SegurancaSenha.temUmCaractereEspecial("!lik3$p3ci@l(h@r@(t3r$"));
		Assert.assertTrue(SegurancaSenha.temUmCaractereEspecial("D3V0IN$3R1RUMCARACTEREE$PECIAL"));
		Assert.assertTrue(SegurancaSenha.temUmCaractereEspecial("@B(xYz"));
		Assert.assertTrue(SegurancaSenha.temUmCaractereEspecial("#bolabolsolargo"));
		Assert.assertTrue(SegurancaSenha.temUmCaractereEspecial("x%ofpopulation"));	
		
		Assert.assertFalse(SegurancaSenha.temUmCaractereEspecial("imnotverycreativeforpasswords"));
		Assert.assertFalse(SegurancaSenha.temUmCaractereEspecial("CantIJustAddLettersAndNumbers"));
		Assert.assertFalse(SegurancaSenha.temUmCaractereEspecial("ICrashedTheCar"));
		Assert.assertFalse(SegurancaSenha.temUmCaractereEspecial("123456"));
		Assert.assertFalse(SegurancaSenha.temUmCaractereEspecial("byebye"));	
		
	}
	

}
