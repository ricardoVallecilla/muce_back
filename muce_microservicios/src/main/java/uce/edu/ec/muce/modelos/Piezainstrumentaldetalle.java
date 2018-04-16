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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PIEZAINSTRUMENTALDETALLE", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezainstrumentaldetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAINSTRUMENTALDETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezainstrumentaldetalle_seq", allocationSize = 1, name = "PIEZAINSTRUMENTALDETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETALLEID", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    @Size(max = 600)
    @Column(name = "TIPOBIEN", length = 600)
    private String tipobien;
    @Size(max = 600)
    @Column(name = "OTRADENOMINACION", length = 600)
    private String otradenominacion;
    @Size(max = 600)
    @Column(name = "TECNICA", length = 600)
    private String tecnica;
    @Size(max = 600)
    @Column(name = "FABRICANTE", length = 600)
    private String fabricante;
    @Size(max = 600)
    @Column(name = "LUGARFABRICACION", length = 600)
    private String lugarfabricacion;
    @Size(max = 10)
    @Column(name = "ALTO", length = 10)
    private String alto;
    @Size(max = 10)
    @Column(name = "LARGO", length = 10)
    private String largo;
    @Size(max = 10)
    @Column(name = "ANCHO", length = 10)
    private String ancho;
    @Size(max = 10)
    @Column(name = "DIAMETRO", length = 10)
    private String diametro;
    @Size(max = 10)
    @Column(name = "ESPESOR", length = 10)
    private String espesor;
    @Size(max = 10)
    @Column(name = "PESO", length = 10)
    private String peso;
    @Size(max = 10)
    @Column(name = "PROFUNDIDAD", length = 10)
    private String profundidad;
    @Size(max = 600)
    @Column(name = "INSCRIPCIONES", length = 600)
    private String inscripciones;
    @Size(max = 600)
    @Column(name = "DESCRIPCION", length = 600)
    private String descripcion;

    @Column(name = "ENUSO", nullable = false)    
    private Boolean enuso;
    @JoinColumn(name = "MATERIALID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo materialid;
  

    @Column(name = "FUNCIONA", nullable = false)    
    private Boolean funciona;
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Piezamuseable piezamuseableid;

    @Column(name = "FECHAFABRICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafabricacion;
    
    @Column(length = 3000)
    private String datosregistros;
    @Column(length = 600)
    private String fotografoplanos;
    @Column(length = 600)
    private String lugarplano;
    @Column(length = 600)
    private String pdfplano;
    @Column(length = 600)
    private String fotografoinstructivo;
    @Column(length = 600)
    private String lugarinstructivo;
    @Column(length = 600)
    private String pdfinstructivo;
    @Column(length = 3000)
    private String social;
    @Column(length = 3000)
    private String inventor;
    @Column(length = 3000)
    private String historiafabricante;
    @Lob
    @JsonIgnore
    private byte[]  fotoregistros;
    @Lob
    @JsonIgnore
    private byte[]  fotoplano;
    @Lob
    @JsonIgnore
    private byte[]  fotoinstructivo;

    
    
    public Piezainstrumentaldetalle() {
    }

    public Piezainstrumentaldetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }



    public String getOtradenominacion() {
        return otradenominacion;
    }

    public void setOtradenominacion(String otradenominacion) {
        this.otradenominacion = otradenominacion;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getLugarfabricacion() {
        return lugarfabricacion;
    }

    public void setLugarfabricacion(String lugarfabricacion) {
        this.lugarfabricacion = lugarfabricacion;
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

   

    public Boolean getEnuso() {
		return enuso;
	}

	public void setEnuso(Boolean enuso) {
		this.enuso = enuso;
	}

	public Catalogo getMaterialid() {
		return materialid;
	}

	public void setMaterialid(Catalogo materialid) {
		this.materialid = materialid;
	}

	public Boolean getFunciona() {
		return funciona;
	}

	public void setFunciona(Boolean funciona) {
		this.funciona = funciona;
	}

	public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }

    public String getTipobien() {
		return tipobien;
	}

	public void setTipobien(String tipobien) {
		this.tipobien = tipobien;
	}
	

	public Date getFechafabricacion() {
		return fechafabricacion;
	}

	public void setFechafabricacion(Date fechafabricacion) {
		this.fechafabricacion = fechafabricacion;
	}

	
	public String getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(String profundidad) {
		this.profundidad = profundidad;
	}

	public String getDatosregistros() {
		return datosregistros;
	}

	public void setDatosregistros(String datosregistros) {
		this.datosregistros = datosregistros;
	}

	public String getFotografoplanos() {
		return fotografoplanos;
	}

	public void setFotografoplanos(String fotografoplanos) {
		this.fotografoplanos = fotografoplanos;
	}

	public String getLugarplano() {
		return lugarplano;
	}

	public void setLugarplano(String lugarplano) {
		this.lugarplano = lugarplano;
	}

	public String getPdfplano() {
		return pdfplano;
	}

	public void setPdfplano(String pdfplano) {
		this.pdfplano = pdfplano;
	}

	public String getFotografoinstructivo() {
		return fotografoinstructivo;
	}

	public void setFotografoinstructivo(String fotografoinstructivo) {
		this.fotografoinstructivo = fotografoinstructivo;
	}

	public String getLugarinstructivo() {
		return lugarinstructivo;
	}

	public void setLugarinstructivo(String lugarinstructivo) {
		this.lugarinstructivo = lugarinstructivo;
	}

	public String getPdfinstructivo() {
		return pdfinstructivo;
	}

	public void setPdfinstructivo(String pdfinstructivo) {
		this.pdfinstructivo = pdfinstructivo;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getInventor() {
		return inventor;
	}

	public void setInventor(String inventor) {
		this.inventor = inventor;
	}

	public String getHistoriafabricante() {
		return historiafabricante;
	}

	public void setHistoriafabricante(String historiafabricante) {
		this.historiafabricante = historiafabricante;
	}

	public byte[] getFotoregistros() {
		return fotoregistros;
	}

	public void setFotoregistros(byte[] fotoregistros) {
		this.fotoregistros = fotoregistros;
	}

	public byte[] getFotoplano() {
		return fotoplano;
	}

	public void setFotoplano(byte[] fotoplano) {
		this.fotoplano = fotoplano;
	}

	public byte[] getFotoinstructivo() {
		return fotoinstructivo;
	}

	public void setFotoinstructivo(byte[] fotoinstructivo) {
		this.fotoinstructivo = fotoinstructivo;
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
        if (!(object instanceof Piezainstrumentaldetalle)) {
            return false;
        }
        Piezainstrumentaldetalle other = (Piezainstrumentaldetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezainstrumentaldetalle[ detalleid=" + detalleid + " ]";
    }
    
}
