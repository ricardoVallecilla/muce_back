/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PIEZAMUSEABLE", catalog = "", schema = "MUCE")
public class Piezamuseable implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAMUSEABLE_SEQ")
    @SequenceGenerator(sequenceName = "museo_seq", allocationSize = 1, name = "PIEZAMUSEABLE_SEQ")
    
    
    @Column(name = "PIEZAMUSEABLEID", precision = 0, scale = -127)
    private Long piezamuseableid;
    
    
    @Size(min = 1, max = 100)
    @Column(name = "CODIGOMUSEO", length = 100)
    private String codigomuseo;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "CONTENEDOR", length = 256)
    private String contenedor;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "DIRECCION", length = 256)
    private String direccion;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "DIRECCIONELECTRONICA", length = 256)
    private String direccionelectronica;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "NUMERO", length = 256)
    private String numero;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "TELEFONO", length = 256)
    private String telefono;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "DISPOSICIONCONTENEDOR", length = 256)
    private String disposicioncontenedor;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "RESPONSABLE", length = 256)
    private String responsable;
    
    
    @Size(min = 1, max = 15)
    @Column(name = "RESPONSABLECI", length = 15)
    private String responsableci;
    @Size(max = 256)
    @Column(name = "ELEMENTOSEXTRANOS", length = 256)
    private String elementosextranos;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "OBSERVACIONES", length = 256)
    private String observaciones;
    
    
    @Lob
    @Column(name = "FOTOGRAFIA")
    private Serializable fotografia;
    
    
    @Size(min = 1, max = 350)
    @Column(name = "HISTORIAITINERANCIA", length = 350)
    private String historiaitinerancia;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "ENTIDADINVESTIGADORA", length = 256)
    private String entidadinvestigadora;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "INVENTARIADOPOR", length = 256)
    private String inventariadopor;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "REVISADOPOR", length = 256)
    private String revisadopor;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "APROBADOPOR", length = 256)
    private String aprobadopor;
    
    
    @Column(name = "FECHAINVENTARIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainventario;
    
    
    @Column(name = "FECHAREVISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharevision;
    
    
    @Column(name = "FECHAAPROBACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaaprobacion;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "REGISTROFOTOGRAFICOPOR", length = 256)
    private String registrofotograficopor;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
   
    
    @Column(name = "PROCESOJURIDICO")    
    private Boolean procesojuridico;
    
    @JoinColumn(name = "ESTADOINTEGRIDAD", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = false)
    private Catalogo estadointegridad;
    
    
    
    @Column(name = "HUMEDAD")    
    private Boolean humedad;
    
  
    
    @Column(name = "CAMARAS")    
    private Boolean camaras;
    
    @JoinColumn(name = "ESTADOCONSERVACIONID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = false)
    private Catalogo estadoconservacionid;
    @JoinColumn(name = "CIUDADID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = false)
    private Catalogo ciudadid;
    @JoinColumn(name = "CANTONID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = false)
    private Catalogo cantonid;
    @JoinColumn(name = "PROVINCIAID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = false)
    private Catalogo provinciaid;
    
    @JoinColumn(name = "ITEMID", referencedColumnName = "ITEMID")
    @OneToOne
    private Item itemid;
    
    
    @Column(name = "INTERVENCIONESINADECUADAS")    
    private Boolean intervencionesinadecuadas;
    
    
    
    @Column(name = "TEMPERATURA")    
    private Boolean temperatura;
    
    
    
    @Column(name = "GUARDIAS")    
    private Boolean guardias;

    
    @Column(name = "LUZ")    
    private Boolean luz;
    
   
    
    @Column(name = "SENSORES")    
    private Boolean sensores;
    
   
    
    @Column(name = "ALARMAS")    
    private Boolean alarmas;
    
      
    @Column(name = "SISTEMAELECTRICODEFECTUOSO")    
    private Boolean sistemaelectricodefectuoso;

    @Column(name = "EXTINTORES")    
    private Boolean extintores;
    

    @Column(name = "MONTAJE")    
    private Boolean montaje;
    
  

    public Piezamuseable() {
    }

    public Piezamuseable(Long piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }

    public Piezamuseable(Long piezamuseableid, String codigomuseo, String contenedor, String direccion, String direccionelectronica, String numero, String telefono, String disposicioncontenedor, String responsable, String responsableci, String observaciones, Serializable fotografia, String historiaitinerancia, String entidadinvestigadora, String inventariadopor, String revisadopor, String aprobadopor, Date fechainventario, Date fecharevision, Date fechaaprobacion, String registrofotograficopor) {
        this.piezamuseableid = piezamuseableid;
        this.codigomuseo = codigomuseo;
        this.contenedor = contenedor;
        this.direccion = direccion;
        this.direccionelectronica = direccionelectronica;
        this.numero = numero;
        this.telefono = telefono;
        this.disposicioncontenedor = disposicioncontenedor;
        this.responsable = responsable;
        this.responsableci = responsableci;
        this.observaciones = observaciones;
        this.fotografia = fotografia;
        this.historiaitinerancia = historiaitinerancia;
        this.entidadinvestigadora = entidadinvestigadora;
        this.inventariadopor = inventariadopor;
        this.revisadopor = revisadopor;
        this.aprobadopor = aprobadopor;
        this.fechainventario = fechainventario;
        this.fecharevision = fecharevision;
        this.fechaaprobacion = fechaaprobacion;
        this.registrofotograficopor = registrofotograficopor;
    }

    public Long getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Long piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }

    public String getCodigomuseo() {
        return codigomuseo;
    }

    public void setCodigomuseo(String codigomuseo) {
        this.codigomuseo = codigomuseo;
    }

    public String getContenedor() {
        return contenedor;
    }

    public void setContenedor(String contenedor) {
        this.contenedor = contenedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionelectronica() {
        return direccionelectronica;
    }

    public void setDireccionelectronica(String direccionelectronica) {
        this.direccionelectronica = direccionelectronica;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDisposicioncontenedor() {
        return disposicioncontenedor;
    }

    public void setDisposicioncontenedor(String disposicioncontenedor) {
        this.disposicioncontenedor = disposicioncontenedor;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getResponsableci() {
        return responsableci;
    }

    public void setResponsableci(String responsableci) {
        this.responsableci = responsableci;
    }

    public String getElementosextranos() {
        return elementosextranos;
    }

    public void setElementosextranos(String elementosextranos) {
        this.elementosextranos = elementosextranos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Serializable getFotografia() {
        return fotografia;
    }

    public void setFotografia(Serializable fotografia) {
        this.fotografia = fotografia;
    }

    public String getHistoriaitinerancia() {
        return historiaitinerancia;
    }

    public void setHistoriaitinerancia(String historiaitinerancia) {
        this.historiaitinerancia = historiaitinerancia;
    }

    public String getEntidadinvestigadora() {
        return entidadinvestigadora;
    }

    public void setEntidadinvestigadora(String entidadinvestigadora) {
        this.entidadinvestigadora = entidadinvestigadora;
    }

    public String getInventariadopor() {
        return inventariadopor;
    }

    public void setInventariadopor(String inventariadopor) {
        this.inventariadopor = inventariadopor;
    }

    public String getRevisadopor() {
        return revisadopor;
    }

    public void setRevisadopor(String revisadopor) {
        this.revisadopor = revisadopor;
    }

    public String getAprobadopor() {
        return aprobadopor;
    }

    public void setAprobadopor(String aprobadopor) {
        this.aprobadopor = aprobadopor;
    }

    public Date getFechainventario() {
        return fechainventario;
    }

    public void setFechainventario(Date fechainventario) {
        this.fechainventario = fechainventario;
    }

    public Date getFecharevision() {
        return fecharevision;
    }

    public void setFecharevision(Date fecharevision) {
        this.fecharevision = fecharevision;
    }

    public Date getFechaaprobacion() {
        return fechaaprobacion;
    }

    public void setFechaaprobacion(Date fechaaprobacion) {
        this.fechaaprobacion = fechaaprobacion;
    }

    public String getRegistrofotograficopor() {
        return registrofotograficopor;
    }

    public void setRegistrofotograficopor(String registrofotograficopor) {
        this.registrofotograficopor = registrofotograficopor;
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

   

    

    public Boolean getProcesojuridico() {
		return procesojuridico;
	}

	public void setProcesojuridico(Boolean procesojuridico) {
		this.procesojuridico = procesojuridico;
	}

	public Catalogo getEstadointegridad() {
		return estadointegridad;
	}

	public void setEstadointegridad(Catalogo estadointegridad) {
		this.estadointegridad = estadointegridad;
	}

	public Boolean getHumedad() {
		return humedad;
	}

	public void setHumedad(Boolean humedad) {
		this.humedad = humedad;
	}

	public Boolean getCamaras() {
		return camaras;
	}

	public void setCamaras(Boolean camaras) {
		this.camaras = camaras;
	}

	public Boolean getIntervencionesinadecuadas() {
		return intervencionesinadecuadas;
	}

	public void setIntervencionesinadecuadas(Boolean intervencionesinadecuadas) {
		this.intervencionesinadecuadas = intervencionesinadecuadas;
	}

	public Boolean getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Boolean temperatura) {
		this.temperatura = temperatura;
	}

	public Boolean getGuardias() {
		return guardias;
	}

	public void setGuardias(Boolean guardias) {
		this.guardias = guardias;
	}

	public Boolean getLuz() {
		return luz;
	}

	public void setLuz(Boolean luz) {
		this.luz = luz;
	}

	public Boolean getSensores() {
		return sensores;
	}

	public void setSensores(Boolean sensores) {
		this.sensores = sensores;
	}

	public Boolean getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(Boolean alarmas) {
		this.alarmas = alarmas;
	}

	public Boolean getSistemaelectricodefectuoso() {
		return sistemaelectricodefectuoso;
	}

	public void setSistemaelectricodefectuoso(Boolean sistemaelectricodefectuoso) {
		this.sistemaelectricodefectuoso = sistemaelectricodefectuoso;
	}

	public Boolean getExtintores() {
		return extintores;
	}

	public void setExtintores(Boolean extintores) {
		this.extintores = extintores;
	}

	public Boolean getMontaje() {
		return montaje;
	}

	public void setMontaje(Boolean montaje) {
		this.montaje = montaje;
	}

	public Catalogo getEstadoconservacionid() {
        return estadoconservacionid;
    }

    public void setEstadoconservacionid(Catalogo estadoconservacionid) {
        this.estadoconservacionid = estadoconservacionid;
    }

    public Catalogo getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(Catalogo ciudadid) {
        this.ciudadid = ciudadid;
    }

    public Catalogo getCantonid() {
        return cantonid;
    }

    public void setCantonid(Catalogo cantonid) {
        this.cantonid = cantonid;
    }

    public Catalogo getProvinciaid() {
        return provinciaid;
    }

    public void setProvinciaid(Catalogo provinciaid) {
        this.provinciaid = provinciaid;
    }

  
   

   

    public Item getItemid() {
		return itemid;
	}

	public void setItemid(Item itemid) {
		this.itemid = itemid;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (piezamuseableid != null ? piezamuseableid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piezamuseable)) {
            return false;
        }
        Piezamuseable other = (Piezamuseable) object;
        if ((this.piezamuseableid == null && other.piezamuseableid != null) || (this.piezamuseableid != null && !this.piezamuseableid.equals(other.piezamuseableid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezamuseable[ piezamuseableid=" + piezamuseableid + " ]";
    }
    
}
