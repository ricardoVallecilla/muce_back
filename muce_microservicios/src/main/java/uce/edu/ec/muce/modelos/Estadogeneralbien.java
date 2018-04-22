/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "ESTADO_GENERAL_BIEN", catalog = "", schema = "MUCE")
public class Estadogeneralbien implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected PiezaCatalogoPk piezaCatalogoPk;
    
    public Estadogeneralbien() {
    	
    }

	public Estadogeneralbien(PiezaCatalogoPk piezaCatalogoPk) {
		
		this.piezaCatalogoPk = piezaCatalogoPk;
	}


	public PiezaCatalogoPk getPiezaCatalogoPk() {
		return piezaCatalogoPk;
	}

	public void setPiezaCatalogoPk(PiezaCatalogoPk piezaCatalogoPk) {
		this.piezaCatalogoPk = piezaCatalogoPk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((piezaCatalogoPk == null) ? 0 : piezaCatalogoPk.hashCode());
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
		Estadogeneralbien other = (Estadogeneralbien) obj;
		if (piezaCatalogoPk == null) {
			if (other.piezaCatalogoPk != null)
				return false;
		} else if (!piezaCatalogoPk.equals(other.piezaCatalogoPk))
			return false;
		return true;
	}
    
    


    
}
