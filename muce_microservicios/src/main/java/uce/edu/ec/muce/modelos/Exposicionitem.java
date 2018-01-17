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
@Table(name = "EXPOSICIONITEM", catalog = "", schema = "MUCE")

public class Exposicionitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXPOSICIONITEM_SEQ")
    @SequenceGenerator(sequenceName = "exposicionItem_seq", allocationSize = 1, name = "EXPOSICIONITEM_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXPOSICIONITEMID", nullable = false)
    private Long exposicionitemid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEMID", nullable = false)
    private Long itemid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXPOSICIONID", nullable = false)
    private Long exposicionid;
    @Size(max = 50)
    @Column(name = "NUMEROSEGURO", length = 50)
    private String numeroseguro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEGURO", nullable = false)
    private Long seguro;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    @JoinColumn(name = "EXPOSICIONID", referencedColumnName = "EXPOSICIONID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Exposicion exposicion;
    @JoinColumn(name = "ITEMID", referencedColumnName = "ITEMID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Item item;

    public Exposicionitem() {
    }

    

    public Long getExposicionitemid() {
		return exposicionitemid;
	}



	public void setExposicionitemid(Long exposicionitemid) {
		this.exposicionitemid = exposicionitemid;
	}



	public Long getItemid() {
		return itemid;
	}



	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}



	public Long getExposicionid() {
		return exposicionid;
	}



	public void setExposicionid(Long exposicionid) {
		this.exposicionid = exposicionid;
	}



	public String getNumeroseguro() {
        return numeroseguro;
    }

    public void setNumeroseguro(String numeroseguro) {
        this.numeroseguro = numeroseguro;
    }

    public Long getSeguro() {
        return seguro;
    }

    public void setSeguro(Long seguro) {
        this.seguro = seguro;
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

    public Exposicion getExposicion() {
        return exposicion;
    }

    public void setExposicion(Exposicion exposicion) {
        this.exposicion = exposicion;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exposicion == null) ? 0 : exposicion.hashCode());
		result = prime * result + ((exposicionid == null) ? 0 : exposicionid.hashCode());
		result = prime * result + ((exposicionitemid == null) ? 0 : exposicionitemid.hashCode());
		result = prime * result + ((fecharegistro == null) ? 0 : fecharegistro.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
		result = prime * result + ((numeroseguro == null) ? 0 : numeroseguro.hashCode());
		result = prime * result + ((seguro == null) ? 0 : seguro.hashCode());
		result = prime * result + ((usuarioregistroid == null) ? 0 : usuarioregistroid.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposicionitem other = (Exposicionitem) obj;
		if (exposicion == null) {
			if (other.exposicion != null)
				return false;
		} else if (!exposicion.equals(other.exposicion))
			return false;
		if (exposicionid == null) {
			if (other.exposicionid != null)
				return false;
		} else if (!exposicionid.equals(other.exposicionid))
			return false;
		if (exposicionitemid == null) {
			if (other.exposicionitemid != null)
				return false;
		} else if (!exposicionitemid.equals(other.exposicionitemid))
			return false;
		if (fecharegistro == null) {
			if (other.fecharegistro != null)
				return false;
		} else if (!fecharegistro.equals(other.fecharegistro))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (itemid == null) {
			if (other.itemid != null)
				return false;
		} else if (!itemid.equals(other.itemid))
			return false;
		if (numeroseguro == null) {
			if (other.numeroseguro != null)
				return false;
		} else if (!numeroseguro.equals(other.numeroseguro))
			return false;
		if (seguro == null) {
			if (other.seguro != null)
				return false;
		} else if (!seguro.equals(other.seguro))
			return false;
		if (usuarioregistroid == null) {
			if (other.usuarioregistroid != null)
				return false;
		} else if (!usuarioregistroid.equals(other.usuarioregistroid))
			return false;
		return true;
	}



	@Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Exposicionitem[ exposicionitemPK=" + this.exposicionitemid + " ]";
    }
    
}
