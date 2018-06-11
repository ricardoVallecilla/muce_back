/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;

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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "FOTOGRAFIA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezafotograficadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAFOTOGRAFICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezafotograficadetalle_seq", allocationSize = 1, name = "PIEZAFOTOGRAFICADETALLE_SEQ")
    
    

    @Column(name = "ftg_id", nullable = false, precision = 0, scale = -127)
    private Long detalleid;

    @Size(min = 1, max = 600)
    @Column(name = "ftg_titulo", nullable = false, length = 600)
    private String titulo;
    
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ftg_tematica", nullable = false, length = 600)
    private String tematica;
    
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ftg_tipologia", nullable = false, length = 600)
    private String tipologia;
    
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ftg_procedimiento", nullable = false, length = 600)
    private String procedimiento;
    
    @Size(max = 600)
    @Column(name = "ftg_autor", length = 600)
    private String autor;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "ftg_siglo_ano", nullable = false, length = 10)
    private String sigloano;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ftg_fondo", nullable = false, length = 600)
    private String fondo;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "ftg_alto", nullable = false, length = 10)
    private String alto;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "ftg_largo", nullable = false, length = 10)
    private String largo;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ftg_inscripciones", nullable = false, length = 600)
    private String inscripciones;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ftg_descripcion", nullable = false, length = 600)
    private String descripcion;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ftg_elementos_relacionado", nullable = false, length = 600)
    private String elementosrelacionado;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    //categorizacion
    @Size(max = 3000)
    @Column(name = "ftg_contexto_cultural", length = 3000)
    private String contextoCultural;
    
    @Size(max = 3000)
    @Column(name = "ftg_contexto_historico", length = 3000)
    private String contextoHistorico;
    
    @Size(max = 3000)
    @Column(name = "ftg_contexto_situacion", length = 3000)
    private String contextoSituacion;
    
    @Size(max = 3000)
    @Column(name = "ftg_contexto_espacial", length = 3000)
    private String contextoEspacial;
    
    @Size(max = 3000)
    @Column(name = "ftg_contexto_temporal", length = 3000)
    private String contextoTemporal;
    
    @Size(max = 600)
    @Column(name = "ftg_tipo_derecho", length = 600)
    private String tipoDerecho;
    
    @Size(max = 600)
    @Column(name = "ftg_derecho", length = 600)
    private String derecho;
    
    @Size(max = 2000)
    @Column(name = "ftg_clausulas", length = 2000)
    private String clausulas;
    
    @Size(max = 2000)
    @Column(name = "ftg_color", length = 2000)
    private String color;
    
    @Size(max = 2000)
    @Column(name = "ftg_camara", length = 2000)
    private String camara;
    
    @Size(max = 2000)
    @Column(name = "ftg_modelo", length = 2000)
    private String modelo;
    
    @Size(max = 2000)
    @Column(name = "ftg_exposicion", length = 2000)
    private String exposicion;
    
    @Size(max = 2000)
    @Column(name = "ftg_objetivo", length = 2000)
    private String objetivo;
    
    @Size(max = 2000)
    @Column(name = "ftg_focal", length = 2000)
    private String focal;
    
    @Size(max = 2000)
    @Column(name = "ftg_iso", length = 2000)
    private String iso;
    
    @Size(max = 2000)
    @Column(name = "ftg_luz", length = 2000)
    private String luz;
    
    @Size(max = 3000)
    @Column(name = "ftg_personal", length = 3000)
    private String personal;
    
    @Size(max = 3000)
    @Column(name = "ftg_familiar", length = 3000)
    private String familiar;
    
    @Size(max = 3000)
    @Column(name = "ftg_corporativo", length = 3000)
    private String corporativo;
    
    @Size(max = 3000)
    @Column(name = "ftg_coleccionista", length = 3000)
    private String coleccionista;
    
    @Size(max = 3000)
    @Column(name = "ftg_descripcion_personal", length = 3000)
    private String descripcionPersonal;
    
    @Size(max = 3000)
    @Column(name = "ftg_descripcion_familiar", length = 3000)
    private String descripcionFamiliar;
    
    @Size(max = 3000)
    @Column(name = "ftg_descripcion_corporativa", length = 3000)
    private String descripcionCorporativa;
    
    @Size(max = 3000)
    @Column(name = "ftg_evento", length = 3000)
    private String evento;
    
    @Size(max = 3000)
    @Column(name = "ftg_descripcion_paisajista", length = 3000)
    private String descripcionPaisajista;
    
    @Size(max = 3000)
    @Column(name = "ftg_tesauro", length = 3000)
    private String tesauro;
    
    @Size(max = 600)
    @Column(name = "ftg_palabras_claves", length = 600)
    private String palabrasClaves;
    

    @JoinColumn(name = "msb_id", referencedColumnName = "msb_id", nullable = false)
    @ManyToOne(cascade = {CascadeType.ALL})

    private Piezamuseable piezamuseableid;


    public Piezafotograficadetalle() {
    }

    public Piezafotograficadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezafotograficadetalle(Long detalleid, String titulo, String tematica, String tipologia, String procedimiento, String sigloano, String fondo, String alto, String largo, String inscripciones, String descripcion, String elementosrelacionado) {
        this.detalleid = detalleid;
        this.titulo = titulo;
        this.tematica = tematica;
        this.tipologia = tipologia;
        this.procedimiento = procedimiento;
        this.sigloano = sigloano;
        this.fondo = fondo;
        this.alto = alto;
        this.largo = largo;
        this.inscripciones = inscripciones;
        this.descripcion = descripcion;
        this.elementosrelacionado = elementosrelacionado;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSigloano() {
        return sigloano;
    }

    public void setSigloano(String sigloano) {
        this.sigloano = sigloano;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
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

    public String getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(String inscripciones) {
        this.inscripciones = inscripciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getElementosrelacionado() {
        return elementosrelacionado;
    }

    public void setElementosrelacionado(String elementosrelacionado) {
        this.elementosrelacionado = elementosrelacionado;
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

    public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }

    public String getContextoCultural() {
		return contextoCultural;
	}

	public void setContextoCultural(String contextoCultural) {
		this.contextoCultural = contextoCultural;
	}

	public String getContextoHistorico() {
		return contextoHistorico;
	}

	public void setContextoHistorico(String contextoHistorico) {
		this.contextoHistorico = contextoHistorico;
	}

	public String getContextoSituacion() {
		return contextoSituacion;
	}

	public void setContextoSituacion(String contextoSituacion) {
		this.contextoSituacion = contextoSituacion;
	}

	public String getContextoEspacial() {
		return contextoEspacial;
	}

	public void setContextoEspacial(String contextoEspacial) {
		this.contextoEspacial = contextoEspacial;
	}

	public String getContextoTemporal() {
		return contextoTemporal;
	}

	public void setContextoTemporal(String contextoTemporal) {
		this.contextoTemporal = contextoTemporal;
	}

	public String getTipoDerecho() {
		return tipoDerecho;
	}

	public void setTipoDerecho(String tipoDerecho) {
		this.tipoDerecho = tipoDerecho;
	}

	public String getDerecho() {
		return derecho;
	}

	public void setDerecho(String derecho) {
		this.derecho = derecho;
	}

	public String getClausulas() {
		return clausulas;
	}

	public void setClausulas(String clausulas) {
		this.clausulas = clausulas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getExposicion() {
		return exposicion;
	}

	public void setExposicion(String exposicion) {
		this.exposicion = exposicion;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getFocal() {
		return focal;
	}

	public void setFocal(String focal) {
		this.focal = focal;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getLuz() {
		return luz;
	}

	public void setLuz(String luz) {
		this.luz = luz;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getFamiliar() {
		return familiar;
	}

	public void setFamiliar(String familiar) {
		this.familiar = familiar;
	}

	public String getCorporativo() {
		return corporativo;
	}

	public void setCorporativo(String corporativo) {
		this.corporativo = corporativo;
	}

	public String getColeccionista() {
		return coleccionista;
	}

	public void setColeccionista(String coleccionista) {
		this.coleccionista = coleccionista;
	}

	public String getDescripcionPersonal() {
		return descripcionPersonal;
	}

	public void setDescripcionPersonal(String descripcionPersonal) {
		this.descripcionPersonal = descripcionPersonal;
	}

	public String getDescripcionFamiliar() {
		return descripcionFamiliar;
	}

	public void setDescripcionFamiliar(String descripcionFamiliar) {
		this.descripcionFamiliar = descripcionFamiliar;
	}

	public String getDescripcionCorporativa() {
		return descripcionCorporativa;
	}

	public void setDescripcionCorporativa(String descripcionCorporativa) {
		this.descripcionCorporativa = descripcionCorporativa;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getDescripcionPaisajista() {
		return descripcionPaisajista;
	}

	public void setDescripcionPaisajista(String descripcionPaisajista) {
		this.descripcionPaisajista = descripcionPaisajista;
	}

	public String getTesauro() {
		return tesauro;
	}

	public void setTesauro(String tesauro) {
		this.tesauro = tesauro;
	}

	public String getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(String palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
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
        if (!(object instanceof Piezafotograficadetalle)) {
            return false;
        }
        Piezafotograficadetalle other = (Piezafotograficadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezafotograficadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
