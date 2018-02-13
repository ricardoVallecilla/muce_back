package uce.edu.ec.muce.modelos.filtros;

import java.util.Set;

import uce.edu.ec.muce.modelos.Catalogo;
import uce.edu.ec.muce.modelos.Movimiento;
import uce.edu.ec.muce.modelos.MovimientoPieza;

public class MovimientoPiezaIngreso {
	
	private Movimiento movimiento;
	private Set<MovimientoPieza> piezas;
	private Catalogo nuevoestadositem;
	
	public Movimiento getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}
	public Set<MovimientoPieza> getPiezas() {
		return piezas;
	}
	public void setPiezas(Set<MovimientoPieza> piezas) {
		this.piezas = piezas;
	}
	public Catalogo getNuevoestadositem() {
		return nuevoestadositem;
	}
	public void setNuevoestadositem(Catalogo nuevoestadositem) {
		this.nuevoestadositem = nuevoestadositem;
	}
	
	
	

}
