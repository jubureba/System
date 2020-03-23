package entity;

public class Detalhes {
	
	private String nomeCivil;
	private String dataNascimento;
	private String sexo;
	private UltimoStatus ultimoStatus;


	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeCivil() {
		return nomeCivil;
	}
	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public UltimoStatus getUltimoStatus() {
		return ultimoStatus;
	}
	public void setUltimoStatus(UltimoStatus ultimoStatus) {
		this.ultimoStatus = ultimoStatus;
	}
	public Detalhes(String nomeCivil, String dataNascimento, String sexo) {
		super();
		this.nomeCivil = nomeCivil;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	
	public Detalhes() {
		
	}
	
	
	
	
}
