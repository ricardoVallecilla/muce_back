package uce.edu.ec.muce.seguridad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLUSUARIO", catalog = "", schema = "MUCE")
public class RolUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLUSUARIO_SEQ")
	@SequenceGenerator(sequenceName = "rolusuario_seq", allocationSize = 1, name = "ROLUSUARIO_SEQ")
	@Column(name = "rolusu_id", nullable = true, updatable = false)
	private Long id;

	@JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
	@OneToOne
	private Rol rolId;

	@JoinColumn(name = "usr_id", referencedColumnName = "usr_id")
	@OneToOne
	private Usuario usrId;

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
}
