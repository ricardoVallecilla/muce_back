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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PIEZAMUSEABLE", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
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
    
    
    @Size(min = 1, max = 600)
    @Column(name = "CONTENEDOR", length = 600)
    private String contenedor;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "DIRECCION", length = 600)
    private String direccion;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "DIRECCIONELECTRONICA", length = 600)
    private String direccionelectronica;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "NUMERO", length = 600)
    private String numero;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "TELEFONO", length = 600)
    private String telefono;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "DISPOSICIONCONTENEDOR", length = 600)
    private String disposicioncontenedor;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "RESPONSABLE", length = 600)
    private String responsable;
    
    
    @Size(min = 1, max = 15)
    @Column(name = "RESPONSABLECI", length = 15)
    private String responsableci;
    @Size(max = 600)
    @Column(name = "ELEMENTOSEXTRANOS", length = 600)
    private String elementosextranos;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "OBSERVACIONES", length = 600)
    private String observaciones;
    
    
    @Lob
    @JsonIgnore
    @Column(name = "FOTOGRAFIA")
    private byte[] fotografia;
    
    
    @Size(min = 1, max = 350)
    @Column(name = "HISTORIAITINERANCIA", length = 350)
    private String historiaitinerancia;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ENTIDADINVESTIGADORA", length = 600)
    private String entidadinvestigadora;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "INVENTARIADOPOR", length = 600)
    private String inventariadopor;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "REVISADOPOR", length = 600)
    private String revisadopor;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "APROBADOPOR", length = 600)
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
    
    
    @Size(min = 1, max = 600)
    @Column(name = "REGISTROFOTOGRAFICOPOR", length = 600)
    private String registrofotograficopor;
    @Size(max = 600)
    @Column(name = "USUARIOREGISTROID", length = 600)
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
    
    @JoinColumn(name = "PROVINCIABIENESID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = true)
    private Catalogo provinciabienesid;
    
    
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
    @Column(length = 3000)
    private String usocuando;
    @Column(length = 3000)
    private String usodonde;
    @Column(length = 3000)
    private String usocomo;
    @Column(length = 3000)
    private String usofinalidad;
    @Column(length = 3000)
    private String usoquien;
    @Column(length = 3000)
    private String usomanejo;
    @Column(length = 3000)
    private String materias;
    @Column(length = 3000)
    private String laboratorios;
    @Column(length = 3000)
    private String docentes;
    @Column(length = 3000)
    private String aporte;
    @Column(length = 3000)
    private String observacionesacademico;
    @Column(length = 3000)
    private String bibliografias;
    @Column(length = 3000)
    private String links;
    @Column(length = 600)
    private String fotografo;
    @Column(length = 600)
    private String fotografialugar;
    
    @Column(length = 200)
    private String oferente;
    @Column(length = 200)
    private String precioadquicicion;
    @Column(length = 200)
    private String tasacion;
    @Column(length = 200)
    private String seguro;
    
    @Lob
    @JsonIgnore
    @Column(name = "FOTOGRAFIADOS")
    private byte[] fotografiados;
    
    @Lob
    @JsonIgnore
    @Column(name = "FOTOGRAFIATRES")
    private byte[] fotografiatres;
    
    @Lob
    @JsonIgnore
    @Column(name = "FOTOGRAFIACUATRO")
    private byte[] fotografiacuatro;

    public Piezamuseable() {
    }

    public Piezamuseable(Long piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }

    public Piezamuseable(Long piezamuseableid, String codigomuseo, String contenedor, String direccion, String direccionelectronica, String numero, String telefono, String disposicioncontenedor, String responsable, String responsableci, String observaciones, String historiaitinerancia, String entidadinvestigadora, String inventariadopor, String revisadopor, String aprobadopor, Date fechainventario, Date fecharevision, Date fechaaprobacion, String registrofotograficopor) {
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
    


    public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
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

    public String getUsocuando() {
		return usocuando;
	}

	public void setUsocuando(String usocuando) {
		this.usocuando = usocuando;
	}

	public String getUsodonde() {
		return usodonde;
	}

	public void setUsodonde(String usodonde) {
		this.usodonde = usodonde;
	}

	public String getUsocomo() {
		return usocomo;
	}

	public void setUsocomo(String usocomo) {
		this.usocomo = usocomo;
	}

	public String getUsofinalidad() {
		return usofinalidad;
	}

	public void setUsofinalidad(String usofinalidad) {
		this.usofinalidad = usofinalidad;
	}

	public String getUsoquien() {
		return usoquien;
	}

	public void setUsoquien(String usoquien) {
		this.usoquien = usoquien;
	}

	public String getUsomanejo() {
		return usomanejo;
	}

	public void setUsomanejo(String usomanejo) {
		this.usomanejo = usomanejo;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	public String getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(String laboratorios) {
		this.laboratorios = laboratorios;
	}

	public String getDocentes() {
		return docentes;
	}

	public void setDocentes(String docentes) {
		this.docentes = docentes;
	}

	public String getAporte() {
		return aporte;
	}

	public void setAporte(String aporte) {
		this.aporte = aporte;
	}

	public String getObservacionesacademico() {
		return observacionesacademico;
	}

	public void setObservacionesacademico(String observacionesacademico) {
		this.observacionesacademico = observacionesacademico;
	}

	public String getBibliografias() {
		return bibliografias;
	}

	public void setBibliografias(String bibliografias) {
		this.bibliografias = bibliografias;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public Item getItemid() {
		return itemid;
	}

	public void setItemid(Item itemid) {
		this.itemid = itemid;
	}
	
	

	public String getFotografo() {
		return fotografo;
	}

	public void setFotografo(String fotografo) {
		this.fotografo = fotografo;
	}

	public String getFotografialugar() {
		return fotografialugar;
	}

	public void setFotografialugar(String fotografialugar) {
		this.fotografialugar = fotografialugar;
	}
	
	

	public byte[] getFotografiados() {
		return fotografiados;
	}

	public void setFotografiados(byte[] fotografiados) {
		this.fotografiados = fotografiados;
	}

	public byte[] getFotografiatres() {
		return fotografiatres;
	}

	public void setFotografiatres(byte[] fotografiatres) {
		this.fotografiatres = fotografiatres;
	}

	public byte[] getFotografiacuatro() {
		return fotografiacuatro;
	}

	public void setFotografiacuatro(byte[] fotografiacuatro) {
		this.fotografiacuatro = fotografiacuatro;
	}

	
	public Catalogo getProvinciabienesid() {
		return provinciabienesid;
	}

	public void setProvinciabienesid(Catalogo provinciabienesid) {
		this.provinciabienesid = provinciabienesid;
	}
	
	

	public String getOferente() {
		return oferente;
	}

	public void setOferente(String oferente) {
		this.oferente = oferente;
	}

	public String getPrecioadquicicion() {
		return precioadquicicion;
	}

	public void setPrecioadquicicion(String precioadquicicion) {
		this.precioadquicicion = precioadquicicion;
	}

	public String getTasacion() {
		return tasacion;
	}

	public void setTasacion(String tasacion) {
		this.tasacion = tasacion;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
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
