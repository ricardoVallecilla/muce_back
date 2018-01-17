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
@Table(name = "PIEZAGEOLOGICADETALLE", catalog = "", schema = "MUCE")
public class Piezageologicadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAGEOLOGICADETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezageologicadetalle_seq", allocationSize = 1, name = "PIEZAGEOLOGICADETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETALLEID", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    @Size(max = 256)
    @Column(name = "MATERIAL", length = 256)
    private String material;
    @Size(max = 256)
    @Column(name = "CLASIFICACION", length = 256)
    private String clasificacion;
    @Size(max = 256)
    @Column(name = "CLASIFICACIONCAMPO", length = 256)
    private String clasificacioncampo;
    @Size(max = 256)
    @Column(name = "PERIODO", length = 256)
    private String periodo;
    @Size(max = 50)
    @Column(name = "EPOCA", length = 50)
    private String epoca;
    @Size(max = 25)
    @Column(name = "ERA", length = 25)
    private String era;
    @Size(max = 25)
    @Column(name = "EDAD", length = 25)
    private String edad;
    @Size(max = 10)
    @Column(name = "ALTO", length = 10)
    private String alto;
    @Size(max = 10)
    @Column(name = "LARGO", length = 10)
    private String largo;
    @Size(max = 10)
    @Column(name = "ANCHO", length = 10)
    private String ancho;
    @Size(max = 10)
    @Column(name = "DIAMETRO", length = 10)
    private String diametro;
    @Size(max = 10)
    @Column(name = "PESO", length = 10)
    private String peso;
    @Size(max = 256)
    @Column(name = "INSCRIPCIONES", length = 256)
    private String inscripciones;
    @Size(max = 10)
    @Column(name = "GRUPO", length = 10)
    private String grupo;
    @Size(max = 256)
    @Column(name = "ELEMENTOSRELACIONADOS", length = 256)
    private String elementosrelacionados;
    @Column(name = "DESCRIPCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date descripcion;
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID")
    @ManyToOne
    private Piezamuseable piezamuseableid;

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
