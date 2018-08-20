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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "ITEM", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_SEQ")
    @SequenceGenerator(sequenceName = "item_seq", allocationSize = 1, name = "ITEM_SEQ")
    
    
    @Column(name = "itm_id", precision = 0, scale = -127)
    private Long itemid;
    
    
    @Size(max = 100)
    @Column(name = "itm_codigo_control", length = 100)
    private String codigocontrol;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "itm_descripcion", length = 256)
    private String descripcion;
    
    
    @Size(min = 1, max = 256)
    @Column(name = "itm_nombre", length = 256)
    private String nombre;
    
    @Size(max = 150)
    @Column(name = "itm_marca", length = 150)
    private String marca;
    
    @Size(max = 150)
    @Column(name = "itm_modelo", length = 150)
    private String modelo;
    
    @Size(max = 50)
    @Column(name = "itm_numero_serie", length = 50)
    private String numeroserie;
    
    
    @Column(name = "itm_valor", precision = 10, scale = 2)
    private Long valor;
    
    @Size(max = 50)
    @Column(name = "itm_otro_ingreso", length = 50)
    private String otroingreso;
   
    @Size(max = 256)
    @Column(name = "itm_custodio_dos", length = 256)
    private String custodiodos;
    
    @Column(name = "itm_fecha_adquisicion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaadquisicion;
    
    
    @Size(min = 1, max = 150)
    @Column(name = "itm_procedencia", length = 150)
    private String procedencia;
    
    @JoinColumn(name = "itm_tipo_ingreso", referencedColumnName = "ctl_id")
    @ManyToOne
    private Catalogo tipoingreso;
    
    @Column(name = "itm_fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaingreso;
    
    @Size(max = 150)
    @Column(name = "itm_tipo_documento", length = 150)
    private String tipodocumento;
    
    
    @Column(name = "itm_restaurado")
    private Boolean restaurado;
    
    @Column(name = "itm_eliminado")
    private Boolean eliminado;
    
    @Column(name = "itm_fecha_restaurado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharestaurado;
    
    
    @Size(min = 1, max = 500)
    @Column(name = "itm_detalles", length = 500)
    private String detalles;
    
    @Size(max = 256)
    @Column(name = "aud_usuario_registro_id", length = 256)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    @JoinColumn(name = "itm_estado", referencedColumnName = "ctl_id")
    @ManyToOne
    private Catalogo estadoid;
    
    @JoinColumn(name = "itm_grupo", referencedColumnName = "ctl_id")
    @ManyToOne
    private Catalogo grupoid;
    
    @JoinColumn(name = "itm_categoria", referencedColumnName = "ctl_id")
    @ManyToOne
    private Catalogo categoriaid;
    
    @JoinColumn(name = "mus_id", referencedColumnName = "mus_id")
    @ManyToOne
    private Museo museoid;

    public Item() {
    }

    public Item(Long itemid) {
        this.itemid = itemid;
    }

    public Item(Long itemid, String descripcion, String nombre, Long valor, String procedencia, Boolean restaurado, String detalles) {
        this.itemid = itemid;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.valor = valor;
        this.procedencia = procedencia;
        this.restaurado = restaurado;
        this.detalles = detalles;
    }

    public String getOtroingreso() {
		return otroingreso;
	}

	public void setOtroingreso(String otroingreso) {
		this.otroingreso = otroingreso;
	}

	public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getCodigocontrol() {
        return codigocontrol;
    }

    public void setCodigocontrol(String codigocontrol) {
        this.codigocontrol = codigocontrol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }
   
    public String getCustodiodos() {
        return custodiodos;
    }

    public void setCustodiodos(String custodiodos) {
        this.custodiodos = custodiodos;
    }

    public Date getFechaadquisicion() {
        return fechaadquisicion;
    }

    public void setFechaadquisicion(Date fechaadquisicion) {
        this.fechaadquisicion = fechaadquisicion;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    

    public Catalogo getTipoingreso() {
		return tipoingreso;
	}

	public void setTipoingreso(Catalogo tipoingreso) {
		this.tipoingreso = tipoingreso;
	}

	public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public Boolean getRestaurado() {
        return restaurado;
    }

    public void setRestaurado(Boolean restaurado) {
        this.restaurado = restaurado;
    }

    public Date getFecharestaurado() {
        return fecharestaurado;
    }

    public void setFecharestaurado(Date fecharestaurado) {
        this.fecharestaurado = fecharestaurado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
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

    public Catalogo getGrupoid() {
        return grupoid;
    }

    public void setGrupoid(Catalogo grupoid) {
        this.grupoid = grupoid;
    }

    public Catalogo getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(Catalogo categoriaid) {
        this.categoriaid = categoriaid;
    }

    public Museo getMuseoid() {
        return museoid;
    }

    public void setMuseoid(Museo museoid) {
        this.museoid = museoid;
    }

    public Boolean getEliminado() {
		return eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uce.edu.ec.muce.modelos.Item[ itemid=" + itemid + " ]";
    }
    
}
