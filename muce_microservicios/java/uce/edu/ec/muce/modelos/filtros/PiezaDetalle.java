package uce.edu.ec.muce.modelos.filtros;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import uce.edu.ec.muce.modelos.Piezaarqueologicadetalle;
import uce.edu.ec.muce.modelos.Piezaartedetalle;
import uce.edu.ec.muce.modelos.Piezabotanicadetalle;
import uce.edu.ec.muce.modelos.Piezaentomologicadetalle;
import uce.edu.ec.muce.modelos.Piezafotograficadetalle;
import uce.edu.ec.muce.modelos.Piezageologicadetalle;
import uce.edu.ec.muce.modelos.Piezainstrumentaldetalle;
import uce.edu.ec.muce.modelos.Piezamuseable;
import uce.edu.ec.muce.modelos.Piezapaleontologicadetalle;
import uce.edu.ec.muce.modelos.Piezazoologicadetalle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PiezaDetalle {
	
	private Piezamuseable piezamuseable;
	private Piezaarqueologicadetalle piezaarqueologicadetalle;
	private Piezabotanicadetalle piezabotanicadetalle;
	private Piezaentomologicadetalle piezaentomologicadetalle;
	private Piezafotograficadetalle piezafotograficadetalle;
	private Piezageologicadetalle piezageologicadetalle;
	private Piezainstrumentaldetalle piezainstrumentaldetalle;
	private Piezapaleontologicadetalle piezapaleontologicadetalle;
	private Piezazoologicadetalle piezazoologicadetalle;
	private Piezaartedetalle piezaartedetalle;
	public Piezamuseable getPiezamuseable() {
		return piezamuseable;
	}
	public void setPiezamuseable(Piezamuseable piezamuseable) {
		this.piezamuseable = piezamuseable;
	}
	public Piezaarqueologicadetalle getPiezaarqueologicadetalle() {
		return piezaarqueologicadetalle;
	}
	public void setPiezaarqueologicadetalle(Piezaarqueologicadetalle piezaarqueologicadetalle) {
		this.piezaarqueologicadetalle = piezaarqueologicadetalle;
	}
	public Piezabotanicadetalle getPiezabotanicadetalle() {
		return piezabotanicadetalle;
	}
	public void setPiezabotanicadetalle(Piezabotanicadetalle piezabotanicadetalle) {
		this.piezabotanicadetalle = piezabotanicadetalle;
	}
	public Piezaentomologicadetalle getPiezaentomologicadetalle() {
		return piezaentomologicadetalle;
	}
	public void setPiezaentomologicadetalle(Piezaentomologicadetalle piezaentomologicadetalle) {
		this.piezaentomologicadetalle = piezaentomologicadetalle;
	}
	public Piezafotograficadetalle getPiezafotograficadetalle() {
		return piezafotograficadetalle;
	}
	public void setPiezafotograficadetalle(Piezafotograficadetalle piezafotograficadetalle) {
		this.piezafotograficadetalle = piezafotograficadetalle;
	}
	public Piezageologicadetalle getPiezageologicadetalle() {
		return piezageologicadetalle;
	}
	public void setPiezageologicadetalle(Piezageologicadetalle piezageologicadetalle) {
		this.piezageologicadetalle = piezageologicadetalle;
	}
	public Piezainstrumentaldetalle getPiezainstrumentaldetalle() {
		return piezainstrumentaldetalle;
	}
	public void setPiezainstrumentaldetalle(Piezainstrumentaldetalle piezainstrumentaldetalle) {
		this.piezainstrumentaldetalle = piezainstrumentaldetalle;
	}
	public Piezapaleontologicadetalle getPiezapaleontologicadetalle() {
		return piezapaleontologicadetalle;
	}
	public void setPiezapaleontologicadetalle(Piezapaleontologicadetalle piezapaleontologicadetalle) {
		this.piezapaleontologicadetalle = piezapaleontologicadetalle;
	}
	public Piezazoologicadetalle getPiezazoologicadetalle() {
		return piezazoologicadetalle;
	}
	public void setPiezazoologicadetalle(Piezazoologicadetalle piezazoologicadetalle) {
		this.piezazoologicadetalle = piezazoologicadetalle;
	}
	public Piezaartedetalle getPiezaartedetalle() {
		return piezaartedetalle;
	}
	public void setPiezaartedetalle(Piezaartedetalle piezaartedetalle) {
		this.piezaartedetalle = piezaartedetalle;
	}

	
	
}
