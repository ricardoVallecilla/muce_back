package uce.edu.ec.muce.modelos;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "ARTES", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezaartedetalle implements Serializable{

	private static final long serialVersionUID = 105602378954888820L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZARTEDETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezaartedetalle_seq", allocationSize = 1, name = "PIEZARTEDETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "art_id", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_tipoBien", nullable = false, length = 600)
	private String tipoBien;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_titulo", nullable = false, length = 600)
	private String titulo;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_tecnica", nullable = false, length = 600)
	private String tecnica;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "zlg_alto", nullable = false, length = 10)
	private String alto;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "zlg_largo", nullable = false, length = 10)
	private String largo;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "zlg_ancho", nullable = false, length = 10)
	private String ancho;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "zlg_diametro", nullable = false, length = 10)
	private String diametro;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "zlg_espesor", nullable = false, length = 10)
	private String espesor;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "zlg_peso", nullable = false, length = 10)
	private String peso;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "zlg_sigloanio", nullable = false, length = 10)
	private String sigloanio;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_autor", nullable = false, length = 600)
	private String autor;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_inscripciones", nullable = false, length = 600)
	private String inscripciones;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_elementoRelacionados", nullable = false, length = 600)
	private String elementoRelacionados;
	
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_descripcion", nullable = false, length = 600)
	private String descripcion;
	
	@JoinColumn(name = "zlg_tecnica_conservacion", referencedColumnName = "ctl_id", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo tecnicaconservacionid;
	
	@JoinColumn(name = "msb_id", referencedColumnName = "msb_id", nullable = false)
    @ManyToOne(optional = false)
    private Piezamuseable piezamuseableid;

	public Long getDetalleid() {
		return detalleid;
	}

	public void setDetalleid(Long detalleid) {
		this.detalleid = detalleid;
	}

	public String getTipoBien() {
		return tipoBien;
	}

	public void setTipoBien(String tipoBien) {
		this.tipoBien = tipoBien;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getAlto() {
		return alto;
	}

	public void setAlto(String alto) {
		this.alto = alto;
	}

	public String getLargo() {
		return largo;
	}

	public void setLargo(String largo) {
		this.largo = largo;
	}

	public String getAncho() {
		return ancho;
	}

	public void setAncho(String ancho) {
		this.ancho = ancho;
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public String getEspesor() {
		return espesor;
	}

	public void setEspesor(String espesor) {
		this.espesor = espesor;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getSigloanio() {
		return sigloanio;
	}

	public void setSigloanio(String sigloanio) {
		this.sigloanio = sigloanio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getInscripciones() {
		return inscripciones;
	}

	public void setInscripciones(String inscripciones) {
		this.inscripciones = inscripciones;
	}

	public String getElementoRelacionados() {
		return elementoRelacionados;
	}

	public void setElementoRelacionados(String elementoRelacionados) {
		this.elementoRelacionados = elementoRelacionados;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Catalogo getTecnicaconservacionid() {
		return tecnicaconservacionid;
	}

	public void setTecnicaconservacionid(Catalogo tecnicaconservacionid) {
		this.tecnicaconservacionid = tecnicaconservacionid;
	}

	public Piezamuseable getPiezamuseableid() {
		return piezamuseableid;
	}

	public void setPiezamuseableid(Piezamuseable piezamuseableid) {
		this.piezamuseableid = piezamuseableid;
	}
}
