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
@Table(name = "ENTOMOLOGIA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezaentomologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAENTOMOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezaentomologicadetalle_seq", allocationSize = 1, name = "PIEZAENTOMOLOGICADETALLE_SEQ")
    
    
    @Column(name = "ent_id", precision = 0, scale = -127)
    private Long detalleid;
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_nombre_cientifico", length = 600)
    private String nombrecientifico;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_nombre_comun", length = 600)
    private String nombrecomun;
    
    @Size(max = 600)
    @Column(name = "ent_autor", length = 600)
    private String autor;
    
    @Size(max = 600)
    @Column(name = "ent_publicado", length = 600)
    private String publicado;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_clase", length = 600)
    private String clase;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_orden", length = 600)
    private String orden;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_familia", length = 600)
    private String familia;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_sexo", length = 600)
    private String sexo;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_etapa_vida", length = 600)
    private String etapavida;
    
    
    @Size(min = 1, max = 3000)
    @Column(name = "ent_descripcion", length = 3000)
    private String descripcion;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "ent_latitud", length = 10)
    private String latitud;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "ent_longitud", length = 10)
    private String longitud;
    
    
    @Size(min = 1, max = 600)
    @Column(name = "ent_localizacion_precisa", length = 600)
    private String localizacionprecisa;
    
    
    @Size(min = 1, max = 10)
    @Column(name = "ent_elevacion", length = 10)
    private String elevacion;
    
    @Column(name = "ent_ciudad")
    private String ciudad;    
        
    @Size(min = 1, max = 600)
    @Column(name = "ent_persona_recolectora", length = 600)
    private String personarecolectora;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    @Column(name = "ent_provincia")
    private String provincia;
    
    @Column(name = "ent_canton")
    private String canton; 
    
    @JoinColumn(name = "ent_pais", referencedColumnName = "ctl_id")
    @ManyToOne()
    private Catalogo paisid;
    
    @JoinColumn(name = "msb_id", referencedColumnName = "msb_id")
    @ManyToOne(cascade = {CascadeType.ALL})
    private Piezamuseable piezamuseableid;
    
    @Column(name = "ent_metodologia_recoleccion", length = 3000)
    private String metodologiarecoleccion;
    
    @Column(name = "ent_materiales_utilizados", length = 3000)
    private String materialesutilizados;
    
    @Column(name = "ent_permisos", length = 3000)
    private String permisos;
    
    @Column(name = "ent_analisis_geografico", length = 3000)
    private String analisisgeografico;
    
    @Column(name = "ent_tipo_ecosistema", length = 3000)
    private String tipoecosistema;
    
    @Column(name = "ent_comportamiento", length = 3000)
    private String comportamiento;
    
    @Column(name = "ent_relacion_clima", length = 3000)
    private String relacionclima;
    
    @Column(name = "ent_fotografo_ecosistema", length = 600)
    private String fotografoecosistema;
    
    @Column(name = "ent_lugar_ecosistema", length = 600)
    private String lugarecosistema;
    
    @Column(name = "ent_fotografo_cartografia", length = 600)
    private String fotografocartografia;
    
    @Column(name = "ent_fuente_cartografia", length = 3000)
    private String fuentecartografia;
    
    @Column(name = "ent_escala_cartografia", length = 3000)
    private String escalacartografia;
    
    @Column(name = "ent_lugar_cartografia", length = 600)
    private String lugarcartografia;
    
    @Column(name = "ent_creencias", length = 3000)
    private String creencias;
    
    @Column(name = "ent_rituales", length = 3000)
    private String rituales;
    
    @Column(name = "ent_semiotica", length = 3000)
    private String semiotica;
    
    @Column(name = "ent_gastronomia", length = 3000)
    private String gastronomia;
    
    
    @Column(name = "ent_foto_ecosistema")
    private String fotoecosistema;
    
    @Column(name = "ent_foto_cartografia")
    private String fotocartografia;

    public Piezaentomologicadetalle() {
    }

    public Piezaentomologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezaentomologicadetalle(Long detalleid, String nombrecientifico, String nombrecomun, String clase, String orden, String familia, String sexo, String etapavida, String descripcion, String latitud, String longitud, String localizacionprecisa, String elevacion, String personarecolectora) {
        this.detalleid = detalleid;
        this.nombrecientifico = nombrecientifico;
        this.nombrecomun = nombrecomun;
        this.clase = clase;
        this.orden = orden;
        this.familia = familia;
        this.sexo = sexo;
        this.etapavida = etapavida;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.localizacionprecisa = localizacionprecisa;
        this.elevacion = elevacion;
        
        this.personarecolectora = personarecolectora;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public void setNombrecientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEtapavida() {
        return etapavida;
    }

    public void setEtapavida(String etapavida) {
        this.etapavida = etapavida;
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
    
    

    public String getMetodologiarecoleccion() {
		return metodologiarecoleccion;
	}

	public void setMetodologiarecoleccion(String metodologiarecoleccion) {
		this.metodologiarecoleccion = metodologiarecoleccion;
	}

	public String getMaterialesutilizados() {
		return materialesutilizados;
	}

	public void setMaterialesutilizados(String materialesutilizados) {
		this.materialesutilizados = materialesutilizados;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

	public String getAnalisisgeografico() {
		return analisisgeografico;
	}

	public void setAnalisisgeografico(String analisisgeografico) {
		this.analisisgeografico = analisisgeografico;
	}

	public String getTipoecosistema() {
		return tipoecosistema;
	}

	public void setTipoecosistema(String tipoecosistema) {
		this.tipoecosistema = tipoecosistema;
	}

	public String getComportamiento() {
		return comportamiento;
	}

	public void setComportamiento(String comportamiento) {
		this.comportamiento = comportamiento;
	}

	public String getRelacionclima() {
		return relacionclima;
	}

	public void setRelacionclima(String relacionclima) {
		this.relacionclima = relacionclima;
	}

	public String getFotografoecosistema() {
		return fotografoecosistema;
	}

	public void setFotografoecosistema(String fotografoecosistema) {
		this.fotografoecosistema = fotografoecosistema;
	}

	public String getLugarecosistema() {
		return lugarecosistema;
	}

	public void setLugarecosistema(String lugarecosistema) {
		this.lugarecosistema = lugarecosistema;
	}

	public String getFotografocartografia() {
		return fotografocartografia;
	}

	public void setFotografocartografia(String fotografocartografia) {
		this.fotografocartografia = fotografocartografia;
	}

	public String getFuentecartografia() {
		return fuentecartografia;
	}

	public void setFuentecartografia(String fuentecartografia) {
		this.fuentecartografia = fuentecartografia;
	}

	public String getEscalacartografia() {
		return escalacartografia;
	}

	public void setEscalacartografia(String escalacartografia) {
		this.escalacartografia = escalacartografia;
	}

	public String getLugarcartografia() {
		return lugarcartografia;
	}

	public void setLugarcartografia(String lugarcartografia) {
		this.lugarcartografia = lugarcartografia;
	}

	public String getCreencias() {
		return creencias;
	}

	public void setCreencias(String creencias) {
		this.creencias = creencias;
	}

	public String getRituales() {
		return rituales;
	}

	public void setRituales(String rituales) {
		this.rituales = rituales;
	}

	public String getSemiotica() {
		return semiotica;
	}

	public void setSemiotica(String semiotica) {
		this.semiotica = semiotica;
	}

	public String getGastronomia() {
		return gastronomia;
	}

	public void setGastronomia(String gastronomia) {
		this.gastronomia = gastronomia;
	}
	

	public String getFotoecosistema() {
		return fotoecosistema;
	}

	public void setFotoecosistema(String fotoecosistema) {
		this.fotoecosistema = fotoecosistema;
	}

	public String getFotocartografia() {
		return fotocartografia;
	}

	public void setFotocartografia(String fotocartografia) {
		this.fotocartografia = fotocartografia;
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
        if (!(object instanceof Piezaentomologicadetalle)) {
            return false;
        }
        Piezaentomologicadetalle other = (Piezaentomologicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezaentomologicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
