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
@Table(name = "ROL", catalog = "", schema = "MUCE")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROL_SEQ")
    @SequenceGenerator(sequenceName = "rol_seq", allocationSize = 1, name = "ROL_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol_id", nullable = false, precision = 0, scale = -127)
    private Long rolid;
    @Size(max = 256)
    @Column(name = "rol_nombre", length = 256)
    private String nombre;
    @Size(max = 256)
    @Column(name = "rol_descripcion", length = 256)
    private String descripcion;
    @JsonIgnore
    @ManyToMany(mappedBy = "rolSet")
    private Set<Permiso> permisoSet;
   

    public Rol() {
    }

    public Rol(Long rolid) {
        this.rolid = rolid;
    }

    public Long getRolid() {
        return rolid;
    }

    public void setRolid(Long rolid) {
        this.rolid = rolid;
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

    @XmlTransient
    public Set<Permiso> getPermisoSet() {
        return permisoSet;
    }

    public void setPermisoSet(Set<Permiso> permisoSet) {
        this.permisoSet = permisoSet;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolid != null ? rolid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolid == null && other.rolid != null) || (this.rolid != null && !this.rolid.equals(other.rolid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Rol[ rolid=" + rolid + " ]";
    }
    
}
