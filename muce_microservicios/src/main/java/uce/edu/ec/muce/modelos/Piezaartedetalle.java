package uce.edu.ec.muce.modelos;

import java.io.Serializable;

import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "ARTES", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL )
public class Piezaartedetalle implements Serializable{

	private static final long serialVersionUID = 105602378954888820L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZARTEDETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezaartedetalle_seq", allocationSize = 1, name = "PIEZARTEDETALLE_SEQ")
    @Column(name = "art_id", precision = 0, scale = -127)
    private Long detalleid;
	
	
	@Size(max = 150)
    @Column(name = "art_tipoBien", length = 150)
	private String tipoBien;
	
	@Size(max = 150)
    @Column(name = "art_titulo", length = 150)
	private String titulo;
	
	@Size(max = 150)
    @Column(name = "art_tecnica", length = 150)
	private String tecnica;
	
	@Size(max = 150)
    @Column(name = "art_autor", length = 150)
	private String autor;
	
	@Size(max = 150)
    @Column(name = "art_epoca", length = 150)
	private String epoca;
	
	@Size(max = 150)
    @Column(name = "art_etapa", length = 150)
	private String etapa;
	
	@Size(max = 150)
    @Column(name = "art_collecion", length = 150)
	private String collecion;
	
	@Size(max = 150)
    @Column(name = "art_fondo", length = 150)
	private String fondo;
	
	@Size(max = 150)
    @Column(name = "art_alto", length = 150)
	private String alto;
	
	@Size(max = 150)
    @Column(name = "art_largo", length = 150)
	private String largo;
	
	@Size(max = 150)
    @Column(name = "art_ancho", length = 150)
	private String ancho;
	
	@Size(max = 150)
    @Column(name = "art_diametro", length = 150)
	private String diametro;
	
	@Size(max = 150)
    @Column(name = "art_peso", length = 150)
	private String peso;
	
	@Size(max = 150)
    @Column(name = "art_sigloanio", length = 150)
	private String sigloanio;
	
	@Size(max = 150)
    @Column(name = "art_inscripciones", length = 150)
	private String inscripciones;
	
	@Size(max = 150)
    @Column(name = "art_elementoRelacionados", length = 150)
	private String elementoRelacionados;
	
	@Size(max = 600)
    @Column(name = "art_descripcion", length = 600)alto
	private String descripcion;
	
	@JoinColumn(name = "msb_id", referencedColumnName = "msb_id")    
    @ManyToOne(cascade = {CascadeType.ALL})
    private Piezamuseable piezamuseableid;
	
	//catalogación
	
    @Size(max = 3000)
    @Column(name = "art_rasgo_estetico", length = 3000)
	private String rasgoEstetico;
	
    @Size(max = 3000)
    @Column(name = "art_calidad_estetica", length = 3000)
	private String calidadEstetica;
	
    @Size(max = 3000)
    @Column(name = "art_originalidad", length = 3000)
	private String originalidad;
	
    @Size(max = 3000)
    @Column(name = "art_historica_artistica", length = 3000)
	private String historicaArtistica;
	
    @Size(max = 3000)
    @Column(name = "art_comercial", length = 3000)
	private String comercial;
	
    @Size(max = 3000)
    @Column(name = "art_comparacion", length = 3000)
	private String comparacion;
	
    @Size(max = 3000)
    @Column(name = "art_biografia", length = 3000)
	private String biografia;

    @Size(max = 3000)
    @Column(name = "art_formacion", length = 3000)
	private String formacion;
	
    @Size(max = 1500)
    @Column(name = "art_movimiento_artistico", length = 1500)
	private String movimientoArtistico;
	
    @Size(max = 3000)
    @Column(name = "art_exposicion", length = 3000)
	private String exposicion;
	
    @Size(max = 2000)
    @Column(name = "art_premios", length = 2000)
	private String premios;
	
    @Size(max = 2000)
    @Column(name = "art_colleccionista", length = 2000)
	private String colleccionista;
	
    @Size(max = 3000)
    @Column(name = "art_contexto_socio", length = 3000)
	private String contextoSocio;
	
    @Size(max = 3000)
    @Column(name = "art_contexto_historico", length = 3000)
	private String contextoHistorico;
	
    @Size(max = 3000)
    @Column(name = "art_contexto_situacion", length = 3000)
	private String contextoSituacion;
	
    @Size(max = 3000)
    @Column(name = "art_contexto_espacial", length = 3000)
	private String contextoEspacial;
	
    @Size(max = 3000)
    @Column(name = "art_contexto_temporal", length = 3000)
	private String contextoTemporal;
	
    @Size(max = 3000)
    @Column(name = "art_simbolo_disenio", length = 3000)
	private String simboloDisenio;
	
    @Size(max = 3000)
    @Column(name = "art_semiotico", length = 3000)
	private String semiotico;
	
    @Size(max = 3000)
    @Column(name = "art_color_usado", length = 3000)
	private String colorUsado;
	
    @Size(max = 3000)
    @Column(name = "art_color_procedencia", length = 3000)
	private String colorProcedencia;
	
    @Size(max = 3000)
    @Column(name = "art_analisis_semiotico", length = 3000)
	private String analisisSemiotico;
	
    @Size(max = 3000)
    @Column(name = "art_materia_usada", length = 3000)
	private String materiaUsada;
	
    @Size(max = 3000)
    @Column(name = "art_labo_usada", length = 3000)
	private String laboUsada;
	
    @Size(max = 3000)
    @Column(name = "art_docente_usada", length = 3000)
	private String docenteUsada;
	
    @Size(max = 3000)
    @Column(name = "art_aporte_obra", length = 3000)
	private String aporteObra;
	
    @Size(max = 3000)
    @Column(name = "art_observacion_usada", length = 3000)
	private String observacionUsada;
    
    @Size(max = 3000)
    @Column(name = "art_tesauro", length = 3000)
	private String tesauro;
    
    @Size(max = 600)
    @Column(name = "art_palabras_claves", length = 600)
	private String palabrasClaves;
    
    public Long getDetalleid() {
		return detalleid;
	}

	public void setDetalleid(Long detalleid) {
		this.detalleid = detalleid;
	}

	public String getTipoBien() {
		return tipoBien;
	}

	public void setTipoBien(String tipoBien) {
		this.tipoBien = tipoBien;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
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

	public String getSigloanio() {
		return sigloanio;
	}

	public void setSigloanio(String sigloanio) {
		this.sigloanio = sigloanio;
	}

	public String getInscripciones() {
		return inscripciones;
	}

	public void setInscripciones(String inscripciones) {
		this.inscripciones = inscripciones;
	}

	public String getElementoRelacionados() {
		return elementoRelacionados;
	}

	public void setElementoRelacionados(String elementoRelacionados) {
		this.elementoRelacionados = elementoRelacionados;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Piezamuseable getPiezamuseableid() {
		return piezamuseableid;
	}

	public void setPiezamuseableid(Piezamuseable piezamuseableid) {
		this.piezamuseableid = piezamuseableid;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getRasgoEstetico() {
		return rasgoEstetico;
	}

	public void setRasgoEstetico(String rasgoEstetico) {
		this.rasgoEstetico = rasgoEstetico;
	}

	public String getCalidadEstetica() {
		return calidadEstetica;
	}

	public void setCalidadEstetica(String calidadEstetica) {
		this.calidadEstetica = calidadEstetica;
	}

	public String getOriginalidad() {
		return originalidad;
	}

	public void setOriginalidad(String originalidad) {
		this.originalidad = originalidad;
	}

	public String getHistoricaArtistica() {
		return historicaArtistica;
	}

	public void setHistoricaArtistica(String historicaArtistica) {
		this.historicaArtistica = historicaArtistica;
	}

	public String getComercial() {
		return comercial;
	}

	public void setComercial(String comercial) {
		this.comercial = comercial;
	}

	public String getComparacion() {
		return comparacion;
	}

	public void setComparacion(String comparacion) {
		this.comparacion = comparacion;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	public String getMovimientoArtistico() {
		return movimientoArtistico;
	}

	public void setMovimientoArtistico(String movimientoArtistico) {
		this.movimientoArtistico = movimientoArtistico;
	}

	public String getExposicion() {
		return exposicion;
	}

	public void setExposicion(String exposicion) {
		this.exposicion = exposicion;
	}

	public String getPremios() {
		return premios;
	}

	public void setPremios(String premios) {
		this.premios = premios;
	}

	public String getColleccionista() {
		return colleccionista;
	}

	public void setColleccionista(String colleccionista) {
		this.colleccionista = colleccionista;
	}

	public String getContextoSocio() {
		return contextoSocio;
	}

	public void setContextoSocio(String contextoSocio) {
		this.contextoSocio = contextoSocio;
	}

	public String getContextoHistorico() {
		return contextoHistorico;
	}

	public void setContextoHistorico(String contextoHistorico) {
		this.contextoHistorico = contextoHistorico;
	}

	public String getContextoSituacion() {
		return contextoSituacion;
	}

	public void setContextoSituacion(String contextoSituacion) {
		this.contextoSituacion = contextoSituacion;
	}

	public String getContextoEspacial() {
		return contextoEspacial;
	}

	public void setContextoEspacial(String contextoEspacial) {
		this.contextoEspacial = contextoEspacial;
	}

	public String getContextoTemporal() {
		return contextoTemporal;
	}

	public void setContextoTemporal(String contextoTemporal) {
		this.contextoTemporal = contextoTemporal;
	}

	public String getSimboloDisenio() {
		return simboloDisenio;
	}

	public void setSimboloDisenio(String simboloDisenio) {
		this.simboloDisenio = simboloDisenio;
	}

	public String getSemiotico() {
		return semiotico;
	}

	public void setSemiotico(String semiotico) {
		this.semiotico = semiotico;
	}

	public String getColorUsado() {
		return colorUsado;
	}

	public void setColorUsado(String colorUsado) {
		this.colorUsado = colorUsado;
	}

	public String getColorProcedencia() {
		return colorProcedencia;
	}

	public void setColorProcedencia(String colorProcedencia) {
		this.colorProcedencia = colorProcedencia;
	}

	public String getAnalisisSemiotico() {
		return analisisSemiotico;
	}

	public void setAnalisisSemiotico(String analisisSemiotico) {
		this.analisisSemiotico = analisisSemiotico;
	}

	public String getMateriaUsada() {
		return materiaUsada;
	}

	public void setMateriaUsada(String materiaUsada) {
		this.materiaUsada = materiaUsada;
	}

	public String getLaboUsada() {
		return laboUsada;
	}

	public void setLaboUsada(String laboUsada) {
		this.laboUsada = laboUsada;
	}

	public String getDocenteUsada() {
		return docenteUsada;
	}

	public void setDocenteUsada(String docenteUsada) {
		this.docenteUsada = docenteUsada;
	}

	public String getAporteObra() {
		return aporteObra;
	}

	public void setAporteObra(String aporteObra) {
		this.aporteObra = aporteObra;
	}

	public String getObservacionUsada() {
		return observacionUsada;
	}

	public void setObservacionUsada(String observacionUsada) {
		this.observacionUsada = observacionUsada;
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

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getCollecion() {
		return collecion;
	}

	public void setCollecion(String collecion) {
		this.collecion = collecion;
	}

	public String getFondo() {
		return fondo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}
}
