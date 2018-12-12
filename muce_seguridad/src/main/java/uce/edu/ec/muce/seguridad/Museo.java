/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.seguridad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "MUSEO", catalog = "", schema = "MUCE")
public class Museo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MUSEO_SEQ")
    @SequenceGenerator(sequenceName = "museo_seq", allocationSize = 1, name = "MUSEO_SEQ")
    
    
    @Column(name = "mus_id", nullable = true, precision = 0, scale = -127)
    private Long museoid;
    
    
    @Size(min = 1, max = 150)
    @Column(name = "mus_nombre", nullable = true, length = 150)
    private String nombres;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "mus_descripcion", nullable = true, length = 600)
    private String descripcion;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "mus_ubicacion", nullable = true, length = 600)
    private String ubicacion;
    
    
    @Size(min = 1, max = 15)
    @Column(name = "mus_telefono", nullable = true, length = 15)
    private String telefono;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "mus_directora", nullable = true, length = 600)
    private String directora;
    
    @Column(name = "aud_usuario_registro_id",length = 600)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    @JoinColumn(name = "mus_custodio_id", referencedColumnName = "usr_id", nullable = true)
    @OneToOne
    @JsonIgnore
    private Usuario cutodioId;
    
    @JoinColumn(name = "mus_coordinador_id", referencedColumnName = "usr_id", nullable = true)
    @OneToOne
    @JsonIgnore
    private Usuario coordinadorId;
    
    @JoinColumn(name = "mus_administrativo_id", referencedColumnName = "usr_id", nullable = true)
    @OneToOne
    @JsonIgnore
    private Usuario administrativoId;
    
    @JoinColumn(name = "mus_tecnologia_id", referencedColumnName = "usr_id", nullable = true)
    @OneToOne
    @JsonIgnore
    private Usuario tecnologiaId;
    

    public Museo() {
    }

    public Museo(Long museoid) {
        this.museoid = museoid;
    }

    public Museo(Long museoid, String nombres, String descripcion, String ubicacion, String telefono, String directora) {
        this.museoid = museoid;
        this.nombres = nombres;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.directora = directora;
    }

    public Long getMuseoid() {
        return museoid;
    }

    public void setMuseoid(Long museoid) {
        this.museoid = museoid;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirectora() {
        return directora;
    }

    public void setDirectora(String directora) {
        this.directora = directora;
    }

    public String getUsuarioregistroid() {
        return usuarioregistroid;
    }

    public void setUsuarioregistroid(String usuarioregistroid) {
        this.usuarioregistroid = usuarioregistroid;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }


	public Usuario getCutodioId() {
		return cutodioId;
	}

	public void setCutodioId(Usuario cutodioId) {
		this.cutodioId = cutodioId;
	}

	public Usuario getCoordinadorId() {
		return coordinadorId;
	}

	public void setCoordinadorId(Usuario coordinadorId) {
		this.coordinadorId = coordinadorId;
	}

	public Usuario getAdministrativoId() {
		return administrativoId;
	}

	public void setAdministrativoId(Usuario administrativoId) {
		this.administrativoId = administrativoId;
	}

	public Usuario getTecnologiaId() {
		return tecnologiaId;
	}

	public void setTecnologiaId(Usuario tecnologiaId) {
		this.tecnologiaId = tecnologiaId;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (museoid != null ? museoid.hashCode() : 0);
        return hash;
    }
    
    

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Museo)) {
            return false;
        }
        Museo other = (Museo) object;
        if ((this.museoid == null && other.museoid != null) || (this.museoid != null && !this.museoid.equals(other.museoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Museo[ museoid=" + museoid + " ]";
    }
    
}
