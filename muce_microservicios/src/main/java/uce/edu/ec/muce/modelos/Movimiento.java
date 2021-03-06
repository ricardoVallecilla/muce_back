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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "MOVIMIENTO", catalog = "", schema = "MUCE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOVIMIENTO_SEQ")
    @SequenceGenerator(sequenceName = "movimiento_seq", allocationSize = 1, name = "MOVIMIENTO_SEQ")
    @Basic(optional = true)
    @NotNull
    @Column(name = "mvm_id", nullable = true)
    private Long movimientoid;
    @JoinColumn(name = "mvm_tipo", referencedColumnName = "ctl_id")
    @ManyToOne(optional = true)
    private Catalogo tipomovimientoid;
    
    @Column(name = "mvm_fecha_movimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamovimiento;
    
    @Column(name = "mvm_fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaingreso;
    
    @Size(max = 600)
    @Column(name = "mvm_institucion", length = 600)
    private String institucion;
    
    @Size(max = 600)
    @Column(name = "mvm_direccion", length = 600)
    private String direccion;
    
    @Size(max = 600)
    @Column(name = "mvm_pais", length = 600)
    private String pais;
    
    @Size(max = 600)
    @Column(name = "mvm_provincia", length = 600)
    private String provincia;
    
    @Size(max = 600)
    @Column(name = "mvm_ciudad", length = 600)
    private String ciudad;
    
    @Size(max = 600)
    @Column(name = "mvm_telefono", length = 600)
    private String telefono;
    
    @Size(max = 600)
    @Column(name = "mvm_email", length = 600)
    private String email;
    
    @Size(max = 600)
    @Column(name = "mvm_contacto", length = 600)
    private String contacto;
    
    @Column(name = "mvm_inicio_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicioprestamo;
    
    @Column(name = "mvm_fin_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinprestamo;
    
    @Column(name = "mvm_fecha_entega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaentega;
    
    @Column(name = "mvm_fecha_traspaso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatraspaso;
    
    @Size(max = 600)
    @Column(name = "mvm_observaciones", length = 600)
    private String observaciones;
    
    @Size(max = 50)
    @Column(name = "mvm_numero_acta", length = 50)
    private String numeroacta;
    
    @Size(max = 500)
    @Column(name = "mvm_numero_seguro", length = 500)
    private String numeroseguro;
    
    @Column(name = "mvm_seguro")
    private Long seguro;
    
    @Size(max = 600)
    @Column(name = "mvm_quien_dono", length = 600)
    private String quiendono;
    
    @Size(max = 600)
    @Column(name = "mvm_aquien_dono", length = 600)
    private String aquiendono;
    
    @Size(max = 50)
    @Column(name = "mvm_numero_doc_baja", length = 50)
    private String numerodocbaja;
    
    @Size(max = 600)
    @Column(name = "aud_usuario_registro_id", length = 600)
    private String usuarioregistroid;
    
    @Column(name = "aud_fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
   
    @Size(max = 600)
    @Column(name = "mvm_entrega_nombre", length = 600)
    private String entreganombre;
    
    @Size(max = 600)
    @Column(name = "mvm_entrega_cargo", length = 600)
    private String entregacargo;
    
    @Size(max = 600)
    @Column(name = "mvm_entrega_reserva", length = 600)
    private String entregareserva;
    
    @Size(max = 600)
    @Column(name = "mvm_entrega_ci", length = 600)
    private String entregaci;
    
    @Size(max = 600)
    @Column(name = "mvm_receptor_nombre", length = 600)
    private String receptornombre;
    
    @Size(max = 600)
    @Column(name = "mvm_receptor_cargo", length = 600)
    private String receptorcargo;
    
    @Size(max = 600)
    @Column(name = "mvm_receptor_reserva", length = 600)
    private String receptorreserva;
    
    @Size(max = 600)
    @Column(name = "mvm_receptor_ci", length = 600)
    private String 	receptorci;
    
    @Size(max = 600)
    @Column(name = "mvm_aseguradora", length = 600)
    private String 	aseguradora;
    
    @Size(max = 10)
    @Column(name = "mvm_valor_seguro", length = 10)
    private String 	valorseguro;
    
    
    @Column(name = "mvm_forma_envio")
    private Boolean 	formaenvio;
    
    @Column(name = "mvm_confirmacion")
    private Boolean 	confirmacion;
    
    @Column(name = "mvm_fecha_confirmacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaconfirmacion;
    
    @Size(max = 600)
    @Column(name = "mvm_documento_respaldo", length = 600)
    private String 	documentorespaldo;
    
    @Column(name = "mvm_museo_id")
    private Long 	museoid;
    
    @Column(name = "mvm_museo_receptor_id")
    private Long 	museoreceptorid;
    
    @Column(name = "mvm_movimiento_relacionado_id")
    private Long 	movimientorelacionadoid;
    

    public Movimiento() {
    }

    public Movimiento(Long movimientoid) {
        this.movimientoid = movimientoid;
    }
    
    @Size(max = 700)
    @Column(name = "mvm_motivo_devolucion", length = 700)
    private String 	motivoDevolucion;
    
    
    @Column(name = "mvm_devuelto")
    private Boolean devuelto;
    
    @Size(max = 1000)
    @Column(name = "mvm_motivo_aplazamiento", length = 700)
    private String 	motivoAplazamiento;
    
    @Column(name = "mvm_fecha_devolucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDevolucion;
    

    

    public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Boolean getDevuelto() {
		return devuelto;
	}

	public String getMotivoDevolucion() {
		return motivoDevolucion;
	}

	public void setMotivoDevolucion(String motivoDevolucion) {
		this.motivoDevolucion = motivoDevolucion;
	}

	public Boolean isDevuelto() {
		return devuelto;
	}

	public void setDevuelto(Boolean devuelto) {
		this.devuelto = devuelto;
	}

	public String getMotivoAplazamiento() {
		return motivoAplazamiento;
	}

	public void setMotivoAplazamiento(String motivoAplazamiento) {
		this.motivoAplazamiento = motivoAplazamiento;
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
