package webservice;

import entity.UltimoStatus;

public class GetUltimoStatus extends GetDetalhes{
	
	private UltimoStatus ultimoStatus;

	public UltimoStatus getUltimoStatus() {
		return ultimoStatus;
	}

	public void setUltimoStatus(UltimoStatus ultimoStatus) {
		this.ultimoStatus = ultimoStatus;
	}
	
	

}
