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
@Table(name="profesional")
public class Profesional {

	@Id
	private int idProfesional;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido", nullable = false)
	private String apellido;
    
    @OneToOne
    @MapsId
    private Users usuario;

	@OneToMany(mappedBy="visita", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private Set<Visita> visitas = new HashSet<Visita>();
	
	@OneToMany(mappedBy="actividad", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Actividad> actividades = new HashSet<Actividad>();

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
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

	public Set<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(Set<Actividad> actividades) {
		this.actividades = actividades;
	}
	
}