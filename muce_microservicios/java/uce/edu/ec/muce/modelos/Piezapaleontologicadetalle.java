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
@Table(name = "PALEONTOLOGIA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezapaleontologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validations 
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAPALEONTOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezapaleontologicadetalle_seq", allocationSize = 1, name = "PIEZAPALEONTOLOGICADETALLE_SEQ")
    @Column(name = "pln_id", nullable = true, precision = 0, scale = -127)
    private Long detalleid;
    
    @Size(max = 600)
    @Column(name = "pln_nombre_cientifico", length = 600)
    private String nombrecientifico;
    
    @Size(max = 600)
    @Column(name = "pln_nombre_comun", length = 600)
    private String nombrecomun;
    
    @Size(max = 600)
    @Column(name = "pln_reino", length = 600)
    private String reino;
    
    @Size(max = 600)
    @Column(name = "pln_filo", length = 600)
    private String filo;
    
    @Size(max = 600)
    @Column(name = "pln_clase", length = 600)
    private String clase;
    @Size(max = 600)
    @Column(name = "pln_orden", length = 600)
    private String orden;
    @Size(max = 600)
    @Column(name = "pln_familia", length = 600)
    private String familia;
    @Size(max = 600)
    @Column(name = "pln_era", length = 600)
    private String era;
    @Size(max = 600)
    @Column(name = "pln_sistema", length = 600)
    private String sistema;
    @Size(max = 600)
    @Column(name = "pln_serie", length = 600)
    private String serie;
    @Size(max = 600)
    @Column(name = "pln_piso", length = 600)
    private String piso;
    @Size(max = 600)
    @Column(name = "pln_miembro", length = 600)
    private String miembro;
    @Size(max = 600)
    @Column(name = "pln_formacion", length = 600)
    private String formacion;
    @Size(max = 600)
    @Column(name = "pln_grupo", length = 600)
    private String grupo;
    @Size(max = 600)
    @Column(name = "pln_alto", length = 600)
    private String alto;
    @Size(max = 600)
    @Column(name = "pln_largo", length = 600)
    private String largo;
    @Size(max = 600)
    @Column(name = "pln_ancho", length = 600)
    private String ancho;
    @Size(max = 600)
    @Column(name = "pln_peso", length = 600)
    private String peso;
    @Size(max = 600)
    @Column(name = "pln_inscripciones", length = 600)
    private String inscripciones;
    @Size(max = 600)
    @Column(name = "pln_elementos_relacionados", length = 600)
    private String elementosrelacionados;
    @Size(max = 600)
    @Column(name = "pln_morfologia", length = 600)
    private String morfologia;
    @Size(max = 600)
    @Column(name = "pln_recolectores", length = 600)
    private String recolectores;
    @Size(max = 600)
    @Column(name = "pln_fecha_recoleccion", length = 600)
    private String fecharecoleccion;
    @Size(max = 600)
    @Column(name = "pln_diametro", length = 600)
    private String diametro;
    @Size(max = 600)
    @Column(name = "pln_latitud", length = 600)
    private String latitud;
    @Size(max = 600)
    @Column(name = "pln_longitud", length = 600)
    private String longitud;
    @Size(max = 600)
    @Column(name = "pln_localizacion_precisa", length = 600)
    private String localizacionprecisa;
    @Size(max = 600)
    @Column(name = "pln_persona_recolectadora", length = 600)
    private String personarecolectadora;
    @Size(max = 600)
    @Column(name = "pln_ciudad", length = 600)
    private String ciudadid;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    @JoinColumn(name = "pln_canton", referencedColumnName = "ctl_id")
    @ManyToOne
    private Catalogo cantonid;
    @JoinColumn(name = "pln_pais", referencedColumnName = "ctl_id")
    @ManyToOne
    private Catalogo paisid;
    
    @JoinColumn(name = "pln_provincia", referencedColumnName = "ctl_id")
    @ManyToOne
    private Catalogo provinciaid;
    
    @JoinColumn(name = "msb_id", referencedColumnName = "msb_id", nullable = true)
    @ManyToOne(cascade = {CascadeType.ALL})

    private Piezamuseable piezamuseableid;
    
    @JoinColumn(name = "pln_yacimiento_provincia", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
	private Catalogo yacimientoprovinciaid;
	
	@JoinColumn(name = "pln_yacimiento_canton", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
	private Catalogo yacimientocantonid;
	
	@JoinColumn(name = "pln_yacimiento_ciudad", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
	private Catalogo yacimientociudadid;
	
	@Column(name = "pln_yacimiento_direccion",length = 3000)
	private String yacimientodireccion;
	
	@Column(name = "pln_yacimiento_latitud",length = 3000)
	private String yacimientolatitud;
	
	@Column(name = "pln_yacimiento_longitud",length = 3000)
	private String yacimientolongitud;
	
	@Column(name = "pln_yacimiento_altura",length = 3000)
	private String yacimientoaltura;
	
	@Column(name = "pln_yacimiento_contenedor",length = 3000)
	private String yacimientocontenedor;
	
	@Column(name = "pln_yacimiento_morfologia",length = 3000)
	private String yacimientomorfologia;
	
	@Column(name = "pln_yacimiento_ubicacion",length = 3000)
	private String yacimientoubicacion;
	
	
    @Column(name = "pln_fotografia_yacimiento")
    private String  fotografiayacimiento;
	
	@Column(name = "pln_yacimiento_fotografo",length = 3000)
	private String yacimientofotografo;
	
	@Column(name = "pln_yacimiento_lugar",length = 3000)
	private String yacimientolugar;
	
	
    @Column(name = "pln_foto_yacimiento_plano")
    private String fotoyacimientoplano;
	
	@Column(name = "pln_yacimiento_glguitecto",length = 3000)
	private String yacimientoglguitecto;
	
	@Column(name = "pln_yacimiento_planos_lugar",length = 3000)
	private String yacimientoplanoslugar;
	
	@Column(name = "pln_observaciones",length = 600)
	private String observaciones;
	
	@Column(name = "pln_responsable",length = 3000)
	private String responsable;
	
	@Column(name = "pln_paleontologo",length = 3000)
	private String paleontologo;
	
	@Column(name = "pln_biografia",length = 3000)
	private String biografia;
	
	@Column(name = "pln_publicaciones",length = 2000)
	private String publicaciones;
	
	@Column(name = "pln_uce",length = 3000)
	private String uce;
	
    @Column(name = "pln_prospeccion_empirica")
	private Boolean prospeccionEmpirica;
    
    @Column(name = "pln_prospeccion_paleontologo")
	private Boolean prospeccionPaleontogo;
    
    @Column(name = "pln_uso_social",length = 3000)
	private String usoSocial;

    @Column(name = "pln_uso_primario",length = 3000)
	private String usoPrimario;

    @Column(name = "pln_alternativo",length = 3000)
	private String alternativo;

    @Column(name = "pln_uso_restriccion",length = 3000)
	private String usoRestriccion;

    @Column(name = "pln_creencia",length = 3000)
	private String creencia;

    @Column(name = "pln_uso_bien",length = 3000)
	private String usoBien;

    @Column(name = "pln_pertenencia",length = 3000)
	private String pertenencia;

    @Column(name = "pln_utiliza_bien",length = 3000)
	private String utilizaBien;

    @Column(name = "pln_donde_utiliza",length = 3000)
	private String dondeUtiliza;

    @Column(name = "pln_donde_coloca",length = 3000)
	private String dondeColoca;

    @Column(name = "pln_vida_aproximada",length = 3000)
	private String vidaAproximada;
    
    @Column(name = "pln_tesauro",length = 3000)
	private String tesauro;
    
    @Column(name = "pln_palabras_claves",length = 3000)
	private String palabrasClaves;
    
    public Piezapaleontologicadetalle() {
    }

    public Piezapaleontologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
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

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
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

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getMiembro() {
        return miembro;
    }

    public void setMiembro(String miembro) {
        this.miembro = miembro;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(String inscripciones) {
        this.inscripciones = inscripciones;
    }

    public String getElementosrelacionados() {
        return elementosrelacionados;
    }

    public void setElementosrelacionados(String elementosrelacionados) {
        this.elementosrelacionados = elementosrelacionados;
    }

    public String getMorfologia() {
        return morfologia;
    }

    public void setMorfologia(String morfologia) {
        this.morfologia = morfologia;
    }

    public String getRecolectores() {
        return recolectores;
    }

    public void setRecolectores(String recolectores) {
        this.recolectores = recolectores;
    }

    public String getFecharecoleccion() {
        return fecharecoleccion;
    }

    public void setFecharecoleccion(String fecharecoleccion) {
        this.fecharecoleccion = fecharecoleccion;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
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

    public String getPersonarecolectadora() {
        return personarecolectadora;
    }

    public void setPersonarecolectadora(String personarecolectadora) {
        this.personarecolectadora = personarecolectadora;
    }

    public String getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(String ciudadid) {
        this.ciudadid = ciudadid;
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

    public Catalogo getCantonid() {
        return cantonid;
    }

    public void setCantonid(Catalogo cantonid) {
        this.cantonid = cantonid;
    }

    public Catalogo getPaisid() {
        return paisid;
    }

    public void setPaisid(Catalogo paisid) {
        this.paisid = paisid;
    }

    public Catalogo getProvinciaid() {
        return provinciaid;
    }

    public void setProvinciaid(Catalogo provinciaid) {
        this.provinciaid = provinciaid;
    }

    public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
    }

    public Catalogo getYacimientoprovinciaid() {
		return yacimientoprovinciaid;
	}

	public void setYacimientoprovinciaid(Catalogo yacimientoprovinciaid) {
		this.yacimientoprovinciaid = yacimientoprovinciaid;
	}

	public Catalogo getYacimientocantonid() {
		return yacimientocantonid;
	}

	public void setYacimientocantonid(Catalogo yacimientocantonid) {
		this.yacimientocantonid = yacimientocantonid;
	}

	public Catalogo getYacimientociudadid() {
		return yacimientociudadid;
	}

	public void setYacimientociudadid(Catalogo yacimientociudadid) {
		this.yacimientociudadid = yacimientociudadid;
	}

	public String getYacimientodireccion() {
		return yacimientodireccion;
	}

	public void setYacimientodireccion(String yacimientodireccion) {
		this.yacimientodireccion = yacimientodireccion;
	}

	public String getYacimientolatitud() {
		return yacimientolatitud;
	}

	public void setYacimientolatitud(String yacimientolatitud) {
		this.yacimientolatitud = yacimientolatitud;
	}

	public String getYacimientolongitud() {
		return yacimientolongitud;
	}

	public void setYacimientolongitud(String yacimientolongitud) {
		this.yacimientolongitud = yacimientolongitud;
	}

	public String getYacimientoaltura() {
		return yacimientoaltura;
	}

	public void setYacimientoaltura(String yacimientoaltura) {
		this.yacimientoaltura = yacimientoaltura;
	}

	public String getYacimientocontenedor() {
		return yacimientocontenedor;
	}

	public void setYacimientocontenedor(String yacimientocontenedor) {
		this.yacimientocontenedor = yacimientocontenedor;
	}

	public String getYacimientomorfologia() {
		return yacimientomorfologia;
	}

	public void setYacimientomorfologia(String yacimientomorfologia) {
		this.yacimientomorfologia = yacimientomorfologia;
	}

	public String getYacimientoubicacion() {
		return yacimientoubicacion;
	}

	public void setYacimientoubicacion(String yacimientoubicacion) {
		this.yacimientoubicacion = yacimientoubicacion;
	}

	public String getFotografiayacimiento() {
		return fotografiayacimiento;
	}

	public void setFotografiayacimiento(String fotografiayacimiento) {
		this.fotografiayacimiento = fotografiayacimiento;
	}

	public String getYacimientofotografo() {
		return yacimientofotografo;
	}

	public void setYacimientofotografo(String yacimientofotografo) {
		this.yacimientofotografo = yacimientofotografo;
	}

	public String getYacimientolugar() {
		return yacimientolugar;
	}

	public void setYacimientolugar(String yacimientolugar) {
		this.yacimientolugar = yacimientolugar;
	}

	public String getFotoyacimientoplano() {
		return fotoyacimientoplano;
	}

	public void setFotoyacimientoplano(String fotoyacimientoplano) {
		this.fotoyacimientoplano = fotoyacimientoplano;
	}

	public String getYacimientoglguitecto() {
		return yacimientoglguitecto;
	}

	public void setYacimientoglguitecto(String yacimientoglguitecto) {
		this.yacimientoglguitecto = yacimientoglguitecto;
	}

	public String getYacimientoplanoslugar() {
		return yacimientoplanoslugar;
	}

	public void setYacimientoplanoslugar(String yacimientoplanoslugar) {
		this.yacimientoplanoslugar = yacimientoplanoslugar;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getPaleontologo() {
		return paleontologo;
	}

	public void setPaleontologo(String paleontologo) {
		this.paleontologo = paleontologo;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(String publicaciones) {
		this.publicaciones = publicaciones;
	}

	public String getUce() {
		return uce;
	}

	public void setUce(String uce) {
		this.uce = uce;
	}

	public Boolean getProspeccionEmpirica() {
		return prospeccionEmpirica;
	}

	public void setProspeccionEmpirica(Boolean prospeccionEmpirica) {
		this.prospeccionEmpirica = prospeccionEmpirica;
	}

	public Boolean getProspeccionPaleontogo() {
		return prospeccionPaleontogo;
	}

	public void setProspeccionPaleontogo(Boolean prospeccionPaleontogo) {
		this.prospeccionPaleontogo = prospeccionPaleontogo;
	}

	public String getUsoSocial() {
		return usoSocial;
	}

	public void setUsoSocial(String usoSocial) {
		this.usoSocial = usoSocial;
	}

	public String getUsoPrimario() {
		return usoPrimario;
	}

	public void setUsoPrimario(String usoPrimario) {
		this.usoPrimario = usoPrimario;
	}

	public String getAlternativo() {
		return alternativo;
	}

	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}

	public String getUsoRestriccion() {
		return usoRestriccion;
	}

	public void setUsoRestriccion(String usoRestriccion) {
		this.usoRestriccion = usoRestriccion;
	}

	public String getCreencia() {
		return creencia;
	}

	public void setCreencia(String creencia) {
		this.creencia = creencia;
	}

	public String getUsoBien() {
		return usoBien;
	}

	public void setUsoBien(String usoBien) {
		this.usoBien = usoBien;
	}

	public String getPertenencia() {
		return pertenencia;
	}

	public void setPertenencia(String pertenencia) {
		this.pertenencia = pertenencia;
	}

	public String getUtilizaBien() {
		return utilizaBien;
	}

	public void setUtilizaBien(String utilizaBien) {
		this.utilizaBien = utilizaBien;
	}

	public String getDondeUtiliza() {
		return dondeUtiliza;
	}

	public void setDondeUtiliza(String dondeUtiliza) {
		this.dondeUtiliza = dondeUtiliza;
	}

	public String getDondeColoca() {
		return dondeColoca;
	}

	public void setDondeColoca(String dondeColoca) {
		this.dondeColoca = dondeColoca;
	}

	public String getVidaAproximada() {
		return vidaAproximada;
	}

	public void setVidaAproximada(String vidaAproximada) {
		this.vidaAproximada = vidaAproximada;
	}

	public String getTesauro() {
		return tesauro;
	}

	public void setTesauro(String tesauro) {
		this.tesauro = tesauro;
	}

	public String getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(String palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
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
        if (!(object instanceof Piezapaleontologicadetalle)) {
            return false;
        }
        Piezapaleontologicadetalle other = (Piezapaleontologicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezapeleontologicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
