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

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PIEZABOTANICADETALLE", catalog = "", schema = "MUCE")
public class Piezabotanicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZABOTANICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezabotanicadetalle_seq", allocationSize = 1, name = "PIEZABOTANICADETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETALLEID", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ESPECIE", nullable = false, length = 256)
    private String especie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "NOMBRECOMUN", nullable = false, length = 256)
    private String nombrecomun;
    @Size(max = 256)
    @Column(name = "AUTOR", length = 256)
    private String autor;
    @Size(max = 256)
    @Column(name = "PUBLICADO", length = 256)
    private String publicado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "CLASE", nullable = false, length = 256)
    private String clase;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "SUBCLASE", nullable = false, length = 256)
    private String subclase;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ORDEN", nullable = false, length = 256)
    private String orden;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "FAMILIA", nullable = false, length = 256)
    private String familia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "GENERO", nullable = false, length = 256)
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DESCRIPCION", nullable = false, length = 256)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LATITUD", nullable = false, length = 10)
    private String latitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LONGITUD", nullable = false, length = 10)
    private String longitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "LOCALIZACIONPRECISA", nullable = false, length = 256)
    private String localizacionprecisa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ELEVACION", nullable = false, length = 256)
    private String elevacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "CIUDADID", nullable = false, length = 256)
    private String ciudadid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "PERSONARECOLECTORA", nullable = false, length = 256)
    private String personarecolectora;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
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
    @JoinColumn(name = "ORIGENID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo origenid;
    @JoinColumn(name = "PAISID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo paisid;
    @JoinColumn(name = "TECNICACONSERVACIONID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo tecnicaconservacionid;
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID", nullable = false)
    @ManyToOne(optional = false)
    private Piezamuseable piezamuseableid;

    public Piezabotanicadetalle() {
    }

    public Piezabotanicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezabotanicadetalle(Long detalleid, String especie, String nombrecomun, String clase, String subclase, String orden, String familia, String genero, String descripcion, String latitud, String longitud, String localizacionprecisa, String elevacion, String ciudadid, String personarecolectora) {
        this.detalleid = detalleid;
        this.especie = especie;
        this.nombrecomun = nombrecomun;
        this.clase = clase;
        this.subclase = subclase;
        this.orden = orden;
        this.familia = familia;
        this.genero = genero;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.localizacionprecisa = localizacionprecisa;
        this.elevacion = elevacion;
        this.ciudadid = ciudadid;
        this.personarecolectora = personarecolectora;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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

    public String getPublicado() {
        return publicado;
    }

    public void setPublicado(String publicado) {
        this.publicado = publicado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSubclase() {
        return subclase;
    }

    public void setSubclase(String subclase) {
        this.subclase = subclase;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getElevacion() {
        return elevacion;
    }

    public void setElevacion(String elevacion) {
        this.elevacion = elevacion;
    }

    public String getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(String ciudadid) {
        this.ciudadid = ciudadid;
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

    public Catalogo getOrigenid() {
        return origenid;
    }

    public void setOrigenid(Catalogo origenid) {
        this.origenid = origenid;
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
        if (!(object instanceof Piezabotanicadetalle)) {
            return false;
        }
        Piezabotanicadetalle other = (Piezabotanicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezabotanicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
