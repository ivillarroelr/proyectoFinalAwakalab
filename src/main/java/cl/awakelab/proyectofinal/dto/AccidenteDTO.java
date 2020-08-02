package cl.awakelab.proyectofinal.dto;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class AccidenteDTO implements Serializable {

    private int idAccidente;

    private Timestamp fechaAccidente;

    private String descripcion;

    private String cliente;

    public int getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    public Timestamp getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(Timestamp fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccidenteDTO)) return false;
        AccidenteDTO that = (AccidenteDTO) o;
        return getIdAccidente() == that.getIdAccidente() &&
                getFechaAccidente().equals(that.getFechaAccidente()) &&
                getDescripcion().equals(that.getDescripcion()) &&
                getCliente().equals(that.getCliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdAccidente(), getFechaAccidente(), getDescripcion(), getCliente());
    }
}
