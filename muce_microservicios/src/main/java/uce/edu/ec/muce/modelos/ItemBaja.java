package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ITEMBAJA", catalog = "", schema = "MUCE")
public class ItemBaja implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEMBAJA_SEQ")
    @SequenceGenerator(sequenceName = "itembaja_seq", allocationSize = 1, name = "ITEMBAJA_SEQ")
	@Column(name = "ITEMBAJAID", precision = 0, scale = -127)
    private Long itembajaid;
	
	@Size(min = 1, max = 150)
    private String denominacion;
	
	@Size(min = 1, max = 150)
    private String subtipo;
	
	@Size(min = 1, max = 600)
    private String procedencia;
	
	
	@Size(min = 1, max = 600)
    private String motivos;
	
	@Size(min = 1, max = 3000)
    private String justificacion;
	
	@Size(min = 1, max = 150)
    private String entidadinvestigadora;
	
	@Size(min = 1, max = 150)
    private String ejecutadopor;
	
	private Date fecha;
	
	@Size(min = 1, max = 150)
    private String custodio;
	
	@Size(min = 1, max = 600)
    private String aprobadopor;
	
	@Size(min = 1, max = 600)
    private String observaciones;
	
	private Date  fechaaprobacion;
	
	
	private Long itemid;

	

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Long getItembajaid() {
		return itembajaid;
	}

	public void setItembajaid(Long itembajaid) {
		this.itembajaid = itembajaid;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getSubtipo() {
		return subtipo;
	}

	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getMotivos() {
		return motivos;
	}

	public void setMotivos(String motivos) {
		this.motivos = motivos;
	}

	public String getJustificacion() {
		return justificacion;
	}

	public void setJustificacion(String justificacion) {
		this.justificacion = justificacion;
	}

	public String getEntidadinvestigadora() {
		return entidadinvestigadora;
	}

	public void setEntidadinvestigadora(String entidadinvestigadora) {
		this.entidadinvestigadora = entidadinvestigadora;
	}

	public String getEjecutadopor() {
		return ejecutadopor;
	}

	public void setEjecutadopor(String ejecutadopor) {
		this.ejecutadopor = ejecutadopor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCustodio() {
		return custodio;
	}

	public void setCustodio(String custodio) {
		this.custodio = custodio;
	}

	public String getAprobadopor() {
		return aprobadopor;
	}

	public void setAprobadopor(String aprobadopor) {
		this.aprobadopor = aprobadopor;
	}

	public Date getFechaaprobacion() {
		return fechaaprobacion;
	}

	public void setFechaaprobacion(Date fechaaprobacion) {
		this.fechaaprobacion = fechaaprobacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aprobadopor == null) ? 0 : aprobadopor.hashCode());
		result = prime * result + ((custodio == null) ? 0 : custodio.hashCode());
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + ((ejecutadopor == null) ? 0 : ejecutadopor.hashCode());
		result = prime * result + ((entidadinvestigadora == null) ? 0 : entidadinvestigadora.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((fechaaprobacion == null) ? 0 : fechaaprobacion.hashCode());
		result = prime * result + ((itembajaid == null) ? 0 : itembajaid.hashCode());
		result = prime * result + ((justificacion == null) ? 0 : justificacion.hashCode());
		result = prime * result + ((motivos == null) ? 0 : motivos.hashCode());
		result = prime * result + ((procedencia == null) ? 0 : procedencia.hashCode());
		result = prime * result + ((subtipo == null) ? 0 : subtipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemBaja other = (ItemBaja) obj;
		if (aprobadopor == null) {
			if (other.aprobadopor != null)
				return false;
		} else if (!aprobadopor.equals(other.aprobadopor))
			return false;
		if (custodio == null) {
			if (other.custodio != null)
				return false;
		} else if (!custodio.equals(other.custodio))
			return false;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (ejecutadopor == null) {
			if (other.ejecutadopor != null)
				return false;
		} else if (!ejecutadopor.equals(other.ejecutadopor))
			return false;
		if (entidadinvestigadora == null) {
			if (other.entidadinvestigadora != null)
				return false;
		} else if (!entidadinvestigadora.equals(other.entidadinvestigadora))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (fechaaprobacion == null) {
			if (other.fechaaprobacion != null)
				return false;
		} else if (!fechaaprobacion.equals(other.fechaaprobacion))
			return false;
		if (itembajaid == null) {
			if (other.itembajaid != null)
				return false;
		} else if (!itembajaid.equals(other.itembajaid))
			return false;
		if (justificacion == null) {
			if (other.justificacion != null)
				return false;
		} else if (!justificacion.equals(other.justificacion))
			return false;
		if (motivos == null) {
			if (other.motivos != null)
				return false;
		} else if (!motivos.equals(other.motivos))
			return false;
		if (procedencia == null) {
			if (other.procedencia != null)
				return false;
		} else if (!procedencia.equals(other.procedencia))
			return false;
		if (subtipo == null) {
			if (other.subtipo != null)
				return false;
		} else if (!subtipo.equals(other.subtipo))
			return false;
		return true;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	

}
