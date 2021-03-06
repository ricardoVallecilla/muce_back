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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "RESTAURACIONMATERIAL", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestauracionMateriales implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESTAURACIONMAT_SEQ")
    @SequenceGenerator(sequenceName = "RESTAURACIONMAT_SEQ", allocationSize = 1, name = "RESTAURACIONMAT_SEQ")
    @Basic(optional = true)
    @Column(name = "rstmrt_id", nullable = true, precision = 0, scale = -127)
	private Long id;
	
	@JoinColumn(name = "rstmrt_tipo", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
	private Catalogo tipo;
	
    @Size(min = 1, max = 150)
    @Column(name = "rstmrt_nombre", length = 150)
	private String nombre;
    
    @JoinColumn(name = "RESTAURACIONID", referencedColumnName = "rst_id")
    @ManyToOne(optional = true)
	private Restauracion restauracion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Restauracion getRestauracion() {
		return restauracion;
	}
	public void setRestauracion(Restauracion restauracion) {
		this.restauracion = restauracion;
	}
}
