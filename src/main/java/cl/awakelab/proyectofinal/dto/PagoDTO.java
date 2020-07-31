package cl.awakelab.proyectofinal.dto;

import cl.awakelab.proyectofinal.model.Cliente;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class PagoDTO implements Serializable {

    private int idPago;

    private String descripcion;

    private int monto;

    private Date fecha;

    private Cliente cliente;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PagoDTO)) return false;
        PagoDTO pagoDTO = (PagoDTO) o;
        return getIdPago() == pagoDTO.getIdPago() &&
                getMonto() == pagoDTO.getMonto() &&
                getDescripcion().equals(pagoDTO.getDescripcion()) &&
                getFecha().equals(pagoDTO.getFecha()) &&
                getCliente().equals(pagoDTO.getCliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPago(), getDescripcion(), getMonto(), getFecha(), getCliente());
    }
}
