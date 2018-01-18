/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.seguridad;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PERMISO", catalog = "", schema = "MUCE")
public class Permiso implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERMISO_SEQ")
    @SequenceGenerator(sequenceName = "permiso_seq", allocationSize = 1, name = "PERMISO_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERMISOID", nullable = false, precision = 0, scale = -127)
    private Long permisoid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "NOMBRE", nullable = false, length = 256)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DETALLE", nullable = false, length = 256)
    private String detalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "URL", nullable = false, length = 256)
    private String url;
    @JoinTable(name = "ROL_PERMISOS", joinColumns = {
        @JoinColumn(name = "PERMISOID", referencedColumnName = "PERMISOID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "ROLID", referencedColumnName = "ROLID", nullable = false)})
    @ManyToMany
    @JsonIgnore
    private Set<Rol> rolSet;

    public Permiso() {
    }

    public Permiso(Long permisoid) {
        this.permisoid = permisoid;
    }

    public Permiso(Long permisoid, String nombre, String detalle, String url) {
        this.permisoid = permisoid;
        this.nombre = nombre;
        this.detalle = detalle;
        this.url = url;
    }

    public Long getPermisoid() {
        return permisoid;
    }

    public void setPermisoid(Long permisoid) {
        this.permisoid = permisoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public Set<Rol> getRolSet() {
        return rolSet;
    }

    public void setRolSet(Set<Rol> rolSet) {
        this.rolSet = rolSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permisoid != null ? permisoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.permisoid == null && other.permisoid != null) || (this.permisoid != null && !this.permisoid.equals(other.permisoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Permiso[ permisoid=" + permisoid + " ]";
    }
    
}
