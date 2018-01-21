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
@Table(name = "CATALOGO", catalog = "", schema = "MUCE")
public class Catalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATALOGO_SEQ")
    @SequenceGenerator(sequenceName = "catalogo_seq", allocationSize = 1, name = "CATALOGO_SEQ")
    @Basic(optional = false)
    @Column(name = "CATALOGOID", nullable = false, precision = 0, scale = -127)
    private Long catalogoid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NOMBRE", nullable = false, length = 150)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DESCRIPCION", nullable = false, length = 256)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACTIVO", nullable = false)
    private Boolean activo;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;    
    @JoinColumn(name = "CATALOGOPADREID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo catalogopadreid;
   
    public Catalogo() {
    }

    public Catalogo(Long catalogoid) {
        this.catalogoid = catalogoid;
    }

    public Catalogo(Long catalogoid, String nombre, String descripcion, Boolean activo) {
        this.catalogoid = catalogoid;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Long getCatalogoid() {
        return catalogoid;
    }

    public void setCatalogoid(Long catalogoid) {
        this.catalogoid = catalogoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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

    public Catalogo getCatalogopadreid() {
        return catalogopadreid;
    }

    public void setCatalogopadreid(Catalogo catalogopadreid) {
        this.catalogopadreid = catalogopadreid;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catalogoid != null ? catalogoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogo)) {
            return false;
        }
        Catalogo other = (Catalogo) object;
        if ((this.catalogoid == null && other.catalogoid != null) || (this.catalogoid != null && !this.catalogoid.equals(other.catalogoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Catalogo[ catalogoid=" + catalogoid + " ]";
    }
    
}
