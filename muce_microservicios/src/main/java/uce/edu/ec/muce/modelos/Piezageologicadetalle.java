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
@Table(name = "GEOLOGIA", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezageologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAGEOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "PIEZAGEOLOGICADETALLE_SEQ", allocationSize = 1, name = "PIEZAGEOLOGICADETALLE_SEQ")
    @Column(name = "glg_id", nullable = true, precision = 0, scale = -127)
    private Long detalleid;

    @Size(max = 600)
    @Column(name = "glg_cientifico", length = 600)
    private String cientifico;
    
    @Size(max = 600)
    @Column(name = "glg_comun", length = 600)
    private String comun;
    
    
    @Size(max = 600)
    @Column(name = "glg_material", length = 600)
    private String material;
    
    @Size(max = 600)
    @Column(name = "glg_clasificacion", length = 600)
    private String clasificacion;
    
    @Size(max = 600)
    @Column(name = "glg_clasificacion_campo", length = 600)
    private String clasificacioncampo;
    
    @Size(max = 600)
    @Column(name = "glg_periodo", length = 600)
    private String periodo;
    
    @Size(max = 50)
    @Column(name = "glg_epoca", length = 50)
    private String epoca;
    
    @Size(max = 25)
    @Column(name = "glg_era", length = 25)
    private String era;
    
    @Size(max = 25)
    @Column(name = "glg_edad", length = 25)
    private String edad;
    
    @Size(max = 10)
    @Column(name = "glg_alto", length = 10)
    private String alto;
    
    @Size(max = 10)
    @Column(name = "glg_largo", length = 10)
    private String largo;
    
    @Size(max = 10)
    @Column(name = "glg_ancho", length = 10)
    private String ancho;
    
    @Size(max = 10)
    @Column(name = "glg_diametro", length = 10)
    private String diametro;
    
    @Size(max = 10)
    @Column(name = "glg_peso", length = 10)
    private String peso;
    
    @Size(max = 600)
    @Column(name = "glg_inscripciones", length = 600)
    private String inscripciones;
    
    @Size(max = 10)
    @Column(name = "glg_grupo", length = 10)
    private String grupo;
    
    @Size(max = 600)
    @Column(name = "glg_elementos_relacionados", length = 600)
    private String elementosrelacionados;
    
    @Column(name = "glg_descripcion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date descripcion;
    
    @JoinColumn(name = "msb_id", referencedColumnName = "msb_id", nullable = true)
    @ManyToOne(cascade = {CascadeType.ALL})

    private Piezamuseable piezamuseableid;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600)
    private String usuarioregistroid;
    
    //catalogacion
    @Size(max = 200)
    @Column(name = "glg_formula", length = 200)
    private String formula;
    
    @Size(max = 1000)
    @Column(name = "glg_composicion", length = 1000)
    private String composicion;
    
    @Size(max = 200)
    @Column(name = "glg_empirica", length = 200)
    private String empirica;
    
    @Size(max = 1000)
    @Column(name = "glg_relacion", length = 1000)
    private String relacion;
    
    @Size(max = 600)
    @Column(name = "glg_ima", length = 600)
    private String ima;
    
    @Size(max = 1500)
    @Column(name = "glg_origen", length = 1500)
    private String origen;
    
    @Size(max = 600)
    @Column(name = "glg_sinonimo", length = 600)
    private String sinonimo;
    
    @Size(max = 300)
    @Column(name = "glg_dimension", length = 300)
    private String dimension;
    
    @Size(max = 300)
    @Column(name = "glg_rayos", length = 300)
    private String rayos;
    
    @Size(max = 300)
    @Column(name = "glg_formas", length = 300)
    private String formas;
    
    @Size(max = 300)
    @Column(name = "glg_estructura", length = 300)
    private String estructura;
    
    @Column(name = "glg_triclinico")
	private Boolean triclinico;
    
    @Column(name = "glg_monoclinico")
	private Boolean monoclinico;
    
    @Column(name = "glg_ortorrombico")
	private Boolean ortorrombico;
    
    @Column(name = "glg_tetragonal")
	private Boolean tetragonal;
    
    @Column(name = "glg_hexagonal")
	private Boolean hexagonal;
    
    @Column(name = "glg_trigonal")
	private Boolean trigonal;
    
    @Column(name = "glg_cubico")
	private Boolean cubico;
    
    @Size(max = 600)
    @Column(name = "glg_escision", length = 600)
    private String escision;
    
    @Size(max = 600)
    @Column(name = "glg_color", length = 600)
    private String color;
    
    @Size(max = 600)
    @Column(name = "glg_densidad", length = 600)
    private String densidad;
    
    @Size(max = 600)
    @Column(name = "glg_transparencia", length = 600)
    private String transparencia;
    
    @Size(max = 600)
    @Column(name = "glg_fuerza", length = 600)
    private String fuerza;
    
    @Size(max = 600)
    @Column(name = "glg_dureza", length = 600)
    private String dureza;
    
    @Size(max = 600)
    @Column(name = "glg_luminicencia", length = 600)
    private String luminicencia;
    
    @Size(max = 600)
    @Column(name = "glg_brillo", length = 600)
    private String brillo;
    
    @Size(max = 600)
    @Column(name = "glg_veta", length = 600)
    private String veta;
    
    @Size(max = 600)
    @Column(name = "glg_gladstone", length = 600)
    private String gladstone;
    
    @Size(max = 600)
    @Column(name = "glg_opticos", length = 600)
    private String opticos;
    
    @Size(max = 200)
    @Column(name = "glg_electrones", length = 200)
    private String electrones;
    
    @Size(max = 200)
    @Column(name = "glg_fermion", length = 200)
    private String fermion;
    
    @Size(max = 200)
    @Column(name = "glg_fotoelectricidad", length = 200)
    private String fotoelectricidad;
    
    @Size(max = 200)
    @Column(name = "glg_radioactividad", length = 200)
    private String radioactividad;
    
    @Size(max = 600)
    @Column(name = "glg_dana", length = 600)
    private String dana;
    
    @Size(max = 600)
    @Column(name = "glg_strunz", length = 600)
    private String strunz;
    
    @JoinColumn(name = "glg_yacimiento_provincia", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
	private Catalogo yacimientoprovinciaid;
	
	@JoinColumn(name = "glg_yacimiento_canton", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
	private Catalogo yacimientocantonid;
	
	@JoinColumn(name = "glg_yacimiento_ciudad", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
	private Catalogo yacimientociudadid;
	
	@Column(name = "glg_yacimiento_direccion",length = 3000)
	private String yacimientodireccion;
	
	@Column(name = "glg_yacimiento_latitud",length = 3000)
	private String yacimientolatitud;
	
	@Column(name = "glg_yacimiento_longitud",length = 3000)
	private String yacimientolongitud;
	
	@Column(name = "glg_yacimiento_altura",length = 3000)
	private String yacimientoaltura;
	
	@Column(name = "glg_yacimiento_contenedor",length = 3000)
	private String yacimientocontenedor;
	
	@Column(name = "glg_yacimiento_morfologia",length = 3000)
	private String yacimientomorfologia;
	
	@Column(name = "glg_yacimiento_ubicacion",length = 3000)
	private String yacimientoubicacion;
	
	
    @Column(name = "glg_fotografia_yacimiento")
    private String  fotografiayacimiento;
	
	@Column(name = "glg_yacimiento_fotografo",length = 3000)
	private String yacimientofotografo;
	
	@Column(name = "glg_yacimiento_lugar",length = 3000)
	private String yacimientolugar;
	
	
    @Column(name = "glg_foto_yacimiento_plano")
    private String fotoyacimientoplano;
	
	@Column(name = "glg_yacimiento_glguitecto",length = 3000)
	private String yacimientoglguitecto;
	
	@Column(name = "glg_yacimiento_planos_lugar",length = 3000)
	private String yacimientoplanoslugar;
	
	@Column(name = "glg_observaciones",length = 600)
	private String observaciones;
	
	@Column(name = "glg_responsable",length = 2000)
	private String responsable;
	
	@Column(name = "glg_geologo",length = 2000)
	private String geologo;
	
	@Column(name = "glg_biografia",length = 2000)
	private String biografia;
	
	@Column(name = "glg_publicaciones",length = 2000)
	private String publicaciones;
	
	@Column(name = "glg_uce",length = 2000)
	private String uce;
	
    @Column(name = "glg_prospeccion_empirica")
	private Boolean prospeccionEmpirica;
    
    @Column(name = "glg_prospeccion_geologica")
	private Boolean prospeccionGeologica;
	
    @Column(name = "glg_tesauro",length = 3000)
	private String tesauro;
	
	@Column(name = "glg_palabras_claves",length = 600)
	private String palabrasClaves;
	
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;

    public Piezageologicadetalle() {
    }

    public Piezageologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Long getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Long detalleid) {
        this.detalleid = detalleid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacioncampo() {
        return clasificacioncampo;
    }

    public void setClasificacioncampo(String clasificacioncampo) {
        this.clasificacioncampo = clasificacioncampo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCientifico() {
		return cientifico;
	}

	public void setCientifico(String cientifico) {
		this.cientifico = cientifico;
	}

	public String getComun() {
		return comun;
	}

	public void setComun(String comun) {
		this.comun = comun;
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

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getElementosrelacionados() {
        return elementosrelacionados;
    }

    public void setElementosrelacionados(String elementosrelacionados) {
        this.elementosrelacionados = elementosrelacionados;
    }

    public Date getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Date descripcion) {
        this.descripcion = descripcion;
    }

    public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
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

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}

	public String getEmpirica() {
		return empirica;
	}

	public void setEmpirica(String empirica) {
		this.empirica = empirica;
	}

	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}

	public String getIma() {
		return ima;
	}

	public void setIma(String ima) {
		this.ima = ima;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getSinonimo() {
		return sinonimo;
	}

	public void setSinonimo(String sinonimo) {
		this.sinonimo = sinonimo;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getRayos() {
		return rayos;
	}

	public void setRayos(String rayos) {
		this.rayos = rayos;
	}

	public String getFormas() {
		return formas;
	}

	public void setFormas(String formas) {
		this.formas = formas;
	}

	public String getEstructura() {
		return estructura;
	}

	public void setEstructura(String estructura) {
		this.estructura = estructura;
	}

	public Boolean getTriclinico() {
		return triclinico;
	}

	public void setTriclinico(Boolean triclinico) {
		this.triclinico = triclinico;
	}

	public Boolean getMonoclinico() {
		return monoclinico;
	}

	public void setMonoclinico(Boolean monoclinico) {
		this.monoclinico = monoclinico;
	}

	public Boolean getOrtorrombico() {
		return ortorrombico;
	}

	public void setOrtorrombico(Boolean ortorrombico) {
		this.ortorrombico = ortorrombico;
	}

	public Boolean getTetragonal() {
		return tetragonal;
	}

	public void setTetragonal(Boolean tetragonal) {
		this.tetragonal = tetragonal;
	}

	public Boolean getHexagonal() {
		return hexagonal;
	}

	public void setHexagonal(Boolean hexagonal) {
		this.hexagonal = hexagonal;
	}

	public Boolean getTrigonal() {
		return trigonal;
	}

	public void setTrigonal(Boolean trigonal) {
		this.trigonal = trigonal;
	}

	public Boolean getCubico() {
		return cubico;
	}

	public void setCubico(Boolean cubico) {
		this.cubico = cubico;
	}

	public String getEscision() {
		return escision;
	}

	public void setEscision(String escision) {
		this.escision = escision;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDensidad() {
		return densidad;
	}

	public void setDensidad(String densidad) {
		this.densidad = densidad;
	}

	public String getTransparencia() {
		return transparencia;
	}

	public void setTransparencia(String transparencia) {
		this.transparencia = transparencia;
	}

	public String getFuerza() {
		return fuerza;
	}

	public void setFuerza(String fuerza) {
		this.fuerza = fuerza;
	}

	public String getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {
		this.dureza = dureza;
	}

	public String getLuminicencia() {
		return luminicencia;
	}

	public void setLuminicencia(String luminicencia) {
		this.luminicencia = luminicencia;
	}

	public String getBrillo() {
		return brillo;
	}

	public void setBrillo(String brillo) {
		this.brillo = brillo;
	}

	public String getVeta() {
		return veta;
	}

	public void setVeta(String veta) {
		this.veta = veta;
	}

	public String getGladstone() {
		return gladstone;
	}

	public void setGladstone(String gladstone) {
		this.gladstone = gladstone;
	}

	public String getOpticos() {
		return opticos;
	}

	public void setOpticos(String opticos) {
		this.opticos = opticos;
	}

	public String getElectrones() {
		return electrones;
	}

	public void setElectrones(String electrones) {
		this.electrones = electrones;
	}

	public String getFermion() {
		return fermion;
	}

	public void setFermion(String fermion) {
		this.fermion = fermion;
	}

	public String getFotoelectricidad() {
		return fotoelectricidad;
	}

	public void setFotoelectricidad(String fotoelectricidad) {
		this.fotoelectricidad = fotoelectricidad;
	}

	public String getRadioactividad() {
		return radioactividad;
	}

	public void setRadioactividad(String radioactividad) {
		this.radioactividad = radioactividad;
	}

	public String getDana() {
		return dana;
	}

	public void setDana(String dana) {
		this.dana = dana;
	}

	public String getStrunz() {
		return strunz;
	}

	public void setStrunz(String strunz) {
		this.strunz = strunz;
	}

	public String getFotografiayacimiento() {
		return fotografiayacimiento;
	}

	public void setFotografiayacimiento(String fotografiayacimiento) {
		this.fotografiayacimiento = fotografiayacimiento;
	}

	public String getFotoyacimientoplano() {
		return fotoyacimientoplano;
	}

	public void setFotoyacimientoplano(String fotoyacimientoplano) {
		this.fotoyacimientoplano = fotoyacimientoplano;
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

	public String getGeologo() {
		return geologo;
	}

	public void setGeologo(String geologo) {
		this.geologo = geologo;
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

	public Boolean getProspeccionGeologica() {
		return prospeccionGeologica;
	}

	public void setProspeccionGeologica(Boolean prospeccionGeologica) {
		this.prospeccionGeologica = prospeccionGeologica;
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
        if (!(object instanceof Piezageologicadetalle)) {
            return false;
        }
        Piezageologicadetalle other = (Piezageologicadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezageologicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
