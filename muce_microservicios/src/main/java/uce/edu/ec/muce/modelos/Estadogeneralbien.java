/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "ESTADOGENERALBIEN", catalog = "", schema = "MUCE")
public class Estadogeneralbien implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESTADOGENERALBIEN_SEQ")
    @SequenceGenerator(sequenceName = "Estadogeneralbien_seq", allocationSize = 1, name = "ESTADOGENERALBIEN_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADOGENERALID", nullable = false, precision = 0, scale = -127)
    private Long estadogeneralid;
    @JoinColumn(name = "CATALOGOID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo catalogoid;
    

    public Estadogeneralbien() {
    }

    public Estadogeneralbien(Long estadogeneralid) {
        this.estadogeneralid = estadogeneralid;
    }

    public Long getEstadogeneralid() {
        return estadogeneralid;
    }

    public void setEstadogeneralid(Long estadogeneralid) {
        this.estadogeneralid = estadogeneralid;
    }

    public Catalogo getCatalogoid() {
        return catalogoid;
    }

    public void setCatalogoid(Catalogo catalogoid) {
        this.catalogoid = catalogoid;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadogeneralid != null ? estadogeneralid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadogeneralbien)) {
            return false;
        }
        Estadogeneralbien other = (Estadogeneralbien) object;
        if ((this.estadogeneralid == null && other.estadogeneralid != null) || (this.estadogeneralid != null && !this.estadogeneralid.equals(other.estadogeneralid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Estadogeneralbien[ estadogeneralid=" + estadogeneralid + " ]";
    }
    
}
