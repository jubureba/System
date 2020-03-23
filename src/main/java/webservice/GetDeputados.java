package webservice;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

import entity.Deputados;

public class GetDeputados {

	
	private Deputados[] dados;

	public Deputados[] getDados() {
		return dados;
	}

	public void setDados(Deputados[] dados) {
		this.dados = dados;
	}

	@Override
	public String toString() {
		return Arrays.toString(dados);
	}

}
