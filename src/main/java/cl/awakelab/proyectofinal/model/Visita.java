package cl.awakelab.proyectofinal.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="visita")
public class Visita {
	
	@Id
	private int idVisita;
	
	@Column(name = "fecha", nullable = true)
	private LocalDateTime fecha;
	
	@Column(name = "descripcion", nullable = true)
	private String descripcion;

	@ManyToOne
    @JoinColumn(name="cliente", nullable=false, foreignKey = @ForeignKey(name="FK_actividad_cliente"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="profesional", nullable=false, foreignKey = @ForeignKey(name="FK_actividad_profesional"))
    private Profesional profesional;
	
	@Column(name = "hora", nullable = true)
	private String hora;

	public Visita() {
		super();
	}


	public Visita(int idVisita, LocalDateTime fecha, String descripcion) {
		super();
		this.idVisita = idVisita;
		this.fecha = fecha;
		this.descripcion = descripcion;
	}


	public int getIdVisita() {
		return idVisita;
	}


	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Profesional getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	
	
}
