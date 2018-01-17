/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "PIEZAMUSEABLEID", nullable = false, precision = 0, scale = -127)
    private Long piezamuseableid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CODIGOMUSEO", nullable = false, length = 100)
    private String codigomuseo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "CONTENEDOR", nullable = false, length = 256)
    private String contenedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DIRECCION", nullable = false, length = 256)
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DIRECCIONELECTRONICA", nullable = false, length = 256)
    private String direccionelectronica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "NUMERO", nullable = false, length = 256)
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "TELEFONO", nullable = false, length = 256)
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DISPOSICIONCONTENEDOR", nullable = false, length = 256)
    private String disposicioncontenedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "RESPONSABLE", nullable = false, length = 256)
    private String responsable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "RESPONSABLECI", nullable = false, length = 15)
    private String responsableci;
    @Size(max = 256)
    @Column(name = "ELEMENTOSEXTRANOS", length = 256)
    private String elementosextranos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "OBSERVACIONES", nullable = false, length = 256)
    private String observaciones;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "FOTOGRAFIA", nullable = false)
    private Serializable fotografia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 350)
    @Column(name = "HISTORIAITINERANCIA", nullable = false, length = 350)
    private String historiaitinerancia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ENTIDADINVESTIGADORA", nullable = false, length = 256)
    private String entidadinvestigadora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "INVENTARIADOPOR", nullable = false, length = 256)
    private String inventariadopor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "REVISADOPOR", nullable = false, length = 256)
    private String revisadopor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "APROBADOPOR", nullable = false, length = 256)
    private String aprobadopor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAINVENTARIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainventario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAREVISION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharevision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAAPROBACION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaaprobacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "REGISTROFOTOGRAFICOPOR", nullable = false, length = 256)
    private String registrofotograficopor;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
   
    @JoinColumn(name = "PROCESOJURIDICOID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo procesojuridicoid;
    @JoinColumn(name = "ESTADOINTEGRIDAD", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo estadointegridad;
    @JoinColumn(name = "HUMEDAD", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo humedad;
    @JoinColumn(name = "CAMARAS", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo camaras;
    @JoinColumn(name = "ESTADOCONSERVACIONID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo estadoconservacionid;
    @JoinColumn(name = "CIUDADID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo ciudadid;
    @JoinColumn(name = "CANTONID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo cantonid;
    @JoinColumn(name = "PROVINCIAID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo provinciaid;
    @JoinColumn(name = "INTERVENCIONESINADECUADAS", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo intervencionesinadecuadas;
    @JoinColumn(name = "TEMPERATURA", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo temperatura;
    @JoinColumn(name = "GUARDIAS", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo guardias;
    @JoinColumn(name = "LUZ", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo luz;
    @JoinColumn(name = "SENSORES", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo sensores;
    @JoinColumn(name = "ALARMAS", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo alarmas;
    @JoinColumn(name = "SISTEMAELECTRICODEFECTUOSO", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo sistemaelectricodefectuoso;
    @JoinColumn(name = "EXTINTORES", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo extintores;
    @JoinColumn(name = "MONTAJE", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo montaje;
    
    @OneToMany(mappedBy = "piezamuseableid")
    private Set<Movimiento> movimientoSet;

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

   

    public Catalogo getProcesojuridicoid() {
        return procesojuridicoid;
    }

    public void setProcesojuridicoid(Catalogo procesojuridicoid) {
        this.procesojuridicoid = procesojuridicoid;
    }

    public Catalogo getEstadointegridad() {
        return estadointegridad;
    }

    public void setEstadointegridad(Catalogo estadointegridad) {
        this.estadointegridad = estadointegridad;
    }

    public Catalogo getHumedad() {
        return humedad;
    }

    public void setHumedad(Catalogo humedad) {
        this.humedad = humedad;
    }

    public Catalogo getCamaras() {
        return camaras;
    }

    public void setCamaras(Catalogo camaras) {
        this.camaras = camaras;
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

    public Catalogo getIntervencionesinadecuadas() {
        return intervencionesinadecuadas;
    }

    public void setIntervencionesinadecuadas(Catalogo intervencionesinadecuadas) {
        this.intervencionesinadecuadas = intervencionesinadecuadas;
    }

    public Catalogo getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Catalogo temperatura) {
        this.temperatura = temperatura;
    }

    public Catalogo getGuardias() {
        return guardias;
    }

    public void setGuardias(Catalogo guardias) {
        this.guardias = guardias;
    }

    public Catalogo getLuz() {
        return luz;
    }

    public void setLuz(Catalogo luz) {
        this.luz = luz;
    }

    public Catalogo getSensores() {
        return sensores;
    }

    public void setSensores(Catalogo sensores) {
        this.sensores = sensores;
    }

    public Catalogo getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(Catalogo alarmas) {
        this.alarmas = alarmas;
    }

    public Catalogo getSistemaelectricodefectuoso() {
        return sistemaelectricodefectuoso;
    }

    public void setSistemaelectricodefectuoso(Catalogo sistemaelectricodefectuoso) {
        this.sistemaelectricodefectuoso = sistemaelectricodefectuoso;
    }

    public Catalogo getExtintores() {
        return extintores;
    }

    public void setExtintores(Catalogo extintores) {
        this.extintores = extintores;
    }

    public Catalogo getMontaje() {
        return montaje;
    }

    public void setMontaje(Catalogo montaje) {
        this.montaje = montaje;
    }
   

    @XmlTransient
    public Set<Movimiento> getMovimientoSet() {
        return movimientoSet;
    }

    public void setMovimientoSet(Set<Movimiento> movimientoSet) {
        this.movimientoSet = movimientoSet;
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
