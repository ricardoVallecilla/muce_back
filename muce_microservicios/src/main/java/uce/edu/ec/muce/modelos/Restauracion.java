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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RESTAURACION", catalog = "", schema = "MUCE")
public class Restauracion implements Serializable {

	private static final long serialVersionUID = -2397285430427127945L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURACION_SEQ")
    @SequenceGenerator(sequenceName = "RESTAURACION_SEQ", allocationSize = 1, name = "RESTAURACION_SEQ")
    @Basic(optional = false)
    @Column(name = "rst_id", nullable = false, precision = 0, scale = -127)
	private Long id;
	
    
    @Column(name = "rst_origen_historico", length = 300)
	private String origenHistorico;

    
    @Column(name = "rst_cambio_ubicacion", length = 300)
	private String cambioUbicacion;
    
    
    @Column(name = "rst_restauracion_modificacion", length = 300)
	private String restauracionModificacion;
    
    
    @Column(name = "rst_exposiciones", length = 300)
	private String exposiciones;
    
    
    @Column(name = "rst_estudios_previos", length = 600)
	private String estudiosPrevios;
    
    
    @Column(name = "rst_estudios_analiticos", length = 600)
	private String estudiosAnaliticos;
    
    
    @Column(name = "rst_estudios_historico", length = 600)
	private String estudiosHistorico;
    
    
    @Column(name = "rst_tratamiento", length = 3000)
	private String tratamiento;
	
    
    @Column(name = "rst_restaurador", length = 150)
	private String restaurador;
    
    
    @Column(name = "rst_biologo", length = 150)
	private String biologo;
    
    
    @Column(name = "rst_quimico", length = 150)
	private String quimico;
    
    
    @Column(name = "rst_historiador", length = 150)
	private String historiador;
    
    
    @Column(name = "rst_arquitecto", length = 150)
	private String arquitecto;
    
    
    @Column(name = "rst_fotografo", length = 150)
	private String fotografo;
    
    
    @Column(name = "rst_auxiliar", length = 150)
	private String auxiliar;
    
    
    @Column(name = "rst_observacion", length = 600)
	private String observacion;
    
    
    @Column(name = "rst_tec_instrumental", length = 600)
	private String tecInstrumental;
    
    
    @Column(name = "rst_tec_quimico", length = 600)
	private String tecQuimico;
    
    
    @Column(name = "rst_tec_observacion", length = 600)
	private String tecObservacion;
    
    @Column(name = "rst_foto_uno")
    private String fotoUno;
    
    @Column(name = "rst_foto_dos")
    private String fotoDos;
    
    @Column(name = "rst_foto_tres")
    private String fotoTres;
    
    @Column(name = "rst_foto_cuatro")
    private String fotoCuatro;
    
    @Column(name = "rst_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
	@JoinColumn(name = "itm_id", referencedColumnName = "itm_id")
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
	
	public String getExposiciones() {
		return exposiciones;
	}
	public void setExposiciones(String exposiciones) {
		this.exposiciones = exposiciones;
	}
	public Item getItemid() {
		return itemid;
	}
	public void setItemid(Item itemid) {
		this.itemid = itemid;
	}
	public String getRestaurador() {
		return restaurador;
	}
	public void setRestaurador(String restaurador) {
		this.restaurador = restaurador;
	}
	public String getBiologo() {
		return biologo;
	}
	public void setBiologo(String biologo) {
		this.biologo = biologo;
	}
	public String getQuimico() {
		return quimico;
	}
	public void setQuimico(String quimico) {
		this.quimico = quimico;
	}
	public String getHistoriador() {
		return historiador;
	}
	public void setHistoriador(String historiador) {
		this.historiador = historiador;
	}
	public String getArquitecto() {
		return arquitecto;
	}
	public void setArquitecto(String arquitecto) {
		this.arquitecto = arquitecto;
	}
	public String getFotografo() {
		return fotografo;
	}
	public void setFotografo(String fotografo) {
		this.fotografo = fotografo;
	}
	public String getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(String auxiliar) {
		this.auxiliar = auxiliar;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getTecInstrumental() {
		return tecInstrumental;
	}
	public void setTecInstrumental(String tecInstrumental) {
		this.tecInstrumental = tecInstrumental;
	}
	public String getTecQuimico() {
		return tecQuimico;
	}
	public void setTecQuimico(String tecQuimico) {
		this.tecQuimico = tecQuimico;
	}
	public String getTecObservacion() {
		return tecObservacion;
	}
	public void setTecObservacion(String tecObservacion) {
		this.tecObservacion = tecObservacion;
	}
	public String getFotoUno() {
		return fotoUno;
	}
	public void setFotoUno(String fotoUno) {
		this.fotoUno = fotoUno;
	}
	public String getFotoDos() {
		return fotoDos;
	}
	public void setFotoDos(String fotoDos) {
		this.fotoDos = fotoDos;
	}
	public String getFotoTres() {
		return fotoTres;
	}
	public void setFotoTres(String fotoTres) {
		this.fotoTres = fotoTres;
	}
	public String getFotoCuatro() {
		return fotoCuatro;
	}
	public void setFotoCuatro(String fotoCuatro) {
		this.fotoCuatro = fotoCuatro;
	}
}
