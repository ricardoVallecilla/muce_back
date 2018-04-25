/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "GEOLOGIA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezageologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAGEOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezageologicadetalle_seq", allocationSize = 1, name = "PIEZAGEOLOGICADETALLE_SEQ")

    @Basic(optional = false)
    @NotNull
    @Column(name = "glg_id", nullable = false, precision = 0, scale = -127)
    private Long detalleid;

    @Size(max = 600)
    @Column(name = "glg_material", length = 600)
    private String material;
    
    @Size(max = 600)
    @Column(name = "glg_clasificacion", length = 600)
    private String clasificacion;
    
    @Size(max = 600)
    @Column(name = "glg_clasificacion_campo", length = 600)
    private String clasificacioncampo;
    
    @Size(max = 600)
    @Column(name = "glg_periodo", length = 600)
    private String periodo;
    
    @Size(max = 50)
    @Column(name = "glg_epoca", length = 50)
    private String epoca;
    
    @Size(max = 25)
    @Column(name = "glg_era", length = 25)
    private String era;
    
    @Size(max = 25)
    @Column(name = "glg_edad", length = 25)
    private String edad;
    
    @Size(max = 10)
    @Column(name = "glg_alto", length = 10)
    private String alto;
    
    @Size(max = 10)
    @Column(name = "glg_largo", length = 10)
    private String largo;
    
    @Size(max = 10)
    @Column(name = "glg_ancho", length = 10)
    private String ancho;
    
    @Size(max = 10)
    @Column(name = "glg_diametro", length = 10)
    private String diametro;
    
    @Size(max = 10)
    @Column(name = "glg_peso", length = 10)
    private String peso;
    
    @Size(max = 600)
    @Column(name = "glg_inscripciones", length = 600)
    private String inscripciones;
    
    @Size(max = 10)
    @Column(name = "glg_grupo", length = 10)
    private String grupo;
    
    @Size(max = 600)
    @Column(name = "glg_elementos_relacionados", length = 600)
    private String elementosrelacionados;
    
    @Column(name = "glg_descripcion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date descripcion;
    
    @JoinColumn(name = "msb_id", referencedColumnName = "msb_id")
    @ManyToOne
    private Piezamuseable piezamuseableid;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;

    public Piezageologicadetalle() {
    }

    public Piezageologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacioncampo() {
        return clasificacioncampo;
    }

    public void setClasificacioncampo(String clasificacioncampo) {
        this.clasificacioncampo = clasificacioncampo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(String inscripciones) {
        this.inscripciones = inscripciones;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getElementosrelacionados() {
        return elementosrelacionados;
    }

    public void setElementosrelacionados(String elementosrelacionados) {
        this.elementosrelacionados = elementosrelacionados;
    }

    public Date getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Date descripcion) {
        this.descripcion = descripcion;
    }

    public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }

    
    public String getUsuarioregistroid() {
		return usuarioregistroid;
	}

	public void setUsuarioregistroid(String usuarioregistroid) {
		this.usuarioregistroid = usuarioregistroid;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleid != null ? detalleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piezageologicadetalle)) {
            return false;
        }
        Piezageologicadetalle other = (Piezageologicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezageologicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
