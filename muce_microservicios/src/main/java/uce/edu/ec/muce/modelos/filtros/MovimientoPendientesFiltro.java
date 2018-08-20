package uce.edu.ec.muce.modelos.filtros;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovimientoPendientesFiltro {
	
	private Long museoid;
	
	private Long[] estados;

	

	public Long getMuseoid() {
		return museoid;
	}

	public void setMuseoid(Long museoid) {
		this.museoid = museoid;
	}

	public Long[] getEstados() {
		return estados;
	}

	public void setEstados(Long[] estados) {
		this.estados = estados;
	}
	
	
	

}
