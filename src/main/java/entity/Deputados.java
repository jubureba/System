package entity;

public class Deputados {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public String getUriPartido() {
		return uriPartido;
	}

	public void setUriPartido(String uriPartido) {
		this.uriPartido = uriPartido;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public int getIdLegilatura() {
		return idLegilatura;
	}

	public void setIdLegilatura(int idLegilatura) {
		this.idLegilatura = idLegilatura;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getVisualizacoes() {
		return visualizacoes;
	}

	public void setVisualizacoes(int visualizacoes) {
		this.visualizacoes = visualizacoes;
	}

	private int id;
	private String uri;
	private String nome;
	private String siglaPartido;
	private String uriPartido;
	private String siglaUf;
	private int idLegilatura;
	private String urlFoto;
	private String email;
	private int visualizacoes;

	@Override
	public String toString() {
		return uri + nome + siglaPartido;
	}

}
