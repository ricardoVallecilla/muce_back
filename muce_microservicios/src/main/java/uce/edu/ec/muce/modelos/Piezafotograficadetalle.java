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
@Table(name = "PIEZAFOTOGRAFICADETALLE", catalog = "", schema = "MUCE")
public class Piezafotograficadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAFOTOGRAFICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezafotograficadetalle_seq", allocationSize = 1, name = "PIEZAFOTOGRAFICADETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETALLEID", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "TITULO", nullable = false, length = 256)
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "TEMATICA", nullable = false, length = 256)
    private String tematica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "TIPOLOGIA", nullable = false, length = 256)
    private String tipologia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "PROCEDIMIENTO", nullable = false, length = 256)
    private String procedimiento;
    @Size(max = 256)
    @Column(name = "AUTOR", length = 256)
    private String autor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "SIGLOANO", nullable = false, length = 10)
    private String sigloano;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "FONDO", nullable = false, length = 256)
    private String fondo;
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
    @Size(min = 1, max = 256)
    @Column(name = "INSCRIPCIONES", nullable = false, length = 256)
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
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID", nullable = false)
    @ManyToOne(optional = false)
    private Piezamuseable piezamuseableid;

    public Piezafotograficadetalle() {
    }

    public Piezafotograficadetalle(Long detalleid) {
        this.detalleid = detalleid;
    }

    public Piezafotograficadetalle(Long detalleid, String titulo, String tematica, String tipologia, String procedimiento, String sigloano, String fondo, String alto, String largo, String inscripciones, String descripcion, String elementosrelacionado) {
        this.detalleid = detalleid;
        this.titulo = titulo;
        this.tematica = tematica;
        this.tipologia = tipologia;
        this.procedimiento = procedimiento;
        this.sigloano = sigloano;
        this.fondo = fondo;
        this.alto = alto;
        this.largo = largo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSigloano() {
        return sigloano;
    }

    public void setSigloano(String sigloano) {
        this.sigloano = sigloano;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleid != null ? detalleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piezafotograficadetalle)) {
            return false;
        }
        Piezafotograficadetalle other = (Piezafotograficadetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezafotograficadetalle[ detalleid=" + detalleid + " ]";
    }
    
}
