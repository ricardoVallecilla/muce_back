package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "RESTAURACION", catalog = "", schema = "MUCE")
public class Restauracion implements Serializable {

	private static final long serialVersionUID = -2397285430427127945L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURACION_SEQ")
    @SequenceGenerator(sequenceName = "RESTAURACION_SEQ", allocationSize = 1, name = "RESTAURACION_SEQ")
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
	private Long id;
	
    @Size(min = 1, max = 256)
    @Column(name = "ORIGENHISTORICO", length = 256)
	private String origenHistorico;

    @Size(min = 1, max = 256)
    @Column(name = "CAMBIOUBICACION", length = 256)
	private String cambioUbicacion;
    
    @Size(min = 1, max = 256)
    @Column(name = "RESTAURACIONMODIFICACION", length = 256)
	private String restauracionModificacion;
    
    @Size(min = 1, max = 256)
    @Column(name = "ESTUDIOSPREVIOS", length = 256)
	private String estudiosPrevios;
    
    @Size(min = 1, max = 256)
    @Column(name = "ESTUDIOSANALITICOS", length = 256)
	private String estudiosAnaliticos;
    
    @Size(min = 1, max = 256)
    @Column(name = "ESTUDIOSHISTORICOS", length = 256)
	private String estudiosHistorico;
    
    @Size(min = 1, max = 256)
    @Column(name = "TRATAMIENTO", length = 256)
	private String tratamiento;
	
    @Lob
    @Column(name = "FOTOGRAFIA")
	private byte[] fotografia;
    
    @Size(min = 1, max = 256)
    @Column(name = "ENTIDADCONTROL", length = 256)
	private String entidadControl;
    
    @Size(min = 1, max = 256)
    @Column(name = "REVISADOPOR", length = 256)
	private String revisadoPor;
	
	@Column(name = "FECHAREVISION")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fechaRevision;
	
    @Size(min = 1, max = 256)
    @Column(name = "REGISTROFOTOGRAFICO", length = 256)
	private String registroFotografico;
	
	@Column(name = "FECHAAPROBACION")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fechaAprobacion;
	
	@Size(min = 1, max = 256)
    @Column(name = "APROBADOPOR", length = 256)
	private String aprobadoPor;
	
	@JoinColumn(name = "ITEMID", referencedColumnName = "ITEMID")
    @OneToOne
    private Item itemid;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrigenHistorico() {
		return origenHistorico;
	}
	public void setOrigenHistorico(String origenHistorico) {
		this.origenHistorico = origenHistorico;
	}
	public String getCambioUbicacion() {
		return cambioUbicacion;
	}
	public void setCambioUbicacion(String cambioUbicacion) {
		this.cambioUbicacion = cambioUbicacion;
	}
	public String getRestauracionModificacion() {
		return restauracionModificacion;
	}
	public void setRestauracionModificacion(String restauracionModificacion) {
		this.restauracionModificacion = restauracionModificacion;
	}
	public String getEstudiosPrevios() {
		return estudiosPrevios;
	}
	public void setEstudiosPrevios(String estudiosPrevios) {
		this.estudiosPrevios = estudiosPrevios;
	}
	public String getEstudiosAnaliticos() {
		return estudiosAnaliticos;
	}
	public void setEstudiosAnaliticos(String estudiosAnaliticos) {
		this.estudiosAnaliticos = estudiosAnaliticos;
	}
	public String getEstudiosHistorico() {
		return estudiosHistorico;
	}
	public void setEstudiosHistorico(String estudiosHistorico) {
		this.estudiosHistorico = estudiosHistorico;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	public byte[] getFotografia() {
		return fotografia;
	}
	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}
	public String getEntidadControl() {
		return entidadControl;
	}
	public void setEntidadControl(String entidadControl) {
		this.entidadControl = entidadControl;
	}
	public String getRevisadoPor() {
		return revisadoPor;
	}
	public void setRevisadoPor(String revisadoPor) {
		this.revisadoPor = revisadoPor;
	}
	public Date getFechaRevision() {
		return fechaRevision;
	}
	public void setFechaRevision(Date fechaRevision) {
		this.fechaRevision = fechaRevision;
	}
	public String getRegistroFotografico() {
		return registroFotografico;
	}
	public void setRegistroFotografico(String registroFotografico) {
		this.registroFotografico = registroFotografico;
	}
	public Date getFechaAprobacion() {
		return fechaAprobacion;
	}
	public void setFechaAprobacion(Date fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}
	public String getAprobadoPor() {
		return aprobadoPor;
	}
	public void setAprobadoPor(String aprobadoPor) {
		this.aprobadoPor = aprobadoPor;
	}
}
