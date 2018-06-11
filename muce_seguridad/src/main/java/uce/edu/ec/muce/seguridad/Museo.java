/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.seguridad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "mus_id", nullable = false, precision = 0, scale = -127)
    private Long museoid;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "mus_nombre", nullable = false, length = 150)
    private String nombres;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "mus_descripcion", nullable = false, length = 256)
    private String descripcion;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "mus_ubicacion", nullable = false, length = 256)
    private String ubicacion;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "mus_telefono", nullable = false, length = 15)
    private String telefono;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "mus_directora", nullable = false, length = 256)
    private String directora;
    
    @Size(max = 256)
    @Column(name = "aud_usuario_registro_id", length = 256)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
   
    @JoinColumn(name = "mus_custodio_id", referencedColumnName = "usr_id", nullable = false)
    @OneToOne(optional = false)
    @JsonBackReference
    private Usuario cutodioId;
    
   

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
