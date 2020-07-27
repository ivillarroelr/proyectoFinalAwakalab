package cl.awakelab.proyectofinal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
    private String username;
    
	@OneToMany(mappedBy="cliente", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Visita> visitas = new HashSet<Visita>();

    @OneToMany(mappedBy="cliente", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Pago> pagos = new HashSet<Pago>();

    @OneToMany(mappedBy="cliente", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private Set<Actividad> actividades = new HashSet<Actividad>();

    @OneToOne
    @MapsId
    private Users usuario;

    
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}