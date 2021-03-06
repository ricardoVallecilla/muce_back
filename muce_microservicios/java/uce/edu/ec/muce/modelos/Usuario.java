package uce.edu.ec.muce.modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Usuario implements UserDetails {
	
	static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_SEQ")
    @SequenceGenerator(sequenceName = "usuario_seq", allocationSize = 1, name = "USUARIO_SEQ")
	@Column(name = "usr_id", nullable = true, updatable = false)
	private Long id;
	
	@Column(name = "usr_username", nullable = true, unique = true)
	private String username;
	
	
	@Column(name = "usr_password", nullable = true)
	private String password;
	
	@Column(name = "usr_enabled", nullable = true)
	private boolean enabled;
	
	@Column(name = "usr_nombres", nullable = true)
	private String  nombres;
	
	
	@JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
    @OneToOne
    private Rol rolId;
	
	@OneToMany
	@JoinColumn(name = "usr_id")
	private Set<RolUsuario> roles = new HashSet<RolUsuario>();
	
	public Set<RolUsuario> getRoles() {
		return roles;
	}

	public void setRoles(Set<RolUsuario> roles) {
		this.roles = roles;
	}

	@JoinColumn(name = "mus_id", referencedColumnName = "mus_id")
    @OneToOne
    @JsonBackReference
    private Museo museoId;
	
	@JoinColumn(name = "mus_dos_id", referencedColumnName = "mus_id")
    @OneToOne
    @JsonBackReference(value="museo-dos")
    private Museo museoDosId;
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// we never lock accounts
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// credentials never expire
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Rol getRolId() {
		return rolId;
	}

	public void setRolId(Rol rolId) {
		this.rolId = rolId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Museo getMuseoId() {
		return museoId;
	}

	public void setMuseoId(Museo museoId) {
		this.museoId = museoId;
	}

	public Museo getMuseoDosId() {
		return museoDosId;
	}

	public void setMuseoDosId(Museo museoDosId) {
		this.museoDosId = museoDosId;
	}
	
	
	
	
}
