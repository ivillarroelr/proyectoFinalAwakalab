package cl.awakelab.proyectofinal.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {

    @Id
    private String username;

    @Column
    private String password;

    @Column
    private Boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "authorities_users", joinColumns = @JoinColumn(name = "username"), inverseJoinColumns = @JoinColumn(name = "id_authority"))
    private Set<Authority> authority;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Authority> getAuthority() {
        return authority;
    }

    public void setAuthority(Set<Authority> authority) {
        this.authority = authority;
    }
}
