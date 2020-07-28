package cl.awakelab.proyectofinal.dto;

import java.io.Serializable;
import java.util.Objects;

public class ProfesionalDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfesionalDTO)) return false;
        ProfesionalDTO that = (ProfesionalDTO) o;
        return getUsername().equals(that.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}

