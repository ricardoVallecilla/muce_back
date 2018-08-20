package uce.edu.ec.muce.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ROLUSUARIO", catalog = "", schema = "MUCE")
public class RolUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLUSUARIO_SEQ")
	@SequenceGenerator(sequenceName = "rolusuario_seq", allocationSize = 1, name = "ROLUSUARIO_SEQ")
	@Column(name = "rolusu_id", nullable = false, updatable = false)
	private Long id;

	@JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
	@OneToOne
	private Rol rolId;

	@JoinColumn(name = "usr_id", referencedColumnName = "usr_id", insertable=false, updatable=false)
	@OneToOne
	@JsonIgnore
	private Usuario usrId;
	
	@Column(name = "usr_id")
	private Long usuarioId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Rol getRolId() {
		return rolId;
	}

	public void setRolId(Rol rolId) {
		this.rolId = rolId;
	}

	public Usuario getUsrId() {
		return usrId;
	}

	public void setUsrId(Usuario usrId) {
		this.usrId = usrId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
}
