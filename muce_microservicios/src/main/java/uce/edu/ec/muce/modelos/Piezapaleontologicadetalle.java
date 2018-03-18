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
@Table(name = "PIEZAPALEONTOLOGICADETALLE", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezapaleontologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAPALEONTOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezapaleontologicadetalle_seq", allocationSize = 1, name = "PIEZAPALEONTOLOGICADETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETALLEID", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    @Size(max = 600)
    @Column(name = "NOMBRECIENTIFICO", length = 600)
    private String nombrecientifico;
    @Size(max = 600)
    @Column(name = "NOMBRECOMUN", length = 600)
    private String nombrecomun;
    @Size(max = 600)
    @Column(name = "REINO", length = 600)
    private String reino;
    @Size(max = 600)
    @Column(name = "FILO", length = 600)
    private String filo;
    @Size(max = 600)
    @Column(name = "CLASE", length = 600)
    private String clase;
    @Size(max = 600)
    @Column(name = "ORDEN", length = 600)
    private String orden;
    @Size(max = 600)
    @Column(name = "FAMILIA", length = 600)
    private String familia;
    @Size(max = 600)
    @Column(name = "ERA", length = 600)
    private String era;
    @Size(max = 600)
    @Column(name = "SISTEMA", length = 600)
    private String sistema;
    @Size(max = 600)
    @Column(name = "SERIE", length = 600)
    private String serie;
    @Size(max = 600)
    @Column(name = "PISO", length = 600)
    private String piso;
    @Size(max = 600)
    @Column(name = "MIEMBRO", length = 600)
    private String miembro;
    @Size(max = 600)
    @Column(name = "FORMACION", length = 600)
    private String formacion;
    @Size(max = 600)
    @Column(name = "GRUPO", length = 600)
    private String grupo;
    @Size(max = 600)
    @Column(name = "ALTO", length = 600)
    private String alto;
    @Size(max = 600)
    @Column(name = "LARGO", length = 600)
    private String largo;
    @Size(max = 600)
    @Column(name = "ANCHO", length = 600)
    private String ancho;
    @Size(max = 600)
    @Column(name = "PESO", length = 600)
    private String peso;
    @Size(max = 600)
    @Column(name = "INSCRIPCIONES", length = 600)
    private String inscripciones;
    @Size(max = 600)
    @Column(name = "ELEMENTOSRELACIONADOS", length = 600)
    private String elementosrelacionados;
    @Size(max = 600)
    @Column(name = "MORFOLOGIA", length = 600)
    private String morfologia;
    @Size(max = 600)
    @Column(name = "RECOLECTORES", length = 600)
    private String recolectores;
    @Size(max = 600)
    @Column(name = "FECHARECOLECCION", length = 600)
    private String fecharecoleccion;
    @Size(max = 600)
    @Column(name = "DIAMETRO", length = 600)
    private String diametro;
    @Size(max = 600)
    @Column(name = "LATITUD", length = 600)
    private String latitud;
    @Size(max = 600)
    @Column(name = "LONGITUD", length = 600)
    private String longitud;
    @Size(max = 600)
    @Column(name = "LOCALIZACIONPRECISA", length = 600)
    private String localizacionprecisa;
    @Size(max = 600)
    @Column(name = "PERSONARECOLECTADORA", length = 600)
    private String personarecolectadora;
    @Size(max = 600)
    @Column(name = "CIUDADID", length = 600)
    private String ciudadid;
    @Size(max = 600)
    @Column(name = "USUARIOREGISTROID", length = 600)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    @JoinColumn(name = "CANTONID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo cantonid;
    @JoinColumn(name = "PAISID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo paisid;
    @JoinColumn(name = "PROVINCIAID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo provinciaid;
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID")
    @ManyToOne
    private Piezamuseable piezamuseableid;

    public Piezapaleontologicadetalle() {
    }

    public Piezapaleontologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
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

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getMiembro() {
        return miembro;
    }

    public void setMiembro(String miembro) {
        this.miembro = miembro;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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

    public String getMorfologia() {
        return morfologia;
    }

    public void setMorfologia(String morfologia) {
        this.morfologia = morfologia;
    }

    public String getRecolectores() {
        return recolectores;
    }

    public void setRecolectores(String recolectores) {
        this.recolectores = recolectores;
    }

    public String getFecharecoleccion() {
        return fecharecoleccion;
    }

    public void setFecharecoleccion(String fecharecoleccion) {
        this.fecharecoleccion = fecharecoleccion;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
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

    public Catalogo getCantonid() {
        return cantonid;
    }

    public void setCantonid(Catalogo cantonid) {
        this.cantonid = cantonid;
    }

    public Catalogo getPaisid() {
        return paisid;
    }

    public void setPaisid(Catalogo paisid) {
        this.paisid = paisid;
    }

    public Catalogo getProvinciaid() {
        return provinciaid;
    }

    public void setProvinciaid(Catalogo provinciaid) {
        this.provinciaid = provinciaid;
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
        if (!(object instanceof Piezapaleontologicadetalle)) {
            return false;
        }
        Piezapaleontologicadetalle other = (Piezapaleontologicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezapeleontologicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
