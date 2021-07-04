package entities;

import java.util.Date;

public class Anuncio {
	private String nome;
	private String cliente;
	private Date dataInicial;
	private Date dataFinal;
	private double investimentoPorDia; 
	
	public Anuncio() {
		
	}
	
	public Anuncio (String nome,String cliente,Date dataInicial,Date dataFinal,double investimentoPorDia) {
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicial=dataInicial;
		this.dataFinal=dataFinal;
		this.investimentoPorDia=investimentoPorDia;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public double getInvestimentoPorDia() {
		return investimentoPorDia;
	}

	public void setInvestimentoPorDia(double investimentoPorDia) {
		this.investimentoPorDia = investimentoPorDia;
	}
	
	public double getValorTotalInvestido(double investimentoPorDia,int diasTotais) {
		double valorTotalInvestido = investimentoPorDia * diasTotais;
		return valorTotalInvestido;
		
	}
	
	public long getDiasTotais() {
	 	
		return (dataFinal.getTime() - dataInicial.getTime()) / 1000 / 60 / 60 / 24;  

	}
	
	

}
