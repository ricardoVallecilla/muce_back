/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity 
@Table(name = "PIEZAMUSEABLECATALOGO", catalog = "", schema = "MUCE")
public class Piezamuseablecatalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  
    @EmbeddedId
    protected PiezaCatalogoPk piezaCatalogoPk;
    
    @Column(name = "IDENTIFICADORCAMPO")
    private String indetificadorCampo;
    
    
    public Piezamuseablecatalogo() {
    	
    }

	public Piezamuseablecatalogo(PiezaCatalogoPk piezaCatalogoPk, String indetificadorCampo) {
		super();
		this.piezaCatalogoPk = piezaCatalogoPk;
		this.indetificadorCampo = indetificadorCampo;
	}

	public String getIndetificadorCampo() {
		return indetificadorCampo;
	}

	public void setIndetificadorCampo(String indetificadorCampo) {
		this.indetificadorCampo = indetificadorCampo;
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
		Piezamuseablecatalogo other = (Piezamuseablecatalogo) obj;
		if (piezaCatalogoPk == null) {
			if (other.piezaCatalogoPk != null)
				return false;
		} else if (!piezaCatalogoPk.equals(other.piezaCatalogoPk))
			return false;
		return true;
	}


    
}
