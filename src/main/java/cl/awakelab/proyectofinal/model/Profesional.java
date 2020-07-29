package cl.awakelab.proyectofinal.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="profesional")
public class Profesional{

	@Id
	private String username;
    
    @OneToOne
    @MapsId
	private Users usuario;

	@OneToMany(mappedBy="profesional", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private Set<Actividad> actividades = new HashSet<Actividad>();

	@OneToMany(mappedBy="profesional", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private Set<Visita> visitas = new HashSet<Visita>();

	public Users getUsuario() {
		return usuario;
	}

	public void setUsuario(Users usuario) {
		this.usuario = usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}