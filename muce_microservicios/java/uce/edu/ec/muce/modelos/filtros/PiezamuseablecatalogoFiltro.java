package uce.edu.ec.muce.modelos.filtros;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PiezamuseablecatalogoFiltro {

	private Long piezamuseableid;
	
	private String[] nombrescolumnas;

	public Long getPiezamuseableid() {
		return piezamuseableid;
	}

	public void setPiezamuseableid(Long piezamuseableid) {
		this.piezamuseableid = piezamuseableid;
	}

	public String[] getNombrescolumnas() {
		return nombrescolumnas;
	}

	public void setNombrescolumnas(String[] nombrescolumnas) {
		this.nombrescolumnas = nombrescolumnas;
	}
	
	
}
