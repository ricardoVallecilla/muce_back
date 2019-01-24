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
public class MovimientoPiezaPk implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  
    @Column(name = "mvm_id")    
    private Long movimientoid;
    
    @Column(name = "itm_id")
    private Long itemid;
    

    public MovimientoPiezaPk() {    	
    }  
    

    
	public Long getMovimientoid() {
		return movimientoid;
	}



	public void setMovimientoid(Long movimientoid) {
		this.movimientoid = movimientoid;
	}



	public Long getItemid() {
		return itemid;
	}



	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
		result = prime * result + ((movimientoid == null) ? 0 : movimientoid.hashCode());
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
		MovimientoPiezaPk other = (MovimientoPiezaPk) obj;
		if (itemid == null) {
			if (other.itemid != null)
				return false;
		} else if (!itemid.equals(other.itemid))
			return false;
		if (movimientoid == null) {
			if (other.movimientoid != null)
				return false;
		} else if (!movimientoid.equals(other.movimientoid))
			return false;
		return true;
	}




	
    
}
