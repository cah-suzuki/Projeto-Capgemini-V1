package application;

import java.text.ParseException;

import entities.Anuncio;
import entities.Relatorio;
import services.Calculadora;
import services.LeitorDeDados;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		LeitorDeDados leitorDeDados = new LeitorDeDados();
		Anuncio anuncio = leitorDeDados.lerDados();
		Calculadora calculadora = new Calculadora();
		Relatorio relatorio = calculadora.getDadosRelatorio(anuncio);
		System.out.print(relatorio.toString());
		
	
	}

}
