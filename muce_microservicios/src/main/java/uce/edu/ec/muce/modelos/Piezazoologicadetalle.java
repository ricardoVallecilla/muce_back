/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "ZOOLOGIA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezazoologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAZOOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezazoologicadetalle_seq", allocationSize = 1, name = "PIEZAZOOLOGICADETALLE_SEQ")
    @Column(name = "zlg_id", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_nombre_cientifico", nullable = false, length = 600)
    private String nombrecientifico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_nombre_comun", nullable = false, length = 600)
    private String nombrecomun;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_autor", nullable = false, length = 600)
    private String autor;
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
    @Column(name = "zlg_peso", nullable = false, length = 10)
    private String peso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_inscripciones", nullable = false, length = 600)
    private String inscripciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_elementos_relacionados", nullable = false, length = 600)
    private String elementosrelacionados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_descripcion", nullable = false, length = 600)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_latitud", nullable = false, length = 600)
    private String latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_longitud", nullable = false, length = 600)
    private String longitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_localizacion_precisa", nullable = false, length = 600)
    private String localizacionprecisa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "zlg_persona_recolectora", nullable = false, length = 600)
    private String personarecolectora;
    
    @Size(min = 1, max = 600)
    @Column(name = "zlg_ciudad", length = 600)
    private String ciudad;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600)
    private String usuarioregistroid;
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
   
    
    @Size(min = 1, max = 600)
    @Column(name = "zlg_provincia", length = 600)
    private String provincia;
    
    @Size(min = 1, max = 600)
    @Column(name = "zlg_canton", length = 600)
    private String canton;
    
    @Size(min = 1, max = 600)
    @Column(name = "zlg_sexo", length = 600)
    private String sexo;
    
    @JoinColumn(name = "zlg_pais", referencedColumnName = "ctl_id", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo paisid;

    @JoinColumn(name = "msb_id", referencedColumnName = "msb_id", nullable = false)
    @ManyToOne(cascade = {CascadeType.ALL})

    private Piezamuseable piezamuseableid;

    public Piezazoologicadetalle() {
    }

    public Piezazoologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezazoologicadetalle(Long detalleid, String nombrecientifico, String nombrecomun, String autor, String alto, String largo, String ancho, String diametro, String peso, String inscripciones, String elementosrelacionados, String descripcion, String latitud, String longitud, String localizacionprecisa, String personarecolectora, String ciudad) {
        this.detalleid = detalleid;
        this.nombrecientifico = nombrecientifico;
        this.nombrecomun = nombrecomun;
        this.autor = autor;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.diametro = diametro;
        this.peso = peso;
        this.inscripciones = inscripciones;
        this.elementosrelacionados = elementosrelacionados;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.localizacionprecisa = localizacionprecisa;
        this.personarecolectora = personarecolectora;
        this.ciudad = ciudad;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public void setNombrecientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
    }

    public String getNombrecomun() {
        return nombrecomun;
    }

    public void setNombrecomun(String nombrecomun) {
        this.nombrecomun = nombrecomun;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public String getElementosrelacionados() {
        return elementosrelacionados;
    }

    public void setElementosrelacionados(String elementosrelacionados) {
        this.elementosrelacionados = elementosrelacionados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLocalizacionprecisa() {
        return localizacionprecisa;
    }

    public void setLocalizacionprecisa(String localizacionprecisa) {
        this.localizacionprecisa = localizacionprecisa;
    }

  


	public String getPersonarecolectora() {
		return personarecolectora;
	}

	public void setPersonarecolectora(String personarecolectora) {
		this.personarecolectora = personarecolectora;
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
    
    
    public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	

    public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Catalogo getPaisid() {
        return paisid;
    }

    public void setPaisid(Catalogo paisid) {
        this.paisid = paisid;
    }
    
    public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
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
        if (!(object instanceof Piezazoologicadetalle)) {
            return false;
        }
        Piezazoologicadetalle other = (Piezazoologicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezazoologicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
