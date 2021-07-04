package services;

import entities.Anuncio;
import entities.Relatorio;

public class Calculadora {
	
	
	public Relatorio getDadosRelatorio(Anuncio anuncio) {
		
		
		double baseVisualizacaoNova = 40;
		double baseCompartilha = 3;
		double baseClicks = 20;
		double baseVisualizacao = 12;
    	double baseVisualizacaoPorClick = 100;
		double pessoasPorInvestimento = 30;
		
  	    double valorInvestido = anuncio.getInvestimentoPorDia();
  	    double totalDias = anuncio.getDiasTotais();
  	    double totalInvestido = valorInvestido * totalDias;
  	    double visualizacaoInicial = pessoasPorInvestimento * totalInvestido;
  	    
  	    Relatorio relatorio = new Relatorio();
  	    relatorio.setQuantidadeMaximaVisualizacao(visualizacaoInicial);
   	    relatorio.setValorTotalInvestido(totalInvestido);  
   	    
	 //Loop se repete sempre as 4 vezes máximas de compartilhamentos, mesmo que compartilhamento seja menor que 1 inteiro 
	 // Função recebe visualizações iniciais e retorna projeção de novas visualizações baseado em regras de negócio
	 // Todos os cálculos consideram o valor double resultante sem restrição de casa decimais (exceto por resultado de visualizaçãoTotal que é mostrado na tela ao cliente)
  	    
  	  for (int i=0;i<=3;i++) {
		 double totalClicks = (visualizacaoInicial * baseVisualizacao)/baseVisualizacaoPorClick;
		 double totalCompartilha = (totalClicks * baseCompartilha) / baseClicks;
		 double visualizacaoNova = totalCompartilha*baseVisualizacaoNova;
							
		
		relatorio.setQuantidadeMaximaVisualizacao(relatorio.getQuantidadeMaximaVisualizacao() + visualizacaoNova);
		relatorio.setQuantidadeMaximaClicks(relatorio.getQuantidadeMaximaClicks() + totalClicks);
		relatorio.setQuantidadeMaximaCompartilhamento(relatorio.getQuantidadeMaximaCompartilhamento() + totalCompartilha);
		visualizacaoInicial = visualizacaoNova;
		
	           		 
  	 }		 	
		
	
		return relatorio;
	
		
	}

}
