package webservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.LinkedHashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.google.gson.Gson;


import entity.Deputados;
import entity.Despesas;

public class WebService {
	
	//Atributos ==========================
	ArrayList<Double> valorTotal;
	ArrayList<Integer> mes;


	//Construtor =========================
	public WebService() {
		
	}

	static WebService ws = new WebService();

	/*public static void main(String[] args) throws Exception {
		ws.despesas(204554);
		
	}*/

	public static List<Deputados> listarDeputados() throws Exception {
		WebService ws = new WebService();
		String url = "https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome&formato=json";
		String json = ws.sendGet(url);

		Gson g = new Gson();
		GetDeputados d = new GetDeputados();

		d = g.fromJson(json, GetDeputados.class);

		List<Deputados> list = convertArrayToList(d.getDados());

		return list;
	}
	
	public GetDetalhes detalharDeputados(int id) throws Exception {
		WebService ws = new WebService();
		String url = "https://dadosabertos.camara.leg.br/api/v2/deputados/"+ id + "?formato=json";
		String json = ws.sendGet(url);

		Gson g = new Gson();
		
		GetDetalhes det = g.fromJson(json, GetDetalhes.class);
			
		return det;	
	}
	
	public List<Despesas> despesas(int id) throws Exception {
		WebService ws = new WebService();
		Despesas despesas = new Despesas();
		Calendar cal = GregorianCalendar.getInstance();
		String url = "https://dadosabertos.camara.leg.br/api/v2/deputados/"+id+"/"
				+ "despesas?mes=" + (cal.get(Calendar.MONTH)+1) + "&mes="+ (cal.get(Calendar.MONTH)) +"&ano="+ (cal.get(Calendar.YEAR))+"&ordem=DESC&ordenarPor=mes&itens=200&formato=json";
		//URL com id do deputado e data dos dois ultimos meses.
		String json = ws.sendGet(url);
		Gson g = new Gson();
		
		GetDespesas getDespesas = g.fromJson(json, GetDespesas.class);
		
		List<Despesas> list = convertArrayToList(getDespesas.getDados());
		
		double sum2 = list.stream().filter(o -> o.getMes() == (cal.get(Calendar.MONTH)+1)).mapToDouble(Despesas::getValorLiquido).sum();
		System.out.println(sum2);
		
		Map<Integer, Double> collect = list.stream().collect(Collectors.groupingBy(Despesas::getMes, Collectors.summingDouble(Despesas::getValorLiquido)));
		despesas.setDespesasAtual(collect);

		return list;
	}
	

	public static List<?> convertObjectToList(Object obj) {
	    List<?> list = new ArrayList<>();
	    if (obj.getClass().isArray()) {
	        list = Arrays.asList((Object[])obj);
	    } else if (obj instanceof Collection) {
	        list = new ArrayList<>((Collection<?>)obj);
	    }
	    return list;
	}

	public static <T> List<T> convertArrayToList(T array[]) {
		List<T> list = new ArrayList<>(); 
		for (T t : array) { 
			list.add(t);
		}
		return list; 
	}

	private String sendGet(String url) throws Exception {

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' Request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		return response.toString();
	}

}