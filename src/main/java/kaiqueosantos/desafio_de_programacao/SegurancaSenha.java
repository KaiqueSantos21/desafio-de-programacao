package kaiqueosantos.desafio_de_programacao;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SegurancaSenha {
	
	
	// Conjunto com os caracteres especiais
	// Utilizado na verificacao da seguranca da senha
	private static final Set<Character> CARACTERES_ESPECIAIS = Stream.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+').collect(Collectors.toSet());
	
	public static boolean temUmNumero(String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isDigit(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	// Varre a String e, se encontrar uma letra minuscula,
	// retorna true imediatamente
	public static boolean temUmaLetraMinuscula(String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLetter(senha.charAt(i)) && 
					senha.charAt(i) == Character.toLowerCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	// Varre a String e, se encontrar uma letra maiuscula,
	// retorna true imediatamente
	public static boolean temUmaLetraMaiuscula(String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLetter(senha.charAt(i)) && 
					senha.charAt(i) == Character.toUpperCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	// Varre a String em busca de um caractere especial
	// ou seja, um caractere que pertenca ao conjunto SPECIAL_CHARACTERS
	public static boolean temUmCaractereEspecial(String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (CARACTERES_ESPECIAIS.contains(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}

}
