/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PIEZAARQUEOLOGICADETALLE", catalog = "", schema = "MUCE")
public class Piezaarqueologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAARQUEOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezaarqueologicadetalle_seq", allocationSize = 1, name = "PIEZAARQUEOLOGICADETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETALLEID", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATEGORIAMORFOFUNCIONAL", nullable = false)
    private Long categoriamorfofuncional;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPOMATERIAL", nullable = false)
    private Long tipomaterial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TECNICAMANOFACTURA", nullable = false)
    private Long tecnicamanofactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TECNICADECORATIVA", nullable = false)
    private Long tecnicadecorativa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERIODOHISTORICO", nullable = false)
    private Long periodohistorico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "CULTURA", nullable = false, length = 150)
    private String cultura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "CRONOLOGIA", nullable = false, length = 150)
    private String cronologia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "FASE", nullable = false, length = 150)
    private String fase;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ALTO", nullable = false, length = 10)
    private String alto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LARGO", nullable = false, length = 10)
    private String largo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ANCHO", nullable = false, length = 10)
    private String ancho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DIAMETRO", nullable = false, length = 10)
    private String diametro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ESPESOR", nullable = false, length = 10)
    private String espesor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PESO", nullable = false, length = 10)
    private String peso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "INSCRIPCIONES", nullable = false, length = 150)
    private String inscripciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "DESCRIPCION", nullable = false, length = 256)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ELEMENTOSRELACIONADO", nullable = false, length = 256)
    private String elementosrelacionado;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    @JoinColumn(name = "METERIALPRIMARIOID", referencedColumnName = "CATALOGOID", nullable = false)
    @ManyToOne(optional = false)
    private Catalogo meterialprimarioid;
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID", nullable = false)
    @ManyToOne(optional = false)
    private Piezamuseable piezamuseableid;

    public Piezaarqueologicadetalle() {
    }

    public Piezaarqueologicadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezaarqueologicadetalle(Long detalleid, Long categoriamorfofuncional, Long tipomaterial, Long tecnicamanofactura, Long tecnicadecorativa, Long periodohistorico, String cultura, String cronologia, String fase, String alto, String largo, String ancho, String diametro, String espesor, String peso, String inscripciones, String descripcion, String elementosrelacionado) {
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

    public Long getCategoriamorfofuncional() {
        return categoriamorfofuncional;
    }

    public void setCategoriamorfofuncional(Long categoriamorfofuncional) {
        this.categoriamorfofuncional = categoriamorfofuncional;
    }

    public Long getTipomaterial() {
        return tipomaterial;
    }

    public void setTipomaterial(Long tipomaterial) {
        this.tipomaterial = tipomaterial;
    }

    public Long getTecnicamanofactura() {
        return tecnicamanofactura;
    }

    public void setTecnicamanofactura(Long tecnicamanofactura) {
        this.tecnicamanofactura = tecnicamanofactura;
    }

    public Long getTecnicadecorativa() {
        return tecnicadecorativa;
    }

    public void setTecnicadecorativa(Long tecnicadecorativa) {
        this.tecnicadecorativa = tecnicadecorativa;
    }

    public Long getPeriodohistorico() {
        return periodohistorico;
    }

    public void setPeriodohistorico(Long periodohistorico) {
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

    public Catalogo getMeterialprimarioid() {
        return meterialprimarioid;
    }

    public void setMeterialprimarioid(Catalogo meterialprimarioid) {
        this.meterialprimarioid = meterialprimarioid;
    }

    public Piezamuseable getPiezamuseableid() {
        return piezamuseableid;
    }

    public void setPiezamuseableid(Piezamuseable piezamuseableid) {
        this.piezamuseableid = piezamuseableid;
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
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezaarqueologicadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
