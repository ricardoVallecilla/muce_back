package uce.edu.ec.muce.modelos.filtros;

import java.util.List;

public class ExposicionResult {

	private Long tipo;
	private List<Object[]> items;
	public Long getTipo() {
		return tipo;
	}
	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}
	public List<Object[]> getItems() {
		return items;
	}
	public void setItems(List<Object[]> items) {
		this.items = items;
	}
	
	
}
