package cl.awakelab.proyectofinal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	private int idCliente;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido", nullable = false)
	private String apellido;

	@OneToMany(mappedBy="visita", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Visita> visitas = new HashSet<Visita>();

    @OneToMany(mappedBy="pago", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Pago> pagos = new HashSet<Pago>();

    @OneToMany(mappedBy="actividad", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Actividad> actividades = new HashSet<Actividad>();

    @OneToOne
    @MapsId
    private Users usuario;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Set<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(Set<Visita> visitas) {
        this.visitas = visitas;
    }

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }

    public Set<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(Set<Pago> pagos) {
        this.pagos = pagos;
    }

    public Set<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(Set<Actividad> actividades) {
        this.actividades = actividades;
    }


}