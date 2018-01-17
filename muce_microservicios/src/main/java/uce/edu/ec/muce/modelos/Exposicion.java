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
import javax.persistence.Lob;
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
@Table(name = "EXPOSICION", catalog = "", schema = "MUCE")
public class Exposicion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXPOSICION_SEQ")
    @SequenceGenerator(sequenceName = "exposicion_seq", allocationSize = 1, name = "EXPOSICION_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXPOSICIONID", nullable = false, precision = 0, scale = -127)
    private Long exposicionid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "NOMBRE", nullable = false, length = 256)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAINICIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAFIN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "LUGAR", nullable = false, length = 256)
    private String lugar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DESCRIPCION", nullable = false, length = 256)
    private String descripcion;
    @Lob
    @Column(name = "IMAGEN")
    private Serializable imagen;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
    private String usuarioregistroid;
    @Size(max = 256)
    @Column(name = "FECHAREGISTRO", length = 256)
    private String fecharegistro;
    

    public Exposicion() {
    }

    public Exposicion(Long exposicionid) {
        this.exposicionid = exposicionid;
    }

    public Exposicion(Long exposicionid, String nombre, Date fechainicio, Date fechafin, String lugar, String descripcion) {
        this.exposicionid = exposicionid;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    public Long getExposicionid() {
        return exposicionid;
    }

    public void setExposicionid(Long exposicionid) {
        this.exposicionid = exposicionid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Serializable getImagen() {
        return imagen;
    }

    public void setImagen(Serializable imagen) {
        this.imagen = imagen;
    }

    public String getUsuarioregistroid() {
        return usuarioregistroid;
    }

    public void setUsuarioregistroid(String usuarioregistroid) {
        this.usuarioregistroid = usuarioregistroid;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exposicionid != null ? exposicionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exposicion)) {
            return false;
        }
        Exposicion other = (Exposicion) object;
        if ((this.exposicionid == null && other.exposicionid != null) || (this.exposicionid != null && !this.exposicionid.equals(other.exposicionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Exposicion[ exposicionid=" + exposicionid + " ]";
    }
    
}
