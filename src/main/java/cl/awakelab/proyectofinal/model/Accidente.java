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
@Table(name="accidente")
public class Accidente {
    
    @Id
	private int idAccidente;
	
	@Column(name = "fecha", nullable = true)
	private LocalDateTime fechaVisita;
	
	@Column(name = "descripcion", nullable = true)
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="cliente", nullable=false, foreignKey = @ForeignKey(name="FK_actividad_cliente"))
    private Cliente cliente;

    public int getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    public LocalDateTime getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDateTime fechaVisita) {
        this.fechaVisita = fechaVisita;
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

    
}