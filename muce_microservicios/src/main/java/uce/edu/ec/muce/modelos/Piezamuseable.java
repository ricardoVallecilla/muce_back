/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "MUSEABLE", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Piezamuseable implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAMUSEABLE_SEQ")
	@SequenceGenerator(sequenceName = "museo_seq", allocationSize = 1, name = "PIEZAMUSEABLE_SEQ")

	@Column(name = "msb_id", precision = 0, scale = -127)
	private Long piezamuseableid;

	@Size(min = 1, max = 100)
	@Column(name = "msb_codigo", length = 100)
	private String codigomuseo;

	@Size(min = 1, max = 600)
	@Column(name = "msb_contenedor", length = 600)
	private String contenedor;

	@Size(min = 1, max = 600)
	@Column(name = "msb_direccion", length = 600)
	private String direccion;

	@Size(min = 1, max = 600)
	@Column(name = "msb_email", length = 600)
	private String direccionelectronica;

	@Size(min = 1, max = 600)
	@Column(name = "msb_numero", length = 600)
	private String numero;

	@Size(min = 1, max = 600)
	@Column(name = "msb_telefono", length = 600)
	private String telefono;

	@Size(min = 1, max = 600)
	@Column(name = "msb_disposicion_contenedor", length = 600)
	private String disposicioncontenedor;

	@Size(min = 1, max = 600)
	@Column(name = "msb_responsable", length = 600)
	private String responsable;

	@Size(min = 1, max = 15)
	@Column(name = "msb_responsable_ci", length = 15)
	private String responsableci;
	@Size(max = 600)
	@Column(name = "msb_elementos_extranos", length = 600)
	private String elementosextranos;

	@Size(min = 1, max = 600)
	@Column(name = "msb_observaciones", length = 600)
	private String observaciones;

	@Size(min = 1, max = 350)
	@Column(name = "msb_historia_itinerancia", length = 350)
	private String historiaitinerancia;

	@Size(min = 1, max = 600)
	@Column(name = "msb_entidad_investigadora", length = 600)
	private String entidadinvestigadora;

	@Size(min = 1, max = 600)
	@Column(name = "msb_inventariado_por", length = 600)
	private String inventariadopor;

	@Size(min = 1, max = 600)
	@Column(name = "msb_revisado_por", length = 600)
	private String revisadopor;

	@Size(min = 1, max = 600)
	@Column(name = "msb_aprobado_por", length = 600)
	private String aprobadopor;

	@Column(name = "msb_fecha_inventario")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechainventario;

	@Column(name = "msb_fecha_registro_inventario")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharegistroinventario;
	
	@Column(name = "msb_fecha_registro_catalogado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharegistrocatalogacion;
	
	@Column(name = "msb_catalogado")
	private Boolean catalogado;

	@Column(name = "msb_fecha_revision")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharevision;

	@Column(name = "msb_fecha_aprobacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaaprobacion;

	@Size(min = 1, max = 600)
	@Column(name = "msb_fotografiado_por", length = 600)
	private String registrofotograficopor;

	@Size(max = 600)
	@Column(name = "aud_usuario_registro_id", length = 600)
	private String usuarioregistroid;

	@Column(name = "aud_fecha_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharegistro;

	@Column(name = "msb_proceso_juridico")
	private Boolean procesojuridico;

	@JoinColumn(name = "msb_estado_integridad", referencedColumnName = "ctl_id")
	@ManyToOne(optional = false)
	private Catalogo estadointegridad;

	@Column(name = "msb_humedad")
	private Boolean humedad;

	@Column(name = "msb_camaras")
	private Boolean camaras;

	@JoinColumn(name = "msb_estado_conservacion_id", referencedColumnName = "ctl_id")
	@ManyToOne(optional = false)
	private Catalogo estadoconservacionid;

	@JoinColumn(name = "msb_ciudad", referencedColumnName = "ctl_id")
	@ManyToOne(optional = false)
	private Catalogo ciudadid;

	@JoinColumn(name = "msb_canton", referencedColumnName = "ctl_id")
	@ManyToOne(optional = false)
	private Catalogo cantonid;

	@JoinColumn(name = "msb_provincia", referencedColumnName = "ctl_id")
	@ManyToOne(optional = false)
	private Catalogo provinciaid;

	@JoinColumn(name = "msb_provincia_bienes", referencedColumnName = "ctl_id")
	@ManyToOne(optional = true)
	private Catalogo provinciabienesid;

	@JoinColumn(name = "itm_id", referencedColumnName = "itm_id")
	@OneToOne
	private Item itemid;

	@Column(name = "msb_intervenciones_inadecuadas")
	private Boolean intervencionesinadecuadas;

	@Column(name = "msb_temperatura")
	private Boolean temperatura;

	@Column(name = "msb_guardias")
	private Boolean guardias;

	@Column(name = "msb_luz")
	private Boolean luz;

	@Column(name = "msb_sensores")
	private Boolean sensores;

	@Column(name = "msb_alarmas")
	private Boolean alarmas;

	@Column(name = "msb_electrico_defectuoso")
	private Boolean sistemaelectricodefectuoso;

	@Column(name = "msb_extintores")
	private Boolean extintores;

	@Column(name = "msb_montaje")
	private Boolean montaje;

	@Column(name = "msb_uso_cuando", length = 3000)
	private String usocuando;

	@Column(name = "msb_uso_donde", length = 3000)
	private String usodonde;

	@Column(name = "msb_uso_como", length = 3000)
	private String usocomo;

	@Column(name = "msb_uso_finalidad", length = 3000)
	private String usofinalidad;

	@Column(name = "msb_uso_quien", length = 3000)
	private String usoquien;

	@Column(name = "msb_uso_manejo", length = 3000)
	private String usomanejo;

	@Column(name = "msb_materias", length = 3000)
	private String materias;

	@Column(name = "msb_laboratorios", length = 3000)
	private String laboratorios;

	@Column(name = "msb_docentes", length = 3000)
	private String docentes;

	@Column(name = "msb_aporte", length = 3000)
	private String aporte;

	@Column(name = "msb_observaciones_academico", length = 3000)
	private String observacionesacademico;

	@Column(name = "msb_bibliografias", length = 3000)
	private String bibliografias;

	@Column(name = "msb_links", length = 3000)
	private String links;

	@Column(name = "msb_fotografo", length = 600)
	private String fotografo;

	@Column(name = "msb_fotografia_lugar", length = 600)
	private String fotografialugar;

	@Column(name = "msb_oferente", length = 200)
	private String oferente;

	@Column(name = "msb_precio_adquicicion", length = 200)
	private String precioadquicicion;

	@Column(name = "msb_tasacion", length = 200)
	private String tasacion;

	@Column(name = "msb_seguro", length = 200)
	private String seguro;

	@Column(name = "msb_ruta_fotografia")
	private String fotografia;

	@Column(name = "msb_fotografia_dos")
	private String fotografiados;

	@Column(name = "msb_fotografia_tres")
	private String fotografiatres;

	@Column(name = "msb_fotografia_cuatro")
	private String fotografiacuatro;
	
	@Column(name = "msb_restauracion_uno")
	private String restauracionuno;
	
	@Column(name = "msb_restauracion_dos")
	private String restauraciondos;
	
	@Column(name = "msb_restauracion_tres")
	private String restauraciontres;
	
	@Column(name = "msb_restauracion_cuatro")
	private String restauracioncuatro;

	public Piezamuseable() {
	}

	public Piezamuseable(Long piezamuseableid) {
		this.piezamuseableid = piezamuseableid;
	}

	public Piezamuseable(Long piezamuseableid, String codigomuseo, String contenedor, String direccion,
			String direccionelectronica, String numero, String telefono, String disposicioncontenedor,
			String responsable, String responsableci, String observaciones, String historiaitinerancia,
			String entidadinvestigadora, String inventariadopor, String revisadopor, String aprobadopor,
			Date fechainventario, Date fecharevision, Date fechaaprobacion, String registrofotograficopor) {
		this.piezamuseableid = piezamuseableid;
		this.codigomuseo = codigomuseo;
		this.contenedor = contenedor;
		this.direccion = direccion;
		this.direccionelectronica = direccionelectronica;
		this.numero = numero;
		this.telefono = telefono;
		this.disposicioncontenedor = disposicioncontenedor;
		this.responsable = responsable;
		this.responsableci = responsableci;
		this.observaciones = observaciones;
		this.historiaitinerancia = historiaitinerancia;
		this.entidadinvestigadora = entidadinvestigadora;
		this.inventariadopor = inventariadopor;
		this.revisadopor = revisadopor;
		this.aprobadopor = aprobadopor;
		this.fechainventario = fechainventario;
		this.fecharevision = fecharevision;
		this.fechaaprobacion = fechaaprobacion;
		this.registrofotograficopor = registrofotograficopor;
	}

	public Long getPiezamuseableid() {
		return piezamuseableid;
	}

	public void setPiezamuseableid(Long piezamuseableid) {
		this.piezamuseableid = piezamuseableid;
	}

	public String getCodigomuseo() {
		return codigomuseo;
	}

	public void setCodigomuseo(String codigomuseo) {
		this.codigomuseo = codigomuseo;
	}

	public String getContenedor() {
		return contenedor;
	}

	public void setContenedor(String contenedor) {
		this.contenedor = contenedor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccionelectronica() {
		return direccionelectronica;
	}

	public void setDireccionelectronica(String direccionelectronica) {
		this.direccionelectronica = direccionelectronica;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDisposicioncontenedor() {
		return disposicioncontenedor;
	}

	public void setDisposicioncontenedor(String disposicioncontenedor) {
		this.disposicioncontenedor = disposicioncontenedor;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getResponsableci() {
		return responsableci;
	}

	public void setResponsableci(String responsableci) {
		this.responsableci = responsableci;
	}

	public String getElementosextranos() {
		return elementosextranos;
	}

	public void setElementosextranos(String elementosextranos) {
		this.elementosextranos = elementosextranos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getHistoriaitinerancia() {
		return historiaitinerancia;
	}

	public void setHistoriaitinerancia(String historiaitinerancia) {
		this.historiaitinerancia = historiaitinerancia;
	}

	public String getEntidadinvestigadora() {
		return entidadinvestigadora;
	}

	public void setEntidadinvestigadora(String entidadinvestigadora) {
		this.entidadinvestigadora = entidadinvestigadora;
	}

	public String getInventariadopor() {
		return inventariadopor;
	}

	public void setInventariadopor(String inventariadopor) {
		this.inventariadopor = inventariadopor;
	}

	public String getRevisadopor() {
		return revisadopor;
	}

	public void setRevisadopor(String revisadopor) {
		this.revisadopor = revisadopor;
	}

	public String getAprobadopor() {
		return aprobadopor;
	}

	public void setAprobadopor(String aprobadopor) {
		this.aprobadopor = aprobadopor;
	}

	public Date getFechainventario() {
		return fechainventario;
	}

	public void setFechainventario(Date fechainventario) {
		this.fechainventario = fechainventario;
	}

	public Date getFecharevision() {
		return fecharevision;
	}

	public void setFecharevision(Date fecharevision) {
		this.fecharevision = fecharevision;
	}

	public Date getFechaaprobacion() {
		return fechaaprobacion;
	}

	public void setFechaaprobacion(Date fechaaprobacion) {
		this.fechaaprobacion = fechaaprobacion;
	}

	public String getRegistrofotograficopor() {
		return registrofotograficopor;
	}

	public void setRegistrofotograficopor(String registrofotograficopor) {
		this.registrofotograficopor = registrofotograficopor;
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

	public Boolean getProcesojuridico() {
		return procesojuridico;
	}

	public void setProcesojuridico(Boolean procesojuridico) {
		this.procesojuridico = procesojuridico;
	}

	public Catalogo getEstadointegridad() {
		return estadointegridad;
	}

	public void setEstadointegridad(Catalogo estadointegridad) {
		this.estadointegridad = estadointegridad;
	}

	public Boolean getHumedad() {
		return humedad;
	}

	public void setHumedad(Boolean humedad) {
		this.humedad = humedad;
	}

	public Boolean getCamaras() {
		return camaras;
	}

	public void setCamaras(Boolean camaras) {
		this.camaras = camaras;
	}

	public Boolean getIntervencionesinadecuadas() {
		return intervencionesinadecuadas;
	}

	public void setIntervencionesinadecuadas(Boolean intervencionesinadecuadas) {
		this.intervencionesinadecuadas = intervencionesinadecuadas;
	}

	public Boolean getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Boolean temperatura) {
		this.temperatura = temperatura;
	}

	public Boolean getGuardias() {
		return guardias;
	}

	public void setGuardias(Boolean guardias) {
		this.guardias = guardias;
	}

	public Boolean getLuz() {
		return luz;
	}

	public void setLuz(Boolean luz) {
		this.luz = luz;
	}

	public Boolean getSensores() {
		return sensores;
	}

	public void setSensores(Boolean sensores) {
		this.sensores = sensores;
	}

	public Boolean getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(Boolean alarmas) {
		this.alarmas = alarmas;
	}

	public Boolean getSistemaelectricodefectuoso() {
		return sistemaelectricodefectuoso;
	}

	public void setSistemaelectricodefectuoso(Boolean sistemaelectricodefectuoso) {
		this.sistemaelectricodefectuoso = sistemaelectricodefectuoso;
	}

	public Boolean getExtintores() {
		return extintores;
	}

	public void setExtintores(Boolean extintores) {
		this.extintores = extintores;
	}

	public Boolean getMontaje() {
		return montaje;
	}

	public void setMontaje(Boolean montaje) {
		this.montaje = montaje;
	}

	public Catalogo getEstadoconservacionid() {
		return estadoconservacionid;
	}

	public void setEstadoconservacionid(Catalogo estadoconservacionid) {
		this.estadoconservacionid = estadoconservacionid;
	}

	public Catalogo getCiudadid() {
		return ciudadid;
	}

	public void setCiudadid(Catalogo ciudadid) {
		this.ciudadid = ciudadid;
	}

	public Catalogo getCantonid() {
		return cantonid;
	}

	public void setCantonid(Catalogo cantonid) {
		this.cantonid = cantonid;
	}

	public Catalogo getProvinciaid() {
		return provinciaid;
	}

	public void setProvinciaid(Catalogo provinciaid) {
		this.provinciaid = provinciaid;
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

	public String getUsocomo() {
		return usocomo;
	}

	public void setUsocomo(String usocomo) {
		this.usocomo = usocomo;
	}

	public String getUsofinalidad() {
		return usofinalidad;
	}

	public void setUsofinalidad(String usofinalidad) {
		this.usofinalidad = usofinalidad;
	}

	public String getUsoquien() {
		return usoquien;
	}

	public void setUsoquien(String usoquien) {
		this.usoquien = usoquien;
	}

	public String getUsomanejo() {
		return usomanejo;
	}

	public void setUsomanejo(String usomanejo) {
		this.usomanejo = usomanejo;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	public String getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(String laboratorios) {
		this.laboratorios = laboratorios;
	}

	public String getDocentes() {
		return docentes;
	}

	public void setDocentes(String docentes) {
		this.docentes = docentes;
	}

	public String getAporte() {
		return aporte;
	}

	public void setAporte(String aporte) {
		this.aporte = aporte;
	}

	public String getObservacionesacademico() {
		return observacionesacademico;
	}

	public void setObservacionesacademico(String observacionesacademico) {
		this.observacionesacademico = observacionesacademico;
	}

	public String getBibliografias() {
		return bibliografias;
	}

	public void setBibliografias(String bibliografias) {
		this.bibliografias = bibliografias;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public Item getItemid() {
		return itemid;
	}

	public void setItemid(Item itemid) {
		this.itemid = itemid;
	}

	public String getFotografo() {
		return fotografo;
	}

	public void setFotografo(String fotografo) {
		this.fotografo = fotografo;
	}

	public String getFotografialugar() {
		return fotografialugar;
	}

	public void setFotografialugar(String fotografialugar) {
		this.fotografialugar = fotografialugar;
	}

	public Date getFecharegistroinventario() {
		return fecharegistroinventario;
	}

	public void setFecharegistroinventario(Date fecharegistroinventario) {
		this.fecharegistroinventario = fecharegistroinventario;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public String getFotografiados() {
		return fotografiados;
	}

	public void setFotografiados(String fotografiados) {
		this.fotografiados = fotografiados;
	}

	public String getFotografiatres() {
		return fotografiatres;
	}

	public void setFotografiatres(String fotografiatres) {
		this.fotografiatres = fotografiatres;
	}

	public String getFotografiacuatro() {
		return fotografiacuatro;
	}

	public void setFotografiacuatro(String fotografiacuatro) {
		this.fotografiacuatro = fotografiacuatro;
	}

	public Catalogo getProvinciabienesid() {
		return provinciabienesid;
	}

	public void setProvinciabienesid(Catalogo provinciabienesid) {
		this.provinciabienesid = provinciabienesid;
	}

	public String getOferente() {
		return oferente;
	}

	public void setOferente(String oferente) {
		this.oferente = oferente;
	}

	public String getPrecioadquicicion() {
		return precioadquicicion;
	}

	public void setPrecioadquicicion(String precioadquicicion) {
		this.precioadquicicion = precioadquicicion;
	}

	public String getTasacion() {
		return tasacion;
	}

	public void setTasacion(String tasacion) {
		this.tasacion = tasacion;
	}

	public String getSeguro() {
		return seguro;
	}

	
	public Date getFecharegistrocatalogacion() {
		return fecharegistrocatalogacion;
	}

	public void setFecharegistrocatalogacion(Date fecharegistrocatalogacion) {
		this.fecharegistrocatalogacion = fecharegistrocatalogacion;
	}

	public Boolean getCatalogado() {
		return catalogado;
	}

	public void setCatalogado(Boolean catalogado) {
		this.catalogado = catalogado;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public String getRestauracionuno() {
		return restauracionuno;
	}

	public void setRestauracionuno(String restauracionuno) {
		this.restauracionuno = restauracionuno;
	}

	public String getRestauraciondos() {
		return restauraciondos;
	}

	public void setRestauraciondos(String restauraciondos) {
		this.restauraciondos = restauraciondos;
	}

	public String getRestauraciontres() {
		return restauraciontres;
	}

	public void setRestauraciontres(String restauraciontres) {
		this.restauraciontres = restauraciontres;
	}

	public String getRestauracioncuatro() {
		return restauracioncuatro;
	}

	public void setRestauracioncuatro(String restauracioncuatro) {
		this.restauracioncuatro = restauracioncuatro;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (piezamuseableid != null ? piezamuseableid.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Piezamuseable)) {
			return false;
		}
		Piezamuseable other = (Piezamuseable) object;
		if ((this.piezamuseableid == null && other.piezamuseableid != null)
				|| (this.piezamuseableid != null && !this.piezamuseableid.equals(other.piezamuseableid))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "uce.edu.ec.muce.modelos.Piezamuseable[ piezamuseableid=" + piezamuseableid + " ]";
	}

}
