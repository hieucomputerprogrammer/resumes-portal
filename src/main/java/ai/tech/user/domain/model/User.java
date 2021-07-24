package ai.tech.user.domain.model;

import ai.tech.base.domain.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User extends BaseEntity {
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "active")
    private boolean active;
    @Column(name = "roles")
    private String roles;

    public User(UUID uuid, String username, String password, boolean active, String roles) {
        super(uuid);
        this.username = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }
}