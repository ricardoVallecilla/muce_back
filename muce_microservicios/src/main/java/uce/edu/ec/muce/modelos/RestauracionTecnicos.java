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
import javax.validation.constraints.Size;

@Entity
@Table(name = "RESTAURACIONTECNICOS", catalog = "", schema = "MUCE")
public class RestauracionTecnicos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURACIONTEC_SEQ")
    @SequenceGenerator(sequenceName = "RESTAURACIONTEC_SEQ", allocationSize = 1, name = "RESTAURACIONTEC_SEQ")
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
	private Long id;
	
	@JoinColumn(name = "RESTAURACIONID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
	private Restauracion restauracion;
	
	@JoinColumn(name = "TIPOID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = false)
	private Catalogo tipo;
	
    @Size(min = 1, max = 150)
    @Column(name = "NOMBRE", length = 150)
	private String nombre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Restauracion getRestauracion() {
		return restauracion;
	}
	public void setRestauracion(Restauracion restauracion) {
		this.restauracion = restauracion;
	}
	public Catalogo getTipo() {
		return tipo;
	}
	public void setTipo(Catalogo tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
