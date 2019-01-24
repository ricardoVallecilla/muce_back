package uce.edu.ec.muce.modelos;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "MOVIMIENTO_PIEZA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovimientoPieza {

	@EmbeddedId
	protected MovimientoPiezaPk movimientopiezaPK;
	
	

	public MovimientoPiezaPk getmovimientopiezaPK() {
		return movimientopiezaPK;
	}

	public void setmovimientopiezaPK(MovimientoPiezaPk movimientopiezaPK) {
		this.movimientopiezaPK = movimientopiezaPK;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movimientopiezaPK == null) ? 0 : movimientopiezaPK.hashCode());
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
		MovimientoPieza other = (MovimientoPieza) obj;
		if (movimientopiezaPK == null) {
			if (other.movimientopiezaPK != null)
				return false;
		} else if (!movimientopiezaPK.equals(other.movimientopiezaPK))
			return false;
		return true;
	}

}
