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
    @Column(name = "MOVIMIENTOID", nullable = false)
    private Long movimientoid;
    @JoinColumn(name = "TIPOMOVIMIENTOID", referencedColumnName = "CATALOGOID")
    @ManyToOne(optional = false)
    private Catalogo tipomovimientoid;
    @Column(name = "FECHAMOVIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamovimiento;
    @Column(name = "FECHAINGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaingreso;
    @Size(max = 256)
    @Column(name = "INSTITUCION", length = 256)
    private String institucion;
    @Size(max = 256)
    @Column(name = "DIRECCION", length = 256)
    private String direccion;
    @Size(max = 256)
    @Column(name = "PAIS", length = 256)
    private String pais;
    @Size(max = 256)
    @Column(name = "PROVINCIA", length = 256)
    private String provincia;
    @Size(max = 256)
    @Column(name = "CIUDAD", length = 256)
    private String ciudad;
    @Size(max = 256)
    @Column(name = "TELEFONO", length = 256)
    private String telefono;
    @Size(max = 256)
    @Column(name = "EMAIL", length = 256)
    private String email;
    @Size(max = 256)
    @Column(name = "CONTACTO", length = 256)
    private String contacto;
    @Column(name = "FECHAINICIOPRESTAMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicioprestamo;
    @Column(name = "FECHAFINPRESTAMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinprestamo;
    @Column(name = "FECHAENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaentega;
    @Column(name = "FECHATRASPASO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatraspaso;
    @Size(max = 256)
    @Column(name = "OBSERVACIONES", length = 256)
    private String observaciones;
    @Size(max = 50)
    @Column(name = "numeroacta", length = 50)
    private String numeroacta;
    @Size(max = 500)
    @Column(name = "NUMEROSEGURO", length = 500)
    private String numeroseguro;
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
   
    @Size(max = 256)
    @Column(name = "ENTREGANOMBRE", length = 256)
    private String entreganombre;
    @Size(max = 256)
    @Column(name = "ENTREGACARGO", length = 256)
    private String entregacargo;
    @Size(max = 256)
    @Column(name = "ENTREGARESERVA", length = 256)
    private String entregareserva;
    @Size(max = 256)
    @Column(name = "ENTREGACI", length = 256)
    private String entregaci;
    @Size(max = 256)
    @Column(name = "RECEPTORNOMBRE", length = 256)
    private String receptornombre;
    @Size(max = 256)
    @Column(name = "RECEPTORCARGO", length = 256)
    private String receptorcargo;
    @Size(max = 256)
    @Column(name = "RECEPTORRESERVA", length = 256)
    private String receptorreserva;
    @Size(max = 256)
    @Column(name = "RECEPTORCI", length = 256)
    private String 	receptorci;
    @Size(max = 256)
    @Column(name = "ASEGURADORA", length = 256)
    private String 	aseguradora;
    @Size(max = 10)
    @Column(name = "VALORSEGURO", length = 10)
    private String 	valorseguro;
    
    @Column(name = "FORMAENVIO")
    private Boolean 	formaenvio;
    @Column(name = "CONFIRMACION")
    private Boolean 	confirmacion;
    
    @Column(name = "FECHACONFIRMCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaconfirmacion;
    
    @Size(max = 256)
    @Column(name = "DOCUMENTORESPALDO", length = 256)
    private String 	documentorespaldo;
    
    @Column(name = "MUSEOID")
    private Long 	museoid;
    
    @Column(name = "MUSEORECEPTORID")
    private Long 	museoreceptorid;
    
    @Column(name = "MOVIMIENTORELACIONADOID")
    private Long 	movimientorelacionadoid;
    

    public Movimiento() {
    }

    public Movimiento(Long movimientoid) {
        this.movimientoid = movimientoid;
    }

    

    public Movimiento(Long movimientoid, Date fechamovimiento, Date fechaingreso, String institucion, String direccion,
			String pais, String provincia, String ciudad, String telefono, String email, String contacto,
			Date fechainicioprestamo, Date fechafinprestamo, Date fechatraspaso, String observaciones,
			String numeroacta, String numerosuguro, Long seguro, String quiendono, String aquiendono,
			String numerodocbaja, String usuarioregistroid, Date fecharegistro, Catalogo estadoid, String entreganombre, String entregacargo, String entregareserva, String entregaci,
			String receptornombre, String receptorcargo, String receptorreserva, String receptorci) {
		super();
		this.movimientoid = movimientoid;
		this.fechamovimiento = fechamovimiento;
		this.fechaingreso = fechaingreso;
		this.institucion = institucion;
		this.direccion = direccion;
		this.pais = pais;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.email = email;
		this.contacto = contacto;
		this.fechainicioprestamo = fechainicioprestamo;
		this.fechafinprestamo = fechafinprestamo;
		this.fechatraspaso = fechatraspaso;
		this.observaciones = observaciones;
		this.numeroacta = numeroacta;
		this.numeroseguro = numerosuguro;
		this.seguro = seguro;
		this.quiendono = quiendono;
		this.aquiendono = aquiendono;
		this.numerodocbaja = numerodocbaja;
		this.usuarioregistroid = usuarioregistroid;
		this.fecharegistro = fecharegistro;
		
		this.entreganombre = entreganombre;
		this.entregacargo = entregacargo;
		this.entregareserva = entregareserva;
		this.entregaci = entregaci;
		this.receptornombre = receptornombre;
		this.receptorcargo = receptorcargo;
		this.receptorreserva = receptorreserva;
		this.receptorci = receptorci;
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

    public String getNumeroseguro() {
        return numeroseguro;
    }

    public void setNumeroseguro(String numeroseguro) {
        this.numeroseguro = numeroseguro;
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

   

    public Date getFechaentega() {
		return fechaentega;
	}

	public void setFechaentega(Date fechaentega) {
		this.fechaentega = fechaentega;
	}

	public Boolean getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(Boolean confirmacion) {
		this.confirmacion = confirmacion;
	}

	public Date getFechaconfirmacion() {
		return fechaconfirmacion;
	}

	public void setFechaconfirmacion(Date fechaconfirmacion) {
		this.fechaconfirmacion = fechaconfirmacion;
	}

	public String getDocumentorespaldo() {
		return documentorespaldo;
	}

	public void setDocumentorespaldo(String documentorespaldo) {
		this.documentorespaldo = documentorespaldo;
	}

    

    public Long getMovimientoid() {
		return movimientoid;
	}

	public void setMovimientoid(Long movimientoid) {
		this.movimientoid = movimientoid;
	}

	public Catalogo getTipomovimientoid() {
		return tipomovimientoid;
	}

	public void setTipomovimientoid(Catalogo tipomovimientoid) {
		this.tipomovimientoid = tipomovimientoid;
	}

	public Date getFechamovimiento() {
		return fechamovimiento;
	}

	public void setFechamovimiento(Date fechamovimiento) {
		this.fechamovimiento = fechamovimiento;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getNumeroacta() {
		return numeroacta;
	}

	public void setNumeroacta(String numeroacta) {
		this.numeroacta = numeroacta;
	}

	public String getEntreganombre() {
		return entreganombre;
	}

	public void setEntreganombre(String entreganombre) {
		this.entreganombre = entreganombre;
	}

	public String getEntregacargo() {
		return entregacargo;
	}

	public void setEntregacargo(String entregacargo) {
		this.entregacargo = entregacargo;
	}

	public String getEntregareserva() {
		return entregareserva;
	}

	public void setEntregareserva(String entregareserva) {
		this.entregareserva = entregareserva;
	}

	public String getEntregaci() {
		return entregaci;
	}

	public void setEntregaci(String entregaci) {
		this.entregaci = entregaci;
	}

	public String getReceptornombre() {
		return receptornombre;
	}

	public void setReceptornombre(String receptornombre) {
		this.receptornombre = receptornombre;
	}

	public String getReceptorcargo() {
		return receptorcargo;
	}

	public void setReceptorcargo(String receptorcargo) {
		this.receptorcargo = receptorcargo;
	}

	public String getReceptorreserva() {
		return receptorreserva;
	}

	public void setReceptorreserva(String receptorreserva) {
		this.receptorreserva = receptorreserva;
	}

	public String getReceptorci() {
		return receptorci;
	}

	public void setReceptorci(String receptorci) {
		this.receptorci = receptorci;
	}

	
	public String getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}

	public String getValorseguro() {
		return valorseguro;
	}

	public void setValorseguro(String valorseguro) {
		this.valorseguro = valorseguro;
	}

	public Boolean getFormaenvio() {
		return formaenvio;
	}

	public void setFormaenvio(Boolean formaenvio) {
		this.formaenvio = formaenvio;
	}

	
	public Long getMuseoid() {
		return museoid;
	}

	public void setMuseoid(Long museoid) {
		this.museoid = museoid;
	}
	
	

	public Long getMuseoreceptorid() {
		return museoreceptorid;
	}

	public void setMuseoreceptorid(Long museoreceptorid) {
		this.museoreceptorid = museoreceptorid;
	}
	
	

	public Long getMovimientorelacionadoid() {
		return movimientorelacionadoid;
	}

	public void setMovimientorelacionadoid(Long movimientorelacionadoid) {
		this.movimientorelacionadoid = movimientorelacionadoid;
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
