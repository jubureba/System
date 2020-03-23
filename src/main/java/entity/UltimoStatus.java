package entity;

public class UltimoStatus {
	
	private String siglaPartido;
	private String urlFoto;
	
	
	public String getSiglaPartido() {
		return siglaPartido;
	}
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	
	public UltimoStatus() {
		
	}
	public UltimoStatus(String siglaPartido, String urlFoto) {
		super();
		this.siglaPartido = siglaPartido;
		this.urlFoto = urlFoto;
	}
	
	
	
	

}
