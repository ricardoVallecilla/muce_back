package uce.edu.ec.muce.modelos.filtros;

import java.util.List;

public class ReporteGeneral {
	
	private List<Object[]> cantidadPiezas;
	
	private List<Object[]> cantidadPiezasInventario;
	
	private List<Object[]> cantidadPiezasCatalogacion;
	
	private Long cantidadPiezasRestauracion;

	public List<Object[]> getCantidadPiezas() {
		return cantidadPiezas;
	}

	public void setCantidadPiezas(List<Object[]> cantidadPiezas) {
		this.cantidadPiezas = cantidadPiezas;
	}

	public List<Object[]> getCantidadPiezasInventario() {
		return cantidadPiezasInventario;
	}

	public void setCantidadPiezasInventario(List<Object[]> cantidadPiezasInventario) {
		this.cantidadPiezasInventario = cantidadPiezasInventario;
	}

	public List<Object[]> getCantidadPiezasCatalogacion() {
		return cantidadPiezasCatalogacion;
	}

	public void setCantidadPiezasCatalogacion(List<Object[]> cantidadPiezasCatalogacion) {
		this.cantidadPiezasCatalogacion = cantidadPiezasCatalogacion;
	}

	public Long getCantidadPiezasRestauracion() {
		return cantidadPiezasRestauracion;
	}

	public void setCantidadPiezasRestauracion(Long cantidadPiezasRestauracion) {
		this.cantidadPiezasRestauracion = cantidadPiezasRestauracion;
	}

	
	
	
	

}
