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
@Table(name = "MOVIMIENTO", catalog = "", schema = "MUCE")
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOVIMIENTO_SEQ")
    @SequenceGenerator(sequenceName = "movimiento_seq", allocationSize = 1, name = "MOVIMIENTO_SEQ")
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "MOVIMIENTOID", nullable = false, length = 256)
    private String movimientoid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPOMOVIMIENTOID", nullable = false, length = 50)
    private String tipomovimientoid;
    @Column(name = "FECHAIGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaigreso;
    @Size(max = 256)
    @Column(name = "INSTITUCION", length = 256)
    private String institucion;
    @Size(max = 256)
    @Column(name = "CONTACTO", length = 256)
    private String contacto;
    @Column(name = "FECHAINICIOPRESTAMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicioprestamo;
    @Column(name = "FECHAFINPRESTAMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinprestamo;
    @Column(name = "FECHATRASPASO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatraspaso;
    @Size(max = 256)
    @Column(name = "DESCRIPCION", length = 256)
    private String descripcion;
    @Size(max = 50)
    @Column(name = "NUMEROREMISIOM", length = 50)
    private String numeroremisiom;
    @Size(max = 500)
    @Column(name = "NUMEROSUGURO", length = 500)
    private String numerosuguro;
    @Column(name = "SEGURO")
    private Long seguro;
    @Size(max = 256)
    @Column(name = "QUIENDONO", length = 256)
    private String quiendono;
    @Size(max = 256)
    @Column(name = "AQUIENDONO", length = 256)
    private String aquiendono;
    @Size(max = 50)
    @Column(name = "NUMERODOCBAJA", length = 50)
    private String numerodocbaja;
    @Size(max = 256)
    @Column(name = "USUARIOREGISTROID", length = 256)
    private String usuarioregistroid;
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    @JoinColumn(name = "ESTADOID", referencedColumnName = "CATALOGOID")
    @ManyToOne
    private Catalogo estadoid;
    @JoinColumn(name = "MUSEODESTINOID", referencedColumnName = "MUSEOID")
    @ManyToOne
    private Museo museodestinoid;
    @JoinColumn(name = "MUSEOEMISORID", referencedColumnName = "MUSEOID")
    @ManyToOne
    private Museo museoemisorid;
    @JoinColumn(name = "PIEZAMUSEABLEID", referencedColumnName = "PIEZAMUSEABLEID")
    @ManyToOne
    private Piezamuseable piezamuseableid;

    public Movimiento() {
    }

    public Movimiento(String movimientoid) {
        this.movimientoid = movimientoid;
    }

    public Movimiento(String movimientoid, String tipomovimientoid) {
        this.movimientoid = movimientoid;
        this.tipomovimientoid = tipomovimientoid;
    }

    public String getMovimientoid() {
        return movimientoid;
    }

    public void setMovimientoid(String movimientoid) {
        this.movimientoid = movimientoid;
    }

    public String getTipomovimientoid() {
        return tipomovimientoid;
    }

    public void setTipomovimientoid(String tipomovimientoid) {
        this.tipomovimientoid = tipomovimientoid;
    }

    public Date getFechaigreso() {
        return fechaigreso;
    }

    public void setFechaigreso(Date fechaigreso) {
        this.fechaigreso = fechaigreso;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Date getFechainicioprestamo() {
        return fechainicioprestamo;
    }

    public void setFechainicioprestamo(Date fechainicioprestamo) {
        this.fechainicioprestamo = fechainicioprestamo;
    }

    public Date getFechafinprestamo() {
        return fechafinprestamo;
    }

    public void setFechafinprestamo(Date fechafinprestamo) {
        this.fechafinprestamo = fechafinprestamo;
    }

    public Date getFechatraspaso() {
        return fechatraspaso;
    }

    public void setFechatraspaso(Date fechatraspaso) {
        this.fechatraspaso = fechatraspaso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroremisiom() {
        return numeroremisiom;
    }

    public void setNumeroremisiom(String numeroremisiom) {
        this.numeroremisiom = numeroremisiom;
    }

    public String getNumerosuguro() {
        return numerosuguro;
    }

    public void setNumerosuguro(String numerosuguro) {
        this.numerosuguro = numerosuguro;
    }

    public Long getSeguro() {
        return seguro;
    }

    public void setSeguro(Long seguro) {
        this.seguro = seguro;
    }

    public String getQuiendono() {
        return quiendono;
    }

    public void setQuiendono(String quiendono) {
        this.quiendono = quiendono;
    }

    public String getAquiendono() {
        return aquiendono;
    }

    public void setAquiendono(String aquiendono) {
        this.aquiendono = aquiendono;
    }

    public String getNumerodocbaja() {
        return numerodocbaja;
    }

    public void setNumerodocbaja(String numerodocbaja) {
        this.numerodocbaja = numerodocbaja;
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

    public Catalogo getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(Catalogo estadoid) {
        this.estadoid = estadoid;
    }

    public Museo getMuseodestinoid() {
        return museodestinoid;
    }

    public void setMuseodestinoid(Museo museodestinoid) {
        this.museodestinoid = museodestinoid;
    }

    public Museo getMuseoemisorid() {
        return museoemisorid;
    }

    public void setMuseoemisorid(Museo museoemisorid) {
        this.museoemisorid = museoemisorid;
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
        hash += (movimientoid != null ? movimientoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimiento)) {
            return false;
        }
        Movimiento other = (Movimiento) object;
        if ((this.movimientoid == null && other.movimientoid != null) || (this.movimientoid != null && !this.movimientoid.equals(other.movimientoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Movimiento[ movimientoid=" + movimientoid + " ]";
    }
    
}
