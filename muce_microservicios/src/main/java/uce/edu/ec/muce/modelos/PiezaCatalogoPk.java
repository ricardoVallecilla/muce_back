/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Usuario
 */
@Embeddable
public class PiezaCatalogoPk implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  
    @Column(name = "CATALOGOID")    
    private Long catalogoid;
    
    @Column(name = "PIEZAMUSEABLEID")
    private Long piezamuseableid;
    

    public PiezaCatalogoPk() {    	
    }  
    

    public Long getCatalogoid() {
		return catalogoid;
	}

	public void setCatalogoid(Long catalogoid) {
		this.catalogoid = catalogoid;
	}

	public Long getPiezamuseableid() {
		return piezamuseableid;
	}

	public void setPiezamuseableid(Long piezamuseableid) {
		this.piezamuseableid = piezamuseableid;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catalogoid == null) ? 0 : catalogoid.hashCode());
		result = prime * result + ((piezamuseableid == null) ? 0 : piezamuseableid.hashCode());
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
		PiezaCatalogoPk other = (PiezaCatalogoPk) obj;
		if (catalogoid == null) {
			if (other.catalogoid != null)
				return false;
		} else if (!catalogoid.equals(other.catalogoid))
			return false;
		if (piezamuseableid == null) {
			if (other.piezamuseableid != null)
				return false;
		} else if (!piezamuseableid.equals(other.piezamuseableid))
			return false;
		return true;
	}
	
	
    
}
