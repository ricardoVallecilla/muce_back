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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PIEZAARQUEOLOGICADETALLE", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezaarqueologicadetalle implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAARQUEOLOGICADETALLE_SEQ")
	@SequenceGenerator(sequenceName = "Piezaarqueologicadetalle_seq", allocationSize = 1, name = "PIEZAARQUEOLOGICADETALLE_SEQ")

	@Column(name = "DETALLEID", precision = 0, scale = -127)
	private Long detalleid;

	@Column(name = "CATEGORIAMORFOFUNCIONAL")
	private String categoriamorfofuncional;

	@Column(name = "TIPOMATERIAL")
	private String tipomaterial;

	@Column(name = "TECNICAMANOFACTURA")
	private String tecnicamanofactura;

	@Column(name = "TECNICADECORATIVA")
	private String tecnicadecorativa;

	@Column(name = "PERIODOHISTORICO")
	private String periodohistorico;

	@Size(min = 1, max = 150)
	@Column(name = "CULTURA", length = 150)
	private String cultura;

	@Size(min = 1, max = 150)
	@Column(name = "CRONOLOGIA", length = 150)
	private String cronologia;

	@Size(min = 1, max = 150)
	@Column(name = "FASE", length = 150)
	private String fase;

	@Size(min = 1, max = 10)
	@Column(name = "ALTO", length = 10)
	private String alto;

	@Size(min = 1, max = 10)
	@Column(name = "LARGO", length = 10)
	private String largo;

	@Size(min = 1, max = 10)
	@Column(name = "ANCHO", length = 10)
	private String ancho;

	@Size(min = 1, max = 10)
	@Column(name = "DIAMETRO", length = 10)
	private String diametro;

	@Size(min = 1, max = 10)
	@Column(name = "ESPESOR", length = 10)
	private String espesor;

	@Size(min = 1, max = 10)
	@Column(name = "PESO", length = 10)
	private String peso;

	@Size(min = 1, max = 150)
	@Column(name = "INSCRIPCIONES", length = 150)
	private String inscripciones;

	@Size(min = 1, max = 256)
	@Column(name = "DESCRIPCION", length = 256)
	private String descripcion;

	@Size(min = 1, max = 256)
	@Column(name = "ELEMENTOSRELACIONADO", length = 256)
	private String elementosrelacionado;
	@Size(max = 256)
	@Column(name = "USUARIOREGISTROID", length = 256)
	private String usuarioregistroid;
	@Column(name = "FECHAREGISTRO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharegistro;
	@JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID")
	@ManyToOne(cascade = { CascadeType.ALL })
	private Piezamuseable piezamuseableid;
	
	private String elaboracion;
	private String herramientas;
	private String decoracion;
	private String alteracion;
	private String simbolos;
	private String semiotico;
	private String coloresusados;
	private String coloresprocedencia;
	private String semioticocolores;
	private Boolean empirica;
	private Boolean arqueologia;
	private String extraccionobservacion;
	private String extraccionresponsable;
	private String extraccionarqueologo;
	private String biografiaarqueologo;
	private String publicacionarqueologo;
	private String arqueologouniversidad;
	private String usosocial;
	private String usoprimario;
	private String usoalternativo;
	private String usorestricciones;
	private String creencias;
	private String peculiaridades;
	private String pertenencia;
	private String usocuando;
	private String usodonde;
	private String usocolocacion;
	private String vida;
	@JoinColumn(name = "YACIMIENTOPROVINCIAID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = true)
	private Catalogo yacimientoprovinciaid;
	@JoinColumn(name = "YACIMIENTOCANTONID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = true)
	private Catalogo yacimientocantonid;
	@JoinColumn(name = "YACIMIENTOCIUDADID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = true)
	private Catalogo yacimientociudadid;
	private String yacimientodireccion;
	private String yacimientolatitud;
	private String yacimientolongitud;
	private String yacimientoaltura;
	private String yacimientocontenedor;
	private String yacimientomorfologia;
	private String yacimientoubicacion;
	@Lob
    @JsonIgnore
    @Column(name = "FOTOGRAFIAYACIMIENTO")
    private byte[]  fotografiayacimiento;
	private String yacimientofotografo;
	private String yacimientolugar;
	@Lob
	@JsonIgnore
    @Column(name = "FOTOGRAFIAYACIMIENTOPLANO")
    private byte[] fotoyacimientoplano;
	private String yacimientoarquitecto;
	private String yacimientoplanoslugar;
	private String variacionnombre;
	private String denominacionnativa;
	private String procedenciamaterial;
	private String terminonativomaterial;
	private String terminonativodecoracion;
	private String terminonativomanofactura;
	

	public Piezaarqueologicadetalle() {
	}

	public Piezaarqueologicadetalle(Long detalleid) {
		this.detalleid = detalleid;
	}

	public Piezaarqueologicadetalle(Long detalleid, String categoriamorfofuncional, String tipomaterial,
			String tecnicamanofactura, String tecnicadecorativa, String periodohistorico, String cultura, String cronologia,
			String fase, String alto, String largo, String ancho, String diametro, String espesor, String peso,
			String inscripciones, String descripcion, String elementosrelacionado) {
		this.detalleid = detalleid;
		this.categoriamorfofuncional = categoriamorfofuncional;
		this.tipomaterial = tipomaterial;
		this.tecnicamanofactura = tecnicamanofactura;
		this.tecnicadecorativa = tecnicadecorativa;
		this.periodohistorico = periodohistorico;
		this.cultura = cultura;
		this.cronologia = cronologia;
		this.fase = fase;
		this.alto = alto;
		this.largo = largo;
		this.ancho = ancho;
		this.diametro = diametro;
		this.espesor = espesor;
		this.peso = peso;
		this.inscripciones = inscripciones;
		this.descripcion = descripcion;
		this.elementosrelacionado = elementosrelacionado;
	}

	public Long getDetalleid() {
		return detalleid;
	}

	public void setDetalleid(Long detalleid) {
		this.detalleid = detalleid;
	}

	public String getCategoriamorfofuncional() {
		return categoriamorfofuncional;
	}

	public void setCategoriamorfofuncional(String categoriamorfofuncional) {
		this.categoriamorfofuncional = categoriamorfofuncional;
	}

	public String getTipomaterial() {
		return tipomaterial;
	}

	public void setTipomaterial(String tipomaterial) {
		this.tipomaterial = tipomaterial;
	}

	public String getTecnicamanofactura() {
		return tecnicamanofactura;
	}

	public void setTecnicamanofactura(String tecnicamanofactura) {
		this.tecnicamanofactura = tecnicamanofactura;
	}

	public String getTecnicadecorativa() {
		return tecnicadecorativa;
	}

	public void setTecnicadecorativa(String tecnicadecorativa) {
		this.tecnicadecorativa = tecnicadecorativa;
	}

	public String getPeriodohistorico() {
		return periodohistorico;
	}

	public void setPeriodohistorico(String periodohistorico) {
		this.periodohistorico = periodohistorico;
	}

	public String getCultura() {
		return cultura;
	}

	public void setCultura(String cultura) {
		this.cultura = cultura;
	}

	public String getCronologia() {
		return cronologia;
	}

	public void setCronologia(String cronologia) {
		this.cronologia = cronologia;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
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

	public String getEspesor() {
		return espesor;
	}

	public void setEspesor(String espesor) {
		this.espesor = espesor;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getElementosrelacionado() {
		return elementosrelacionado;
	}

	public void setElementosrelacionado(String elementosrelacionado) {
		this.elementosrelacionado = elementosrelacionado;
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

	public Piezamuseable getPiezamuseableid() {
		return piezamuseableid;
	}

	public void setPiezamuseableid(Piezamuseable piezamuseableid) {
		this.piezamuseableid = piezamuseableid;
	}

	
	public String getElaboracion() {
		return elaboracion;
	}

	public void setElaboracion(String elaboracion) {
		this.elaboracion = elaboracion;
	}

	public String getHerramientas() {
		return herramientas;
	}

	public void setHerramientas(String herramientas) {
		this.herramientas = herramientas;
	}

	public String getDecoracion() {
		return decoracion;
	}

	public void setDecoracion(String decoracion) {
		this.decoracion = decoracion;
	}

	public String getAlteracion() {
		return alteracion;
	}

	public void setAlteracion(String alteracion) {
		this.alteracion = alteracion;
	}

	public String getSimbolos() {
		return simbolos;
	}

	public void setSimbolos(String simbolos) {
		this.simbolos = simbolos;
	}

	public String getSemiotico() {
		return semiotico;
	}

	public void setSemiotico(String semiotico) {
		this.semiotico = semiotico;
	}

	public String getColoresusados() {
		return coloresusados;
	}

	public void setColoresusados(String coloresusados) {
		this.coloresusados = coloresusados;
	}

	public String getColoresprocedencia() {
		return coloresprocedencia;
	}

	public void setColoresprocedencia(String coloresprocedencia) {
		this.coloresprocedencia = coloresprocedencia;
	}

	public String getSemioticocolores() {
		return semioticocolores;
	}

	public void setSemioticocolores(String semioticocolores) {
		this.semioticocolores = semioticocolores;
	}

	public Boolean getEmpirica() {
		return empirica;
	}

	public void setEmpirica(Boolean empirica) {
		this.empirica = empirica;
	}

	public Boolean getArqueologia() {
		return arqueologia;
	}

	public void setArqueologia(Boolean arqueologia) {
		this.arqueologia = arqueologia;
	}

	public String getExtraccionobservacion() {
		return extraccionobservacion;
	}

	public void setExtraccionobservacion(String extraccionobservacion) {
		this.extraccionobservacion = extraccionobservacion;
	}

	public String getExtraccionresponsable() {
		return extraccionresponsable;
	}

	public void setExtraccionresponsable(String extraccionresponsable) {
		this.extraccionresponsable = extraccionresponsable;
	}

	public String getExtraccionarqueologo() {
		return extraccionarqueologo;
	}

	public void setExtraccionarqueologo(String extraccionarqueologo) {
		this.extraccionarqueologo = extraccionarqueologo;
	}

	public String getBiografiaarqueologo() {
		return biografiaarqueologo;
	}

	public void setBiografiaarqueologo(String biografiaarqueologo) {
		this.biografiaarqueologo = biografiaarqueologo;
	}

	public String getPublicacionarqueologo() {
		return publicacionarqueologo;
	}

	public void setPublicacionarqueologo(String publicacionarqueologo) {
		this.publicacionarqueologo = publicacionarqueologo;
	}

	public String getArqueologouniversidad() {
		return arqueologouniversidad;
	}

	public void setArqueologouniversidad(String arqueologouniversidad) {
		this.arqueologouniversidad = arqueologouniversidad;
	}

	public String getUsosocial() {
		return usosocial;
	}

	public void setUsosocial(String usosocial) {
		this.usosocial = usosocial;
	}

	public String getUsoprimario() {
		return usoprimario;
	}

	public void setUsoprimario(String usoprimario) {
		this.usoprimario = usoprimario;
	}

	public String getUsoalternativo() {
		return usoalternativo;
	}

	public void setUsoalternativo(String usoalternativo) {
		this.usoalternativo = usoalternativo;
	}

	public String getUsorestricciones() {
		return usorestricciones;
	}

	public void setUsorestricciones(String usorestricciones) {
		this.usorestricciones = usorestricciones;
	}

	public String getCreencias() {
		return creencias;
	}

	public void setCreencias(String creencias) {
		this.creencias = creencias;
	}

	public String getPeculiaridades() {
		return peculiaridades;
	}

	public void setPeculiaridades(String peculiaridades) {
		this.peculiaridades = peculiaridades;
	}

	public String getPertenencia() {
		return pertenencia;
	}

	public void setPertenencia(String pertenencia) {
		this.pertenencia = pertenencia;
	}

	public String getUsocuando() {
		return usocuando;
	}

	public void setUsocuando(String usocuando) {
		this.usocuando = usocuando;
	}

	public String getUsodonde() {
		return usodonde;
	}

	public void setUsodonde(String usodonde) {
		this.usodonde = usodonde;
	}

	public String getUsocolocacion() {
		return usocolocacion;
	}

	public void setUsocolocacion(String usocolocacion) {
		this.usocolocacion = usocolocacion;
	}

	public String getVida() {
		return vida;
	}

	public void setVida(String vida) {
		this.vida = vida;
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

	public byte[] getFotografiayacimiento() {
		return fotografiayacimiento;
	}

	public void setFotografiayacimiento(byte[] fotografiayacimiento) {
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

	public byte[] getFotoyacimientoplano() {
		return fotoyacimientoplano;
	}

	public void setFotoyacimientoplano(byte[] fotoyacimientoplano) {
		this.fotoyacimientoplano = fotoyacimientoplano;
	}

	public String getYacimientoarquitecto() {
		return yacimientoarquitecto;
	}

	public void setYacimientoarquitecto(String yacimientoarquitecto) {
		this.yacimientoarquitecto = yacimientoarquitecto;
	}

	public String getYacimientoplanoslugar() {
		return yacimientoplanoslugar;
	}

	public void setYacimientoplanoslugar(String yacimientoplanoslugar) {
		this.yacimientoplanoslugar = yacimientoplanoslugar;
	}
	
	

	public String getVariacionnombre() {
		return variacionnombre;
	}

	public void setVariacionnombre(String variacionnombre) {
		this.variacionnombre = variacionnombre;
	}

	public String getDenominacionnativa() {
		return denominacionnativa;
	}

	public void setDenominacionnativa(String denominacionnativa) {
		this.denominacionnativa = denominacionnativa;
	}

	public String getProcedenciamaterial() {
		return procedenciamaterial;
	}

	public void setProcedenciamaterial(String procedenciamaterial) {
		this.procedenciamaterial = procedenciamaterial;
	}

	public String getTerminonativomaterial() {
		return terminonativomaterial;
	}

	public void setTerminonativomaterial(String terminonativomaterial) {
		this.terminonativomaterial = terminonativomaterial;
	}

	public String getTerminonativodecoracion() {
		return terminonativodecoracion;
	}

	public void setTerminonativodecoracion(String terminonativodecoracion) {
		this.terminonativodecoracion = terminonativodecoracion;
	}

	public String getTerminonativomanofactura() {
		return terminonativomanofactura;
	}

	public void setTerminonativomanofactura(String terminonativomanofactura) {
		this.terminonativomanofactura = terminonativomanofactura;
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
		if (!(object instanceof Piezaarqueologicadetalle)) {
			return false;
		}
		Piezaarqueologicadetalle other = (Piezaarqueologicadetalle) object;
		if ((this.detalleid == null && other.detalleid != null)
				|| (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "uce.edu.ec.muce.modelos.Piezaarqueologicadetalle[ detalleid=" + detalleid + " ]";
	}

}
