package ai.tech.user.domain.model;

import ai.tech.base.domain.model.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {
    private String username;
    private String password;
    private boolean active;
    private String roles;

    public User(UUID uuid, String username, String password, boolean active, String roles) {
        super(uuid);
        this.username = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }
}