package entities;

public class Relatorio {
	private double valorTotalInvestido;
	private double quantidadeMaximaVisualizacao;
	private double quantidadeMaximaClicks;
	private double quantidadeMaximaCompartilhamento;
	
	public Relatorio() {
		
	}
	
	public Relatorio(double valorTotalInvestido,double quantidadeMaximaVisualizacao,double quantidadeMaximaClicks,double quantidadeMaximaCompartilhamento) {
		this.valorTotalInvestido = valorTotalInvestido;
		this.quantidadeMaximaVisualizacao = quantidadeMaximaVisualizacao;
		this.quantidadeMaximaClicks = quantidadeMaximaClicks;
		this.quantidadeMaximaCompartilhamento = quantidadeMaximaCompartilhamento;
	}

	public double getValorTotalInvestido() {
		return valorTotalInvestido;
	}

	public void setValorTotalInvestido(double valorTotalInvestido) {
		this.valorTotalInvestido = valorTotalInvestido;
	}

	public double getQuantidadeMaximaVisualizacao() {
		return quantidadeMaximaVisualizacao;
	}

	public void setQuantidadeMaximaVisualizacao(double quantidadeMaximaVisualizacao) {
		this.quantidadeMaximaVisualizacao = quantidadeMaximaVisualizacao;
	}

	public double getQuantidadeMaximaClicks() {
		return quantidadeMaximaClicks;
	}

	public void setQuantidadeMaximaClicks(double quantidadeMaximaClicks) {
		this.quantidadeMaximaClicks = quantidadeMaximaClicks;
	}

	public double getQuantidadeMaximaCompartilhamento() {
		return quantidadeMaximaCompartilhamento;
	}

	public void setQuantidadeMaximaCompartilhamento(double quantidadeMaximaCompartilhamento) {
		this.quantidadeMaximaCompartilhamento = quantidadeMaximaCompartilhamento;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Valor total investido: " + valorTotalInvestido + "\n");
		sb.append("Quantidade máxima de visualizações: " + quantidadeMaximaVisualizacao + "\n");
		sb.append("Quantidade máxima de clicks: " + quantidadeMaximaClicks + "\n");
		sb.append("Quantidade máxima de compartilhamento: " + quantidadeMaximaCompartilhamento + "\n");
		return sb.toString();
		
	}
	

}
