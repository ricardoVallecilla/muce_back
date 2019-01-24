/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "BOTANICA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezabotanicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZABOTANICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezabotanicadetalle_seq", allocationSize = 1, name = "PIEZABOTANICADETALLE_SEQ")
    
    
    @Column(name = "btn_id", precision = 0, scale = -127)
    private Long detalleid;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_especie", length = 600)
    private String especie;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_nombre_comun", length = 600,nullable=true)
    private String nombrecomun;
    
    @Size(max = 600)
    @Column(name = "btn_autor", length = 600)
    private String autor;
    
    @Size(max = 600)
    @Column(name = "btn_publicado", length = 600)
    private String publicado;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_clase", length = 600)
    private String clase;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_subclase", length = 600)
    private String subclase;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_orden", length = 600)
    private String orden;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_familia", length = 600)
    private String familia;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_genero", length = 600)
    private String genero;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_descripcion", length = 600)
    private String descripcion;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "btn_latitud", length = 10)
    private String latitud;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "btn_longitud", length = 10)
    private String longitud;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_localizacion_precisa", length = 600)
    private String localizacionprecisa;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_elevacion", length = 600)
    private String elevacion;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_ciudad", length = 600)
    private String ciudad;
    
    @Column(name = "btn_provincia")
    private String provincia;
    
    @Column(name = "btn_canton")
    private String canton;  
    
    @JoinColumn(name = "btn_pais", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
    private Catalogo paisid;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "btn_persona_recolectora", length = 600,nullable=true)
    private String personarecolectora;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600,nullable=true)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    
    @JoinColumn(name = "msb_id", referencedColumnName = "msb_id")    
    @ManyToOne(cascade = {CascadeType.ALL})
    private Piezamuseable piezamuseableid;

    public Piezabotanicadetalle() {
    }

    public Piezabotanicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezabotanicadetalle(Long detalleid, String especie, String nombrecomun, String clase, String subclase, String orden, String familia, String genero, String descripcion, String latitud, String longitud, String localizacionprecisa, String elevacion, String ciudad, String personarecolectora) {
        this.detalleid = detalleid;
        this.especie = especie;
        this.nombrecomun = nombrecomun;
        this.clase = clase;
        this.subclase = subclase;
        this.orden = orden;
        this.familia = familia;
        this.genero = genero;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.localizacionprecisa = localizacionprecisa;
        this.elevacion = elevacion;
        this.ciudad = ciudad;
        this.personarecolectora = personarecolectora;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombrecomun() {
        return nombrecomun;
    }

    public void setNombrecomun(String nombrecomun) {
        this.nombrecomun = nombrecomun;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicado() {
        return publicado;
    }

    public void setPublicado(String publicado) {
        this.publicado = publicado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSubclase() {
        return subclase;
    }

    public void setSubclase(String subclase) {
        this.subclase = subclase;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLocalizacionprecisa() {
        return localizacionprecisa;
    }

    public void setLocalizacionprecisa(String localizacionprecisa) {
        this.localizacionprecisa = localizacionprecisa;
    }

    public String getElevacion() {
        return elevacion;
    }

    public void setElevacion(String elevacion) {
        this.elevacion = elevacion;
    }


    public String getPersonarecolectora() {
        return personarecolectora;
    }

    public void setPersonarecolectora(String personarecolectora) {
        this.personarecolectora = personarecolectora;
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

   

    public Catalogo getPaisid() {
        return paisid;
    }

    public void setPaisid(Catalogo paisid) {
        this.paisid = paisid;
    }

   

    public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }
    
    

    public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleid != null ? detalleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piezabotanicadetalle)) {
            return false;
        }
        Piezabotanicadetalle other = (Piezabotanicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezabotanicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
