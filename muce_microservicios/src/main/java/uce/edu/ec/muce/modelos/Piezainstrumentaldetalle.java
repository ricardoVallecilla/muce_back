/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uce.edu.ec.muce.modelos;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PIEZAINSTRUMENTALDETALLE", catalog = "", schema = "MUCE")
public class Piezainstrumentaldetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PIEZAINSTRUMENTALDETALLE_SEQ")
    @SequenceGenerator(sequenceName = "Piezainstrumentaldetalle_seq", allocationSize = 1, name = "PIEZAINSTRUMENTALDETALLE_SEQ")
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETALLEID", nullable = false, precision = 0, scale = -127)
    private Long detalleid;
    @Size(max = 256)
    @Column(name = "ESPECIE", length = 256)
    private String especie;
    @Size(max = 256)
    @Column(name = "NOMBRE", length = 256)
    private String nombre;
    @Size(max = 256)
    @Column(name = "OTRADENOMINACION", length = 256)
    private String otradenominacion;
    @Size(max = 256)
    @Column(name = "TECNICA", length = 256)
    private String tecnica;
    @Size(max = 256)
    @Column(name = "FABRICANTE", length = 256)
    private String fabricante;
    @Size(max = 256)
    @Column(name = "LUGARFABRICACION", length = 256)
    private String lugarfabricacion;
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
    @Column(name = "ESPESOR", length = 10)
    private String espesor;
    @Size(max = 10)
    @Column(name = "PESO", length = 10)
    private String peso;
    @Size(max = 256)
    @Column(name = "INSCRIPCIONES", length = 256)
    private String inscripciones;
    @Size(max = 256)
    @Column(name = "DESCRIPCION", length = 256)
    private String descripcion;
    @JoinColumn(name = "ENUSOID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo enusoid;
    @JoinColumn(name = "MATERIALID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo materialid;
    @JoinColumn(name = "FUNCIONAID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo funcionaid;
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID")
    @ManyToOne
    private Piezamuseable piezamuseableid;

    public Piezainstrumentaldetalle() {
    }

    public Piezainstrumentaldetalle(Long detalleid) {
        this.detalleid = detalleid;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOtradenominacion() {
        return otradenominacion;
    }

    public void setOtradenominacion(String otradenominacion) {
        this.otradenominacion = otradenominacion;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getLugarfabricacion() {
        return lugarfabricacion;
    }

    public void setLugarfabricacion(String lugarfabricacion) {
        this.lugarfabricacion = lugarfabricacion;
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

    public Catalogo getEnusoid() {
        return enusoid;
    }

    public void setEnusoid(Catalogo enusoid) {
        this.enusoid = enusoid;
    }

    public Catalogo getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Catalogo materialid) {
        this.materialid = materialid;
    }

    public Catalogo getFuncionaid() {
        return funcionaid;
    }

    public void setFuncionaid(Catalogo funcionaid) {
        this.funcionaid = funcionaid;
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
        if (!(object instanceof Piezainstrumentaldetalle)) {
            return false;
        }
        Piezainstrumentaldetalle other = (Piezainstrumentaldetalle) object;
        if ((this.detalleid == null && other.detalleid != null) || (this.detalleid != null && !this.detalleid.equals(other.detalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Piezainstrumentaldetalle[ detalleid=" + detalleid + " ]";
    }
    
}
