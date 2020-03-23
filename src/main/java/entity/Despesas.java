package entity;

import java.util.HashMap;
import java.util.Map;

public class Despesas {

	private int ano;
	private int mes;
	private String tipoDespesa;
	private String tipoDocumento;
	private String dataDocumento;
	private double valorLiquido;
	
	private double valorTotal;
	private String mesAtual;
	
	Map<Integer, Double> despesasAtual = new HashMap<Integer, Double>();

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(String dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getMesAtual() {
		return mesAtual;
	}

	public void setMesAtual(String mesAtual) {
		this.mesAtual = mesAtual;
	}
	
	

	public Map<Integer, Double> getDespesasAtual() {
		return despesasAtual;
	}
	
	

	public void setDespesasAtual(Map<Integer, Double> despesasAtual) {
		this.despesasAtual = despesasAtual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((dataDocumento == null) ? 0 : dataDocumento.hashCode());
		result = prime * result + mes;
		result = prime * result + ((tipoDespesa == null) ? 0 : tipoDespesa.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorLiquido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Despesas other = (Despesas) obj;
		if (ano != other.ano)
			return false;
		if (dataDocumento == null) {
			if (other.dataDocumento != null)
				return false;
		} else if (!dataDocumento.equals(other.dataDocumento))
			return false;
		if (mes != other.mes)
			return false;
		if (tipoDespesa == null) {
			if (other.tipoDespesa != null)
				return false;
		} else if (!tipoDespesa.equals(other.tipoDespesa))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		if (Double.doubleToLongBits(valorLiquido) != Double.doubleToLongBits(other.valorLiquido))
			return false;
		return true;
	}
	
	

}
