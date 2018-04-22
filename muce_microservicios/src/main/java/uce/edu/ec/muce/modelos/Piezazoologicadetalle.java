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
@Table(name = "PIEZAZOOLOGICADETALLE", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezazoologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAZOOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezazoologicadetalle_seq", allocationSize = 1, name = "PIEZAZOOLOGICADETALLE_SEQ")
    
    
    @Column(name = "DETALLEID", precision = 0, scale = -127)
    private Long detalleid;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "NOMBRECIENTIFICO", nullable = false, length = 600)
    private String nombrecientifico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "NOMBRECOMUN", nullable = false, length = 600)
    private String nombrecomun;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "AUTOR", nullable = false, length = 600)
    private String autor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ALTO", nullable = false, length = 10)
    private String alto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LARGO", nullable = false, length = 10)
    private String largo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ANCHO", nullable = false, length = 10)
    private String ancho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DIAMETRO", nullable = false, length = 10)
    private String diametro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PESO", nullable = false, length = 10)
    private String peso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "INSCRIPCIONES", nullable = false, length = 600)
    private String inscripciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "ELEMENTOSRELACIONADOS", nullable = false, length = 600)
    private String elementosrelacionados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "DESCRIPCION", nullable = false, length = 600)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "LATITUD", nullable = false, length = 600)
    private String latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "LONGITUD", nullable = false, length = 600)
    private String longitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "LOCALIZACIONPRECISA", nullable = false, length = 600)
    private String localizacionprecisa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "PERSONARECOLECTADORA", nullable = false, length = 600)
    private String personarecolectadora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 600)
    @Column(name = "CIUDADID", nullable = false, length = 600)
    private String ciudadid;
    @Size(max = 600)
    @Column(name = "USUARIOREGISTROID", length = 600)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    @JoinColumn(name = "PROVINCIAID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo provinciaid;
    @JoinColumn(name = "CANTONID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo cantonid;
    @JoinColumn(name = "SEXOID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo sexoid;
    @JoinColumn(name = "PAISID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo paisid;
    @JoinColumn(name = "TECNICACONSERVACIONID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo tecnicaconservacionid;
    
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Piezamuseable piezamuseableid;

    public Piezazoologicadetalle() {
    }

    public Piezazoologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezazoologicadetalle(Long detalleid, String nombrecientifico, String nombrecomun, String autor, String alto, String largo, String ancho, String diametro, String peso, String inscripciones, String elementosrelacionados, String descripcion, String latitud, String longitud, String localizacionprecisa, String personarecolectadora, String ciudadid) {
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
        this.personarecolectadora = personarecolectadora;
        this.ciudadid = ciudadid;
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

    public String getPersonarecolectadora() {
        return personarecolectadora;
    }

    public void setPersonarecolectadora(String personarecolectadora) {
        this.personarecolectadora = personarecolectadora;
    }

    public String getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(String ciudadid) {
        this.ciudadid = ciudadid;
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

    public Catalogo getProvinciaid() {
        return provinciaid;
    }

    public void setProvinciaid(Catalogo provinciaid) {
        this.provinciaid = provinciaid;
    }

    public Catalogo getCantonid() {
        return cantonid;
    }

    public void setCantonid(Catalogo cantonid) {
        this.cantonid = cantonid;
    }

    public Catalogo getSexoid() {
        return sexoid;
    }

    public void setSexoid(Catalogo sexoid) {
        this.sexoid = sexoid;
    }

    public Catalogo getPaisid() {
        return paisid;
    }

    public void setPaisid(Catalogo paisid) {
        this.paisid = paisid;
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
