package controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import javax.inject.Inject;

import entity.Deputados;
import entity.Despesas;
import entity.Detalhes;
import webservice.GetDetalhes;
import webservice.WebService;

@ApplicationScoped
@ManagedBean(name = "parl")
public class ParlBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private List<Deputados> deputadosList;
	private List<Deputados> deputadosFiltered;

	@Inject
	private Deputados deputados;

	@Inject
	private List<Despesas> despesasList;

	@Inject
	private Despesas despesas;

	@Inject
	private Detalhes detail;
	
	private List<Double> valorTotal;
	private List<Integer> mes;


	@Inject
	private GetDetalhes detaillist;

	private WebService webservice = new WebService();

	@PostConstruct
	public void init() {
		try {
			setDeputadosList(WebService.listarDeputados());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void detalhar(int id) {
		try {
			setDetaillist(webservice.detalharDeputados(id));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void despesas(int id) {
		try {
			setDespesasList(webservice.despesas(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setDeputadoVisualizacao(int num) { 
		deputados.setVisualizacoes(num);
		System.out.print(deputados.getVisualizacoes());
	}
	

	/*public List<Entry<Integer, Double>> getMyHashMapEntryList() throws Exception {
		webservice.despesas(204554);
		Set<Map.Entry<Integer, Double>> productSet = despesas.getDespesasAtual().entrySet();
		
		return new ArrayList<Map.Entry<Integer, Double>>(productSet);
	}*/



	// set e get ============================================

	public List<Deputados> getDeputadosList() {
		return deputadosList;
	}

	public void setDeputadosList(List<Deputados> deputadosList) {
		this.deputadosList = deputadosList;
	}

	public Deputados getDeputados() {
		return deputados;
	}

	public void setDeputados(Deputados deputados) {
		this.deputados = deputados;
	}

	public Detalhes getDetail() {
		return detail;
	}

	public void setDetail(Detalhes detail) {
		this.detail = detail;
	}

	public GetDetalhes getDetaillist() {
		return detaillist;
	}

	public void setDetaillist(GetDetalhes getDetalhes) {
		this.detaillist = getDetalhes;
	}

	public List<Despesas> getDespesasList() {
		return despesasList;
	}

	public void setDespesasList(List<Despesas> despesasList) {
		this.despesasList = despesasList;
	}

	public Despesas getDespesas() {
		return despesas;
	}

	public void setDespesas(Despesas despesas) {
		this.despesas = despesas;
	}

	public List<Double> getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(List<Double> valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Integer> getMes() {
		return mes;
	}

	public void setMes(List<Integer> mes) {
		this.mes = mes;
	}

	public List<Deputados> getDeputadosFiltered() {
		return deputadosFiltered;
	}

	public void setDeputadosFiltered(List<Deputados> deputadosFiltered) {
		this.deputadosFiltered = deputadosFiltered;
	}



	

	

}
