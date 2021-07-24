package ai.tech.user.application.dto;

import ai.tech.base.domain.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDto extends BaseEntity {
    @NotNull
    @Size(min = 8)
    private String username;
    @NotNull
    @Size(min = 8)
    private String password;
    private boolean active;
    private String roles;

    public UserDto(UUID uuid, String username, String password, boolean active, String roles) {
        super(uuid);
        this.username = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }
}