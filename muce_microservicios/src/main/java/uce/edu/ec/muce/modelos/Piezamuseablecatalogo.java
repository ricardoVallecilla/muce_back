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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Usuario
 */
@Entity 
@Table(name = "MUSEABLECATALOGO", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Piezamuseablecatalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  
    @EmbeddedId
    protected PiezaCatalogoPk piezacatalogoPk;
    
    @Column(name = "msbctl_indetificador_campo")
    private String indetificadorcampo;
    
    
    public Piezamuseablecatalogo() {
    	
    }

	public Piezamuseablecatalogo(PiezaCatalogoPk piezacatalogoPk, String indetificadorcampo) {
		super();
		this.piezacatalogoPk = piezacatalogoPk;
		this.indetificadorcampo = indetificadorcampo;
	}

	public String getIndetificadorcampo() {
		return indetificadorcampo;
	}

	public void setIndetificadorcampo(String indetificadorcampo) {
		this.indetificadorcampo = indetificadorcampo;
	}

	public PiezaCatalogoPk getPiezacatalogoPk() {
		return piezacatalogoPk;
	}

	public void setPiezacatalogoPk(PiezaCatalogoPk piezacatalogoPk) {
		this.piezacatalogoPk = piezacatalogoPk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((piezacatalogoPk == null) ? 0 : piezacatalogoPk.hashCode());
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
		if (piezacatalogoPk == null) {
			if (other.piezacatalogoPk != null)
				return false;
		} else if (!piezacatalogoPk.equals(other.piezacatalogoPk))
			return false;
		return true;
	}


    
}
